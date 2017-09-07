package network.pluto.bibliotheca.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import network.pluto.bibliotheca.enums.AuthorityName;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PLUTO_AUTHORITY")
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue
    private long authorityId;

    @JsonIgnore
    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private AuthorityName name;

    @Override
    public String getAuthority() {
        return name.name();
    }
}