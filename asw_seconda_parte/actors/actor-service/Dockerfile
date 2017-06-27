########################################################
# Dockerfile per l'applicazione actor / actor service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/actor-service-0.0.1-SNAPSHOT.jar actor.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "actor.jar"]


