package basea.baseA.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListaDeDividaDto {

	private int cpf;
	private String devedor;
	private double valorAPagar;
	
}
