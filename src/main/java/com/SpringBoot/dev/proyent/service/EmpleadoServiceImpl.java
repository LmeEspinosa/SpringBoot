package com.SpringBoot.dev.proyent.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.dev.proyent.dao.Dao;
import com.SpringBoot.dev.proyent.dao.PageOptions;
import com.SpringBoot.dev.proyent.dao.ResultPage;
import com.SpringBoot.dev.proyent.entity.Empleado;
import com.SpringBoot.dev.proyent.entity.EmpleadoFilter;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private Dao<Empleado, Long> dao;

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoServiceImpl.class);

    @Override
    public ResultPage<Empleado> getEmpleados(EmpleadoFilter filter, PageOptions pageOptions) {
        logger.trace("getEmpleados");
        return this.dao.get(filter, pageOptions);
    }

    @Override
    @Transactional
    public void insert(Empleado empleado) {
        logger.trace("insert");
        dao.insert(empleado);
    }

    @Override
    @Transactional
    public void update(Empleado empleado) {
        logger.trace("update");
        dao.update(empleado.getId(), empleado);
    }
    
    @Override
    @Transactional
    public void delete(Long idEmpleado) {
        logger.trace("delete");
        dao.delete(idEmpleado);
        
    }  
}
