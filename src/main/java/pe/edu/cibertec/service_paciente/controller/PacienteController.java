package pe.edu.cibertec.service_paciente.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.service_paciente.model.Paciente;


import pe.edu.cibertec.service_paciente.service.PacienteService;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService pacienteService;

    @GetMapping("/list")
    public ResponseEntity<List<Paciente>> obtenerPacientes() {
        List<Paciente> pacientes = pacienteService.obtenerPacientes();
        return new ResponseEntity<>(pacientes, HttpStatus.OK); // Devuelve 200 OK
    }

    @GetMapping("/{id}") // Método HTTP GET
    public ResponseEntity<Paciente> obtenerPacientePorId(@PathVariable int id) {
        Paciente paciente = pacienteService.obtenerPacientePorId(id);
        if (paciente != null) {
            return new ResponseEntity<>(paciente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/saludo-paciente")
    public String saludoPacientes(){
        return "HOLA DESDE EL SERVICIO DE PACIENTES ";
    }

    @GetMapping("/info-paciente")
    public String informacionDelPaciente(){
        return "Informacion Del Paciente"   ;
    }







}
