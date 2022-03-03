create sequence hibernate_sequence start 1 increment 1;

create table TSTAFF (
    ID int NOT NULL GENERATED ALWAYS AS IDENTITY,
    EMPLOYEE varchar(255),
    POSITION varchar(255),
    ABSENCE_DATE varchar(255),
    ABSENCE_TIME varchar(255),
    ABSENCE_REASON varchar(255),
    primary key (ID)
    );

create table EMPLOYEE (
    ID int NOT NULL GENERATED ALWAYS AS IDENTITY,
    FULL_NAME varchar(255),
    primary key (ID)
    );

create table POSITION (
    ID int NOT NULL GENERATED ALWAYS AS IDENTITY,
    POST varchar(255),
    primary key (ID)
    );


