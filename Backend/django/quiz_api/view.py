from django.shortcuts import render
from rest_framework.response import Response
from rest_framework.decorators import api_view
from .models import Quiz
from .serializers import QuizSerializer
import random


# Create your views here.
@api_view(['GET'])
def helloAPI(request):
    return Response("Hello, World!")

# 개수가 들어오면 그만큼의 퀴즈를 반환
@api_view(['GET'])
def randomQuiz(request, id):
    totalQuizs = Quiz.objects.all()
    randomQuizs = random.sample(list(totalQuizs), id)
    serializer = QuizSerializer(randomQuizs, many=True)  # 다량의 데이터에 대해 직렬화
    return Response(serializer.data)
