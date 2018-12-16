package model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    private Long id;
    private String accountData;

    public Account() {
    }

    public Account(Long id, String accountData) {
        this.id = id;
        this.accountData = accountData;
    }

    public Account(String accountData) {
        this.accountData = accountData;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getAccountData() {
        return accountData;
    }

    public void setAccountData(String accountData) {
        this.accountData = accountData;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountData='" + accountData + '\'' +
                '}';
    }
}