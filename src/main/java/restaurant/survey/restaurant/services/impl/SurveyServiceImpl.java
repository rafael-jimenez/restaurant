package restaurant.survey.restaurant.services.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import restaurant.survey.restaurant.dto.Survey;
import restaurant.survey.restaurant.repository.SurveyRepository;
import restaurant.survey.restaurant.services.SurveyService;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SurveyServiceImpl implements SurveyService {


    private final SurveyRepository surveyRepository;
    @Override
    public Optional<Survey> getSurvey(Long id) {
        var survey = surveyRepository.findById(id);

        return survey;
    }

    @Override
    public Optional<Survey> createSurvey(Survey survey) {
        return Optional.of(surveyRepository.save(survey));

    }
}
