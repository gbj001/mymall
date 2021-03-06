package org.mochou.mymall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mochou.mymall.db.domain.MymallGoodsProduct;
import org.mochou.mymall.db.domain.MymallGoodsProductExample;

public interface MymallGoodsProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    long countByExample(MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int deleteByExample(MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int insert(MymallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int insertSelective(MymallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallGoodsProduct selectOneByExample(MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallGoodsProduct selectOneByExampleSelective(@Param("example") MymallGoodsProductExample example, @Param("selective") MymallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<MymallGoodsProduct> selectByExampleSelective(@Param("example") MymallGoodsProductExample example, @Param("selective") MymallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    List<MymallGoodsProduct> selectByExample(MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallGoodsProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") MymallGoodsProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    MymallGoodsProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MymallGoodsProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") MymallGoodsProduct record, @Param("example") MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") MymallGoodsProduct record, @Param("example") MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MymallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MymallGoodsProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") MymallGoodsProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mymall_goods_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}