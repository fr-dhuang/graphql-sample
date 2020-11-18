package graphql.sample.mapper;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;

import graphql.sample.model.Member;
import graphql.sample.model.Music;

@Configuration
public class MemberMapperImpl implements MemberMapper {
    public Member getById(String id) {
        return new Member("114514", "yaju", 810, Arrays.asList(new Music("a", "b")));
    }
}
