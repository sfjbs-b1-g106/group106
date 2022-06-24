# Group106

Project Name: Pension-Management system.

Team Members:Meka Manikanta,Divyavani Kimidi, Akanksha Srivastava,Harsha Nimmakayala,Arun Thommandru
---------------

Project Overview:
State government aims to automate a portion of the Pension detail provisioning.

This project covers pensioner detail provision, calculate provision and view for further processing.

Total Microservices:

A.Authorization Microservice

B.Pensioner detail Microservice

C.Process Pension Microservice

D.Pension Management portal

Steps to create github repository
---------------
Log in to GitHub.

Click on + icon at top right of the page and select New Repository.

A Create a new repository page opens. ...

Check the Public checkbox under repository type to make the GitHub profile README visible to everyone who visits the GitHub profile page. ...

Check the Add a README file checkbox. ...

Click on the Create repository button. ...

Functionalities
---------------

A)Authorization Microservice:
-----------------------------

Will add later

B)Pensioner detail Microservice:
--------------------------------

Main Functionality-->

1)Used to find all the pensioner details

GET Method:http://localhost:8085/AllPensioner

2)Used to find details of a particular pensioner by Aadhar card number. 

GET Method:http://localhost:8085/PensionerDetailByAadhaar/{aadharNumber}

3)Used to post details of a pensioner.

POST Method:http://localhost:8085/AllPensioner


1.1)To find all the pensioner details.
------------------------------------

Step-1:Open Postman and follow the steps below:
 
Step-2:Go to Url section and paste---> http://localhost:8085/getAllPensioner

2.1)To find details of a particular pensioner by Aadhar card number.
-----------------------------------------------------------------

Step-1:Open Postman and follow the steps below:

Step-2:Go to Url section and paste---> http://localhost:8085/PensionerDetailByAadhaar/420559429029

3.1)To post pensioner details
----------------------------------------------

Step-1:Open Postman and follow the steps below

POST Method:http://localhost:8085/AllPensioner

C)Process Pension Microservice:
-------------------------------

Main Functionality-->

a)Get all Pensionerdetails.

Get method:http://localhost:8084/getAllPensioner

It wil access the pensiondetails microserver with RestTemplate

b)Get pensionamount calculated

Get Method:localhost:8084/ProcessPension/{addharnum}



Pension amount calculation detail is as follows
------------------------------------------------
**▪ Self pension: 80% of the last salary earned + allowances**

**▪ Family pension: 50% of the last salary earned + allowances**

o The Pensioner detailmicroservice has the bank detail. Process pension microservice can have pre-defined list of banks and service charge as follows

**▪ Public banks – INR 500**

**▪ Private banks – INR 550**
 

Self note-> meka manikanta
---------
Created pensionerdata db and pensioner table

