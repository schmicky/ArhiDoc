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
-- begin ARHIDOC_PA
create table ARHIDOC_PA (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    A01_DENUMIRE_PROIECT longtext,
    A02_NR_PROIECT longtext,
    A03_VALOARE_PROIECT varchar(255),
    A04_CATEGORIE_IMPORTANTA longtext,
    A05_CLASA_IMPORTANTA longtext,
    A06_DURATA_CONSTRUCTIE longtext,
    A07_FUNCTIUNE_PROIECT longtext,
    A08_LUNGIME_IMPREJMUIRE longtext,
    A09_NR_PARCAJE longtext,
    A10_NR_GARAJE varchar(255),
    A11_REGIM_INALTIME varchar(255),
    A12_HMAX varchar(255),
    A13_HCORNISA varchar(255),
    A14_SISTEM_ACOPERIRE longtext,
    A15_DATA_INCEPERE_LUCRARE longtext,
    A16_VOLUM_IMOBIL longtext,
    A13_SCAROSABIL longtext,
    A14_SGARAJ longtext,
    A15_SPLATFORMA_PARCAJ longtext,
    A16_SSPATII_VERZI longtext,
    A17_SSPATII_MINERALE longtext,
    A18_SAPE varchar(255),
    A19_STROTUARE varchar(255),
    A20_STERASE_ACOPERITE varchar(255),
    A25_FAZA_PROIECT longtext,
    B01_ADRESA_AMPLASAMENT longtext,
    B02_NR_CADASTRAL varchar(255),
    B03_CARTE_FUNCIARA varchar(255),
    B04_FISA_IMOBIL varchar(255),
    B05_VECIN_NORD varchar(255),
    B06_VECIN_NORD_EST varchar(255),
    B07_VECIN_NORD_VEST varchar(255),
    B08_VECIN_SUD varchar(255),
    B09_VECIN_SUD_EST varchar(255),
    B10_VECIN_SUD_VEST varchar(255),
    B11_VECIN_EST varchar(255),
    B12_VECIN_VEST varchar(255),
    B13_STEREN_ACTE varchar(255),
    B14_STEREN_MASURATORI varchar(255),
    B15_ACT_PROPRIETATE varchar(255),
    B16_STADIU_AMPLASAMENT varchar(255),
    B17_DIST_VECIN_NORD varchar(255),
    B18_DIST_VECIN_NORD_EST varchar(255),
    B19_DIST_VECIN_NORD_VEST varchar(255),
    B20_DIST_VECIN_SUD varchar(255),
    B21_DIST_VECIN_SUD_EST varchar(255),
    B22_DIST_VECIN_SUD_VEST varchar(255),
    B23_DIST_VECIN_EST varchar(255),
    B24_DIST_VECIN_VEST varchar(255),
    C01_DENUMIRE_BENEFICIAR_PF varchar(255),
    C02_DENUMIRE_BENEFICIAR_PJ varchar(255),
    C03_CALITATE_PF varchar(255),
    C04_ADRESA_BENEFICIAR_PF varchar(255),
    C05_ADRESA_BENEFICIAR_PJ varchar(255),
    C06_CNP_BENEFICIAR_PF varchar(255),
    C07_CI_BENEFICIAR_PF varchar(255),
    C08_EMITENT_CI_BENEFICIAR_PF varchar(255),
    C09_EMAIL_BENEFICIAR varchar(255),
    C10_CUI_BENEFICIAR_PJ varchar(255),
    C11_NR_REG_COM_PJ varchar(255),
    C12_TELEFON_BENEFICIAR varchar(255),
    D01_DENUMIRE_ARHITECT_PF varchar(255),
    D02_DENUMIRE_ARHITECT_PJ varchar(255),
    D03_TNA_ARHITECT varchar(255),
    D04_ADRESA_ARHITECT_PJ varchar(255),
    D05_FILIALA_ARHITECT varchar(255),
    D06_NR_DOVADA_OAR varchar(255),
    E01_INCADRARE_URBANISM varchar(255),
    E02_SC_EXISTENT varchar(255),
    E03_SD_EXISTENT varchar(255),
    E04_POT_EXISTENT varchar(255),
    E05_CUT_EXISTENT varchar(255),
    E06_SC_PROPUS varchar(255),
    E07_SD_PROPUS varchar(255),
    E08_POT_PROPUS varchar(255),
    E09_CUT_PROPUS varchar(255),
    E10_SC_EXISTENT_DESFIINTAT varchar(255),
    E11_SD_EXISTENT_DESFIINTAT varchar(255),
    E12_SU_EXISTENT_DESFIINTAT varchar(255),
    E13_SC_EXISTENT_MENTINUT varchar(255),
    E14_SD_EXISTENT_MENTINUT varchar(255),
    E15_SU_EXISTENT_MENTINUT varchar(255),
    E16_SC_PROPUS varchar(255),
    E17_SD_PROPUS varchar(255),
    E18_SU_PROPUS varchar(255),
    E19_SC_TOTAL varchar(255),
    E20_SD_TOTAL varchar(255),
    E21_SU_TOTAL varchar(255),
    E22_NIVELURI_EXISTENTE varchar(255),
    E23_NIVELURI_PROPUSE varchar(255),
    F01_EMITENT_CU varchar(255),
    F02_NR_CU varchar(255),
    F03_CHITANTA_AC varchar(255),
    G01_GRAD_REZISTENTA_FOC varchar(255),
    G02_RISC_PERICOL_INCENDIU varchar(255),
    G03_NR_UTILIZATORI varchar(255),
    G04_ACCES_PIETONAL varchar(255),
    G05_ACCES_AUTO varchar(255),
    H01_COMPONENTA_DOSAR varchar(255),
    H02_DESEURI varchar(255),
    A21_SSPATII_VERZI longtext,
    A22_SSPATII_MINERALE longtext,
    A23_SAPE longtext,
    A24_STROTUARE longtext,
    A26_TOTAL_NR_PARCARI longtext,
    A27_STERASE_ACOPERITE longtext,
    --
    primary key (ID)
)^
-- end ARHIDOC_PA
