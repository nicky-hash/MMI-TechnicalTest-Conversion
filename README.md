# MMI-TechnicalTest-Conversion
Conversion  of units

  Technical test instructions:    
  1. Create a Spring Boot application using rest API’s to do a conversions. 
  2. Convert Metric to imperial and vice versa. The API must cater for at least 5 conversions (include temperature conversion please). 
  3. Ensure that you have proper Unit and Integration testing that accompany the project. 
  4. Postman/Jmeter project with your RestAPI's. 
  5. Use the latest Angular to create a front end for your project. (Only if you have time) 
  6. Upload your project into your own GIT repository and share the project with us. 
  7. The project must be able to run in its own Docker environment 
  8. Build system must use Maven.
    
How to test the app using Postman
**********************************
1.These are different  Api’s base on you can use your request.
-The port number was use for my testing
-Append with an api on the url.
POST:Url : //localhost:8080/api/v1/celsiusfahrenheit
-"/celsiusfahrenheit"
-"/fahrenheitcelsius"
-"/acreshectare"
-"/hectareacres"
-"/kilogrampound"
-"/poundkilogram"
-"/kilometermile"
-"/milekilometer"
-"/gallonliter"
-"/litergallon"


Payload:
{
"unitType":"CelsiustoFahrenheit",
"unitValue":37
}

Angular8 Presentation
*********************
After you have started springboot app then you can run angular application.
Angular App will be running on.
-just put the url: http://localhost:4200/
-enter metrix or imperial then press convert..
-You don’t need to append with an api.

