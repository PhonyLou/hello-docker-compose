package com.caesar.schedual;

import com.caesar.directive.entity.Directive;
import com.caesar.directive.repository.DirectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class SecretsMachine {

    @Autowired
    DirectiveRepository directiveRepository;

    @Scheduled(cron = " 0/10 * * * * ? ")
    public void issueCommand() {
        System.out.println("HElloooo==========");
        Directive directive = new Directive(System.currentTimeMillis() + "");
        directiveRepository.save(directive);
    }
}
