# Startup notes
You can use this template the same way that you have used templates in this course or Introduction to Programming. Just start IntelliJ and open the folder.

The CSV data required is provided in the project and can be accessed using the file name “targets.csv”.

# Bug bounty administration system

## Summary
In this test you will create a system that can be used to store and analyse bug bounties. Bug bounties are payments you can receive by testing the security of systems.
There are two types of targets which will do a payout when you find a bug. These are charities and companies.

## Targets
To provide your system with data, we have included a file “targets.csv” that you must import into the system.
When the system runs, the targets in the file are the only targets that should be considered.
The file contains:
- The type: If it is a charity or company
- The name: The name of the company or charity
- The city: The city where the charity or company is located
- The taxNumber: In case of a company, the taxNumber is given. For charities, no taxnumber exists.
- The registrationNumber: In case of charities, the charity registration number is given. For companies, no registration number exists.

## Bounties
The system should be able to store the bounties and do some calculations on those bounties (more on that later).
Bounties are paid based on type. For all Information Disclosure (ID) bounties, an 8 character identifier (e.g. 6f09f420) should be stored. Furthermore, the target (as described above), the year (e.g. 2023), the total payment amount (e.g. €1000), which information is leaked (e.g. "credit card") and whether or not the information is related to the GDPR rules is stored.
For Structured Query Language Injections (SQLI) bounties an 8 character identifier, the target, the year, the total payment amount and which databases is compromised (e.g. "user_db") is stored.

You are required to hardcode two bounties for each category:
Information Disclosure:
- id: fd212311, target: Bol, year: 2023, payment amount: €400, leak: customer data, gdpr: true
- id: 805a9d09, target: Nu, year: 2023, payment amount: €100, leak: database id, gdpr: false

Structured Query Language Injections:
- id: 6f09f420, target: Bol, year: 2023, payment amount: €500, database: django
- id: eb75874b, target: Amazon, year: 2023, payment amount: €200, database: postgress_amazon

The targets of these bounties are already present in the targets.csv file.

## Getting started
To get you started we have provided a template which includes a menu to guide you through this exam. This menu only has 5 options.
```
*********************************************
* 1) Add Information Disclosure bounty      *
* 2) Add SQL injection bounty               *
* 3) Show bug bounty overview               *
* 4) Show bug bounties per target (sorted)  *
* 0) Exit                                   *
*********************************************
```
In the “Example” section of this description you’ll find a demonstration of how your system could function. For now, we’ll briefly discuss the important parts of each step.

- Option 1 requires you to add an Information Disclosure bounty to the system
- Option 2 requires you to add an SQL Injection bounty to the system
- Option 3 needs to give a total overview of all bounties, with in conclusion the total amount of bounties received. When a bounty is related to the GDPR (gdpr = true) this will be indicated with a "*". The bounty with the highest amount will receive the annotation "(max)". Please see the examples below.
- Option 4 needs to give an overview of the bounties received per target. This should be sorted by total amount ascending. If the total amount of bounties received for this target is the same as for another target, the sorting should be based on name (ascending).

## Exception handling
You are required to check for the following problems, using a custom exception class of your own design.
- A bounty cannot be added to the system when the total payment amount of bounties exceeds €100000.
- A bounty cannot be added to the system when the target does not exist
- A bounty cannot be added to the system when the year is before 1990

In all cases, you will need to throw your own exception.

To save time during your test, there is no need to include any other checks / validations in your program.

Hints:
- Before you start, create a class diagram to design your system (properly).
- Start by creating a system that can register bounties, then work on the overviews.

## Example output
Whenever you start the program the data should be loaded from the targets.csv file and the hardcoded bounties should be loaded as well.

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
