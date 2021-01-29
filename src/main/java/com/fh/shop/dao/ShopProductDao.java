package com.fh.shop.dao;

import com.fh.shop.entity.po.ShopProduct;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ShopProductDao {
    @Insert("insert into t_shopProduct (proId,attrData,stockss,prices) value (#{proId},#{attrData},#{stockss},#{prices})")
    void addShopProduct(ShopProduct shopProduct);
    @Insert("<script>insert into t_shopProduct (proId,attrData,stockss,prices) values" +
            "<foreach collection='list' item='a' separator=','>(#{a.proId},#{a.attrData},#{a.stockss},#{a.prices})"+
            " </foreach> </script>")
    void addDouble(List<ShopProduct> list);
    @Update("update t_shopProduct set proId=#{proId},attrData=#{attrData},stockss=#{stockss},prices=#{prices} where id=#{id}")
    void updateShopProduct(ShopProduct shopProduct);
    @Select("select * from t_shopProduct where id=#{id}")
    ShopProduct queryShopProductById(Integer id);
    @Delete("delete from t_shopProduct where id=#{id}")
    void deleteShopProduct(Integer id);
    @Select("select * from t_shopProduct where proId=#{proId}")
    List<ShopProduct> queryShopProductByProId(Integer proId);
}
