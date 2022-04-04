package dev.patika.app.bankingapplication.repository;

import dev.patika.app.bankingapplication.model.Account;
import dev.patika.app.bankingapplication.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            repository.save(new User("Omer","12345678912"));
            repository.save(new User("Ali","18345978912"));
        };
    }
}
