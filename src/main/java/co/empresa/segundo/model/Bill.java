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
    
	public Bill(Date date_bill, Integer userId, Integer value, Integer type) {
		super();
		this.date_bill = date_bill;
		this.userId = userId;
		this.value = value;
		this.type = type;
	}
    
    
    

}
