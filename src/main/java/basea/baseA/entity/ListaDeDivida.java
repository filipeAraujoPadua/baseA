package basea.baseA.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import basea.baseA.dto.ListaDeDividaDto;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@Entity
@Table(name = "lista_divida")
@NoArgsConstructor
@AllArgsConstructor
public class ListaDeDivida implements Serializable{

	 private static final long serialVersionUID = -1559864615786877060L;
	 
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 @Column(name="id")
	 private Integer id;

	 @Column(name="cpf")
	 private int cpf;
	 
	 @Column(name="devedor")
	 private String devedor;
	 
	 @Column(name="valorAPagar")
	 private double valorAPagar;
	 
	 @Transient
	 public ListaDeDividaDto listaDeDividaDto() {
		 return new ListaDeDividaDto(cpf, devedor, valorAPagar);
	 }
	 
}
