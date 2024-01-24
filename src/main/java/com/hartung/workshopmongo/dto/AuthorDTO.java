package com.hartung.workshopmongo.dto;

import com.hartung.workshopmongo.domain.User;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;

public class AuthorDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String name;

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
