package pokekeep.service.pokemon;

import org.springframework.data.annotation.Id;

/**
 * Created by Sina on 25/07/2016.
 */
public class Pokemon {

    @Id private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

