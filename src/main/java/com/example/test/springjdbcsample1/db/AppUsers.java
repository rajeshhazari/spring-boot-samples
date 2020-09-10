package com.example.test.springjdbcsample1.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Table("APPUSERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUsers implements Serializable {
    private @Id
    Long userid;
    private String username;
    private String password;
    private String email;

    @MappedCollection(idColumn="userid", keyColumn="userid")
    private Set<AppUsersAuth> appUsersAuthList ;
}


