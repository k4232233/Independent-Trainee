from django.contrib import admin
from .models import Test, Contact, Tag


# Register your models here.
# 注册多个模型并显示
# admin.site.register([Test, Contact, Tag])

# class ContactAdmin(admin.ModelAdmin):
#     # 只显示 name\email 字段
#     fields = ('name','email')

# 使用内联显示，让 Tag 附加在 Contact 的编辑页面上显示
class TagInline(admin.TabularInline):
    model = Tag


# 将输入栏分块，每个栏也可以定义自己的格式
# 列表页的显示
# 增加搜索栏
class ContactAdmin(admin.ModelAdmin):
    list_display = ('name', 'age', 'email')  # list
    search_fields = ('name',)  # search
    inlines = [TagInline]  # 内联显示
    fieldsets = (
        ['Main', {
            'fields': ('name', 'email')
        }],
        ['Advance', {
            'classes': ('collapse',),  # css样式
            'fields': ('age',),
        }]
    )


admin.site.register(Contact, ContactAdmin)
# admin.site.register([Test,Tag])
admin.site.register([Test])
