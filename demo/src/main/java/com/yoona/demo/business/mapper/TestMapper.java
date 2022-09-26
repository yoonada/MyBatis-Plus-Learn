package com.yoona.demo.business.mapper;

import com.yoona.demo.business.domain.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yoonada
 * @since 2022-09-26 14:19:13
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
