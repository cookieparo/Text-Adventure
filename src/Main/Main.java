package Main;

import gameobjekte.Kampf;
import gameobjekte.Items;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException  {
        //Der throws-Befehl ist für den Cooldown zwischen den Nachrichten zuständig.
        //Der Thread.sleep-Befehl kann Fehler aufweisen, die durch den throws-Befehl behoben werden können. (try und catch)
        //Ohne diesen Befehl würde Java es nicht zulassen, das Programm zu starten.

        Scanner input = new Scanner(System.in);

        //Item/Gegner Erstellung
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        double Schadensring = 1.15;

        Items Heiltrank = new Items();
        Heiltrank.itemAttribute(0, 150);
        int HeiltrankAnzahl = 0;

        Items Schwert = new Items();
        Schwert.itemAttribute(75, 0);

        Kampf VariableFürKampf = new Kampf();
        VariableFürKampf.fight("Zepton", 1.0, 1.0, 1.45, 500.0, 105);
        //////////////////////////////////////////////////////////////////////////////////////////////////////11




        //Erstellung von booleans,Strings und ints, damit Variablen initialisiert werden (für später)
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        boolean Antwort6gurke = false;
        boolean Ende1 = false;
        boolean Ende2Vatertot= false;

        String ZwischenAntwort1 ="";
        String Antwort2 = "";
        String Antwort3 = "";
        String Antwort4 = "";
        String Antwort5 = "";
        String Antwort6 = "";
        double SpielerfinalDamage = 0;
        //////////////////////////////////////////////////////////////////////////////////////////////////////

        //while-Schleife, damit das Programm auch wiederholt werden kann


            //Spielererstellung und Anfang
            //////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("Wie möchtest du heißen?\n >");
            String SpielerName = input.nextLine();


            Kampf Spieler = new Kampf();
            Spieler.Kampferstellung(SpielerName, 500, 5);



            System.out.println("Hallo " + SpielerName + "," + " dies ist der Anfang deiner Geschichte.");
            Thread.sleep(2500);
            System.out.println("Du hast momentan " + Spieler.Leben + " Leben und machst " + Spieler.Schaden + " Schaden.");
            Thread.sleep(3000);
            System.out.println("Es gibt Wörter oder Sätze, um die '*' Symbole sind. Dies sind Antwortmöglichkeiten, die du auch GENAU so eingeben musst.");
            Thread.sleep(6500);
            System.out.println("Du bist gerade in deinem Zimmer. Möchtest du dein *Zimmer erkunden* oder in das *Wohnzimmer gehen*?\n >");
            Thread.sleep(5000);
            String Antwort1 = input.nextLine();


                //Bis zum Wohnzimmer (mit Zimmer erkunden)
                //////////////////////////////////////////////////////////////////////////////////////////////////////
            if (Antwort1.equals("Zimmer erkunden")) {

                System.out.println("Du findest ein Schwert!\n.               [\n.          @XXXX[{::::::::::::::::::::::::>\n.               [. ");
                Thread.sleep(1000);
                System.out.println("\n//Schwert erhalten.//\n");
                Spieler.Kampferstellung(SpielerName, 500, 5 + Schwert.Schaden);
                Thread.sleep(1500);
                System.out.println("Möchtest du weitersuchen? *Ja* *Nein*\n>");


                Antwort2 = input.nextLine();
                System.out.println(".");
                Thread.sleep(1000);
                System.out.println("..");
                Thread.sleep(1000);
                System.out.println("!!");
                Thread.sleep(500);


            }

            if (Antwort2.equals("Ja")) {
                System.out.println("Du hast deinen kleinen Zeh gestoßen. Du verlierst 100 Leben. Du kannst jetzt ins *Wohnzimmer gehen*. Oder doch *weitersuchen*?\n>");
                Antwort3 = input.nextLine();
                Spieler.Leben -= 100;



            }
            if(Antwort3.equals("weitersuchen")){
                System.out.println(".           _______");
                System.out.println(".        _-|  	   |-_");
                System.out.println(".       |    ______   |");
                System.out.println(".       |   |_ O _|   |");
                System.out.println(".       |             |");
                System.out.println(".        |_         _|");
                System.out.println(".          |_______|");

                System.out.println("Du hast noch einen alten Ring gefunden, der dir +15% Schaden gibt!");
                System.out.println("\n//Ring erhalten.//\n");
                Spieler.Schaden = Schadensring*Spieler.Schaden;
                Thread.sleep(2500);
                System.out.println("Du ziehst ihn an und machst jetzt " + Spieler.Schaden + " Schaden.");
                Thread.sleep(2500);
                System.out.println("Du kannst jetzt ins *Wohnzimmer gehen*.");
                ZwischenAntwort1 = input.nextLine();


            }
            if (Antwort2.equals("Nein") || Antwort1.equals("Wohnzimmer gehen") || Antwort3.equals("Wohnzimmer gehen")|| ZwischenAntwort1.equals("Wohnzimmer gehen")) {
                System.out.println("Du gehst ins Wohnzimmer.");
                Thread.sleep(1500);
                System.out.println("Du gehst ins Wohnzimmer..");
                Thread.sleep(1500);
                System.out.println("Du gehst ins Wohnzimmer...");
                Thread.sleep(1500);

                System.out.println("Möchtest du mit deiner Mutter über dein bevorstehendes *Abenteuer reden*, oder direkt *aus dem Haus gehen*?\n>");
                Antwort4 = input.nextLine();
                //////////////////////////////////////////////////////////////////////////////////////////////////////

                //Mit Mutter reden
                if (Antwort4.equals("Abenteuer reden")) {
                    System.out.println("  Hey " + Spieler.Name + "! Ich hoffe du weißt, dass es viele Herausforderungen auf deiner Reise geben wird... ");
                    Thread.sleep(4000);
                    System.out.println("  Ich habe dir in den letzten Tagen einen Trank zubereitet, der dir vielleicht irgendwann mal helfen wird.");
                    Thread.sleep(4000);

                    System.out.println("            ____");
                    System.out.println("           |////|");
                    System.out.println("           |____|");
                    System.out.println("          /      \\");
                    System.out.println("         / ~   ~ ~ \\");
                    System.out.println("        |~  ~ ~  ~ ~ |");
                    System.out.println("       /  ~     ~     \\");
                    System.out.println("      | ~  ~ ~   ~   ~ |");
                    System.out.println("      |~    ~  ~ ~ ~   |");
                    System.out.println("      |________________|");

                    System.out.println("//Heiltrank erhalten.//");
                    Thread.sleep(2000);
                    System.out.println("  Viel Glück und pass auf dich auf!");
                    Thread.sleep(2000);

                    HeiltrankAnzahl += 1; //Inventar für den Heiltrank

                    System.out.println("Möchtest du noch mit deinem *Vater reden* oder *aus dem Haus gehen*?");
                    Antwort5 = input.nextLine();


                //Mit Vater reden
                }
                if (Antwort5.equals("Vater reden")) {
                    Ende2Vatertot = true;
                    Thread.sleep(500);
                    System.out.println(".");
                    Thread.sleep(500);
                    System.out.println("..");
                    Thread.sleep(1000);
                    System.out.println("  Hallo " + Spieler.Name + ". Ich hoffe du bist gut vorbereitet.");
                    Thread.sleep(3000);
                    System.out.println("  Es gibt viele Monster da draußen.");
                    Thread.sleep(2500);
                    System.out.println("  Ich habe gestern ein Monster im Wald gesehen, welches ein rötliches Bein hatte.");
                    Thread.sleep(4000);
                    System.out.println("  Pass also gut auf di-");
                    Thread.sleep(2500);
                    System.out.println(" !!");
                    Thread.sleep(2500);
                    System.out.println("//Ein Monster springt aus dem Fenster. Es bringt deinen Vater um und greift direkt dich an.//");
                    Spieler.Leben -= 80;
                    Thread.sleep(2000);
                    System.out.println("\nDadurch verlierst du 80 Leben. Du hast noch " + Spieler.Leben + " Leben.\n");
                    Thread.sleep(4500);
                }



                if (Antwort4.equals("aus dem Haus gehen")||Antwort5.equals("aus dem Haus gehen")) {
                    System.out.println("Du gehst aus dem Haus...");
                    Thread.sleep(2000);
                    System.out.println("Du guckst nach links und siehst ein Monster, welches am Fenster deines Hauses steht.");
                    Thread.sleep(3500);
                    System.out.println("Möchtest du es *angreifen* oder *weitergehen*?\n>");
                    Antwort6 = input.nextLine();

                }
                if (Antwort6.equals("angreifen")) {
                    Thread.sleep(1000);
                    System.out.println("Du rennst zum Monster und greifst es an.");
                    Thread.sleep(2000);

                    VariableFürKampf.Gesamtleben -= Spieler.Schaden;
                    System.out.println("Du machst ihm direkt " + Spieler.Schaden + " Schaden.");
                    Thread.sleep(3500);
                    Antwort6gurke = true;


                }
                if (Antwort6.equals("weitergehen")) {

                         System.out.println("Du gehst weiter");
                         Thread.sleep(1000);
                         System.out.println(".");
                         Thread.sleep(1000);
                         System.out.println("..");
                         Thread.sleep(1000);
                         System.out.println("!!!!");
                         Thread.sleep(2000);
                         System.out.println("Dich greift das Monster von hinten an und du stirbst...");
                         Thread.sleep(4500);
                         Ende1 = true;

                }
                if (Antwort6gurke || Antwort5.equals("Vater reden")) {
                    System.out.println("///////////////////////////////\nDER KAMPF BEGINNT\n///////////////////////////////");
                    Thread.sleep(1500);
                }
                    //Kampf
                    //////////////////////////////////////////////////////////////////////////////////////////////////////


                while (true&&!Ende1) {
                    System.out.println("Was möchtest du machen? (Nummern eingeben) \n1)Angreifen\n2)Items \n>");
                    int Angriff = input.nextInt();

                    int Körperteil = 0;
                    int Item = 0;

                    if (Angriff == 1) {
                        System.out.println("Welches Körperteil möchtest du angreifen?\n1) Kopf\n2) Torso\n3) Beine\n>");
                        Körperteil = input.nextInt();
                    } else {
                        System.out.println("Welches Item möchtest du benutzen? \n1) Heiltrank = " + HeiltrankAnzahl + "\n>");
                        Item = input.nextInt();

                    }
                    if (HeiltrankAnzahl > 0 && Item == 1) {
                        Spieler.Leben += Heiltrank.Heilung;
                        System.out.println("Deine Leben haben sich um " + Heiltrank.Heilung + " Lebenspunkte erhöht.\n>");
                        HeiltrankAnzahl -= 1;
                    }

                    switch (Körperteil) {
                        case 1:
                            SpielerfinalDamage = Spieler.Schaden * VariableFürKampf.Kopf;
                            VariableFürKampf.Gesamtleben -= SpielerfinalDamage;
                            System.out.println(Spieler.Name + " fügt " + VariableFürKampf.Gegnername + " " + SpielerfinalDamage + " Schaden zu. " + VariableFürKampf.Gegnername + " hat noch " + VariableFürKampf.Gesamtleben + " Lebenspunkte");
                            break;
                        case 2:
                            SpielerfinalDamage = Spieler.Schaden * VariableFürKampf.Torso;
                            VariableFürKampf.Gesamtleben -= SpielerfinalDamage;
                            System.out.println(Spieler.Name + " fügt " + VariableFürKampf.Gegnername + " " + SpielerfinalDamage + " Schaden zu. " + VariableFürKampf.Gegnername + " hat noch " + VariableFürKampf.Gesamtleben + " Lebenspunkte");
                            break;
                        case 3:
                            SpielerfinalDamage = Spieler.Schaden * VariableFürKampf.Beine;
                            VariableFürKampf.Gesamtleben -= SpielerfinalDamage;
                            System.out.println(Spieler.Name + " fügt " + VariableFürKampf.Gegnername + " " + SpielerfinalDamage  + " Schaden zu. " + VariableFürKampf.Gegnername + " hat noch " + VariableFürKampf.Gesamtleben + " Lebenspunkte");
                            break;


                    }
                    if (VariableFürKampf.Gesamtleben <= 0 && Ende2Vatertot) {
                        System.out.println("Gewonnen!");
                        Thread.sleep(3000);
                        System.out.println("Du siehst aber deinen toten Vater auf dem Boden...");
                        Thread.sleep(5000);
                        break;
                    }
                    else if(VariableFürKampf.Gesamtleben <= 0){
                        System.out.println("Gewonnen!");
                         Thread.sleep(3000);
                         System.out.println("Deinem Vater, der vor dem Fenster stand, scheint es auch gut zu gehen.");
                        Thread.sleep(3000);
                         break;
                    }

                    Spieler.Leben -= VariableFürKampf.Schadenf;
                    System.out.println(VariableFürKampf.Gegnername + " fügt " + Spieler.Name + " " + VariableFürKampf.Schadenf + " Schaden zu. " + Spieler.Name + " hat noch " + Spieler.Leben + " Lebenspunkte.");

                    if (Spieler.Leben <= 0) {
                        Thread.sleep(1500);
                        System.out.println("Du bist gestorben...");
                        Thread.sleep(2000);
                        break;
                        //////////////////////////////////////////////////////////////////////////////////////////////////////


                    }

                }



            }
        }
    }

