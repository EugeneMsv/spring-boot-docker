### Spring-boot web application is packaged to docker image

   1. Install docker 
   2. Run 
         
      ```
         mnvw clean package
      ```
   3. Run
   
      ```
         docker image ls 
      ```
      check that there is spring-boot-docker:0.1.0-SNAPSHOT
   4. Run   
   
       ```
          docker run -p 8080:8080 spring-boot-docker:0.1.0-SNAPSHOT
       ```
   5. Go to localhost:8080/api/person in web browser
   and see response with person data
    