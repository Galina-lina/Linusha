package ru.mtusi.sampleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ru.mtusi.sampleapi.dao.ProductRepository;
import ru.mtusi.sampleapi.model.Product;

@Component

public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public CommandLineAppStartupRunner(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Override
    public void run(String...args) throws Exception{
        System.out.println(productRepository.findById(2L).get());
    }
}
