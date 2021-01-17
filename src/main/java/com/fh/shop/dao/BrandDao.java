package com.fh.shop.dao;

import com.fh.shop.entity.po.Brand;
import com.fh.shop.entity.vo.BrandParams;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BrandDao {
    @Delete("update t_brand set isDel=1 where id=#{id}")
    void delete(Integer id);
    @Insert("insert into t_brand (name,bandE,imgpath,bandDesc,ord,isdel,createDate) value (#{name},#{bandE},#{imgpath},#{bandDesc},#{ord},#{isdel},#{createDate}) ")
    Integer add(Brand brand);
    @Update("<script>update t_brand set updateDate=#{updateDate}" +
            "<if test='name != null and name != &quot;&quot;'>,name=#{name}</if>" +
            "<if test='bandE != null and bandE != &quot;&quot;'>,bandE=#{bandE}</if>" +
            "<if test='imgpath != null and imgpath != &quot;&quot;'>,imgpath= #{imgpath}</if>" +
            "<if test='bandDesc != null and bandDesc != &quot;&quot;'>,bandDesc=#{bandDesc}</if>" +
            "<if test='ord!= null and ord != &quot;&quot;'>,ord= #{ord}</if>" +
            "<if test='isdel != null and isdel!=&quot;&quot;'>,isdel=#{isdel}</if>" +

            "where id=#{id} </script>")
    void update(Brand brand);
    @Select("select * from t_brand where id=#{id}")
    Brand queryById(Integer id);
    @Select("<script> select count(1) from t_brand where 1=1 " +
            "<if test='name!=null and name !=&quot;&quot;'>and name=#{name} </if> " +

            "</script>")
    Long queryBrandCount(BrandParams params);
    @Select("<script> select * from t_brand where 1=1 " +
            "<if test='name!=null and name!=&quot;&quot;'> and name=#{name}</if>" +
            " limit #{startIndex},#{limit} </script>")
    List<Brand> queryData(BrandParams params);
}
