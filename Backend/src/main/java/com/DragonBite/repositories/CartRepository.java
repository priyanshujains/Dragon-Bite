package com.DragonBite.repositories;

import com.DragonBite.models.Cart;
import com.DragonBite.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Optional<Cart> findByUser(User user);
}
