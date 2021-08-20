package com.example.mscredit.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "credit")
@Data
public class Credit {

    @Id
    private String creditId;
    @Field(name = "customerIdentityNumber")
    private String customerIdentityNumber;
    @Field(name = "creditNumber")
    private String creditNumber;
    @Field(name = "cardNumber")
    private String cardNumber;
    @Field(name = "typeCredit")
    private String typeCredit;
    @Field(name = "product")
    private Product product;
    @Field(name = "amount")
    private Double amount;

    @Field(name = "consumDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime creditDate = LocalDateTime.now();
}
