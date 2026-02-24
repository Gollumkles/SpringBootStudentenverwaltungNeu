package at.itkollegimst.studentenverwaltung.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExeptionDTO {

    private String code;
    private String message;
}
