package com.example.todoapp.repository;

import com.example.todoapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
//JpaRepository 是 Spring Data JPA 的核心接口之一，
// 它使得我们能够在不编写任何 SQL 或 JPA 查询语言（JPQL）的情况下，
// 进行常见的数据库操作。通过继承这个接口，Spring 会为你提供一些基础的数据库操作方法。
