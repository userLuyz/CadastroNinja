package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String nameMission;
    private char dificulty;

    // Uma missao pode ter vários ninjas - modelo entidade relacionamento
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel() {
    }

    public MissoesModel(String nameMission, char dificulty) {
        this.nameMission = nameMission;
        this.dificulty = dificulty;
    }

    public String getNameMission() {
        return nameMission;
    }

    public void setNameMission(String nameMission) {
        this.nameMission = nameMission;
    }

    public char getDificulty() {
        return dificulty;
    }

    public void setDificulty(char dificulty) {
        this.dificulty = dificulty;
    }
}
