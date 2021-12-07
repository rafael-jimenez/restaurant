package restaurant.survey.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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


    @OneToMany(targetEntity = Question.class, mappedBy = "survey", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Question> question;
}
