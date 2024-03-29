package org.ptech.java.citas.entities;

public class Medico {

    //POR REGLA GENERAL:
    // los atributos de una clase
    // deben ser private
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private Long registroMedico;
    private Especialidad especialidad;

    //constructor por defecto
    //siempre debe ser public
    public Medico(){

    }

    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    //Getters y Setters 
    //deben ser publicos
    // Firma de un Getter:
    // Tipo de dato de retorno: 
    //           es el t.d del atributo
    // Nombre del metodo:
    //           get seguido del nombre del atributo  
    // Paramentros: 0
    // retorna: El valor del atributo
    public String getNombres() {
        //return sirve para
        //retornar el valor
        //al invocante
        return this.nombres;
    }

    //Setter: sirve para asignar
    // un valor a un atributo privado
    //Firma de un setter:
    // - Tipo de dato de retorno: void
    // - Nombre: set seguido del nombre del atributo
    // - Parametros: 1, input del valor a asignar al
    //                  al atributo
    // - Retorna: nada
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
    

    

}
