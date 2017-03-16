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
    private String firstName;
    @Column(name="lastname")
    private String lastName;


    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "customer[id=%d, firstname='%s', lastname='%s']",
                id, firstName, lastName);
    }

// end::sample[]

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}

