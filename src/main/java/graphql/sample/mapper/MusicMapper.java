package graphql.sample.mapper;

import graphql.sample.type.Music;

public interface MusicMapper {
    Music getById(String id);
}
