from django import forms

class EmpForm(forms.Form):
    name = forms.CharField(min_length=4,label="姓名",error_messages={"min_length":"你太短了","required":"该字段不能为空"})
    age = forms.IntegerField(label="年龄")
    salary = forms.DecimalField(label="工资")