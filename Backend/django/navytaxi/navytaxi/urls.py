from django.contrib import admin
from django.urls import path, include
from navytaxi import views
from .views import helloAPI

urlpatterns = [
    path('', views.index),
    path('hello/', helloAPI),
]
