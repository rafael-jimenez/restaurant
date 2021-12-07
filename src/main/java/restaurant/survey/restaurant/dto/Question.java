package restaurant.survey.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "QUESTION", schema = "SURVEY")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Enum type;

    private String question;

    @ManyToOne(targetEntity = Survey.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Survey survey;
}

