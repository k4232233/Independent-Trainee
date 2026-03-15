# 路由分发
# 存在问题：Django 项目里多个app目录共用一个 urls 容易造成混淆，后期维护也不方便。
#
# 解决：使用路由分发（include），让每个app目录都单独拥有自己的 urls
from django.urls import re_path,path
from . import views,My_Forms

# 1、在每个 app 目录里都创建一个 urls.py 文件。
# 2、在项目名称目录下的 urls 文件里，统一将路径分发给各个 app 目录。

urlpatterns = [
#     re_path(r'^login/(?P<m>[0-9]){2}/$', views.index)
#    path('add_emp/', views.add_emp)
]
