# Voordat je start
Je kunt dit project op dezelfde manier gebruiken zoals je gewend bent in dit vak of zoals bij Introductie Programmeren. Start IntelliJ en open de map.

Het benodigde CVS bestand is gegeven in het project en heeft de naam "targets.csv".

# Bug bounty administratie systeem

## Samenvatting
Gedurende deze test bouw je een systeem wat we kunnen gebruiken voor het opslaan en analyseren van bug bounties. Bug bounties zijn betalingen die je kunt ontvangen voor het testen van systemen. Er zijn twee soorten instanties (targets) die een uitbetaling doen als je een fout vindt in een systeem. Dit zijn goede doelen (charities) en bedrijven (compagnies).

## Instanties (Targets)
Om het administratiesysteem van gegevens te voorzien is het bestand "targets.csv" gegeven. Je moet de gegevens van dit bestand importeren in het systeem. Wanneer het systeem start moeten de instanties in het bestand ingelezen worden. Je hoeft alleen rekening te houden met deze instanties.

Het bestand bevat:
- Type: Of het een goed doel (charity) of bedrijf (company) is
- Naam: De naam van het bedrijf of goede doel
- City: De plaats waar het bedrijf of goede doel gevestigd is
- taxNumber: In het geval van een bedrijf is het belastingsnummer (tax number) gegeven. Voor goede doelen is dit niet relevant.
- registrationNumber: In het geval van een goed doel is het registratienummer gegeven. Dit is niet relevant voor een bedrijf.

## Bounties
Het systeem moet in staat zijn om bounties op te slaan en hier een aantal berekeningen op uit te voeren (hier komen we zo op terug).
Bounties worden uitbetaald op basis van type. Voor alle Information Disclosure (ID) bounties moet er een identificatienummer van 8 karakters opgeslagen worden (bijv. 6f09f420). Verder moet de instantie (Target) zoals hierboven beschreven, het jaar (bijv. 2023), het totale bedrag (bijv. €1000), welke informatie er is gelekt (bijv. "credit card info") en of de informatie wel of niet te maken heeft met de AVG regels (GDPR) worden opgeslagen.
Voor Structured Query Language Injections (SQLI) bounties moet er een 8 karakter lange identifier, de instantie (Target), het jaar, het totale bedrag en welke database geraakt is (bijv. "user_db") opgeslagen worden.

Je bent verplicht twee bounties hard-coded te administreren:

Information Disclosure:
- id: fd212311, target: Bol, year: 2023, payment amount: €400, leak: customer data, gdpr: true
- id: 805a9d09, target: Nu, year: 2023, payment amount: €100, leak: database id, gdpr: false

Structured Query Language Injection:
- id: 6f09f420, target: Bol, year: 2023, payment amount: €500, database: django
- id: eb75874b, target: Amazon, year: 2023, payment amount: €200, database: postgress_amazon

De instanties (targets) van deze bounties zijn vanzelfsprekend al aanwezig in het targets.csv bestand.

## Beginnen
Om je snel te laten beginnen hebben we al een template voor je gemaakt. Deze bevat een menu om je door dit examen heen te begeleiden. Het menu heeft maar 5 opties.
```
*********************************************
* 1) Add Information Disclosure bounty      *
* 2) Add SQL injection bounty               *
* 3) Show bug bounty overview               *
* 4) Show bug bounties per target (sorted)  *
* 0) Exit                                   *
*********************************************
```
In het hoofdstuk "Voorbeeld" hieronder is een voorbeeld te vinden van hoe het systeem zou kunnen functioneren. We zullen de verschillende functionaliteiten kort toelichten:

- Optie 1: met deze optie kun je een Information Disclosure bounty toevoegen aan het systeem
- Optie 2: met deze optie kun je een SQL Injection bounty toevoegen aan het systeem
- Optie 3: deze optie zal een overzicht geven van alle bounties in het systeem. Tevens toont deze optie het totaal bedrag van alle bounties samen. Als een bountie gerelateerd is aan de AVG regels (gdpr = true) zal dit aangegeven worden door middel van een "*". De bounty met het hoogste bedrag krijgt de annotatie "(max)". Zie de voorbeelden hieronder.
- Optie 4: deze optie geeft een overzicht van alle bounties per instantie (target). Dit overzicht dient gesorteerd te worden op het totaalbedrag wat ontvangen is (oplopend). Als het totaalbedrag hetzelfde is dient gesorteerd te worden op naam (op alphabet).

## Foutafhandeling
Je bent verplicht om de volgende problemen af te vangen door gebruik te maken van een eigengemaakte exceptie klasse.
- Er kan geen bounty toegevoegd worden aan het systeem als het bedrag groter is dan €100000
- Er kan geen bounty toegevoegd worden aan het systeem als de instantie (target) niet bestaat
- Er kan geen bounty toegevoegd worden aan het systeem als het jaartal lager is dan 1990.

In alle gevallen moet je je eigen exceptie throwen.

Om je wat tijd te besparen tijdens het examen hoef je geen andere foutafhandelingen of validaties aan je programma toe te voegen.

Tips:
- Maak een klassediagram voordat je start
- Start met het systeem om de bounties te registreren, zorg er daarna voor dat je de overzichten implementeert.

## Voorbeeld
Als je het programma start moet de data ingeladen worden uit het targets.csv bestand. De hard gecodeerde bounties moeten ook geadministreerd worden.

```
*********************************************
* 1) Add Information Disclosure bounty      *
* 2) Add SQL injection bounty               *
* 3) Show bug bounty overview               *
* 4) Show bug bounties per target (sorted)  *
* 0) Exit                                   *
*********************************************

Please select a menu option: 1

Adding ID Bounty
id: 328ff22a
target: Bol
year: 2023
amount: 600
information: CTO mail address
gdpr: true

*********************************************
* 1) Add Information Disclosure bounty      *
* 2) Add SQL injection bounty               *
* 3) Show bug bounty overview               *
* 4) Show bug bounties per target (sorted)  *
* 0) Exit                                   *
*********************************************

Please select a menu option: 2

Adding SQLI Bounty
id: 951bc432
target: Amazon
year: 2024
amount: 100
database: users_db

*********************************************
* 1) Add Information Disclosure bounty      *
* 2) Add SQL injection bounty               *
* 3) Show bug bounty overview               *
* 4) Show bug bounties per target (sorted)  *
* 0) Exit                                   *
*********************************************

Please select a menu option: 3

Overview of bugbounties: 
Id:fd212311, Target: Bol, Year: 2023, Amount: €400 Information: customer data * 
Id:805a9d09, Target: Nu, Year: 2023, Amount: €100 Information: database id 
Id:6f09f420, Target: Bol, Year: 2023, Amount: €500 Database: django 
Id:eb75874b, Target: Amazon, Year: 2023, Amount: €200 Database: postgress_amazon 
Id:328ff22a, Target: Bol, Year: 2023, Amount: €600 Information: CTO mail address * (max)
Id:951bc432, Target: Amazon, Year: 2024, Amount: €100 Database: users_db 
Total payout = €1900

*********************************************
* 1) Add Information Disclosure bounty      *
* 2) Add SQL injection bounty               *
* 3) Show bug bounty overview               *
* 4) Show bug bounties per target (sorted)  *
* 0) Exit                                   *
*********************************************

Please select a menu option: 4

Save the Children €0
World Wildlife Fund €0
Nu €100
Amazon €300
Bol €1500
```
