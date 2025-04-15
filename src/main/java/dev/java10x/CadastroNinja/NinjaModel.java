package dev.java10x.CadastroNinja;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity // transforma uma classe em uma entidade do DB
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {
    String name;
    String email;
    short age;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // no args
    public NinjaModel() {

    }
    // all args
    public NinjaModel(String name, String email, short age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
