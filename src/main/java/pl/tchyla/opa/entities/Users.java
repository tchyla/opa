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

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Users {

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
    @Email
    private String email;

    @NotNull
    @Pattern(regexp="^(?:(?:(?:(?:\\+|00)\\d{2})?[ -]?(?:(?:\\(0?\\d{2}\\))|(?:0?\\d{2})))?[ -]?(?:\\d{3}[- ]?\\d{2}[- ]?\\d{2}|\\d{2}[- ]?\\d{2}[- ]?\\d{3}|\\d{7})|(?:(?:(?:\\+|00)\\d{2})?[ -]?\\d{3}[ -]?\\d{3}[ -]?\\d{3}))$")
    private int phone;

    private String password;

}
