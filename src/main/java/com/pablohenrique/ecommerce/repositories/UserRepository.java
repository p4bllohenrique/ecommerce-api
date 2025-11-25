package com.pablohenrique.ecommerce.repositories;

import com.pablohenrique.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
