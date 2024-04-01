package org.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
printProducts();
    }
    public  static void printProducts() throws JsonProcessingException {
        Product[] products = new Product[3];
        var product0= new Product(1,"mahmoud",new Date(), 12, 12.5);
        var product1= new Product(2,"ali",new Date(), 13, 12.5);
        var product2= new Product(3,"ahmed",new Date(), 14, 12.5);
        products[0]=product1;
        products[1]=product1;
        products[2]=product2;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN, true);
        String jsonformate = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(products);
        System.out.println(jsonformate);
    }
}