package com.java.bffagendadorarefas.business;


import com.java.bffagendadorarefas.business.dto.out.TarefasDTOResponse;
import com.java.bffagendadorarefas.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }
}
