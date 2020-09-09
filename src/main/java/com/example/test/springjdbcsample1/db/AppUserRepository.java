package com.example.test.springjdbcsample1.db;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AppUserRepository extends CrudRepository<AppUsers, Long> {

    @Query("select * from APPUSERS where upper(email) = upper(:email)   ")
    AppUsers findByEmail(@Param("email") String email);
}
