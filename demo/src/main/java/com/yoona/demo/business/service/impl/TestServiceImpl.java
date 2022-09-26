package com.yoona.demo.business.service.impl;

import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yoona.demo.business.domain.entity.Test;
import com.yoona.demo.business.mapper.TestMapper;
import com.yoona.demo.business.service.TestService;
import com.yoona.demo.common.BaseResponse;
import com.yoona.demo.common.SystemResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yoonada
 * @since 2022-09-26 14:19:13
 */
@DS("master")
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    /**
     * 根据类型测试多数据查询
     *
     * @param type
     * @return
     */
    @Override
    public BaseResponse queryByType(Integer type) {
        TestServiceImpl testService = SpringUtil.getBean(TestServiceImpl.class);
        if (1 == type) {
            return SystemResponse.success(testService.testList1());
        }
        if (2 == type) {
            return SystemResponse.success(testService.testList2());
        }
        if (3 == type) {
            return SystemResponse.success(testService.testList3());
        }
        return null;
    }

    public List<Test> testList1() {
        return list();
    }

    @DS("slave_1")
    public List<Test> testList2() {
        return list();
    }

    @DS("slave_2")
    public List<Test> testList3() {
        return list();
    }

}
