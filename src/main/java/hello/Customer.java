// tag::sample[]
package hello;

import javax.persistence.*;

@Entity
@Table(name="customer")

public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;


    protected Customer() {}

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format(
                "customer[id=%d, firstname='%s', lastname='%s']",
                id, firstname, lastname);
    }

// end::sample[]

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstname;
	}

	public String getLastName() {
		return lastname;
	}
}

