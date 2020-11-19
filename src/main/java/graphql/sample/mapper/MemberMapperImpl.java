package graphql.sample.mapper;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;

import graphql.sample.dao.Member;
import graphql.sample.dao.Music;

@Configuration
public class MemberMapperImpl implements MemberMapper {
    public Member getById(String id) {
        return new Member("114514", "yaju", 810, Arrays.asList(new Music("a", "b")));
    }
}
