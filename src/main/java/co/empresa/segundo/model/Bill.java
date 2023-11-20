package co.empresa.segundo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
	private Integer id;
    private Date date_bill;
    private Integer userId;
    private Integer value;
    private Integer type;
    
    

}
