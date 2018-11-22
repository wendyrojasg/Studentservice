/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pacagroup.laboratorio3_2.service.impl;

import java.util.ArrayList;
import java.util.List;

import pe.edu.pacagroup.laboratorio3_2.dao.AlumnoDao;
import pe.edu.pacagroup.laboratorio3_2.dao.impl.AlumnoDaoImpl;
import pe.edu.pacagroup.laboratorio3_2.service.AlumnoService;

/**
 *
 * @author Java
 */
public class AlumnoServiceImpl implements AlumnoService{

    AlumnoDao alumnoDao = new AlumnoDaoImpl();
    
    @Override
    public List<String> dameAlumnosMayuscula() {
        List<String> alumnos = alumnoDao.encontrarAlumnos();
        List<String> alumnosMayuscula = new ArrayList<>();
        for (int i = 0; i < alumnos.size(); i++) {
            alumnosMayuscula.add(alumnos.get(i).toUpperCase());
        }
        return alumnosMayuscula;
    }

    @Override
    public String generaBienvenida(Long idAlumno) {
        String nombreAlumno = alumnoDao.dameAlumno(idAlumno);
        return "Bienvenido " + nombreAlumno + " al curso de Java Advanced";
    }

    public AlumnoDao getAlumnoDao() {
        return alumnoDao;
    }

    public void setAlumnoDao(AlumnoDao alumnoDao) {
        this.alumnoDao = alumnoDao;
    }

}
