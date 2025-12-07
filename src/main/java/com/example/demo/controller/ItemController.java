package com.example.demo.controller;

import com.example.demo.domain.Item;
import com.example.demo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController // REST API를 만들기 위한 컨트롤러
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    // 1. 상품 등록 API (POST /items)
    @PostMapping("/items")
    public Item createItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    // 2. 상품 조회 API (GET /items/{itemId})
    @GetMapping("/items/{itemId}")
    public Item getItem(@PathVariable("itemId") Long id) {
        // TODO: ItemService를 사용하여 ID로 상품을 찾고 찾은 Item 객체를 반환하세요.
        // 힌트: itemService.findOne(id);
        return itemService.findOne(id);
    }
}