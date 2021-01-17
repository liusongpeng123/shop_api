package com.fh.shop.service;

import com.fh.shop.entity.po.PeopertyValue;

import java.util.List;

public interface PeopertyValueService {
    void deletePeopertyValue(Integer id);

    PeopertyValue quertyPeopertyValueById(Integer id);

    void updatePeopertyValue(PeopertyValue peopertyValue);

    void addPeopertyValue(PeopertyValue peopertyValue);

    List<PeopertyValue> queryByPeoId(Integer peoId);
}
