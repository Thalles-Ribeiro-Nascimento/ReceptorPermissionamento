package br.com.senac.Receptor.services;

import br.com.senac.Receptor.entities.Receptor;
import br.com.senac.Receptor.repositories.ReceptorRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptorService {

    @Autowired
    private ReceptorRepository receptorRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "permissoes")
    private void reading(Receptor receptor){
        receptorRepository.save(receptor);
        System.out.println(receptor);
    }

}
