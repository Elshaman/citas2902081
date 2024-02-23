package org.ptech.java.citas.entities;
import java.time.LocalDate;

public class Paciente {

    int id;
    String nombres;
    String apellidos;
    TipoDocumento tipoDocumento;
    Long numeroDocumento;
    String email;
    Long celular;
    LocalDate fechaNacimiento;
    Double altura;
    Double peso;
    TipoSangre tipoSangre;
    char factorRH;

}
