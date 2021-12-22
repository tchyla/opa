package pl.tchyla.opa.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Actors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 2)
    private String name;

    @NotNull
    @Size(min = 2)
    private String surname;

    @NotNull
    @Column(unique = true)
    @Email (regexp = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}")
    private String email;

    @NotNull
    @Pattern(regexp="[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")
    private String phone;

    private String password;

    @ManyToMany
    private List<Characters> characters = new ArrayList<>();

    @ManyToMany
    private List<Shows> shows = new ArrayList<>();

    @OneToOne
    @JoinColumn
    private Contract contract;
}
