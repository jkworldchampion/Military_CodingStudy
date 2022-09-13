from django.contrib import admin
from django.urls import path, include

from navytaxi import views

urlpatterns = [
    path('', views.index, name='index'),
    path('admin/', admin.site.urls),
    path('navytaxi/', include('navytaxi.urls')),
]
