package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {

    //Proponer un metodo para agendar 
    //cita
    public boolean agendarCita(LocalDateTime fecha, Consultorio c );
    //proponer un metodo para reagendar cita
    public boolean reAgendarCita(LocalDateTime nuevaFecha , Consultorio nuevoc);
    //cancelar una cita
    public boolean cancelarCita();

}
