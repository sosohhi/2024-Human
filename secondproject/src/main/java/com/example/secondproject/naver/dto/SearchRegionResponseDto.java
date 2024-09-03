package com.example.secondproject.naver.dto;

import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchRegionResponseDto {
    private String lastBuildDate;
    private Integer total;
    private Integer start;
    private Integer display;
    // items
    private List<SearchRegionItem> items;

    @ToString
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SearchRegionItem    {
        private String title;
        private String link;
        private String category;
        private String description;
        private String telephone;
        private String address;
        private String roadAddress;
        private String mapx;
        private String mapy;

    }
}
