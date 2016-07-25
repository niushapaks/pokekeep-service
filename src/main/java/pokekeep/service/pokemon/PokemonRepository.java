package pokekeep.service.pokemon;

import java.awt.*;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Sina on 25/07/2016.
 */
@RepositoryRestResource(collectionResourceRel = "pokemon", path = "pokemon")
public interface PokemonRepository extends MongoRepository<Pokemon, String> {

    List<Pokemon> findByName(@Param("name") String name);

}
