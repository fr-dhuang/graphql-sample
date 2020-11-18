package graphql.sample.mapper;

import graphql.sample.model.Member;

public interface MemberMapper {
    Member getById(String id);
}
