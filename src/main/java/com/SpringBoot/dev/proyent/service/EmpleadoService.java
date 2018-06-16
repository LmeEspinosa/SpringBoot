package com.SpringBoot.dev.proyent.service;

import com.SpringBoot.dev.proyent.dao.PageOptions;
import com.SpringBoot.dev.proyent.dao.ResultPage;
import com.SpringBoot.dev.proyent.entity.Empleado;
import com.SpringBoot.dev.proyent.entity.EmpleadoFilter;

public interface EmpleadoService {

    ResultPage<Empleado> getEmpleados(EmpleadoFilter filter, PageOptions pageOptions);
    
    void insert(Empleado empleado);
    
    void update(Empleado empleado);
    
    void delete(Long idEmpleado);
}
