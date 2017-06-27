#!/bin/bash

# Script per avviare il servizio actor

echo Running

java -Xms64m -Xmx128m -jar build/libs/eureka-server-0.0.1-SNAPSHOT.jar
