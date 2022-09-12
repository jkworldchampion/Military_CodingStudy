# django에서 api를 통해 json형식으로 데이터를 전달하기 위한 파일

from rest_framework import serializers
from .models import Quiz

class QuizSerializer(serializers.ModelSerializer):
    class Meta:
        model = Quiz
        fields = ('title', 'body', 'answer')
