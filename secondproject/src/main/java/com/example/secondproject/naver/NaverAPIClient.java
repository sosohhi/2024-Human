package com.example.secondproject.naver;

import com.example.secondproject.naver.dto.SearchImageRequestDto;
import com.example.secondproject.naver.dto.SearchImageResponseDto;
import com.example.secondproject.naver.dto.SearchRegionRequestDto;
import com.example.secondproject.naver.dto.SearchRegionResponseDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class NaverAPIClient {
    // api호출시 가장 먼저 확인해야 할 것은 model의 dto
    //request dto, response dto

    //1. 지역검색 API Call Method
    public SearchRegionResponseDto searchRegion (SearchRegionRequestDto searchRegionRequestDto) {
        // Spring boot에서 실제 api call하는 라이브러리 -> RestTemplate
        // RestTemplate에 대응하는 자바스크립트 라이브러리 -> axios, fetch, ajax 등

        HttpEntity httpEntity = getHttpEntity();

       return new RestTemplate().exchange(getURI("/v1/search/local.json", searchRegionRequestDto.getQuery()), HttpMethod.GET, httpEntity,SearchRegionResponseDto.class )
                .getBody();
    }

    // 2. 이미지 검색 API Call Method
    public SearchImageResponseDto searchImage (SearchImageRequestDto searchImageRequestDto) {
        // Spring boot에서 실제 api call하는 라이브러리 -> RestTemplate
        // RestTemplate에 대응하는 자바스크립트 라이브러리 -> axios, fetch, ajax 등

        HttpEntity httpEntity = getHttpEntity();


        return new RestTemplate().exchange(getURI("/v1/search/image.json", searchImageRequestDto.getQuery()), HttpMethod.GET, httpEntity,SearchImageResponseDto.class )
                .getBody();
    }
    // 공통화 리팩토링

    // 1. HttpHeader 공통화
    private HttpHeaders getHttpHeaders()    {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", "lHoYty2_qLWLX2Uvw7Fv");
        headers.set("X-Naver-Client-Secret", "zr4K_h92xd");
        headers.setContentType(MediaType.APPLICATION_JSON);

        return headers;
    };
    // 2. HttpEntity 공통화
    private HttpEntity getHttpEntity() {
        HttpHeaders httpHeaders = getHttpHeaders();
        return new HttpEntity(httpHeaders);
    }
    // 3. URI관련 공통화
    private URI getURI(String path, String query) {
        return UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path(path)
                .queryParam("query",query)
                .encode()
                .build()
                .toUri();
    }
}
