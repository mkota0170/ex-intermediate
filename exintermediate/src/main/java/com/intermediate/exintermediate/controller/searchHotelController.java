package com.intermediate.exintermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intermediate.exintermediate.domain.searchHotel;
import com.intermediate.exintermediate.service.searchHotelService;

@Controller
@RequestMapping("/ex02")
public class searchHotelController {
    
    @Autowired
    private searchHotelService service;

    /**
     * 入力画面へ遷移するメソッド
     * @param model
     * @return 入力画面
     */
    @RequestMapping("")
    public String index(Model model){
        return "inputHotelDate";
    }
    
    /**
     * 引数で渡された金額に応じて条件に一致するホテルの情報を返すメソッド
     * @param price
     * @param model
     * @return 取得したホテルの情報一覧
     */
    @RequestMapping("/searchHotel")
    public String searchByLessThanPrice(Integer price, Model model){
        List<searchHotel> hotelList = service.searchByLessThanPrice(price);
        model.addAttribute("hotelList", hotelList);
        return "inputHotelDate";
    }
}
