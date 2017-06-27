#!/bin/bash

echo 'Starting actor application as a stack' 

source "docker.env"

docker stack deploy --compose-file docker-stack-actor.yml actor
