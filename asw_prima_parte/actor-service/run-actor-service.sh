#!/bin/bash

# Script per avviare il servizio actor

echo Running as ACTOR  

java -Xms64m -Xmx128m -jar -Dspring.profiles.active=actor build/libs/actor-service-0.0.1-SNAPSHOT.jar
