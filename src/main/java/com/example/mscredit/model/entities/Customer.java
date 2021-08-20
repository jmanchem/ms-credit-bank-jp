package com.example.mscredit.model.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@Document(collection = "customer")
@Data
public class Customer {
    //@Id
    //private String id;
    @NotBlank
    @Field(name = "customerIdentityType")//Tipo de documento
    private String customerIdentityType;
    @Field(name = "customerIdentityNumber")//Numero de documento
    private String customerIdentityNumber;
    @Field(name = "customerTypeEP")
    private String customerTypeEP;
    @Field(name = "customerTypeTF")
    private String customerTypeTF;
    @Size(max = 40)
    @Field(name = "name")
    private String name;
    @Size(max = 40)
    @Field(name = "lastname")
    private String lastname;
    @Size(max = 75)
    @Email
    @Field(name = "email")
    private String email;
    @Size(max = 9)
    @Field(name = "phone")
    private String phone;
    @Field(name = "address")
    private String address;

}
