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
    @NotEmpty(message = "El nombre es requerido")
    @NotNull(message = "Mande el campo!")
    @Size(min = 3)
    private String nombre;
    private String start;
    private String end;
    @NotNull(message = "La fecha es requerida")
    @Future(message = "La fecha debe ser una fecha futura")
    private LocalDate fecha;
    @NotEmpty(message = "La asignatura es requerido")
    @NotNull(message = "Mande el campo!")
    @Size(min = 3)
    private AsignaturaEnum Asignatura;
    @NotEmpty(message = "Es requerido")
    @NotNull(message = "Mande el campo!")
    @Size(min = 3)
    private String title;
    private int tutorId;

}

