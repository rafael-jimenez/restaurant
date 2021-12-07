package restaurant.survey.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.survey.restaurant.dto.Survey;

import java.util.List;
import java.util.Optional;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    @Override
    Optional<Survey> findById(Long id);
}
