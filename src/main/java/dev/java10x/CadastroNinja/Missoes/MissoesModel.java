package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_mission")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String nameMission;
    private char dificulty;

    // Uma missao pode ter vários ninjas - modelo entidade relacionamento
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
