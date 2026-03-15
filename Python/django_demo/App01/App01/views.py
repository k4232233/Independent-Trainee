from django.shortcuts import render,HttpResponse
# from . import models
# def add_book(request):
#     book = models.Book(title="红楼梦",price=300,publish="菜鸟出版社",pub_date="2008-8-8")
#     book.save()
#     return HttpResponse("<p>数据添加成功！</p>")

from django.shortcuts import render,HttpResponse
from App01 import models
def add_book(request):
    books = models.Book.objects.create(title="如来神掌",price=200,publish="功夫出版社",pub_date="2010-10-10")
    print(books, type(books)) # Book object (18)
    return HttpResponse("<p>数据添加成功！</p>")