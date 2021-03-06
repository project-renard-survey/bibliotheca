package network.pluto.bibliotheca.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class EmailVerification extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "verificationSequence")
    @SequenceGenerator(name = "verificationSequence", sequenceName = "verification_sequence", allocationSize = 1)
    @Id
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @Column(nullable = false, unique = true)
    private String token;
}
