package ro.gsdata.arhidoc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "ARHIDOC_PA")
@Entity(name = "arhidoc$PA")
public class PA extends StandardEntity {
    private static final long serialVersionUID = 3761695772082358398L;

    @Lob
    @Column(name = "A01_DENUMIRE_PROIECT")
    protected String a01DenumireProiect;

    @Lob
    @Column(name = "A02_NR_PROIECT")
    protected String a02NrProiect;

    @Column(name = "A03_VALOARE_PROIECT")
    protected String a03ValoareProiect;

    @Lob
    @Column(name = "A04_CATEGORIE_IMPORTANTA")
    protected String a04CategorieImportanta;

    @Lob
    @Column(name = "A05_CLASA_IMPORTANTA")
    protected String a05ClasaImportanta;

    @Lob
    @Column(name = "A06_DURATA_CONSTRUCTIE")
    protected String a06DurataConstructie;

    @Lob
    @Column(name = "A07_FUNCTIUNE_PROIECT")
    protected String a07FunctiuneProiect;

    @Lob
    @Column(name = "A08_LUNGIME_IMPREJMUIRE")
    protected String a08LungimeImprejmuire;

    @Lob
    @Column(name = "A09_NR_PARCAJE")
    protected String a09NrParcaje;

    @Column(name = "A10_NR_GARAJE")
    protected String a10NrGaraje;

    @Column(name = "A11_REGIM_INALTIME")
    protected String a11RegimInaltime;

    @Column(name = "A12_HMAX")
    protected String a12Hmax;

    @Column(name = "A13_HCORNISA")
    protected String a13Hcornisa;

    @Lob
    @Column(name = "A14_SISTEM_ACOPERIRE")
    protected String a14SistemAcoperire;

    @Lob
    @Column(name = "A15_DATA_INCEPERE_LUCRARE")
    protected String a15DataIncepereLucrare;

    @Lob
    @Column(name = "A16_VOLUM_IMOBIL")
    protected String a16VolumImobil;

    @Lob
    @Column(name = "A13_SCAROSABIL")
    protected String a13Scarosabil;

    @Lob
    @Column(name = "A14_SGARAJ")
    protected String a14Sgaraj;

    @Lob
    @Column(name = "A15_SPLATFORMA_PARCAJ")
    protected String a15SplatformaParcaj;

    @Lob
    @Column(name = "A16_SSPATII_VERZI")
    protected String a16SspatiiVerzi;

    @Lob
    @Column(name = "A17_SSPATII_MINERALE")
    protected String a17SspatiiMinerale;

    @Column(name = "A18_SAPE")
    protected String a18Sape;

    @Column(name = "A19_STROTUARE")
    protected String a19Strotuare;

    @Column(name = "A20_STERASE_ACOPERITE")
    protected String a20SteraseAcoperite;

    @Lob
    @Column(name = "B01_ADRESA_AMPLASAMENT")
    protected String b01AdresaAmplasament;

    @Column(name = "B02_NR_CADASTRAL")
    protected String b02NrCadastral;

    @Column(name = "B03_CARTE_FUNCIARA")
    protected String b03CarteFunciara;

    @Column(name = "B04_FISA_IMOBIL")
    protected String b04FisaImobil;

    @Column(name = "B05_VECIN_NORD")
    protected String b05VecinNord;

    @Column(name = "B06_VECIN_NORD_EST")
    protected String b06VecinNordEst;

    @Column(name = "B07_VECIN_NORD_VEST")
    protected String b07VecinNordVest;

    @Column(name = "B08_VECIN_SUD")
    protected String b08VecinSud;

    @Column(name = "B09_VECIN_SUD_EST")
    protected String b09VecinSudEst;

    @Column(name = "B10_VECIN_SUD_VEST")
    protected String b10VecinSudVest;

    @Column(name = "B11_VECIN_EST")
    protected String b11VecinEst;

    @Column(name = "B12_VECIN_VEST")
    protected String b12VecinVest;

    @Column(name = "B13_STEREN_ACTE")
    protected String b13SterenActe;

    @Column(name = "B14_STEREN_MASURATORI")
    protected String b14SterenMasuratori;

    @Column(name = "B15_ACT_PROPRIETATE")
    protected String b15ActProprietate;

    @Column(name = "B16_STADIU_AMPLASAMENT")
    protected String b16StadiuAmplasament;

    @Column(name = "B17_DIST_VECIN_NORD")
    protected String b17DistVecinNord;

    @Column(name = "B18_DIST_VECIN_NORD_EST")
    protected String b18DistVecinNordEst;

    @Column(name = "B19_DIST_VECIN_NORD_VEST")
    protected String b19DistVecinNordVest;

    @Column(name = "B20_DIST_VECIN_SUD")
    protected String b20DistVecinSud;

    @Column(name = "B21_DIST_VECIN_SUD_EST")
    protected String b21DistVecinSudEst;

    @Column(name = "B22_DIST_VECIN_SUD_VEST")
    protected String b22DistVecinSudVest;

    @Column(name = "B23_DIST_VECIN_EST")
    protected String b23DistVecinEst;

    @Column(name = "B24_DIST_VECIN_VEST")
    protected String b24DistVecinVest;

    @Column(name = "C01_DENUMIRE_BENEFICIAR_PF")
    protected String c01DenumireBeneficiarPf;

    @Column(name = "C02_DENUMIRE_BENEFICIAR_PJ")
    protected String c02DenumireBeneficiarPj;

    @Column(name = "C03_CALITATE_PF")
    protected String c03CalitatePf;

    @Column(name = "C04_ADRESA_BENEFICIAR_PF")
    protected String c04AdresaBeneficiarPf;

    @Column(name = "C05_ADRESA_BENEFICIAR_PJ")
    protected String c05AdresaBeneficiarPj;

    @Column(name = "C06_CNP_BENEFICIAR_PF")
    protected String c06CnpBeneficiarPf;

    @Column(name = "C07_CI_BENEFICIAR_PF")
    protected String c07CiBeneficiarPf;

    @Column(name = "C08_EMITENT_CI_BENEFICIAR_PF")
    protected String c08EmitentCiBeneficiarPf;

    @Column(name = "C09_EMAIL_BENEFICIAR")
    protected String c09EmailBeneficiar;

    @Column(name = "C10_CUI_BENEFICIAR_PJ")
    protected String c10CuiBeneficiarPj;

    @Column(name = "C11_NR_REG_COM_PJ")
    protected String c11NrRegComPj;

    @Column(name = "C12_TELEFON_BENEFICIAR")
    protected String c12TelefonBeneficiar;

    @Column(name = "D01_DENUMIRE_ARHITECT_PF")
    protected String d01DenumireArhitectPf;

    @Column(name = "D02_DENUMIRE_ARHITECT_PJ")
    protected String d02DenumireArhitectPj;

    @Column(name = "D03_TNA_ARHITECT")
    protected String d03TnaArhitect;

    @Column(name = "D04_ADRESA_ARHITECT_PJ")
    protected String d04AdresaArhitectPj;

    @Column(name = "D05_FILIALA_ARHITECT")
    protected String d05FilialaArhitect;

    @Column(name = "D06_NR_DOVADA_OAR")
    protected String d06NrDovadaOar;

    @Column(name = "E01_INCADRARE_URBANISM")
    protected String e01IncadrareUrbanism;

    @Column(name = "E02_SC_EXISTENT")
    protected String e02ScExistent;

    @Column(name = "E03_SD_EXISTENT")
    protected String e03SdExistent;

    @Column(name = "E04_POT_EXISTENT")
    protected String e04PotExistent;

    @Column(name = "E05_CUT_EXISTENT")
    protected String e05CutExistent;

    @Column(name = "E06_SC_PROPUS")
    protected String e06ScPropus;

    @Column(name = "E07_SD_PROPUS")
    protected String e07SdPropus;

    @Column(name = "E08_POT_PROPUS")
    protected String e08PotPropus;

    @Column(name = "E09_CUT_PROPUS")
    protected String e09CutPropus;

    @Column(name = "E10_SC_EXISTENT_DESFIINTAT")
    protected String e10ScExistentDesfiintat;

    @Column(name = "E11_SD_EXISTENT_DESFIINTAT")
    protected String e11SdExistentDesfiintat;

    @Column(name = "E12_SU_EXISTENT_DESFIINTAT")
    protected String e12SuExistentDesfiintat;

    @Column(name = "E13_SC_EXISTENT_MENTINUT")
    protected String e13ScExistentMentinut;

    @Column(name = "E14_SD_EXISTENT_MENTINUT")
    protected String e14SdExistentMentinut;

    @Column(name = "E15_SU_EXISTENT_MENTINUT")
    protected String e15SuExistentMentinut;

    @Column(name = "E16_SC_PROPUS")
    protected String e16ScPropus;

    @Column(name = "E17_SD_PROPUS")
    protected String e17SdPropus;

    @Column(name = "E18_SU_PROPUS")
    protected String e18SuPropus;

    @Column(name = "E19_SC_TOTAL")
    protected String e19ScTotal;

    @Column(name = "E20_SD_TOTAL")
    protected String e20SdTotal;

    @Column(name = "E21_SU_TOTAL")
    protected String e21SuTotal;

    @Column(name = "E22_NIVELURI_EXISTENTE")
    protected String e22NiveluriExistente;

    @Column(name = "E23_NIVELURI_PROPUSE")
    protected String e23NiveluriPropuse;

    @Column(name = "F01_EMITENT_CU")
    protected String f01EmitentCu;

    @Column(name = "F02_NR_CU")
    protected String f02NrCu;

    @Column(name = "F03_CHITANTA_AC")
    protected String f03ChitantaAc;

    @Column(name = "G01_GRAD_REZISTENTA_FOC")
    protected String g01GradRezistentaFoc;

    @Column(name = "G02_RISC_PERICOL_INCENDIU")
    protected String g02RiscPericolIncendiu;

    @Column(name = "G03_NR_UTILIZATORI")
    protected String g03NrUtilizatori;

    @Column(name = "G04_ACCES_PIETONAL")
    protected String g04AccesPietonal;

    @Column(name = "G05_ACCES_AUTO")
    protected String g05AccesAuto;

    @Column(name = "H01_COMPONENTA_DOSAR")
    protected String h01ComponentaDosar;

    @Column(name = "H02_DESEURI")
    protected String h02Deseuri;

    public void setA01DenumireProiect(String a01DenumireProiect) {
        this.a01DenumireProiect = a01DenumireProiect;
    }

    public String getA01DenumireProiect() {
        return a01DenumireProiect;
    }

    public void setA02NrProiect(String a02NrProiect) {
        this.a02NrProiect = a02NrProiect;
    }

    public String getA02NrProiect() {
        return a02NrProiect;
    }

    public void setA03ValoareProiect(String a03ValoareProiect) {
        this.a03ValoareProiect = a03ValoareProiect;
    }

    public String getA03ValoareProiect() {
        return a03ValoareProiect;
    }

    public void setA04CategorieImportanta(String a04CategorieImportanta) {
        this.a04CategorieImportanta = a04CategorieImportanta;
    }

    public String getA04CategorieImportanta() {
        return a04CategorieImportanta;
    }

    public void setA05ClasaImportanta(String a05ClasaImportanta) {
        this.a05ClasaImportanta = a05ClasaImportanta;
    }

    public String getA05ClasaImportanta() {
        return a05ClasaImportanta;
    }

    public void setA06DurataConstructie(String a06DurataConstructie) {
        this.a06DurataConstructie = a06DurataConstructie;
    }

    public String getA06DurataConstructie() {
        return a06DurataConstructie;
    }

    public void setA07FunctiuneProiect(String a07FunctiuneProiect) {
        this.a07FunctiuneProiect = a07FunctiuneProiect;
    }

    public String getA07FunctiuneProiect() {
        return a07FunctiuneProiect;
    }

    public void setA08LungimeImprejmuire(String a08LungimeImprejmuire) {
        this.a08LungimeImprejmuire = a08LungimeImprejmuire;
    }

    public String getA08LungimeImprejmuire() {
        return a08LungimeImprejmuire;
    }

    public void setA09NrParcaje(String a09NrParcaje) {
        this.a09NrParcaje = a09NrParcaje;
    }

    public String getA09NrParcaje() {
        return a09NrParcaje;
    }

    public void setA10NrGaraje(String a10NrGaraje) {
        this.a10NrGaraje = a10NrGaraje;
    }

    public String getA10NrGaraje() {
        return a10NrGaraje;
    }

    public void setA11RegimInaltime(String a11RegimInaltime) {
        this.a11RegimInaltime = a11RegimInaltime;
    }

    public String getA11RegimInaltime() {
        return a11RegimInaltime;
    }

    public void setA12Hmax(String a12Hmax) {
        this.a12Hmax = a12Hmax;
    }

    public String getA12Hmax() {
        return a12Hmax;
    }

    public void setA13Hcornisa(String a13Hcornisa) {
        this.a13Hcornisa = a13Hcornisa;
    }

    public String getA13Hcornisa() {
        return a13Hcornisa;
    }

    public void setA14SistemAcoperire(String a14SistemAcoperire) {
        this.a14SistemAcoperire = a14SistemAcoperire;
    }

    public String getA14SistemAcoperire() {
        return a14SistemAcoperire;
    }

    public void setA15DataIncepereLucrare(String a15DataIncepereLucrare) {
        this.a15DataIncepereLucrare = a15DataIncepereLucrare;
    }

    public String getA15DataIncepereLucrare() {
        return a15DataIncepereLucrare;
    }

    public void setA16VolumImobil(String a16VolumImobil) {
        this.a16VolumImobil = a16VolumImobil;
    }

    public String getA16VolumImobil() {
        return a16VolumImobil;
    }

    public void setA13Scarosabil(String a13Scarosabil) {
        this.a13Scarosabil = a13Scarosabil;
    }

    public String getA13Scarosabil() {
        return a13Scarosabil;
    }

    public void setA14Sgaraj(String a14Sgaraj) {
        this.a14Sgaraj = a14Sgaraj;
    }

    public String getA14Sgaraj() {
        return a14Sgaraj;
    }

    public void setA15SplatformaParcaj(String a15SplatformaParcaj) {
        this.a15SplatformaParcaj = a15SplatformaParcaj;
    }

    public String getA15SplatformaParcaj() {
        return a15SplatformaParcaj;
    }

    public void setA16SspatiiVerzi(String a16SspatiiVerzi) {
        this.a16SspatiiVerzi = a16SspatiiVerzi;
    }

    public String getA16SspatiiVerzi() {
        return a16SspatiiVerzi;
    }

    public void setA17SspatiiMinerale(String a17SspatiiMinerale) {
        this.a17SspatiiMinerale = a17SspatiiMinerale;
    }

    public String getA17SspatiiMinerale() {
        return a17SspatiiMinerale;
    }

    public void setA18Sape(String a18Sape) {
        this.a18Sape = a18Sape;
    }

    public String getA18Sape() {
        return a18Sape;
    }

    public void setA19Strotuare(String a19Strotuare) {
        this.a19Strotuare = a19Strotuare;
    }

    public String getA19Strotuare() {
        return a19Strotuare;
    }

    public void setA20SteraseAcoperite(String a20SteraseAcoperite) {
        this.a20SteraseAcoperite = a20SteraseAcoperite;
    }

    public String getA20SteraseAcoperite() {
        return a20SteraseAcoperite;
    }

    public void setB01AdresaAmplasament(String b01AdresaAmplasament) {
        this.b01AdresaAmplasament = b01AdresaAmplasament;
    }

    public String getB01AdresaAmplasament() {
        return b01AdresaAmplasament;
    }

    public void setB02NrCadastral(String b02NrCadastral) {
        this.b02NrCadastral = b02NrCadastral;
    }

    public String getB02NrCadastral() {
        return b02NrCadastral;
    }

    public void setB03CarteFunciara(String b03CarteFunciara) {
        this.b03CarteFunciara = b03CarteFunciara;
    }

    public String getB03CarteFunciara() {
        return b03CarteFunciara;
    }

    public void setB04FisaImobil(String b04FisaImobil) {
        this.b04FisaImobil = b04FisaImobil;
    }

    public String getB04FisaImobil() {
        return b04FisaImobil;
    }

    public void setB05VecinNord(String b05VecinNord) {
        this.b05VecinNord = b05VecinNord;
    }

    public String getB05VecinNord() {
        return b05VecinNord;
    }

    public void setB06VecinNordEst(String b06VecinNordEst) {
        this.b06VecinNordEst = b06VecinNordEst;
    }

    public String getB06VecinNordEst() {
        return b06VecinNordEst;
    }

    public void setB07VecinNordVest(String b07VecinNordVest) {
        this.b07VecinNordVest = b07VecinNordVest;
    }

    public String getB07VecinNordVest() {
        return b07VecinNordVest;
    }

    public void setB08VecinSud(String b08VecinSud) {
        this.b08VecinSud = b08VecinSud;
    }

    public String getB08VecinSud() {
        return b08VecinSud;
    }

    public void setB09VecinSudEst(String b09VecinSudEst) {
        this.b09VecinSudEst = b09VecinSudEst;
    }

    public String getB09VecinSudEst() {
        return b09VecinSudEst;
    }

    public void setB10VecinSudVest(String b10VecinSudVest) {
        this.b10VecinSudVest = b10VecinSudVest;
    }

    public String getB10VecinSudVest() {
        return b10VecinSudVest;
    }

    public void setB11VecinEst(String b11VecinEst) {
        this.b11VecinEst = b11VecinEst;
    }

    public String getB11VecinEst() {
        return b11VecinEst;
    }

    public void setB12VecinVest(String b12VecinVest) {
        this.b12VecinVest = b12VecinVest;
    }

    public String getB12VecinVest() {
        return b12VecinVest;
    }

    public void setB13SterenActe(String b13SterenActe) {
        this.b13SterenActe = b13SterenActe;
    }

    public String getB13SterenActe() {
        return b13SterenActe;
    }

    public void setB14SterenMasuratori(String b14SterenMasuratori) {
        this.b14SterenMasuratori = b14SterenMasuratori;
    }

    public String getB14SterenMasuratori() {
        return b14SterenMasuratori;
    }

    public void setB15ActProprietate(String b15ActProprietate) {
        this.b15ActProprietate = b15ActProprietate;
    }

    public String getB15ActProprietate() {
        return b15ActProprietate;
    }

    public void setB16StadiuAmplasament(String b16StadiuAmplasament) {
        this.b16StadiuAmplasament = b16StadiuAmplasament;
    }

    public String getB16StadiuAmplasament() {
        return b16StadiuAmplasament;
    }

    public void setB17DistVecinNord(String b17DistVecinNord) {
        this.b17DistVecinNord = b17DistVecinNord;
    }

    public String getB17DistVecinNord() {
        return b17DistVecinNord;
    }

    public void setB18DistVecinNordEst(String b18DistVecinNordEst) {
        this.b18DistVecinNordEst = b18DistVecinNordEst;
    }

    public String getB18DistVecinNordEst() {
        return b18DistVecinNordEst;
    }

    public void setB19DistVecinNordVest(String b19DistVecinNordVest) {
        this.b19DistVecinNordVest = b19DistVecinNordVest;
    }

    public String getB19DistVecinNordVest() {
        return b19DistVecinNordVest;
    }

    public void setB20DistVecinSud(String b20DistVecinSud) {
        this.b20DistVecinSud = b20DistVecinSud;
    }

    public String getB20DistVecinSud() {
        return b20DistVecinSud;
    }

    public void setB21DistVecinSudEst(String b21DistVecinSudEst) {
        this.b21DistVecinSudEst = b21DistVecinSudEst;
    }

    public String getB21DistVecinSudEst() {
        return b21DistVecinSudEst;
    }

    public void setB22DistVecinSudVest(String b22DistVecinSudVest) {
        this.b22DistVecinSudVest = b22DistVecinSudVest;
    }

    public String getB22DistVecinSudVest() {
        return b22DistVecinSudVest;
    }

    public void setB23DistVecinEst(String b23DistVecinEst) {
        this.b23DistVecinEst = b23DistVecinEst;
    }

    public String getB23DistVecinEst() {
        return b23DistVecinEst;
    }

    public void setB24DistVecinVest(String b24DistVecinVest) {
        this.b24DistVecinVest = b24DistVecinVest;
    }

    public String getB24DistVecinVest() {
        return b24DistVecinVest;
    }

    public void setC01DenumireBeneficiarPf(String c01DenumireBeneficiarPf) {
        this.c01DenumireBeneficiarPf = c01DenumireBeneficiarPf;
    }

    public String getC01DenumireBeneficiarPf() {
        return c01DenumireBeneficiarPf;
    }

    public void setC02DenumireBeneficiarPj(String c02DenumireBeneficiarPj) {
        this.c02DenumireBeneficiarPj = c02DenumireBeneficiarPj;
    }

    public String getC02DenumireBeneficiarPj() {
        return c02DenumireBeneficiarPj;
    }

    public void setC03CalitatePf(String c03CalitatePf) {
        this.c03CalitatePf = c03CalitatePf;
    }

    public String getC03CalitatePf() {
        return c03CalitatePf;
    }

    public void setC04AdresaBeneficiarPf(String c04AdresaBeneficiarPf) {
        this.c04AdresaBeneficiarPf = c04AdresaBeneficiarPf;
    }

    public String getC04AdresaBeneficiarPf() {
        return c04AdresaBeneficiarPf;
    }

    public void setC05AdresaBeneficiarPj(String c05AdresaBeneficiarPj) {
        this.c05AdresaBeneficiarPj = c05AdresaBeneficiarPj;
    }

    public String getC05AdresaBeneficiarPj() {
        return c05AdresaBeneficiarPj;
    }

    public void setC06CnpBeneficiarPf(String c06CnpBeneficiarPf) {
        this.c06CnpBeneficiarPf = c06CnpBeneficiarPf;
    }

    public String getC06CnpBeneficiarPf() {
        return c06CnpBeneficiarPf;
    }

    public void setC07CiBeneficiarPf(String c07CiBeneficiarPf) {
        this.c07CiBeneficiarPf = c07CiBeneficiarPf;
    }

    public String getC07CiBeneficiarPf() {
        return c07CiBeneficiarPf;
    }

    public void setC08EmitentCiBeneficiarPf(String c08EmitentCiBeneficiarPf) {
        this.c08EmitentCiBeneficiarPf = c08EmitentCiBeneficiarPf;
    }

    public String getC08EmitentCiBeneficiarPf() {
        return c08EmitentCiBeneficiarPf;
    }

    public void setC09EmailBeneficiar(String c09EmailBeneficiar) {
        this.c09EmailBeneficiar = c09EmailBeneficiar;
    }

    public String getC09EmailBeneficiar() {
        return c09EmailBeneficiar;
    }

    public void setC10CuiBeneficiarPj(String c10CuiBeneficiarPj) {
        this.c10CuiBeneficiarPj = c10CuiBeneficiarPj;
    }

    public String getC10CuiBeneficiarPj() {
        return c10CuiBeneficiarPj;
    }

    public void setC11NrRegComPj(String c11NrRegComPj) {
        this.c11NrRegComPj = c11NrRegComPj;
    }

    public String getC11NrRegComPj() {
        return c11NrRegComPj;
    }

    public void setC12TelefonBeneficiar(String c12TelefonBeneficiar) {
        this.c12TelefonBeneficiar = c12TelefonBeneficiar;
    }

    public String getC12TelefonBeneficiar() {
        return c12TelefonBeneficiar;
    }

    public void setD01DenumireArhitectPf(String d01DenumireArhitectPf) {
        this.d01DenumireArhitectPf = d01DenumireArhitectPf;
    }

    public String getD01DenumireArhitectPf() {
        return d01DenumireArhitectPf;
    }

    public void setD02DenumireArhitectPj(String d02DenumireArhitectPj) {
        this.d02DenumireArhitectPj = d02DenumireArhitectPj;
    }

    public String getD02DenumireArhitectPj() {
        return d02DenumireArhitectPj;
    }

    public void setD03TnaArhitect(String d03TnaArhitect) {
        this.d03TnaArhitect = d03TnaArhitect;
    }

    public String getD03TnaArhitect() {
        return d03TnaArhitect;
    }

    public void setD04AdresaArhitectPj(String d04AdresaArhitectPj) {
        this.d04AdresaArhitectPj = d04AdresaArhitectPj;
    }

    public String getD04AdresaArhitectPj() {
        return d04AdresaArhitectPj;
    }

    public void setD05FilialaArhitect(String d05FilialaArhitect) {
        this.d05FilialaArhitect = d05FilialaArhitect;
    }

    public String getD05FilialaArhitect() {
        return d05FilialaArhitect;
    }

    public void setD06NrDovadaOar(String d06NrDovadaOar) {
        this.d06NrDovadaOar = d06NrDovadaOar;
    }

    public String getD06NrDovadaOar() {
        return d06NrDovadaOar;
    }

    public void setE01IncadrareUrbanism(String e01IncadrareUrbanism) {
        this.e01IncadrareUrbanism = e01IncadrareUrbanism;
    }

    public String getE01IncadrareUrbanism() {
        return e01IncadrareUrbanism;
    }

    public void setE02ScExistent(String e02ScExistent) {
        this.e02ScExistent = e02ScExistent;
    }

    public String getE02ScExistent() {
        return e02ScExistent;
    }

    public void setE03SdExistent(String e03SdExistent) {
        this.e03SdExistent = e03SdExistent;
    }

    public String getE03SdExistent() {
        return e03SdExistent;
    }

    public void setE04PotExistent(String e04PotExistent) {
        this.e04PotExistent = e04PotExistent;
    }

    public String getE04PotExistent() {
        return e04PotExistent;
    }

    public void setE05CutExistent(String e05CutExistent) {
        this.e05CutExistent = e05CutExistent;
    }

    public String getE05CutExistent() {
        return e05CutExistent;
    }

    public void setE06ScPropus(String e06ScPropus) {
        this.e06ScPropus = e06ScPropus;
    }

    public String getE06ScPropus() {
        return e06ScPropus;
    }

    public void setE07SdPropus(String e07SdPropus) {
        this.e07SdPropus = e07SdPropus;
    }

    public String getE07SdPropus() {
        return e07SdPropus;
    }

    public void setE08PotPropus(String e08PotPropus) {
        this.e08PotPropus = e08PotPropus;
    }

    public String getE08PotPropus() {
        return e08PotPropus;
    }

    public void setE09CutPropus(String e09CutPropus) {
        this.e09CutPropus = e09CutPropus;
    }

    public String getE09CutPropus() {
        return e09CutPropus;
    }

    public void setE10ScExistentDesfiintat(String e10ScExistentDesfiintat) {
        this.e10ScExistentDesfiintat = e10ScExistentDesfiintat;
    }

    public String getE10ScExistentDesfiintat() {
        return e10ScExistentDesfiintat;
    }

    public void setE11SdExistentDesfiintat(String e11SdExistentDesfiintat) {
        this.e11SdExistentDesfiintat = e11SdExistentDesfiintat;
    }

    public String getE11SdExistentDesfiintat() {
        return e11SdExistentDesfiintat;
    }

    public void setE12SuExistentDesfiintat(String e12SuExistentDesfiintat) {
        this.e12SuExistentDesfiintat = e12SuExistentDesfiintat;
    }

    public String getE12SuExistentDesfiintat() {
        return e12SuExistentDesfiintat;
    }

    public void setE13ScExistentMentinut(String e13ScExistentMentinut) {
        this.e13ScExistentMentinut = e13ScExistentMentinut;
    }

    public String getE13ScExistentMentinut() {
        return e13ScExistentMentinut;
    }

    public void setE14SdExistentMentinut(String e14SdExistentMentinut) {
        this.e14SdExistentMentinut = e14SdExistentMentinut;
    }

    public String getE14SdExistentMentinut() {
        return e14SdExistentMentinut;
    }

    public void setE15SuExistentMentinut(String e15SuExistentMentinut) {
        this.e15SuExistentMentinut = e15SuExistentMentinut;
    }

    public String getE15SuExistentMentinut() {
        return e15SuExistentMentinut;
    }

    public void setE16ScPropus(String e16ScPropus) {
        this.e16ScPropus = e16ScPropus;
    }

    public String getE16ScPropus() {
        return e16ScPropus;
    }

    public void setE17SdPropus(String e17SdPropus) {
        this.e17SdPropus = e17SdPropus;
    }

    public String getE17SdPropus() {
        return e17SdPropus;
    }

    public void setE18SuPropus(String e18SuPropus) {
        this.e18SuPropus = e18SuPropus;
    }

    public String getE18SuPropus() {
        return e18SuPropus;
    }

    public void setE19ScTotal(String e19ScTotal) {
        this.e19ScTotal = e19ScTotal;
    }

    public String getE19ScTotal() {
        return e19ScTotal;
    }

    public void setE20SdTotal(String e20SdTotal) {
        this.e20SdTotal = e20SdTotal;
    }

    public String getE20SdTotal() {
        return e20SdTotal;
    }

    public void setE21SuTotal(String e21SuTotal) {
        this.e21SuTotal = e21SuTotal;
    }

    public String getE21SuTotal() {
        return e21SuTotal;
    }

    public void setE22NiveluriExistente(String e22NiveluriExistente) {
        this.e22NiveluriExistente = e22NiveluriExistente;
    }

    public String getE22NiveluriExistente() {
        return e22NiveluriExistente;
    }

    public void setE23NiveluriPropuse(String e23NiveluriPropuse) {
        this.e23NiveluriPropuse = e23NiveluriPropuse;
    }

    public String getE23NiveluriPropuse() {
        return e23NiveluriPropuse;
    }

    public void setF01EmitentCu(String f01EmitentCu) {
        this.f01EmitentCu = f01EmitentCu;
    }

    public String getF01EmitentCu() {
        return f01EmitentCu;
    }

    public void setF02NrCu(String f02NrCu) {
        this.f02NrCu = f02NrCu;
    }

    public String getF02NrCu() {
        return f02NrCu;
    }

    public void setF03ChitantaAc(String f03ChitantaAc) {
        this.f03ChitantaAc = f03ChitantaAc;
    }

    public String getF03ChitantaAc() {
        return f03ChitantaAc;
    }

    public void setG01GradRezistentaFoc(String g01GradRezistentaFoc) {
        this.g01GradRezistentaFoc = g01GradRezistentaFoc;
    }

    public String getG01GradRezistentaFoc() {
        return g01GradRezistentaFoc;
    }

    public void setG02RiscPericolIncendiu(String g02RiscPericolIncendiu) {
        this.g02RiscPericolIncendiu = g02RiscPericolIncendiu;
    }

    public String getG02RiscPericolIncendiu() {
        return g02RiscPericolIncendiu;
    }

    public void setG03NrUtilizatori(String g03NrUtilizatori) {
        this.g03NrUtilizatori = g03NrUtilizatori;
    }

    public String getG03NrUtilizatori() {
        return g03NrUtilizatori;
    }

    public void setG04AccesPietonal(String g04AccesPietonal) {
        this.g04AccesPietonal = g04AccesPietonal;
    }

    public String getG04AccesPietonal() {
        return g04AccesPietonal;
    }

    public void setG05AccesAuto(String g05AccesAuto) {
        this.g05AccesAuto = g05AccesAuto;
    }

    public String getG05AccesAuto() {
        return g05AccesAuto;
    }

    public void setH01ComponentaDosar(String h01ComponentaDosar) {
        this.h01ComponentaDosar = h01ComponentaDosar;
    }

    public String getH01ComponentaDosar() {
        return h01ComponentaDosar;
    }

    public void setH02Deseuri(String h02Deseuri) {
        this.h02Deseuri = h02Deseuri;
    }

    public String getH02Deseuri() {
        return h02Deseuri;
    }


}