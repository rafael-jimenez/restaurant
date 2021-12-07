package restaurant.survey.restaurant.services;

import restaurant.survey.restaurant.dto.Survey;

import java.util.Optional;

public interface SurveyService {
    Optional<Survey> getSurvey(Long id);

    Optional<Object> createSurvey(Survey survey);
}
