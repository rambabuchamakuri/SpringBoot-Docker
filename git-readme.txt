
================ Create and save project in github
C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git init

	Initialized empty Git repository in C:/D drive/myWork/SpringBoot-Docker/SpringBoot-Docker/.git/


C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git commit -m "first commit"
	On branch master
	
	Initial commit
	
	Untracked files:
	  (use "git add <file>..." to include in what will be committed)
	        .gitignore
	        .mvn/
	        Dockerfile
	        SpringBoot-Docker/
	        mvnw
	        mvnw.cmd
	        pom.xml
	        readme.txt
	        src/
	
	nothing added to commit but untracked files present (use "git add" to track)



C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git add .
	
	warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of '.mvn/wrapper/maven-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of 'mvnw', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of 'mvnw.cmd', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of 'src/main/java/com/javamantram/springdocker/SpringBootDockerApplication.java', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of 'src/main/resources/application.properties', LF will be replaced by CRLF the next time Git touches it
	warning: in the working copy of 'src/test/java/com/javamantram/springdocker/SpringBootDockerApplicationTests.java', LF will be replaced by CRLF the next time Git touches it

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git commit -m "first commit"
	[master (root-commit) 3e68293] first commit
	 12 files changed, 662 insertions(+)
	 create mode 100644 .gitignore
	 create mode 100644 .mvn/wrapper/maven-wrapper.jar
	 create mode 100644 .mvn/wrapper/maven-wrapper.properties
	 create mode 100644 Dockerfile
	 create mode 100644 mvnw
	 create mode 100644 mvnw.cmd
	 create mode 100644 pom.xml
	 create mode 100644 readme.txt
	 create mode 100644 src/main/java/com/javamantram/springdocker/MyController.java
	 create mode 100644 src/main/java/com/javamantram/springdocker/SpringBootDockerApplication.java
	 create mode 100644 src/main/resources/application.properties
	 create mode 100644 src/test/java/com/javamantram/springdocker/SpringBootDockerApplicationTests.java

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git branch -M main

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git remote add origin https://github.com/rambabuchamakuri/SpringBoot-Docker.git

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git push -u origin main
	Enumerating objects: 28, done.
	Counting objects: 100% (28/28), done.
	Delta compression using up to 8 threads
	Compressing objects: 100% (19/19), done.
	Writing objects: 100% (28/28), 59.71 KiB | 11.94 MiB/s, done.
	Total 28 (delta 0), reused 0 (delta 0), pack-reused 0
	To https://github.com/rambabuchamakuri/SpringBoot-Docker.git
	 * [new branch]      main -> main
	branch 'main' set up to track 'origin/main'.



============================= update/add/modify files project in github

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git status
	On branch main
	Your branch is up to date with 'origin/main'.
	
	Changes to be committed:
	  (use "git restore --staged <file>..." to unstage)
	        modified:   readme.txt

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git add .

C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git commit -a -m "modified readme.txt"
	[main 7166e12] modified readme.txt
	 1 file changed, 3 deletions(-)


C:\D drive\myWork\SpringBoot-Docker\SpringBoot-Docker>git push -u origin main
	Enumerating objects: 5, done.
	Counting objects: 100% (5/5), done.
	Delta compression using up to 8 threads
	Compressing objects: 100% (3/3), done.
	Writing objects: 100% (3/3), 289 bytes | 289.00 KiB/s, done.
	Total 3 (delta 2), reused 0 (delta 0), pack-reused 0
	remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
	To https://github.com/rambabuchamakuri/SpringBoot-Docker.git
	   3e68293..7166e12  main -> main
	branch 'main' set up to track 'origin/main'.

