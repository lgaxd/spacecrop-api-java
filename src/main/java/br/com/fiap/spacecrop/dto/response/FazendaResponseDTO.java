package br.com.fiap.spacecrop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FazendaResponseDTO {
    private Long id;
    private String nome;
    private String cidade;
    private String estado;
    private Float areaHectares;
    private Long usuarioId;
}