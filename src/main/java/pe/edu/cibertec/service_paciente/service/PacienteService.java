package pe.edu.cibertec.service_paciente.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.service_paciente.model.Paciente;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private List<Paciente> pacientes = new ArrayList<>();


    public PacienteService() {
        Paciente p1 = new Paciente(1, "Luis Saldaña", "75477270");
        Paciente p2 = new Paciente(2, "Adrian LLontop","85456923");
        Paciente p3 = new Paciente(3,"Jose Lagos","75315985");
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
    }

    public Paciente altaPaciente(String nombre, String documento) {
        int nuevoId = pacientes.size() + 1;
        Paciente nuevoPaciente = new Paciente(nuevoId, nombre, documento);
        pacientes.add(nuevoPaciente);
        return nuevoPaciente;
    }


    public List<Paciente> obtenerPacientes() {
        return pacientes;
    }

    public Paciente obtenerPacientePorId(int id) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == id) {
                return paciente;
            }
        }
        return null;
    }
}
