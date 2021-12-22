package pl.tchyla.opa.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Stages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(unique = true)
    @Size(min = 2)
    private String stageName;

    @ManyToMany(mappedBy = "stages")
    private List<Titles> titles = new ArrayList<>();

    @OneToMany(mappedBy = "stages")
    private List<Shows> shows = new ArrayList<>();
}
