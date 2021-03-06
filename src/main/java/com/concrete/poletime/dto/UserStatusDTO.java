package com.concrete.poletime.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserStatusDTO {
    private int status;
    private String message;
    private String email;
}
