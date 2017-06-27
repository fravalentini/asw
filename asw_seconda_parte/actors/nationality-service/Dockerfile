########################################################
# Dockerfile per l'applicazione actor / nationality service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/nationality-service-0.0.1-SNAPSHOT.jar nationality.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "nationality.jar"]