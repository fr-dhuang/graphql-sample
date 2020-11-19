package graphql.sample.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.sample.mapper.MusicsOfMemberMapper;
import graphql.sample.dao.Member;
import graphql.sample.dao.Music;

@Component
public class MemberResolver implements GraphQLResolver<Member> {

    @Autowired
    MusicsOfMemberMapper mapper;

    @SuppressWarnings("unused")
    public List<Music> joining(Member member, String hoge) {
        return mapper.getMusicsOfMember(member.getMemberId());
    }
}