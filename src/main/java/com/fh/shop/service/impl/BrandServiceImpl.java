package com.fh.shop.service.impl;

import com.fh.shop.dao.BrandDao;
import com.fh.shop.entity.po.Brand;
import com.fh.shop.entity.vo.BrandParams;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;
    @Override
    public void delete(Integer id) {
        brandDao.delete(id);
    }

    @Override
    public void add(Brand brand) {
        brand.setCreateDate(new Date());
        brand.setIsdel(0);
     brandDao.add(brand);
    }

    @Override
    public List<Brand> queryAllBrandData() {
        return brandDao.queryAllBrandData();
    }
//



    @Override
    public void update(Brand brand) {
        brand.setUpdateDate(new Date());
        brandDao.update(brand);
    }

    @Override
    public Brand queryById(Integer id) {
        return brandDao.queryById(id);
    }

    @Override
    public PageResult<Brand> queryData(BrandParams params) {
        Long count= brandDao.queryBrandCount(params);
        params.setStartIndex((params.getPage()-1)*params.getLimit());
        List<Brand> list=brandDao.queryData(params);
        PageResult<Brand> brand=new PageResult<>(count,list);
        return brand;
    }
}
