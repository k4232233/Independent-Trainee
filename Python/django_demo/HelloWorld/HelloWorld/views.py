from django.http import HttpResponse
from django.shortcuts import render


def runoob(request):
    # context = {}
    # context 字典中元素的键值 hello 对应了模板中的变量 {{ hello }}
    # context['hello'] = 'Hello World!'
    # views_name = '前后不分离'
    views_list = ['灰衣', '回忆', '哒哒哒']

    # return render(request, 'runoob.html', {"name":views_name})

    # return render(request,"runoob.html",{'view_list':views_list})

    views_dict = {"name": "圣斗士", "AGE": 666}
    # return render(request, 'runoob.html', {'views_dict': views_dict})
    # 0  0.0  False  0j  ""  []  ()  set()  {}  None
    name = 0
    views_str = "<a href='https://www.baidu.com'>点击跳转</a>"
    # return render(request,"runoob.html",{"views_str":views_str})
    # return render(request,'runoob.html',{"name":name})
    img_name = "这是一张图片"
    img_url = "images/white.jpg"
    views_num = 88
    views_list = [1,2,3,4]
    view_list = []
    # return render(request,'runoob.html',{'num':views_num})
    return render(request,'runoob.html',{"views_dict":views_dict,"views_list":views_list,"view_list":view_list,"img_url":img_url,'img_name':img_name})


# def index(request, year):
#     print(year) # 一个形参代表路径中一个分组的内容，按顺序匹配
#     return HttpResponse('年份')

def index(request, year, month):
    print(year,month) # 一个形参代表路径中一个分组的内容，按关键字对应匹配
    return HttpResponse('年-月')