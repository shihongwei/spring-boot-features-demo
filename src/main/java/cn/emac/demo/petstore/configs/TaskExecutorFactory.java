package cn.emac.demo.petstore.configs;

import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author Emac
 * @since 2016-04-11
 */
public class TaskExecutorFactory {

    /**
     * 创建{@code AsyncTaskExecutor}的工厂方法.
     *
     * @param corePoolSize
     * @param queueCapacity
     * @param maxPoolSize
     * @return
     */
    public static AsyncTaskExecutor build(int corePoolSize, int queueCapacity, int maxPoolSize) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setMaxPoolSize(maxPoolSize);
        return executor;
    }
}