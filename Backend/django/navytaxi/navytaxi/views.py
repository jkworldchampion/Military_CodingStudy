from django.shortcuts import render, HttpResponse
from rest_framework.response import Response
from rest_framework.decorators import api_view
from .models import navytaxi
from .serializers import NavytaxiSerializer

# Create your views here.
def index(request):
    return HttpResponse('Welcome!!')

@api_view(['GET'])
def helloAPI(request):
    return Response("Hello world")
