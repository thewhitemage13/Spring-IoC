package spring.database.repository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class UserRepository {
    private String userName;
    private int poolSize;
    private List<Object> args;
    public Map<String, Object> properties;

    public void init(){
        System.out.println("init UserRepository");
    }

    public void destroy(){
        System.out.println("destroy UserRepository");
    }
}
