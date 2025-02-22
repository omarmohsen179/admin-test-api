package com.santechture.api.dto.admin;

import com.santechture.api.entity.Admin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDto {

    private Integer adminId;

    private String username;

    public AdminDto(Admin admin){
        setAdminId(admin.getAdminId());
        setUsername(admin.getUsername());
    }

}
