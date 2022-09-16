from django.db import models

# Create your models here.
class Car(models.Model):
    car_id = models.AutoField(primary_key=True)
    number = models.CharField(max_length=32, blank=True, null=True)
    model = models.CharField(max_length=16, blank=True, null=True)
    propulsion_type = models.CharField(max_length=16, blank=True, null=True)
    color = models.CharField(max_length=16, blank=True, null=True)
    location = models.CharField(max_length=64, blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'Car'

        

class History(models.Model):
    department = models.CharField(max_length=32, blank=True, null=True)
    arrival = models.CharField(max_length=32, blank=True, null=True)
    datetime = models.DateTimeField(blank=True, null=True)
    time = models.DateTimeField()
    total_range = models.CharField(max_length=16, blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'History'


        
class User(models.Model):
    name = models.CharField(max_length=16, blank=True, null=True)
    gender = models.CharField(max_length=8, blank=True, null=True)
    department = models.CharField(max_length=32, blank=True, null=True)

    class Meta:
        managed = False
        db_table = 'User'

