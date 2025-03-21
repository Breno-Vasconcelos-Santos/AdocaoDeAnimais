package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private int idUsuario;

}
