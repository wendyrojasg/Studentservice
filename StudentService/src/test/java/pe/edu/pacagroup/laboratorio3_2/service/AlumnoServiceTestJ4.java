/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pacagroup.laboratorio3_2.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pe.edu.pacagroup.laboratorio3_2.dao.AlumnoDao;
import pe.edu.pacagroup.laboratorio3_2.service.impl.AlumnoServiceImpl;

/**
 *
 * @author Java
 */
public class AlumnoServiceTestJ4 {
    
    AlumnoDao alumnoDaoMock;
    
      
    @Before
    public void previoTest() {
        alumnoDaoMock = new AlumnoDaoMock();
    }
    
    @After
    public void despuesTest() {
        
    }

    @Test
    public void pruebaDameAlumnosMayuscula() {
        AlumnoServiceImpl alumnoService = new AlumnoServiceImpl();
        alumnoService.setAlumnoDao(alumnoDaoMock);
        List<String> listaAlumnos = alumnoService.dameAlumnosMayuscula();
        assertEquals("MARIA MEZA", listaAlumnos.get(0));
        assertEquals("JUAN PEREZ", listaAlumnos.get(1));
    }
    
    @Test
    public void pruebaGeneraBienvenida() {
        AlumnoServiceImpl alumnoService = new AlumnoServiceImpl();
        alumnoService.setAlumnoDao(alumnoDaoMock);
        String saludo = alumnoService.generaBienvenida(1L);
        assertEquals("Bienvenido Alumno Pacagroup al curso de Java Advanced", saludo);
    }
    
    private class AlumnoDaoMock implements AlumnoDao {

        @Override
        public List<String> encontrarAlumnos() {
            List<String> result = new ArrayList<>();
            result.add("Maria Meza");
            result.add("Juan Perez");
            return result;
        }

        @Override
        public String dameAlumno(Long idAlumno) {
            return "Alumno Pacagroup";
        }
        
    }
}
