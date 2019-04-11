package net.yiyutao.dubbo.cli.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author masterYI
 */
@Data
public class User implements Serializable {

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;
}