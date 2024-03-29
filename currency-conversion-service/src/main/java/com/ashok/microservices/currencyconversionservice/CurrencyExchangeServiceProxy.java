package com.ashok.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*****************Ribbon*****************************/
/*
@FeignClient(name="currency-exchange-service", url="localhost:8000")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}*/

/*****************Ribbon Load balancing*****************************/
/*
@FeignClient(name="currency-exchange-service")//Pick from listofservers property
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}*/


/*****************Eureka*****************************/
 /*
 @FeignClient(name="currency-exchange-service")
 public interface CurrencyExchangeServiceProxy {
 @GetMapping("/currency-exchange/from/{from}/to/{to}")
 public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
 }*/

/*****************Gateway******************************/
 @FeignClient(name="netflix-zuul-api-gateway-server")
 public interface CurrencyExchangeServiceProxy {
     @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
     public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
 }