package io.github.changebooks.workerid.sample;

import io.github.changebooks.workerid.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author changebooks@qq.com
 */
@Configuration
@EnableConfigurationProperties({WorkerIdProperties.class, ZookeeperProperties.class})
public class WorkerIdConfigurer {

    @Bean
    public WorkerId workerId(Zookeeper zookeeper, WorkerIdProperties workerIdProperties) {
        return new WorkerIdImpl(zookeeper, workerIdProperties);
    }

    @Bean(name = "zookeeper", initMethod = "start", destroyMethod = "close")
    public Zookeeper zookeeper(ZookeeperProperties zookeeperProperties) {
        return new Zookeeper(zookeeperProperties);
    }

}
