#!/bin/bash

# Script per avviare il servizio nationality

echo Running as NATIONALITY  

java -Xms64m -Xmx128m -jar -Dspring.profiles.active=nationality build/libs/nationality-service-0.0.1-SNAPSHOT.jar
