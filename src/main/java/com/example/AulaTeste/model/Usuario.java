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
@Entity(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
   
    @Id()
    @GeneratedValue()
    private UUID codigo_usuario;

    @Column(name = "nome da empresa")
    private String nome_da_empresa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private String idade;

    @Column(name = "dataDeNascimento")
    private String dataDeNascimento;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "email")
    private String email;

    @Column(name  = "telefone")
    private String telefone;
 
}
