package hello;
import java.util.List;

import hello.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;

@RepositoryRestResource(collectionResourceRel = "account", path = "account")
public interface AccountRepository extends MongoRepository<Account, Long> {

    public Account findByUserName(@Param("username") String username);

    public Account findByRoles(@Param("roles") String roles);

    public Account findByAccountNonLocked(@Param("accountnonlocked") String accountNonLocked);

}
