package com.example.springboot_mongodb.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("Book")
@Data
public class Book {

    @Id
    @Indexed
    private String id;

    @Field("name")
    private String name;

    @Field("author")
    private String author;

    @Field("createTime")
    private Date createTime;

}
