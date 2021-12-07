package restaurant.survey.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity

@Table(name = "SURVEY", schema = "SURVEY")
public class Survey {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany(targetEntity = Question.class, mappedBy = "survey", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Option> options;

}
