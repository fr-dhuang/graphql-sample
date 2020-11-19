package graphql.sample.type;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private String companyId;
    private Integer price;
}
