package com.example.secondproject.controller;

import com.example.secondproject.wishlist.WishListDto;
import com.example.secondproject.wishlist.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private WishListService wishListService;

    // 1. 검색 API(GET)
    @GetMapping("/api/search")
    public WishListDto search(@RequestParam String searchQuery){
        WishListDto wishListDto = wishListService.search(searchQuery);
    return wishListDto;
    }
}
