package com.example.springbootblogrestapi.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CommentDto {
    private long id;

    @NotEmpty(message = "Name should not be null or empty")
    private String name;


    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 5, message = "Comment must be minimum 10 characters")
    private String body;
}
