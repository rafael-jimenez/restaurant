package restaurant.survey.restaurant.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restaurant.survey.restaurant.dto.Survey;
import restaurant.survey.restaurant.services.SurveyService;

@RestController
@AllArgsConstructor
@Slf4j
public class SurveyController {

    private  final SurveyService surveyService;

    @GetMapping("/")
    public ResponseEntity  getSurvey(@RequestParam Long id){
        var response = surveyService.getSurvey(id);
        return ResponseEntity.ok(response.get());
    }

    @PostMapping("/create")
    public ResponseEntity createSurvey(@RequestBody Survey survey){
        ResponseEntity response = ResponseEntity.badRequest().body("Error on data");
        var saveResponse = surveyService.createSurvey(survey);
        if(saveResponse.isPresent()){
            response = ResponseEntity.ok("executed");
        }
        return response;
    }

}
