package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    @Autowired
    private ProjectRepository projectRepo;
    @Autowired
    private CustomerRepository customerRepo;
    @Autowired
    private AccountRepository accountRepo;


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    public void run(String... args) {

        // save a couple of customers
        /*customerRepo.save(new Customer("Jack", "Bauer"));
        customerRepo.save(new Customer("Chloe", "O'Brian"));
        customerRepo.save(new Customer("Kim", "Bauer"));
        customerRepo.save(new Customer("David", "Palmer"));
        customerRepo.save(new Customer("Michelle", "Dessler"));

        // fetch all customers
        log.info("Customers found with findAll():");
        log.info("-------------------------------");
        for (Customer customer : customerRepo.findAll()) {
            log.info(customer.toString());
        }
        log.info("");

        // fetch an individual customer by ID
        Customer customer = customerRepo.findOne(1L);
        log.info("Customer found with findOne(1L):");
        log.info("--------------------------------");
        log.info(customer.toString());
        log.info("");



        // fetch customers by last name
        log.info("Customer found with findByLastName('Bau'):");
        log.info("--------------------------------------------");
        for (Customer bau : customerRepo.findBylastname( "Bau" )) {
            log.info(bau.toString());
        }
        log.info("");*/

        Project proj = new Project();
        proj.addCustomer(customerRepo.save(new Customer("Jack", "Bauer")));
        proj.addCustomer(customerRepo.save(new Customer("Kim", "Bauer")));
        proj.setName("subbotnik");
        projectRepo.save(proj);

        proj = new Project();
        proj.addCustomer(customerRepo.save(new Customer("Jack", "Bauer")));
        proj.addCustomer(customerRepo.save(new Customer("David", "Palmer")));
        proj.setName("project10001");
        projectRepo.save(proj);


        proj = new Project();
        proj.addCustomer(customerRepo.save(new Customer("Michelle", "Dessler")));
        proj.addCustomer(customerRepo.save(new Customer("David", "Palmer")));
        proj.setName("project7");
        projectRepo.save(proj);








        accountRepo.save(new Account(10L,"myuser", "user", true, true, true,true, "ROLE_USER"));
        accountRepo.save(new Account(20L,"myadmin", "admin", true, true, true,true, "ROLE_ADMIN"));


    }
}

