package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String rua;
    private String bairro;
    private int numero;
    private String cep;
    private String complemento;
    private String cidade;
    private String estado;

}
