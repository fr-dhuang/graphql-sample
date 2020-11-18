package graphql.sample.mapper;

import graphql.sample.model.Music;

public interface MusicMapper {
    Music getById(String id);
}
