package graphql.sample.resolver;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.sample.type.Company;
import graphql.sample.type.MessageInput;

@Component
public class CompanyQueryResolver implements GraphQLQueryResolver {
    public Company getCompany(MessageInput messageInput) {
        return new Company(messageInput.getAuthor() + messageInput.getContent(), 50);
    }
}