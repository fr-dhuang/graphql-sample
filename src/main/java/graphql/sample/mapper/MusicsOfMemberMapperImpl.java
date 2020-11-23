package graphql.sample.mapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import graphql.sample.type.Music;

@Configuration
public class MusicsOfMemberMapperImpl implements MusicsOfMemberMapper {
    public List<Music> getMusicsOfMember(String memberId) {
        return Arrays.asList(new Music("a", "b"), new Music("c", "d"));
    }
}
