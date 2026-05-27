package com.java.bffagendadorarefas.business;
import com.java.bffagendadorarefas.business.dto.in.EnderecoDTORequest;
import com.java.bffagendadorarefas.business.dto.in.LoginRequestDTO;
import com.java.bffagendadorarefas.business.dto.in.TelefoneDTORequest;
import com.java.bffagendadorarefas.business.dto.in.UsuarioDTORequest;
import com.java.bffagendadorarefas.business.dto.out.EnderecoDTOResponse;
import com.java.bffagendadorarefas.business.dto.out.TelefoneDTOResponse;
import com.java.bffagendadorarefas.business.dto.out.UsuarioDTOResponse;
import com.java.bffagendadorarefas.business.dto.out.ViaCepDTOResponse;
import com.java.bffagendadorarefas.infrastructure.client.UsuarioClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;


    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {

        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginRequestDTO dto) {
        return client.login(dto);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token) {
        return client.buscaUsuarioPorEmail(email, token);
    }


    public void deletaUsuarioPorEmail(String email, String token) {

        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto) {
        return client.atualizDadoUsuario(dto, token);
    }

    public EnderecoDTOResponse atualizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO,
                                                String token) {

        return client.atualizaEndereco(enderecoDTO, idEndereco, token);

    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest dto, String token) {

        return client.atualizaTelefone(dto, idTelefone, token);

    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto) {

        return client.cadastaEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto) {

        return client.cadastraTelefone(dto, token);
    }

    public ViaCepDTOResponse buscarEnderecoPorCep(String cep) {
        return client.buscarDadosCep(cep);
    }
}
