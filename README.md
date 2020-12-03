_LSD Project, Team A, [case 4](https://datsoftlyngby.github.io/soft2020fall/resources/da1526ac-case-4.pdf)_

# CASE 4: ACCOMODATION DOT COM


**Frontend for TEAM A**

* Mads Meinert Andersen - <cph-ma581@cphbusiness.dk>
* Sebastian Harvej- <cph-sh413@cphbusiness.dk>
* Benjamin Østerø Højgaard - <cph-bh187@cphbusiness.dk>
* Malene Hansen - <cph-mh357@cphbusiness.dk>  ***(officer)***

**Backend for TEAM A**

* Kimon Togrou - <cph-kt151@cphbusiness.dk>
* tobias frehr- <cph-tf76@cphbusiness.dk>
* Christian Falk Moustesgård - <cph-cm267@cphbusiness.dk>  ***(officer)***



## Project Links


#### Link to deployed solution: http://ec2-3-139-98-176.us-east-2.compute.amazonaws.com/  \n



Link to project contract: https://github.com/Team-A-SOFT2020/Contract/blob/main/CONTRACT.md


**Repositories:**


Frontend repository: https://github.com/BenjaminHojgaard/Spring_CI_CD

Contract repository: https://github.com/Team-A-SOFT2020/Contract

Backend repository: Contact backend officer Christian Falk Moustesgård for admission to Backend repository.


## How to use

We have created a Postman Collection, that you can use to interact with our application: https://github.com/Team-A-SOFT2020/Contract/blob/main/postman_collection.json



## CI/CD

We chose GitHub Action as our Continous Integration and Deployment tool.

GitHub Actions builds and process a pipeline using actions through .yml files. 

You can see our .yml file here: https://github.com/BenjaminHojgaard/Spring_CI_CD/blob/main/.github/workflows/aws.yml


The (major) steps in the pipeline goes like this:

 1. Sets up java and builds the program using maven
 2. Creates a Docker Image
 3. Pushes it to AWS ECR (our remote Docker repository) 
 4. Publishes the Docker Image on an EC2 instance
 




## Branching Strategy

We chose the branching strategy called "Feature Branching". 


![alt text](https://github.com/Team-A-SOFT2020/Contract/blob/main/branching.png)

*(image credit: https://dzone.com/articles/feature-branching-using-feature-flags-1
)*





## Monitoring & Logging

You can monitor the state of the EC2 instance (vm) by navigating through these steps:

 1. Open [this link](https://signin.aws.amazon.com/signin?redirect_uri=https%3A%2F%2Fconsole.aws.amazon.com%2Fconsole%2Fhome%3Fstate%3DhashArgs%2523%26isauthcode%3Dtrue&client_id=arn%3Aaws%3Aiam%3A%3A015428540659%3Auser%2Fhomepage&forceMobileApp=0&code_challenge=aOCau_UoY-aaNCYGLBhpaHNrwdWHHrvzUI0emQm4xMs&code_challenge_method=SHA-256)
 2. Login as IAM user with the following credentials:\
   User name: ReadOnlyUser\
   Password: jorzek-kiCre0-mufzyv
 3. In the search field, search for and select "EC2"
 4. In the "Resources" panel, select "Instances (running)"
 5. In the table with instances click on "Instance ID"
 6. Scroll down and select the "Monitoring" tab
 7. Sit back and enjoy
 




### You can follow the logs on the following links: 

[Frontend](http://ec2-3-139-98-176.us-east-2.compute.amazonaws.com/logs)


[Backend](http://ec2-18-224-135-52.us-east-2.compute.amazonaws.com/logs)



## SLA 

[View SLA](https://github.com/Team-A-SOFT2020/Contract/blob/main/SLA.md)
