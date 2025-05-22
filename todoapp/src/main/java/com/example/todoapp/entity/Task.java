package com.example.todoapp.entity;

import jakarta.persistence.*;
import lombok.Data;

//Lombok 提供的注解，用来自动生成一些常用的代码，例如 getter、setter、toString、equals、hashCode 和 canEqual 方法。
//该注解表明这个类是一个 实体类，它将与数据库中的表进行映射。具体来说，JPA 将这个类与数据库中的一张表（默认表名为类名）对应，进行 CRUD（增、删、改、查）操作。
@Entity
@Data
public class Task {
    //主键
    //指定主键的生成策略。GenerationType.IDENTITY 表示主键的生成由数据库来自动处理，通常是通过自增的方式生成一个唯一的值
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private boolean completed;

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

}