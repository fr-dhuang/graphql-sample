package graphql.sample.mapper;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;

import graphql.sample.type.Member;
import graphql.sample.type.Music;

@Configuration
public class MemberMapperImpl implements MemberMapper {
    public Member getById(String id) {
        return new Member("a", "b", 810, Arrays.asList(new Music("a", "b")));
    }
}
