package model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String accountData;

    public Account() {
    }



    public Account(String accountData) {
        this.accountData = accountData;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


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