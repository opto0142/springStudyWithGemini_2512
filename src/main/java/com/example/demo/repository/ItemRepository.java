package com.example.demo.repository;

import com.example.demo.domain.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItemRepository {

    public Item save(Item item);

    public Item findById(Long id);

    public List<Item> findAll();
}
