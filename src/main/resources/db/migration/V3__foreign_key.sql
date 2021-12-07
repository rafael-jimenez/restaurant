--Foreign
ALTER TABLE survey.option ADD CONSTRAINT option_fk FOREIGN KEY (question) REFERENCES survey.question(id);
ALTER TABLE survey.question ADD CONSTRAINT question_fk FOREIGN KEY (survey_id) REFERENCES survey.survey(id);

-- Unique
ALTER TABLE survey."option" ADD CONSTRAINT option_un UNIQUE ("order",question);
