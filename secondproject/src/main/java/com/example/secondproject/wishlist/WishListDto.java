package com.example.secondproject.wishlist;

import lombok.Data;

@Data

public class WishListDto {
    private String title;       // 검색결과 제목
    private String category;      // 검색결과 카테고리
    private String jibunAddress;
    private String roadAddress;
    private String homepageLink;
    private String imageLink;
}
