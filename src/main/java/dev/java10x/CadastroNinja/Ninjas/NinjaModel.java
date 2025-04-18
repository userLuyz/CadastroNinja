package dev.java10x.CadastroNinja.Ninjas;

import dev.java10x.CadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro_ninja")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera automaticamente o ID
    private Long ID;
    private String name;
    private String email;
    private short age;

    // isso quer dizer que a classe ninja so pode ter uma missao - modelo entidade relacionamento
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave secundaria ou chave estrangeira
    private MissoesModel missoes;

}
