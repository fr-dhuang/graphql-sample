package graphql.sample.mapper;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import graphql.sample.model.Music;

@Configuration
public class MusicsOfMemberMapperImpl implements MusicsOfMemberMapper {
    public List<Music> getMusicsOfMember(String memberId) {
        return Arrays.asList(new Music("114514", "1919810"), new Music("931", "364"));
    }
}
