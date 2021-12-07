--Survey
INSERT INTO SURVEY.survey
(id, description)
VALUES(1, 'Encuesta Servicio');
INSERT INTO SURVEY.survey
(id, description)
VALUES(2, 'Encuesta Comida');
INSERT INTO SURVEY.survey
(id, description)
VALUES(3, 'Encuesta Instalaciones');

-- Question
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(1, 'OPEN', 'La atencion ofrecida cumplio con sus expectativas', 1);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(2, 'CLOSE', 'El tiempo de espera para pasar a mesa fue prudente', 1);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(3, 'OPEN', 'No cobramos propina pero cuanto estaria dispuesta a dar y ¿porque?', 1);

INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(4, 'OPEN', 'Le ha gustado la comida ¿porque?', 2);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(5, 'CLOSE', 'La vajilla combinaba con la comida', 2);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(6, 'OPEN', 'Que te gustaria encontrar en nuestro menu', 2);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(7, 'CLOSE', '¿Prefieres plato frios o calientes?', 2);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(8, 'CLOSE', '¿Le ha parecido picante la comida?', 2);

INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(9, 'CLOSE', 'Le ha gustado las instalaciones del restaurante', 3);
INSERT INTO SURVEY.question (id, "type", question, survey_id) VALUES(10, 'OPEN', 'Le gustaria ver algo diferente en las instalaciones', 3);

--Option
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(1,1,	'Si',	2);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(2,2,	'NO',	2);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(3,1,	'Si',	5);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(4,2,	'No',	5);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(5,2,	'Frios',	7);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(6,1,	'Calientes',	7);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(7,2,	'No',	8);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(8,1,	'Si',	8);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(9,1,	'Si',	9);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(10,2,	'No',	9);
INSERT INTO SURVEY."option" (id, "order", value, question) VALUES(11,3,	'Me es indiferente',	2);


