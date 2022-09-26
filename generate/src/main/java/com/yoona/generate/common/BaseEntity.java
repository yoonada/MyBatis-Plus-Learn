package com.yoona.generate.common;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description: 父类实体
 * @date 2022-04-21 16:16
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 2817238157225518775L;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    public Long createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    public Long updateTime;

    @TableLogic
    @ApiModelProperty(value = "是否删除：0、未删除；1、删除")
    @TableField(value = "is_delete", fill = FieldFill.INSERT_UPDATE)
    private Integer isDelete;

}