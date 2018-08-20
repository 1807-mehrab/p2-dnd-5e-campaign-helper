CREATE TABLE User_Accounts(
    user_id INTEGER PRIMARY KEY,
    email VARCHAR(32) UNIQUE,
    pass VARCHAR(32)
);

CREATE TABLE Characters_Main(
    char_id INTEGER PRIMARY KEY,
    user_id INTEGER REFERENCES User_Accounts(user_id),
    char_name VARCHAR(32),
    char_class  VARCHAR(32),
    char_race VARCHAR(32),
    char_background VARCHAR(32),
    char_alignment VARCHAR(32)
);

CREATE TABLE Characters_Stats(
    char_id INTEGER REFERENCES Characters_Main(character_id),
    strength INTEGER CHECK (strength BETWEEN 1 AND 20),
    desterity INTEGER CHECK (desterity BETWEEN 1 AND 20),
    constitution INTEGER CHECK (constitution BETWEEN 1 AND 20),
    intelligence INTEGER CHECK (intelligence BETWEEN 1 AND 20),
    wisdom INTEGER CHECK (wisdom BETWEEN 1 AND 20),
    charisma INTEGER CHECK (charisma BETWEEN 1 AND 20),
    hit_points INTEGER,
    speed INTEGER
);

CREATE TABLE Characters_Skills(
    char_id INTEGER REFERENCES Characters_Main(character_id),
    char_acrobatics VARCHAR(1) DEFAULT ('F') CHECK (char_acrobatics in ('T', 'F')),
    char_animal_handling VARCHAR(1) DEFAULT ('F') CHECK (char_animal_handling in ('T', 'F')),
    char_arcana VARCHAR(1) DEFAULT ('F') CHECK (char_arcana in ('T', 'F')),
    char_athletics VARCHAR(1) DEFAULT ('F') CHECK (char_athletics in ('T', 'F')),
    char_deception VARCHAR(1) DEFAULT ('F') CHECK (char_deception in ('T', 'F')),
    char_history VARCHAR(1) DEFAULT ('F') CHECK (char_history in ('T', 'F')),
    char_insight VARCHAR(1) DEFAULT ('F') CHECK (char_insight in ('T', 'F')),
    char_intimidation VARCHAR(1) DEFAULT ('F') CHECK (char_intimidation in ('T', 'F')),
    char_investigation VARCHAR(1) DEFAULT ('F') CHECK (char_investigation in ('T', 'F')),
    char_medicine VARCHAR(1) DEFAULT ('F') CHECK (char_medicine in ('T', 'F')),
    char_nature VARCHAR(1) DEFAULT ('F') CHECK (char_nature in ('T', 'F')),
    char_perception VARCHAR(1) DEFAULT ('F') CHECK (char_perception in ('T', 'F')),
    char_performance VARCHAR(1) DEFAULT ('F') CHECK (char_performance in ('T', 'F')),
    char_persuasion VARCHAR(1) DEFAULT ('F') CHECK (char_persuasion in ('T', 'F')),
    char_religion VARCHAR(1) DEFAULT ('F') CHECK (char_religion in ('T', 'F')),
    char_soh VARCHAR(1) DEFAULT ('F') CHECK (char_soh in ('T', 'F')),
    char_stealth VARCHAR(1) DEFAULT ('F') CHECK (char_stealth in ('T', 'F')),
    char_survival VARCHAR(1) DEFAULT ('F') CHECK (char_stealth in ('T', 'F'))
);

CREATE TABLE Character_Spells(
    char_id INTEGER REFERENCES Characters_Main(character_id),
    spell1 VARCHAR(32),
    spell2 VARCHAR(32),
    spell3 VARCHAR(32),
    spell4 VARCHAR(32),
    spell5 VARCHAR(32),
    spell6 VARCHAR(32)
);

CREATE SEQUENCE user_id_seq;
CREATE SEQUENCE char_id_seq;

CREATE OR REPLACE TRIGGER user_id_on_insert
    BEFORE INSERT ON User_Accounts
    FOR EACH ROW
BEGIN
    SELECT user_id_seq.nextval
    INTO :new.user_id
    FROM dual;
END;
/

CREATE OR REPLACE TRIGGER char_id_on_insert
    BEFORE INSERT ON Characters_Main
    FOR EACH ROW
BEGIN
    SELECT char_id_seq.nextval
    INTO :new.char_id
    FROM dual;
END;
/