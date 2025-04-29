package segurancadotrabalho.formulario.model;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "Formulario")
@AllArgsConstructor
@NoArgsConstructor

public class FormularioDoCliente {
   
    @Id()
    @GeneratedValue()
    private UUID codigo_usuario;

    @Column(name = "nome")
    private String nome;

    @Column(name = "telefone_fixo")
    private String telefonefixo;

    @Column(name = "endereco")
    private String endereco;

    @Column(name  = "celular")
    private String celular;

    @Column(name = "cnpj")
    private String cnpj;

}