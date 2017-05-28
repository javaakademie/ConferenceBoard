# ConferenceBoard

Bei dieser Anwendung handelt es sich um ein Beispiel für eine auf Java-Modulen basierten Anwendung. Es handelt sich um ein Tool zur Verwaltung von Sessions und Speakern einer Konferenz. Die Anwendung ist im Zuge eines Vortrages auf der JAX 2017 entstanden und basiert auf einer Java 9 Vorabversion (jdk-9_166), der eclipse Vorabversion Oxygen Release Milestone 6 (4.7.0 M6) und Maven 3.3.9. Da zum Zeitpunkt der Programmerstellung Java 9 noch nicht final war, könnten zu einem späteren Zeitpunkt der Verwendung noch Anpassungen notwendig sein.
<p align="center"><br/>
  <img src="https://github.com/javaakademie/ConferenceBoard/blob/master/preview.png" border="0">
</p>

Die Anwendung besteht aus den folgenden vier Modulen:
- GUI-Modul (*de.javaakademie.cb.gui*)
- Speaker-Modul (*de.javaakademie.cb.speaker*)
- Sessions-Modul (*de.javaakademie.cb.sessions*) 
- API-Modul (*de.javaakademie.cb.api*)

Das GUI-Modul fungiert dabei als Servie-Consumer, die beiden Module Speaker und Sessions als Service-Provider-Module und das API-Modul enthält das Service-Provider-Interface (SPI). Das Model wurde der einfachheit halber ebenfalls im API-Modul verpackt, um das Beispiel übersichtlicher zu halten, anstatt hierfür ein eigenes Modul anzulegen. Die Oberfläche der Anwendung wurde mit JavaFX umgesetzt.

Die Module sind orientierend an einer Schichtenarchitektur und den Fachdomänen wie folgt geschnitten:

<p align="center"><br/>
  <img src="https://github.com/javaakademie/ConferenceBoard/blob/master/loesungsansatz.png" border="0">
</p>


###  Von der Konsole aus Bauen und Starten ### 

Kompilieren und Bauen der Anwendung:<br/>
**cd [Projektverzeichnis]**<br/>
**mvn clean install**

Starten der Anwendung<br/>
**java -p modules -m de.javaakademie.cb.gui/de.javaakademie.cb.gui.App**


###  Von eclipse aus Bauen und Starten ### 

Im Verzeicnis des GUI-Moduls liegt die Datei **App.launch** für zusätzliche "**Run Configurations**".
Mit dieser Datei können die Configurations in eclipse imoprtiert werden oder manuell eingegeben werden:

<p align="center"><br/>
  <img src="https://github.com/javaakademie/ConferenceBoard/blob/master/runConfigurations.png" border="0">
</p>


## Links ##

* [JDK 9 Early-Access Build](https://jdk.java.net/9/)
* [Eclipse Oxygen Milestone 7 mit JDK 9](http://javaakademie.de/blog/java-9-ea-oxygen)
* [Java 9 API Specification](http://download.java.net/java/jdk9/docs/api/overview-summary.html)
* [Vortrag JAX: Die Welt ist modular](https://jax.de/session/die-welt-ist-modular/)
