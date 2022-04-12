# microservicio
http://ec2-54-174-157-125.compute-1.amazonaws.com:8082/stringModify/noSpace/esta e suna prueba smsdjfg 
http://ec2-54-174-157-125.compute-1.amazonaws.com:8082/stringModify/noSpace/String con espacios
quita los espacios de un string 




<p align="center">
<img src="https://user-images.githubusercontent.com/59320487/163065733-d15fac5c-1480-49c5-9344-86598c694890.png">
</p>


<p align="center">
<img src="https://user-images.githubusercontent.com/59320487/163068107-f5f81b72-a3ab-4c85-a574-787fafd19394.png">
</p>

rabiit escucha y muestra los mensajes enviados al puerto 9292 usando en paralelo rtabbit 5672
Aplicacion contenida en la carpeta microservice.

la cual acepta peticiones en localhost:8080/stringModify/noSpace/{String}
modificando String y quitandole todos los espacios

aplicacion dockerizada y desplegada en aws en los puertos 8081
