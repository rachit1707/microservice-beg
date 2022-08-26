package com.rachit.userservice.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
}
