package graphql.sample.mapper;

import graphql.sample.dao.Company;

public interface CompanyOfMusicMapper {
    Company getCompanyOfMusic(String companyId);
}
