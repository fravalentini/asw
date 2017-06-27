#!/bin/bash

gradle build -b eureka-server/build.gradle 
gradle build -b actor-service/build.gradle
gradle build -b award-service/build.gradle 
gradle build -b nationality-service/build.gradle 
gradle build -b zuul/build.gradle 




