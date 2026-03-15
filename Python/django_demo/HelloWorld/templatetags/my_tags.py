from django import template
from django.utils.safestring import mark_safe

# 自定义标签和过滤器

register = template.Library()   #register的名字是固定的,不可改变

# 1. 利用装饰器 @register.filter 自定义过滤器
# 2. 在使用自定义标签和过滤器前，要在 html 文件 body 的最上方中导入该 py 文件
@register.filter
def my_filter(v1,v2):
    return v1 * v2

# 利用装饰器 @register.simple_tag 自定义标签
@register.simple_tag
def my_tag1(v1, v2, v3):
    return v1 * v2 * v3

# 语义化标签,类过滤器safe效果
@register.simple_tag
def my_html(v1,v2):
    temp_html = "<p><input type='text' id='%s' class='%s'></p>" %(v1,v2)
    return mark_safe(temp_html)