package ang.neggaw.tickets.configs;

import brave.sampler.Sampler;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZipkinConfig {

    @Bean
    @LoadBalanced
    public Sampler defaultSampler() { return Sampler.ALWAYS_SAMPLE; }
}
