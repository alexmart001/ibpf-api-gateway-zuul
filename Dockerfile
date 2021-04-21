FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/ibpf-api-gateway-zuu-0.0.1-SNAPSHOT.jar ibpf-api-gateway-zuu.jar
ENTRYPOINT ["java","-jar","/ibpf-api-gateway-zuu.jar"]