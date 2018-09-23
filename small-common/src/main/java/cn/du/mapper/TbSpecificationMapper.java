package cn.du.mapper;


import cn.du.mapper.base.BaseMapper;
import cn.du.po.TbSpecification;
import cn.du.po.TbSpecificationExample;

public interface TbSpecificationMapper extends BaseMapper<TbSpecification, TbSpecificationExample> {

    int insertAndReturnPrimaryKey(TbSpecification specification);

}