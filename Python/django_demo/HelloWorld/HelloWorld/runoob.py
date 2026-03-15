from django.http import HttpResponse
from django.views.decorators.csrf import csrf_exempt

# def runoob(request):
#     name = request.GET.get("name")
#     return HttpResponse('姓名：{}'.format(name))

@csrf_exempt
def runoob(request):
    print(request)
    name = request.POST.get("name")
    return HttpResponse('姓名：{}'.format(name))