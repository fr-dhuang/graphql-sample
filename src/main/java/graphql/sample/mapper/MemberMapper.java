package graphql.sample.mapper;

import graphql.sample.type.Member;

public interface MemberMapper {
    Member getById(String id);
}
