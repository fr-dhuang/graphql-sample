package graphql.sample.mapper;

import java.util.List;

import graphql.sample.model.Company;
import graphql.sample.model.Music;

public interface CompanyOfMusicMapper {
    Company getCompanyOfMusic(String companyId);
}
