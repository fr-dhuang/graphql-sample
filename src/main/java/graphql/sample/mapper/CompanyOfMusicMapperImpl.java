package graphql.sample.mapper;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import graphql.sample.model.Company;
import lombok.Setter;

@Component
@Configuration
@ConfigurationProperties(prefix = "bar")
@Setter
public class CompanyOfMusicMapperImpl implements CompanyOfMusicMapper {
    private int interval = 1919;

    public Company getCompanyOfMusic(String memberId) {
        return new Company("893", interval);
    }
}
