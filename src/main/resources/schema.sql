CREATE TABLE JOB(
    JOB_ID INT PRIMARY KEY,
    COMPANY VARCHAR(255) NOT NULL,
    EMPLOYMENT_TYPE VARCHAR(255) NOT NULL,
    INDUSTRY VARCHAR(255) NOT NULL,
    JOB_DESCRIPTION TEXT NOT NULL,
    COUNTRY VARCHAR(255) NOT NULL,
    CITY VARCHAR(255) NOT NULL,
    SENIORITY_LEVEL VARCHAR(255) NOT NULL,
    TITLE VARCHAR(255) NOT NULL,
    TOTAL_APPLICANTS INT NOT NULL
);

CREATE TABLE SKILLS (
    SKILL_ID INT PRIMARY KEY,
    SKILL_NAME VARCHAR(255)
);

CREATE TABLE JOB_SKILLS (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    JOB_ID INT,
    SKILL_ID INT,
    FOREIGN KEY (JOB_ID) REFERENCES JOB(JOB_ID),
    FOREIGN KEY (SKILL_ID) REFERENCES SKILLS(SKILL_ID)
);