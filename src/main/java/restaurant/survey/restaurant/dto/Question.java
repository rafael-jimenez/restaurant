package restaurant.survey.restaurant.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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

    @ManyToOne
    @JoinColumn(name = "survey_id")
    @JsonBackReference
    @JsonIgnore

    private Survey survey;
}

