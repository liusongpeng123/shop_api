package com.fh.shop.service;

import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.entity.vo.PageResult;
import com.fh.shop.entity.vo.PeopertyParams;

import java.util.List;

public interface PeopertyService {
    void delete(Integer id);

    void addPeoperty(Peoperty peoperty);

    void updatePeoperty(Peoperty peoperty);

    PageResult<Peoperty> queryPeopertyData(PeopertyParams params);

    Peoperty queryPeopertyById(Integer id);

    List<Peoperty> queryPeopertyByTypeId(Integer typeId);
}
