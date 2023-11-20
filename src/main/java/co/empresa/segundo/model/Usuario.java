package co.empresa.segundo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	private Integer id;
    private String username;
    private String pass;
    private String email;
    
    
    

}
