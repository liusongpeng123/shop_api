package com.fh.shop.dao;

import com.fh.shop.entity.po.Peoperty;
import com.fh.shop.entity.vo.PeopertyParams;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PeopertyDao {
    @Delete("update  t_peoperty set isDel=1 where id=#{id}")
    void delete(Integer id);
    @Insert("insert into t_peoperty (peopertyId,peopertyName,typeId,peopertyType,isSku,isDel,createDate) value (#{peopertyId},#{peopertyName},#{typeId},#{peopertyType},#{isSku},#{isDel},#{createDate})")
    void addPeoperty(Peoperty peoperty);
    @Update("<script>update t_peoperty set updateDate=#{updateDate}" +
            "<if test='peopertyId!= null and peopertyId!= &quot;&quot;'>,peopertyId= #{peopertyId}</if>"+
            "<if test='peopertyName!= null and peopertyName != &quot;&quot;'>,peopertyName= #{peopertyName}</if>"+

            "<if test='typeId!= null'>,typeId= #{typeId}</if>"+
            "<if test='peopertyType!= null'>,peopertyType= #{peopertyType}</if>"+

            "<if test='isSku!= null'>,isSku= #{isSku}</if>"+
            "where id=#{id} </script>")
    void updatePeoperty(Peoperty peoperty);
    @Select("<script>select count(1) from t_peoperty where 1=1 and isDel=0" +
            "<if test='peopertyId!=null'> and peopertyId=#{peopertyId} </if>"+
            "<if test='peopertyName!=null and peopertyName!=&quot;&quot;'> and peopertyName=#{peopertyName} </if>"+
            "</script>")
    Long queryCount(PeopertyParams params);
    @Select("<script>select * from t_peoperty where 1=1 and isDel=0  " +
            "<if test='peopertyId!=null'> and peopertyId=#{peopertyId} </if>"+
            "<if test='peopertyName!=null and peopertyName!=&quot;&quot;'> and peopertyName=#{peopertyName} </if>"+
            "limit #{startIndex},#{limit} </script>")
    List<Peoperty> queryPeopertyData(PeopertyParams params);

    @Select("select * from t_peoperty where isDel=0 and id=#{id}")
    Peoperty queryPeopertyById(Integer id);
@Select("select * from t_peoperty where isDel=0 and typeId=#{typeId}")
    List<Peoperty> queryPeopertyByTypeId(Integer typeId);
}
