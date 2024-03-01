package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

//Clases que heredan:
// - Clases hijas
// - subclases
// - Clases detalle
// - Clases especificas

public class Medico extends Usuario {

  
    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(int id, 
                 String nombres, 
                 String apellidos, 
                 TipoDocumento tipoDocumento, 
                 Long numeroDocumento,
                 Long registroMedico,
                 Especialidad especialidad
                 ) {

        //Si quieres instanciar un medico
        //Tambien debes instanciar el usuario         
        //super en el constructor invoca(llama, ejecuta) 
        //al constructor de la clase padre(superclase)   
        
        //super()llamada al constructor de la superclase
        //debe ser lo primero que aparezca en el
        //contructor de la clase hija    
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        //a continuacion inicializamos 
        //atributos propios de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;

    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    



    

    

    

}
