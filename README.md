### **Automatizirano Testiranje - Selenium**

Projekt odrađen u IntelliJ koristeći Selenium WebDriver,Java i TestNG testni okvir.  
Testira se web stranica hcl.hr

---

## **Tehnologije**

Java – programski jezik
ChromeDriver – korištenje Google Chrome za testiranje
Selenium WebDriver – web testiranje
TestNG – organizacija testova

Potrebni alati: JDK, Maven, ChromeDriver, TestNG, IntelliJ

---

## **Testovi**

Za pocetak testova se otvara Google Chrome , maksimizira prozor te kreću 5 testova

1.	googleSearchTest() - pronalazak stranice na webu
- klikanje "reject" buttona
- traženje pojma "hcl hr" na google
- u ovom koraku je ostavljeno korisniku vremena da se rješi captcha
- nakon uspješne pretrage se gledaju rezultati i traži se stranica hcl-a

2.	ClickHCLPageTest() - ulazak na stranicu
- ulazak na stranicu hcl po pronađenom elementu
- pristanak na cookies
- verificiranje je li ostvaren ulaz na točnu stranicu

3.	GameBaseTest() - testiranje baze igara na hcl
- pronalazak baze igara
- ulazak u stranicu baze igara
- provjera je li stranica točna

4.	ShopTest() - testiranje hcl trgovine
- pronalazak shop-a
- ulazak u stranicu shop-a
- provjera je li stranica točna

5.	LoginTest() - testiranje logina
- povratak na glavnu stranicu hcl-a
- pronalazk i klik na login
- pokušaj logina bez inputa
- verificiranje je li login točno govori da je pokušaj odrađen

Na kraju testova se gasi Google Chrome

---

Automatizirano testiranje na Google Chrome, xpath korišten za pronalazak elemenata.
