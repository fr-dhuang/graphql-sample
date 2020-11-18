package graphql.sample.mapper;

import org.springframework.context.annotation.Configuration;

import graphql.sample.model.Member;
import graphql.sample.model.Music;

@Configuration
public class MusicMapperImpl implements MusicMapper {
    public Music getById(String id) {
        return new Music("114514", "yaju");
    }
}
