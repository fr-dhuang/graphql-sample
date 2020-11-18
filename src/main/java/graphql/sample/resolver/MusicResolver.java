package graphql.sample.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;
import graphql.sample.mapper.CompanyOfMusicMapper;
import graphql.sample.model.Company;
import graphql.sample.model.Music;

@Component
public class MusicResolver implements GraphQLResolver<Music> {

    @Autowired
    CompanyOfMusicMapper mapper;

    @SuppressWarnings("unused")
    public Company belongsTo(Music music, Integer minPrice) {
        return mapper.getCompanyOfMusic(music.getMusicId());
    }
}