package com.didispace.bean;

import com.didispace.connn.SexEnum;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import javax.persistence.*;

// 下面的@Getter ，@Setter 注解也可用 @Data代替，
// 使用 @Data可直接生成getter，setter
// 标明是一个实体类
// @Alias 为指定别名
@Alias(value="user")
@Data
public class User {

    private Long id;

    private String userName;

    // 性别枚举，这里需要使用typeHandler进行转换
    private SexEnum sex;

    private String note;

}
