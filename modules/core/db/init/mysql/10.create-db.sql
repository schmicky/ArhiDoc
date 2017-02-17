-- begin ARHIDOC_PROIECT_ARHITECTURA
create table ARHIDOC_PROIECT_ARHITECTURA (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    ARHITECT_NUME_BIROU varchar(255),
    ARHITECT_ADRESA varchar(255),
    ARHITECT_PERSOANA varchar(255),
    ARHITECT_NR_SEMNATURA varchar(255),
    ARHITECT_FILIALA_TERITORIALA varchar(255),
    BENEFICIAR_NUME varchar(255),
    BENEFICIAR_CNP varchar(255) not null,
    BENEFICIAR_ADRESA varchar(255) not null,
    BENEFICIAR_TELEFON varchar(255),
    BENEFICIAR_REPREZENTANT varchar(255),
    BENEFICIAR_CUI varchar(255),
    PROIECT_ADRESA varchar(255) not null,
    PROIECT_SUPRAFATA varchar(255) not null,
    PROIECT_CARTE_FUNCIARA varchar(255),
    PROIECT_FISA_BUNULUI_IMOBIL varchar(255),
    PROIECT_NUMAR_CADASTRAL varchar(255),
    PROIECT_LUCRARE_EXECUTATA varchar(255),
    PROIECT_VALOARE_RON varchar(255),
    PROIECT_AUTORIZATIA_EXECUTARII_LUCRARII varchar(255),
    --
    primary key (ID)
)^
-- end ARHIDOC_PROIECT_ARHITECTURA
