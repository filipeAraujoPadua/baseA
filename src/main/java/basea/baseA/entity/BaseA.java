package basea.baseA.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import basea.baseA.dto.BaseADto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name = "base_dados")
@NoArgsConstructor
@AllArgsConstructor
public class BaseA implements Serializable{
	 private static final long serialVersionUID = -1559864615786877060L;
	 
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 @Column(name="id")
	 private Integer id;

	 @Column(name="cpf")
	 private int cpf;
	 
	 @Column(name="nome")
	 private String nome;
	 
	 @Column(name="endereco")
	 private String endereco;
	 
	 @Transient
	 public BaseADto baseADto() {
		 return new BaseADto(cpf, nome, endereco);
	 }
	
}
