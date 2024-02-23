package org.ptech.java.citas.entities;
import java.time.LocalDateTime;

public class Cita {

    int id;
    LocalDateTime fecha;
    Medico medico;
    Paciente paciente;
    Consultorio consultorio;
    EstadoCita estado;

}
