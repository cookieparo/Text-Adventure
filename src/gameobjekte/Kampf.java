package gameobjekte;

import java.util.Scanner;

//Erstellung der Variablen für Gegner und Spieler
public class Kampf {
    Scanner input = new Scanner(System.in);

    public double Kopf;
    public double Torso;
    public double Beine;
    public double Gesamtleben;
    public double Schaden;
    public double Schadenf;
    public double Leben;
    public String Name;
    public String Gegnername;

    //Spielererstellung
    public void Kampferstellung(String Name, double Leben, double Schaden) {
        this.Name = Name;
        this.Leben = Leben;
        this.Schaden = Schaden;

    }



    //Gegnererstellung
    public void fight(String Gegnername,double Kopf, double Torso, double Beine, double Gesamtleben, double Schadenf){
        this.Gegnername = Gegnername;
        this.Kopf = Kopf;
        this.Torso = Torso;
        this.Beine = Beine;
        this.Gesamtleben = Gesamtleben;
        this.Schadenf = Schadenf;

            }
        }


