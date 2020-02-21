package com.qingcheng.service.impl;

import com.qingcheng.service.goods.CategoryService;
import com.qingcheng.service.goods.SkuService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class lint implements InitializingBean {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private SkuService skuService;

    public void afterPropertiesSet() throws Exception {
        System.out.println("缓存预热");
        categoryService.savefindCategoryTreeRedis();  //增加分类到缓存里
        skuService.saveAllPriceToReids();   //  增加价格到缓存里面

    }
}
