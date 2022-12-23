package com.gift.infrastructure.common.event;


import org.springframework.stereotype.Component;


/**
 *
 * 领域事件发布器
 * the Event is sent to EventBus
 *
 * Normally DomainEvent should be sent to Messaging Middleware
 *
 */
@Component
public class DomainEventPublisher {

    public void publish(Object domainEvent){


    }


}
