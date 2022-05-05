package com.example.demo.model;


import jdk.jfr.DataAmount;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tblclient")
public class Client implements Serializable,Cloneable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name="id")
    private int ID;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (ID != client.ID) return false;
        if (isActive != client.isActive) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        if (address != null ? !address.equals(client.address) : client.address != null) return false;
        if (email != null ? !email.equals(client.email) : client.email != null) return false;
        return phoneNumber != null ? phoneNumber.equals(client.phoneNumber) : client.phoneNumber == null;
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() :0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

}
