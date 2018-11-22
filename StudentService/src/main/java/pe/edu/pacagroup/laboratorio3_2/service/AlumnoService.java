/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pacagroup.laboratorio3_2.service;

import java.util.List;

/**
 *
 * @author Java
 */
public interface AlumnoService {
    public List<String> dameAlumnosMayuscula();
    public String generaBienvenida(Long idAlumno);
}
