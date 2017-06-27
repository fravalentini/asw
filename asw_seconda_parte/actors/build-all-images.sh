#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/eureka-server-img-9013 ./eureka-server 
docker build --rm -t ${DOCKER_REGISTRY}/actor-img-9013 ./actor-service 
docker build --rm -t ${DOCKER_REGISTRY}/nationality-img-9013 ./nationality-service
docker build --rm -t ${DOCKER_REGISTRY}/award-img-9013 ./award-service
docker build --rm -t ${DOCKER_REGISTRY}/zuul-img-9013 ./zuul