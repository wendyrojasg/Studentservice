/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pacagroup.laboratorio3_2.dao.impl;

import java.util.ArrayList;
import java.util.List;

import pe.edu.pacagroup.laboratorio3_2.dao.AlumnoDao;

/**
 *
 * @author Java
 */
public class AlumnoDaoImpl implements AlumnoDao{

    @Override
    public List<String> encontrarAlumnos() {
        List<String> result = new ArrayList<>();
        result.add("Francisco Verastegui Meza");
        result.add("Percy Sonan Higa");
        result.add("Eduardo Nieto Marquez");
        result.add("Pamela Linera Holmes");
        return result;
    }

    @Override
    public String dameAlumno(Long idAlumno) {
        return "Jaime" + idAlumno;
    }
    
}
