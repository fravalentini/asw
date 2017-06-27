########################################################
# Dockerfile per l'applicazione actor / award service 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD build/libs/award-service-0.0.1-SNAPSHOT.jar award.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "award.jar"]

