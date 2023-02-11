
-- install "Docker Desktop" software in your system 
-- Open "Docker Desktop" software in your system 

-- docker steps
	cd C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker

docker image ls

docker build -t sparing-boot-docker .

docker image ls
	REPOSITORY                  TAG             IMAGE ID       CREATED          SIZE
	sparing-boot-docker         latest          dab9aae09d9e   17 minutes ago   377MB


docker run -p 9090:8080 sparing-boot-docker

docker container ls
	CONTAINER ID   IMAGE                 COMMAND                  CREATED          STATUS          PORTS                              NAMES
	42eff6aad28b   sparing-boot-docker   "java -jar /SpringBo…"   57 seconds ago   Up 55 seconds   9090/tcp, 0.0.0.0:9090->8080/tcp   vibrant_cori

-- Open browser 
	http://localhost:9090/hello


