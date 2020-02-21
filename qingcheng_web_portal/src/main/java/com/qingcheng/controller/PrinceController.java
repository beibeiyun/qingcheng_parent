package com.qingcheng.controller;

import com.qingcheng.service.goods.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sku")
@CrossOrigin
public class PrinceController {
    @Autowired
    private SkuService skuService;
    @GetMapping("/price")
    public Integer Price(String id){
        return skuService.findPrice(id);
    }
}
