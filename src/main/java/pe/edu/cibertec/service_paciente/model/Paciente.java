package pe.edu.cibertec.service_paciente.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente {
    private Integer id;
    private String name;
    private String dni;

    public Paciente(Integer id, String name , String dni) {
        this.id = id;
        this.name = name;
        this.dni = dni;
    }
}
