package org.tlias.pojo;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Emp {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender;
    private String image;
    private Short job;
    private LocalDateTime entrydate;
    private Integer dept_id;
    private LocalDateTime create_time;
    private LocalDateTime update_time;



}
