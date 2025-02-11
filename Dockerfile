FROM openjdk:17
EXPOSE 8080
ADD target/gitaction-images-new.jar gitaction-images-new.jar
ENTRYPOINT ["java","-jar","/gitaction-images-new.jar"]