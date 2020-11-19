package graphql.sample.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.sample.mapper.MemberMapper;
import graphql.sample.dao.Member;

@Component
public class MemberQueryResolver implements GraphQLQueryResolver {

    @Autowired
    MemberMapper mapper;

    public Member getMember(String memberId) {
        return mapper.getById(memberId);
    }
}