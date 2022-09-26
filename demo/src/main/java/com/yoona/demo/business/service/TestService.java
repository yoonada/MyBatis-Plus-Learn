package com.yoona.demo.business.service;

import com.yoona.demo.business.domain.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yoona.demo.common.BaseResponse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yoonada
 * @since 2022-09-26 14:19:13
 */
public interface TestService extends IService<Test> {

    /**
     * 根据类型测试多数据查询
     *
     * @param type
     * @return
     */
    BaseResponse queryByType(Integer type);
}
