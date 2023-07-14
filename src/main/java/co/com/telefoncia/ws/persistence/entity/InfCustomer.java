package co.com.telefoncia.ws.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "INF_CUSTOMER", schema = "DWHODS")
public class InfCustomer {
    @Column(name = "cust_code")
    private String custCode;
}
