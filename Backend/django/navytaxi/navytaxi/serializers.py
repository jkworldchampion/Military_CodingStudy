from rest_framework import serializers
from .models import navytaxi

class NavytaxiSerializer(serializers.ModelSerializer):
    class Meta:
        model = navytaxi 
        fields = ('name', 'age')
