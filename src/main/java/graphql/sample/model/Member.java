package graphql.sample.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private String memberId;
    private String name;
    private Integer age;
    private List<Music> joining;
}
