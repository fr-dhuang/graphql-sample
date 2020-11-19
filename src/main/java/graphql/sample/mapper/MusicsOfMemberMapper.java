package graphql.sample.mapper;

import java.util.List;

import graphql.sample.dao.Music;

public interface MusicsOfMemberMapper {
    List<Music> getMusicsOfMember(String memberId);
}
