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

a)Used to find all the pensioner details

GET Method: Go to Url section and paste---> http://localhost:8080/pension/alldetails

b)Used to find details of a particular pensioner by Aadhar card number. 

GET Method: Go to Url section and paste---> http://localhost:8080/pension/87938340489


a)To find all the pensioner details.
------------------------------------

Step-1:Open Postman and follow the steps below:
 
Step-2:Go to Url section and paste---> http://localhost:8080/pension/getAllPensioner

b)To find details of a particular pensioner by Aadhar card number.
-----------------------------------------------------------------

Step-1:Open Postman and follow the steps below:

Step-2:Go to Url section and paste---> http://localhost:8080/pension/PensionerDetailByAadhaar/420559429029

C)Process Pension Microservice:
-------------------------------

Main Functionality-->

a)Calculate Pension.

Steps: Will later

Pension amount calculation detail is as follows
------------------------------------------------
**▪ Self pension: 80% of the last salary earned + allowances**

**▪ Family pension: 50% of the last salary earned + allowances**

o The Pensioner detailmicroservice has the bank detail. Process pension microservice can have pre-defined list of banks and service charge as follows

**▪ Public banks – INR 500**

**▪ Private banks – INR 550**
 

Self note-> meka manikanta
---------
Created two table
Names
bank_persion_details
pension_persondata
