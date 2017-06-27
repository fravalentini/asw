#!/bin/bash

echo 'Removing actor application as a stack' 

source "docker.env"

docker stack rm actor
