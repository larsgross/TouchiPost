import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Christian Cidecian, Vithun Knadeepan & Lars Gross) 
 * @version (1.0.2)
 */
public class MyWorld extends World
{
    //Definierung der Variablen mit Datentypen
    private SimpleTimer timer = new SimpleTimer();
    private int StepCounter;
    private int RoundCheck;
    
    String status;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Erstellen einer neuen Welt in der Grösse 1200x800 mit 1x1 Pixel
        super(1200, 800, 1);
        
        //Abruf der Methoden
        spawnHouses();
        spawnAdmin();

    }
    
    public void act(){
        Steps();
        displayText();
    }
    
    private void spawnHouses(){
        //Die Häuser werden erzeugt und an die Koordinaten gesetzt.
        addObject(new Sender(), 246, 172);
        addObject(new Empfaenger(), 941, 172);
    
    }
    
    private void displayText(){
        //Der Aktuelle Status wird aufgezeigt
        showText("Status: " + status, 300, 40); 
 
    
    }
    
    private void spawnAdmin(){
        //Server und Zustelldienst werden erzeugt und an die Koordinaten gesetzt.
        addObject(new AuftragsSystem(), 610, 415);
        addObject(new DeliveryService(), 610, 674);
    
    }
    
    public void Steps(){
        
        if(timer.millisElapsed() > 2000 && RoundCheck == 0){
            //Neuer Pfeil wird generiert
            addObject(new Arrow(), 452, 318);
            //Neuer Status wird ausgegeben
            status = "Neuer Auftrag ins System aufgegeben";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 40 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 4000 && RoundCheck == 1){
            //Neuer Pfeil wird erstellt
            addObject(new Arrow2(), 594, 582);
            //Pfeil wird entfernt
            removeObjects(getObjects(Arrow.class));
            //Neuer Status wird ausgegeben
            status = "Auftrag wird dem Zustelldienst weitergeleitet";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 45 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 4500 && RoundCheck == 2){
            //Paket wird erstellt
            addObject(new Package(), 255, 304);
            //Pfeil wird entfernt
            removeObjects(getObjects(Arrow2.class));
            //Neuer Status wird ausgegeben
            status = "Sender bereitet Paket vor";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 55 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 5500 && RoundCheck == 3){
            //Drohne wird erstellt
            addObject(new Drone(), 453, 651);
            //Neuer Status wird ausgegeben
            status = "Drone startet vom Zustelldienst";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 65 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 6500 && RoundCheck == 4){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Drohne wird erstellt
            addObject(new Drone(), 117, 331);
            //Neuer Status wird ausgegeben
            status = "Drone ist unterwegs";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 70 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 7000 && RoundCheck == 5){
            // Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Paket wird entfernt
            removeObjects(getObjects(Package.class));
            //Drohne wird auf folgender Koordinate erstellt
            addObject(new Drone(), 301, 456);
            //Paket wird auf folgender Koordinate erstellt
            addObject(new Package(), 306, 528);
            //Neuer Status wird ausgegeben
            status = "Drone nimmt Paket entgegen";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 75 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 7500 && RoundCheck == 6){
            // Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Paket wird entfernt
            removeObjects(getObjects(Package.class));
            //Drohne wird auf folgender Koordinate erstellt
            addObject(new Drone(), 435, 621);
            //Paket wird auf folgender Koordinate erstellt
            addObject(new Package(), 442, 691);
            //Status wird ausgegeben
            status = "Drone kehrt mit dem Paket zurück";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 80 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 8000 && RoundCheck == 7){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Paket wird entfernt
            removeObjects(getObjects(Package.class));
            //Neuer Status wird ausgegeben
            status = "Zustelldienst hat das Paket erfolgreich erhalten";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 85 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 8500 && RoundCheck == 8){
            //Drohne wird generiert
            addObject(new Drone(), 800, 612);
            //Paket wird erstellt
            addObject(new Package(), 802, 684);
            //Status wird ausgegeben
            status = "Zustelldienst entsendet Drone für Zustellung";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 90 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 9000 && RoundCheck == 9){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Paket wird entfernt
            removeObjects(getObjects(Package.class));
            //Drohne wird erstellt
            addObject(new Drone(), 936, 463);
            //Paket wird erstellt
            addObject(new Package(), 942, 538);
            //Statusausgabe
            status = "Drone ist unterwegs für die Zustellung";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 95 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 9500 && RoundCheck == 10){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Paket wird entfernt
            removeObjects(getObjects(Package.class));
            //Neues Drohne wird erstellt
            addObject(new Drone(), 997, 302);
            //Neues Paket wird erstellt
            addObject(new Package(), 1002, 370);
            //Aktueller Status der Lieferung
            status = "Drone ist angekommen";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 100 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 10000 && RoundCheck == 11){
            //Paket wird entfernt
            removeObjects(getObjects(Package.class));
            //Status Ausgabe
            status = "Paket wurde erfolgreich abgeliefert";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 105 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 10500 && RoundCheck == 12){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Neue Drohne wird auf neuer Koordinate generiert
            addObject(new Drone(), 954, 472);
            //Aktuelle Status wird ausgegeben
            status = "Drone kehrt zum Zustelldienst zurück";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 110 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 11000 && RoundCheck == 13){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Drohne wird erneut erstellt
            addObject(new Drone(), 806, 652);
            //Status wird ausgegeben
            status = "Drone ist erfolgreich beim Zustelldienst angekommen";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 120 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 12000 && RoundCheck == 14){
            //Drohne wird entfernt
            removeObjects(getObjects(Drone.class));
            //Neuer Pfeil wird generiert
            addObject(new Arrow3(), 753, 310);
            //Status wird ausgegeben
            status = "Empfänger ändert den Status der Lieferung";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        //Nach 125 Sekunden und wenn die richtige Runde abgeschlossen ist, tritt dieser IF Fall ein
        if(timer.millisElapsed() > 12500 && RoundCheck == 15){
            //Alter Pfeil wird entfernt
            removeObjects(getObjects(Arrow3.class));
            //Neuer Pfeil wird generiert
            addObject(new Arrow4(), 446, 263);
            //Neuer Pfeil wird generiert
            addObject(new Arrow2(), 594, 582);
            //Status wird ausgegeben
            status = "Auftragssystem informiert Sender und Zustelldienst von der Zustellung";
            //Überprüft die Runde, in welcher man sich gerade befindet, bei der Zustellung
            RoundCheck++;
        
        }
        
        
    
    }
    
}
