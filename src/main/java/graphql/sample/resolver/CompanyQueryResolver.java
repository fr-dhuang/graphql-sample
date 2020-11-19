package graphql.sample.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.sample.mapper.MusicMapper;
import graphql.sample.model.Company;
import graphql.sample.model.MessageInput;
import graphql.sample.model.Music;

@Component
public class CompanyQueryResolver implements GraphQLQueryResolver {
    public Company getCompany(MessageInput messageInput) {
        return new Company(messageInput.getAuthor() + messageInput.getContent(), 50);
    }
}