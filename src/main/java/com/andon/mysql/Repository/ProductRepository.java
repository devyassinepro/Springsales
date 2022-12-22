package com.andon.mysql.Repository;

import com.andon.mysql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByPublished(boolean published);
    List<Product> findByTitleContaining(String title);


}
