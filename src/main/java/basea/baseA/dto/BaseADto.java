package basea.baseA.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseADto {
	private int cpf;
	private String nome;
	private String endereco;
	//private List<ListaDeDividaDto> listaDivida;
}
