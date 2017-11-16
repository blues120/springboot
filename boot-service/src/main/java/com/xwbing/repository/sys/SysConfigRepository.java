package com.xwbing.repository.sys;

import com.xwbing.entity.SysConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 说明:
 * 项目名称: boot-module-demo
 * 创建时间: 2017/5/5 16:44
 * 作者:  xiangwb
 */
public interface SysConfigRepository extends JpaRepository<SysConfig, String> {
    SysConfig getByCode(String code);

    List<SysConfig> getByEnable(String enable);
}