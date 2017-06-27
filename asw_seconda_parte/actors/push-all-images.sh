#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/eureka-img-9013
docker push ${DOCKER_REGISTRY}/actor-img-9013
docker push ${DOCKER_REGISTRY}/award-img-9013
docker push ${DOCKER_REGISTRY}/nationality-img-9013
docker push ${DOCKER_REGISTRY}/zuul-img-9013






