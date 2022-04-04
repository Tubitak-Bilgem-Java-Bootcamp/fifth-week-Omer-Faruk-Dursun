package dev.patika.app.bankingapplication.repository;

import dev.patika.app.bankingapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
