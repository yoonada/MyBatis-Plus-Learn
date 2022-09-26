package com.yoona.generate.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author YoonaDa
 * @email lintiaoda@suntang.com
 * @description: 生成代码工具类
 * @date 2022-09-23 17:17
 */
public class GenerateCodeUtil {


    public static void main(String[] args) {
        generate();
    }

    /**
     * 生成器
     */
    public static void generate() {
        FastAutoGenerator
                .create(Parameter.JDBC_URL, Parameter.JDBC_USERNAME, Parameter.JDBC_PASSWORD)
                .globalConfig(builder -> {
                    builder
                            .author(Parameter.AUTHOR) // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(Parameter.OUTPUT_DIR + "/src/main/java")// 指定输出目录
                            .commentDate("yyyy-MM-dd HH:mm:ss")
                            .disableOpenDir();// 生成代码后不打开输出目录
                })
                .packageConfig(builder -> {
                    builder.parent(Parameter.PARENT_PACKAGE) // 设置父包名
                            .moduleName(Parameter.PARENT_MODULE_NAME) // 设置父包模块名
                            .entity("domain.entity")
                            .controller("controller") // Controller 包名	默认值:controller
//                            .other("other") // 自定义文件包名	输出自定义文件时所用到的包名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, Parameter.OUTPUT_DIR + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(Parameter.INCLUDE_TABLES) // 设置需要生成的表名
                            .addTablePrefix(Parameter.TABLE_PREFIX)// 设置过滤表前缀
                            .entityBuilder().superClass(Parameter.PARENT_ENTITY).enableChainModel().enableLombok()
                            .mapperBuilder().enableBaseColumnList().enableBaseResultMap().enableMapperAnnotation()
                            .controllerBuilder().enableRestStyle()//开启@RestController风格
                            .serviceBuilder().formatServiceFileName("%sService"); //去掉默认的I前缀
                })
                //使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }

}

