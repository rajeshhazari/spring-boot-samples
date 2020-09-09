package com.example.test.springjdbcsample1.db;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("authorities_master")
@Data
 public class AuthoritiesMaster {

    @Column("id")
    private Integer id;
    @Column("role_id")
    private String roleId;
    @Column("roledesc")
    private String roledesc;
}
