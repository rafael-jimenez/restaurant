package restaurant.survey.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import restaurant.survey.restaurant.dto.Option;

public interface OptionRepository extends JpaRepository<Option, Long> {
}
