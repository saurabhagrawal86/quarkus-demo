# quarkus-demo
OSS Summit 2019 - Quarkus Demo for Azure Functions


1. Do have an Azure account (even a free one will be fine)
2. From Azure CLI or Windows Powershell (Administrator) - Run the command "az login" (no quotes)
3. After a successful Azure login then run the following Maven command from your checked out code base
4. mvn clean install azure-functions:deploy 
5. Step 4 will create an uberJar, package it, create a function on Azure and deploy it
6. Step 5 will give you a URL to access your service/web app - Use It
