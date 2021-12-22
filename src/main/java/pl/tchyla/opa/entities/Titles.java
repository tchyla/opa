package pl.tchyla.opa.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Titles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 2)
    private String titleName;

    @Size(min = 2)
    private String director;

    @Min(1)
    private int duration;

    private int interacts;

    @ManyToMany
    private List<Stages> stages = new ArrayList<>();

    @OneToMany(mappedBy = "titles")
    private List<Shows> shows = new ArrayList<>();

}
