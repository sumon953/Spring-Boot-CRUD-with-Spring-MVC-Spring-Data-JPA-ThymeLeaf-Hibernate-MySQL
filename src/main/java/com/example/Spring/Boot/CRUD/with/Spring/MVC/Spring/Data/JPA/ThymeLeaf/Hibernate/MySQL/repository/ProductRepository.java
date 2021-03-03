package com.example.Spring.Boot.CRUD.with.Spring.MVC.Spring.Data.JPA.ThymeLeaf.Hibernate.MySQL.repository;

import com.example.Spring.Boot.CRUD.with.Spring.MVC.Spring.Data.JPA.ThymeLeaf.Hibernate.MySQL.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
