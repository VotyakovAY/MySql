package hello;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "project", path = "project")
public interface ProjectRepository extends PagingAndSortingRepository<Project, Long> {

    List<Project> findByName(@Param("name") String name);

     /*@Query("select p.name from Project p, Customer c where c = p.customers and LOWER(c.firstname) " +
            "LIKE lower(concat('%',:name, '%')) or LOWER(c.lastname) LIKE lower(concat('%',:name, '%'))")
     List<String> findProjectByCustomer (@Param("name") String name );

     @Query(" select c from Project p join p.customers c where LOWER(p.name) LIKE lower(concat('%',:name, '%'))")
     List<Customer> findCustomerByProject (@Param("name") String name);*/


}
