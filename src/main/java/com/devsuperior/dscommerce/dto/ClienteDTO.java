package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;

public class ClienteDTO {

    private Long id;
    private String name;

    public ClienteDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClienteDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
