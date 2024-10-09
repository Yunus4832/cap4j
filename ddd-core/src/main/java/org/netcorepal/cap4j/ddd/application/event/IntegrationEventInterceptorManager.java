package org.netcorepal.cap4j.ddd.application.event;

import org.netcorepal.cap4j.ddd.domain.event.EventInterceptor;

import java.util.Set;

/**
 * 集成事件拦截器管理器
 *
 * @author binking338
 * @date 2024/9/12
 */
public interface IntegrationEventInterceptorManager {
    /**
     * 拦截器基于 {@link org.springframework.core.annotation.Order} 排序
     * @return
     */
    Set<IntegrationEventInterceptor> getOrderedIntegrationEventInterceptors();

    /**
     *
     * 拦截器基于 {@link org.springframework.core.annotation.Order} 排序
     * @return
     */
    Set<EventInterceptor> getOrderedEventInterceptors4IntegrationEvent();
}
