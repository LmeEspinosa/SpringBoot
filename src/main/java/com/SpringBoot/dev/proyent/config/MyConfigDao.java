package com.SpringBoot.dev.proyent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.SpringBoot.dev.proyent.dao.Dao;
import com.SpringBoot.dev.proyent.dao.DaoEntityManagerImpl;
import com.SpringBoot.dev.proyent.entity.Empleado;

@Configuration
//@EnableWebMvc

public class MyConfigDao {

    @Bean
    public Dao<Empleado, Long> getEmpleadoDao() {
        return new DaoEntityManagerImpl<>(Empleado.class);
    }
}
