CREATE SCHEMA  survey;
CREATE TABLE survey.option (
                                        id int NOT NULL,
                                        "order" int NOT NULL,
                                        value varchar NOT NULL,
                                        "question" int NOT NULL
);
CREATE TABLE survey.question (
                                        id int NOT NULL,
                                        "type" varchar NOT NULL,
                                        "question" varchar NOT NULL,
                                        "survey_id" int NOT NULL
);

CREATE TABLE survey.survey (
                                        id int NOT NULL,
                                        "description" varchar NOT NULL
);

