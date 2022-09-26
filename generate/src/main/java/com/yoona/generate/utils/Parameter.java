package com.yoona.generate.utils;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description: 配置参数
 * @date 2022-09-26 10:10
 */
public interface Parameter {

    /**
     * 需要生成的表
     */
    String[] INCLUDE_TABLES = new String[]{"sys_dept", "sys_user"};

    /**
     * 代码输出路径
     */
    String OUTPUT_DIR = "C:\\Users\\dell\\Desktop\\MyBatis-Plus-Learn\\generate";

    /**
     * 父级包名
     */
    String PARENT_PACKAGE = "com.yoona.generate";

    /**
     * 父级模块名称
     */
    String PARENT_MODULE_NAME = "business";

    /**
     * 作者
     */
    String AUTHOR = "yoonada";

    /**
     * 数据库链接
     */
    String JDBC_URL = "jdbc:mysql://192.168.118.128:3307/yoona-cloud?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";

    /**
     * 账户名
     */
    String JDBC_USERNAME = "root";

    /**
     * 密码
     */
    String JDBC_PASSWORD = "DD123456aa";


    /**
     * 表前缀
     */
    String[] TABLE_PREFIX = new String[]{"t_", "sys_"};

    /**
     * 父级实体
     */
    String PARENT_ENTITY = "com.demo.generate.common.BaseEntity";


}