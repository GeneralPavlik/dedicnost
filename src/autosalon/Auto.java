package autosalon;

public class Auto {
    private int pocetSedadel = 5;
    private int pocetDveri = 5;
    private int pocetNahradnichKol = 1;
    private int pocetKoni;
    private int cena;
    private String barva;

     public Auto (int pocetKoni,int cena,String barva){
         this.barva=barva;
         this.cena=cena;
         this.pocetKoni=pocetKoni;
    }

    /// ////////////////////////////////////////////////////////////////////

    public void vypisInfo(){
         System.out.println("Počet Sedadel: "+pocetSedadel);
         System.out.println("Počet Dveří: "+pocetDveri);
         System.out.println("Počet Náhradních kol: "+pocetNahradnichKol);
         System.out.println("Cena: "+cena);
         System.out.println("Barva: "+barva);
    }

    public void jizdaStart(){
         System.out.println("Auto začalo svou jízdu");
    }


    /// ////////////////////////////////////////////////////////////////////


    public int getPocetSedadel() {
        return pocetSedadel;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public int getPocetNahradnichKol() {
        return pocetNahradnichKol;
    }

    public int getPocetKoni() {
        return pocetKoni;
    }

    public int getCena() {
        return cena;
    }

    public String getBarva() {
        return barva;
    }


}