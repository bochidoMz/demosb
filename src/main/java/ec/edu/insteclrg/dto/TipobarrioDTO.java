package ec.edu.insteclrg.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class TipobarrioDTO {
	
    private Long id;
    private String nombre;
    private String identificadorxColor;
    
}