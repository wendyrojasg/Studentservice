/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pacagroup.laboratorio3_2.service;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import pe.edu.pacagroup.laboratorio3_2.dao.AlumnoDao;
import pe.edu.pacagroup.laboratorio3_2.service.impl.AlumnoServiceImpl;

/**
 *
 * @author Java
 */
public class AlumnoServiceTest extends TestCase {
    
    AlumnoDao alumnoDaoMock;
    
    public AlumnoServiceTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        alumnoDaoMock = new AlumnoDaoMock();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    
    public void testDameAlumnosMayuscula() {
        AlumnoServiceImpl alumnoService = new AlumnoServiceImpl();
        alumnoService.setAlumnoDao(alumnoDaoMock);
        List<String> listaAlumnos = alumnoService.dameAlumnosMayuscula();
        assertEquals("MARIA MEZA", listaAlumnos.get(0));
        assertEquals("JUAN PEREZ", listaAlumnos.get(1));
    }
    
    public void testGeneraBienvenida() {
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
