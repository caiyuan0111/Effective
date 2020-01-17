package com.effective.common.javabean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Description
 * @author:caiyuan
 * @date:2019/10/25 0025
 * @ver:1.0
 **/
@Document(indexName = "person",type = "docs",shards = 1,replicas = 0)
public class Person {

    @Id
    private int id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
