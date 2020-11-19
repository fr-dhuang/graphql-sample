package graphql.sample.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.sample.mapper.MusicMapper;
import graphql.sample.type.Music;

@Component
public class MusicQueryResolver implements GraphQLQueryResolver {

    @Autowired
    MusicMapper mapper;

    public Music getMusic(String musicId) {
        return mapper.getById(musicId);
    }
}