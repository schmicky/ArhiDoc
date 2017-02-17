create table ARHIDOC_PROIECT_ARHITECTURA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BENEFICIAR_NUME varchar(255),
    BENEFICIAR_CNP varchar(255) not null,
    BENEFICIAR_ADRESA varchar(255) not null,
    PROIECTANT_NUME varchar(255) not null,
    PROIECTANT_ADRESA varchar(255),
    PROIECTANT_TELEFON varchar(255) not null,
    PROIECT_ADRESA varchar(255) not null,
    PROIECT_SUPRAFATA varchar(255) not null,
    ISU_GRAD_DE_REZISTENTA_LA_FOC varchar(255),
    --
    primary key (ID)
);
