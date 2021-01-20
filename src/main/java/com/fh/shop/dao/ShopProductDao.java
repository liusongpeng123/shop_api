package com.fh.shop.dao;

import com.fh.shop.entity.po.ShopProduct;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ShopProductDao {
    @Insert("insert into t_shopProduct (proId,attrData,stockss,prices) value (#{proId},#{attrData},#{stockss},#{prices})")
    void addShopProduct(ShopProduct shopProduct);
    @Update("update t_shopProduct set proId=#{proId},attrData=#{attrData},stockss=#{stockss},prices=#{prices} where id=#{id}")
    void updateShopProduct(ShopProduct shopProduct);
    @Select("select * from t_shopProduct where id=#{id}")
    ShopProduct queryShopProductById(Integer id);
    @Delete("delete from t_shopProduct where id=#{id}")
    void deleteShopProduct(Integer id);
}
