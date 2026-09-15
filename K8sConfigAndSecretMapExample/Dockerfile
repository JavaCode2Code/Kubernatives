FROM eclipse-temurin:17-jdk
LABEL maintainer="test_user@gmail.com"
EXPOSE 8080
COPY target/k8s-config-secret-map-example-0.0.1-SNAPSHOT.jar k8s-config-secret-map-example-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/k8s-config-secret-map-example-0.0.1-SNAPSHOT.jar"]