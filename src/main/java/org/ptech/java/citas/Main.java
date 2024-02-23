package org.ptech.java.citas;

import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {
       
        //Crear un objeto medico
        //Instanciar un medico
        //Una manera de dar valor
        //a atributos privados en una clase
        //es a traves de el constructor
        //parametrizado
        Medico m = new Medico(1, 
                             "Cristian" ,
                             "Buitrago" ,
                              TipoDocumento.PPT,
                              1203230123412L, 
                              345345345L , 
                              Especialidad.MEDICINA_GENERAL );

        //instanciar otro medico
        Medico m2 = new Medico();
        //Se debe utilizar primero el setter
        //del atributo a asignar
        m2.setNombres("Carla");
        m2.setApellidos("Giraldo");
        m2.setNumeroDocumento(12332131L);
        System.out.println(m2.getNombres());
        

    }
}