package com.pablohenrique.ecommerce.repositories;

import com.pablohenrique.ecommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
