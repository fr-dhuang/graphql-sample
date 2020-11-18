package graphql.sample.mapper;

import java.util.List;

import graphql.sample.model.Music;

public interface MusicsOfMemberMapper {
    List<Music> getMusicsOfMember(String memberId);
}
