package graphql.sample.type;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Music {
    private String musicId;
    private String title;
}