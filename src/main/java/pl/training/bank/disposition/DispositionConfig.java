package pl.training.bank.disposition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.training.bank.account.AccountService;
import pl.training.bank.operation.OperationService;

@Configuration
public class DispositionConfig {

    @Bean
    public DispositionService dispositionService(AccountService accountService, OperationService operationService) {
        return new DispositionService(accountService, operationService);
    }

}
