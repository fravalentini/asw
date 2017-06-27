#!/bin/bash

gradle clean -b eureka-server/build.gradle
gradle clean -b award-service/build.gradle
gradle clean -b actor-service/build.gradle
gradle clean -b nationality-service/build.gradle
gradle clean -b zuul/build.gradle 




