package com.grupo9.tpintegrador.controllers.requests.states;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class SaveStateRequest {
    private String nombre;
    private String descripcion;
}
