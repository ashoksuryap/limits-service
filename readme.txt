http://localhost:8888/limits-service/default
http://localhost:8888/limits-service/qa
http://localhost:8888/limits-service/dev

http://localhost:8080/limits(activate dev/qa) profile

Exchange
http://localhost:8000/currency-exchange/from/USD/to/INR
http://localhost:8001/currency-exchange/from/USD/to/INR

http://localhost:8000/h2-console
jdbc:h2:mem:testdb

Conversion
http://localhost:8100/currency-converter/from/USD/to/INR/quantity/1000
http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/1000


Eureka
http://localhost:8761/


Zuul
http://localhost:8765/{application-name}/{uri}
http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/INR




