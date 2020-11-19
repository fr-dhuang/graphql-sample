package graphql.sample.mapper;

import graphql.sample.dao.Music;

public interface MusicMapper {
    Music getById(String id);
}
