package restaurant.survey.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.survey.restaurant.dto.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
