package edu.java.bot.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionStatus;

@Slf4j
@Configuration
public class SpringConfig {
    @Bean
    @ConditionalOnMissingBean(TransactionManager.class)
    PlatformTransactionManager mockTransactionManager() {
        return new PlatformTransactionManager() {
            @Override
            public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
                log.debug("Start mock tx");
                return new DefaultTransactionStatus("Trokjin mock tx", null, true, true, true, true, true, null);
            }

            @Override
            public void commit(TransactionStatus status) throws TransactionException {
                log.debug("Commit mock tx: {}", status.getTransactionName());

            }

            @Override
            public void rollback(TransactionStatus status) throws TransactionException {
                try {
                    log.debug("Rollback mock tx: {}", status.getTransactionName());
                } catch (TransactionException e) {
                    log.debug("ooops");
                }
            }
        };
    }
}
