# lojaspringbot

requires java 21 or newer

DEV:
mvn install

docker build . -tag my-java-app

docker run -p 8080:8080 my-java-app

http://localhost:8080/products/

PROD:
https://app-20.cxjnaeiz2n3.us-south.codeengine.appdomain.cloud/products/


Docker Image:
https://hub.docker.com/repository/docker/plucena/ws3
