package com.fh.shop.service;

import com.fh.shop.entity.po.Brand;
import com.fh.shop.entity.vo.BrandParams;
import com.fh.shop.entity.vo.PageResult;

public interface BrandService {
    void delete(Integer id);

    

    void update(Brand brand);

    Brand queryById(Integer id);

    PageResult<Brand> queryData(BrandParams params);

    void add(Brand brand);
}
