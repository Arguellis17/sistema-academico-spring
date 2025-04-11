package sistemaAcademico.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sistemaAcademico.model.Horario;
import sistemaAcademico.service.HorarioService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/horarios")
@RequiredArgsConstructor
public class HorarioController {

    private final HorarioService horarioService;

    /**
     * Obtiene la lista de todos los horarios
     */
    @GetMapping
    public List<Horario> getAllHorarios() throws Exception {
        return horarioService.findAll();
    }

    /**
     * Obtiene un horario por su ID
     */
    @GetMapping("/{codigoHorario}")
    public Optional<Horario> getHorarioById(@PathVariable Long codigoHorario) throws Exception {
        return horarioService.findById(codigoHorario);
    }

    /**
     * Crea un nuevo horario
     */
    @PostMapping
    public Horario createHorario(@RequestBody Horario horario) throws Exception {
        return horarioService.save(horario);
    }

    /**
     * Actualiza un horario existente
     */
    @PutMapping("/{codigoHorario}")
    public Horario updateHorario(@PathVariable Long codigoHorario, @RequestBody Horario horario) throws Exception {
        horario.setCodigoHorario(codigoHorario);
        return horarioService.update(horario);
    }

    /**
     * Elimina un horario por ID
     */
    @DeleteMapping("/{codigoHorario}")
    public void deleteHorario(@PathVariable Long codigoHorario) throws Exception {
        horarioService.deleteById(codigoHorario);
    }

    /**
     * Elimina todos los horarios
     */
    @DeleteMapping
    public void deleteAllHorarios() throws Exception {
        horarioService.deleteAll();
    }

    /*
     * Métodos personalizados (descomentar si implementas en service y repository)
     */
    /*
    @GetMapping("/buscar/curso")
    public List<Horario> getHorariosByCurso(@RequestParam Long codigoCurso) throws Exception {
        Curso curso = new Curso();
        curso.setCodigoCurso(codigoCurso);
        return horarioService.findByCodigoCurso(curso);
    }

    @GetMapping("/buscar/hora-inicio")
    public List<Horario> getHorariosByHoraInicio(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date horaInicio) throws Exception {
        return horarioService.findByHoraInicio(horaInicio);
    }

    @GetMapping("/buscar/hora-fin")
    public List<Horario> getHorariosByHoraFin(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date horaFin) throws Exception {
        return horarioService.findByHoraFin(horaFin);
    }

    @GetMapping("/buscar/tipo-sesion")
    public List<Horario> getHorariosByTipoSesion(@RequestParam String tipoSesion) throws Exception {
        return horarioService.findByTipoSesion(tipoSesion);
    }
    */
}
