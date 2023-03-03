# training-microservice

Java Console (JConsole) -> comes with jdk bundle.

Lombook -> microservice doesn't suggest to use Lombook

microservice doesn't recomment javax -> instead use the jersy lib

server.servlet.context.path=/training/api

Aggregator design pattern

Project to project referencing -> not good idea in spring boot microservices

service discovery pattern -> Discovery server, discovery client, regitering to eureka discovery server, spring cloud

yaml file, Docker-compose -f <filename.yml> up 

Design pattern -> Aggregator cum chain of responsibility pattern

fault tolerance - to identify if all system goes down or partial goes down

resilience - how much system can bounce back

circuit breaker -> 3 steps - fail pass, fall back and recovery 

most famous framework for circuit breaker -> hystrix (netflix - legacy microservice) and resilience4j(new style functional programming and associated apis - new apps)

Event mechanism -> eviction -> when we bring down some service need to identify and alert by admins


Getting properties from remote server;
