from django.db import models

# Create your models here.
class navytaxi(models.Model):
        name = models.CharField(max_length=5)
        age = models.IntegerField(max_length=10)
