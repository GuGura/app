package com.folder.app.dto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private int no;
    private String name;
    private String email;
    private String pwd;
    private Boolean gender;
    private Boolean del;
    private LocalDate regDate;
}
