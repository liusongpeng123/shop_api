package com.fh.shop.dao;

import com.fh.shop.entity.po.Shop;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface ShopDao {
    @Insert("insert into t_shop (name,title,brandId,productdecs,price,stocks,sortNum,peopertyId,imgpath,createDate,isDel,author) value (#{name},#{title},#{brandId},#{productdecs},#{price},#{stocks},#{sortNum},#{peopertyId},#{imgpath},#{createDate},#{isDel},#{author})")
    void addShop(Shop shop);
    @Delete("update t_shop set isDel=1 where id=#{id}")
    void deleteShop(Integer id);
    @Update("<script>update t_shop set updateDate=#{updateDate}" +
            "<if test='name!=null and  name != &quot;&quot;'>,name=#{name}</if>" +
            "<if test='title!=null and  title != &quot;&quot;'>,title=#{title}</if>" +
            "<if test='brandId!=null'>,brandId=#{brandId}</if>" +
            "<if test='productdecs!=null and  productdecs != &quot;&quot;'>,productdecs=#{productdecs}</if>"+
            "<if test='price!=null'>,price=#{price}</if>" +
            "<if test='stocks!=null'>,stocks=#{stocks}</if>" +
            "<if test='sortNum!=null'>,sortNum=#{sortNum}</if>" +
            "<if test='peopertyId!=null'>,peopertyId=#{peopertyId}</if>" +
            "<if test='imgpath!=null and  imgpath != &quot;&quot;'>,imgpath=#{imgpath}</if>"+
            "<if test='author!=null and  author != &quot;&quot;'>,author=#{author}</if>"+
            "where id=#{id} </script>")
    void updateShop(Shop shop);
}
