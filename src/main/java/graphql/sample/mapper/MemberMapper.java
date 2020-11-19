package graphql.sample.mapper;

import graphql.sample.dao.Member;

public interface MemberMapper {
    Member getById(String id);
}
