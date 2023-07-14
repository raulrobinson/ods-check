package co.com.telefoncia.ws.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "INF_PARTY_CERTIFICATE", schema = "DWHODS")
public class InfPartyCertificate {
    @Column(name = "party_id")
    private String partyId;
}
