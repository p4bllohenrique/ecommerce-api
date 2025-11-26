package com.pablohenrique.ecommerce.repositories;

import com.pablohenrique.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
