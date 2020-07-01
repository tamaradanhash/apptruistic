package at.nacs.apptruistic.configuration;

import at.nacs.apptruistic.domain.Organization;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("dataset")
public class OrganizationConfiguration {
  @Getter
  @Setter
  List<Organization> organizations;

  @Bean
  List<Organization> organizations(){
    return organizations;
  }
}
