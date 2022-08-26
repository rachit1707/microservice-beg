package com.rachit.userservice.user.dto;

import com.rachit.userservice.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserResponseDTO {

    private User user;
    private Department department;

}
