package com.example.secondproject.wishlist;

import com.example.secondproject.naver.NaverAPIClient;
import com.example.secondproject.naver.dto.SearchImageRequestDto;
import com.example.secondproject.naver.dto.SearchImageResponseDto;
import com.example.secondproject.naver.dto.SearchRegionRequestDto;
import com.example.secondproject.naver.dto.SearchRegionResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {
    @Autowired
    private NaverAPIClient naverAPIClient;

    public WishListDto search(String paramQuery) {
        WishListDto wishListDto = new WishListDto();

        // 1. NAVER API 지역검색 호출해서 dto값 매핑코드
        SearchRegionRequestDto searchRegionRequestDto = new SearchRegionRequestDto();
        searchRegionRequestDto.setQuery(paramQuery);

        SearchRegionResponseDto searchRegionResponseDto = naverAPIClient.searchRegion(searchRegionRequestDto);
        // searchRegionResponse ->WishListDto에 매핑
        List<SearchRegionResponseDto.SearchRegionItem> searchRegionItemList =
        searchRegionResponseDto.getItems();
        if (searchRegionItemList != null && searchRegionItemList.size()>0) {
            SearchRegionResponseDto.SearchRegionItem searchRegionItem= searchRegionItemList.get(0);

            wishListDto.setTitle(searchRegionItem.getTitle());
            wishListDto.setCategory(searchRegionItem.getCategory());
            wishListDto.setJibunAddress(searchRegionItem.getAddress());
            wishListDto.setRoadAddress(searchRegionItem.getRoadAddress());
            wishListDto.setHomepageLink(searchRegionItem.getLink());
        }
        // 2. NAVER API 이미지검색 호출해서 dto값 매핑코드
        SearchImageRequestDto searchImageRequestDto = new SearchImageRequestDto();
        searchImageRequestDto.setQuery(paramQuery);

        SearchImageResponseDto searchImageResponseDto = naverAPIClient.searchImage(searchImageRequestDto);

        List<SearchImageResponseDto.SearchImageItem> searchImageItemList = searchImageResponseDto.getItems();
        if (searchImageItemList != null && searchImageItemList.size()>0) {
            SearchImageResponseDto.SearchImageItem searchImageItem =searchImageItemList.get(0);
            wishListDto.setImageLink(searchImageItem.getLink());
        }
        return wishListDto;
    }
}
