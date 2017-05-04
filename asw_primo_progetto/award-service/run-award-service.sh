#!/bin/bash

# Script per avviare il servizio award

echo Running as AWARD  

java -Xms64m -Xmx128m -jar -Dspring.profiles.active=award build/libs/award-service-0.0.1-SNAPSHOT.jar
