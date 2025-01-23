package com.projetowebservice.projeto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetowebservice.projeto.entities.Category;
import com.projetowebservice.projeto.entities.Order;
import com.projetowebservice.projeto.entities.Product;
import com.projetowebservice.projeto.entities.User;
import com.projetowebservice.projeto.entities.enums.OrderStatus;
import com.projetowebservice.projeto.repositories.CategoryRepository;
import com.projetowebservice.projeto.repositories.OrderRepository;
import com.projetowebservice.projeto.repositories.ProductRepository;
import com.projetowebservice.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers"); 

        Product p1 = new Product(null, "O Senhor dos Anéis", "Uma jornada épica pela Terra Média, cheia de mistérios e aventuras.", 90.5, "");
        Product p2 = new Product(null, "TV Inteligente", "Desfrute de imagens nítidas e recursos inovadores para sua casa.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Desempenho imbatível e design sofisticado para profissionais criativos.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Potência e desempenho para uma experiência de jogo sem limites.", 1200.0, "");
        Product p5 = new Product(null, "Rails para Leigos", "Aprenda Rails de maneira simples e prática, mesmo sem experiência prévia.", 100.99, ""); 

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat3);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));


        User u1 = new User(null, "Nicolas Santana", "nicolas@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Mellany Pilan", "mellany@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1); 

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
