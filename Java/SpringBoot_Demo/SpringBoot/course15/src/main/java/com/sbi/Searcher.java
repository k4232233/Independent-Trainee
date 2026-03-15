package com.sbi;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * 文件关键词检索
 *
 * @author haoran.xu
 * @date 2025/03/20 10:14
 **/
public class Searcher {

    public static void search(String indexDir, String q) throws IOException, ParseException {
        //获取要查询的路径，也就是索引所在的位置
        Directory directory = FSDirectory.open(Paths.get(indexDir));
        IndexReader reader = DirectoryReader.open(directory);
        //构建IndexSearcher
        IndexSearcher searcher = new IndexSearcher(reader);
        //标准分词器，会自动去掉空格那些
        Analyzer analyzer = new StandardAnalyzer();
        //查询解析器
        QueryParser parser = new QueryParser("contents", analyzer);
        //通过解析要查询的String,获取查询对象，q为传入的带查询字符串
        Query query = parser.parse(q);

        //记录索引开始时间
        long startTime = System.currentTimeMillis();
        //开始查询，查询前10条数据，将记录保存在docs中
        TopDocs docs = searcher.search(query, 10);
        //记录索引结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("匹配" + q + "共耗时" + (endTime - startTime) + "毫秒");
        System.out.println("查询到" + docs.totalHits + "条记录");

        //取出每条查询数据
        for (ScoreDoc scoreDoc : docs.scoreDocs) {
            //scoreDoc.doc相当于docID,根据这个docID来获取文档
            Document document = searcher.doc(scoreDoc.doc);

            //fullPath是刚刚建立索引的时候我们定义的一个字段，表示路径
            //也可以取其他的内容，只要我们在建立索引时有定义即可
            System.out.println(document.get("fullPath"));
        }

        reader.close();

    }

    public static void main(String[] args) {
        String indexDir = "C:\\Users\\haoran.xu\\Desktop\\test\\lucene";
        //查询的字符串
        String q = "public";
        try {
            search(indexDir,q);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}