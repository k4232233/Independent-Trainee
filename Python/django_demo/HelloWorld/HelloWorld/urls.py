from django.contrib import admin
from django.urls import path, re_path as url, include
from . import views, testdb, search, search2, runoob
from django.conf import settings
from django.conf.urls.static import static
# from cookie import views

# URL调度中心
urlpatterns = [
    url(r'^admin/', admin.site.urls),  # 后台管理路由
    # path('blog/', include('blog.urls')),  # 子应用路由分发
    # include()：实现路由模块化，将不同应用的路由分离到各自的 urls.py
    # namespace：用于反向解析 URL 时避免命名冲突
    # 可在此处添加自定义路由
    # path('hello/', views.hello, name="hello")
    path('runoob/', runoob.runoob),

    # path('testdb/', testdb.getdb),

    url(r'^search-form/', search.search_from),
    url(r'^search-post/', search2.search_post),
    url(r'^search/', search.search),
    # 支持正则表达式
    # re_path(r'^hello/', views.hello)

    # urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)

    # 正则路径下的无名分组 (按照位置一一对应)
    # url("^index/([0-9]{4})/$", views.index),

    # 正则路径下的有名分组
    # url("^index/(?P[0-9]{4})/(?P[0-9]{2})/$", views.index),

    # path('app01/', include("TestModel.urls"))  # 普通的路由分发

    # path('admin/', admin.site.urls),
    # path('login/', views.login),
    # path('index/', views.index),
    # path('logout/', views.logout),
    # path('order/', views.order)

]
