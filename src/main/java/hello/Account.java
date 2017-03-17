package hello;

import javax.persistence.*;


public class Account {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="username")
    private String userName;
    @Column(name="password")
    private String password;
    @Column(name="enabled")
    private Boolean enabled;
    @Column(name="accountnonexpired")
    private Boolean accountNonExpired;
    @Column(name="credentialsnonexpired")
    private Boolean credentialsNonExpired;
    @Column(name="accountnonlocked")
    private Boolean accountNonLocked;
    @Column(name="roles")
    private String roles;

    public Account() {}

    public Account(String userName, String password, Boolean enabled, Boolean accountNonExpired, Boolean credentialsNonExpired, Boolean accountNonLocked, String roles) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.accountNonExpired = accountNonExpired;
        this.credentialsNonExpired = credentialsNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.roles = roles;

    }

    public Account(Long id, String userName, String password, Boolean enabled, Boolean accountNonExpired, Boolean credentialsNonExpired, Boolean accountNonLocked, String roles) {
        this.id=id;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.accountNonExpired = accountNonExpired;
        this.credentialsNonExpired = credentialsNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.roles = roles;

    }

    @Override
    public String toString() {
        return String.format(
                "customer[id=%d, username='%s', password='%s', enabled=%b, accountnonExpired=%b, credentialsnonExpired=%b" +
                        "accountnonLocked=%b ,roles='%s']",
                id, userName, password, enabled,accountNonExpired,credentialsNonExpired,accountNonLocked,roles);
    }

// end::sample[]

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Boolean isEnabled() {
        return enabled;
    }

    public Boolean isAccountNonExpired() {return accountNonExpired; }

    public Boolean isCredentialsNonExpired() {return credentialsNonExpired;}

    public Boolean isAccountNonLocked() {return accountNonLocked;}

    public String getRoles() {return roles;}
}

