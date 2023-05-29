package co.edu.unisabana.sigaTutoriass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TutoriaDTO {
    private int id;
    private String nombre;
    private String start;
    private String end;
    private LocalDate fecha;
    private AsignaturaEnum Asignatura;
    private String title;
    private int tutorId;

}

