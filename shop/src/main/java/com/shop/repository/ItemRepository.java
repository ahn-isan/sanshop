package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByItemNm(String itemNm);

    List<Item> findByItemNmOrItemDetail(String iteNm, String itemDetail);
    //상품을 상품명과 상품상세 설명을 or 조건을 이용하여 조회하는 쿼리메소드

}
