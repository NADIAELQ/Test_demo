# Test_demo
Une application Spring Boot pour gérer des réservations dans un barbershop, utilisant PostgreSQL pour la base de données.

Cette application permet :
- D'ajouter une réservation.
- De visualiser les réservations existantes.
- De supprimer des réservations.
- Utiliser une base de données PostgreSQL pour stocker les données.
- Inclure des tests pour garantir la robustesse.

## Technologies utilisées
- **Java 17**
- **Spring Boot 3**
    - Spring Web
    - Spring Data JPA
- **PostgreSQL**
- **Thymeleaf** 
- **Bootstrap**

## Installation

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/NADIAELQ/Test_demo.git
   cd Test_demo

2. Configurez PostgreSQL :

Créez une base de données nommée booking_app.
Modifiez les informations de connexion dans src/main/resources/application.properties :

spring.datasource.url=jdbc:postgresql://localhost:5432/booking_app
spring.datasource.username=your_username
spring.datasource.password=your_password

3. Lancez l'application avec Maven :

mvn spring-boot:run

Formulaire de réservation : http://localhost:8080/booking
Liste des réservations : http://localhost:8080/bookings

4. Tests
## Tests
Pour exécuter les tests :
mvn test

### Page de réservation :
![image](https://github.com/user-attachments/assets/7afa45ea-4ae8-43a6-a622-ce2aa5b40b9f)


### Liste des réservations :
![image](https://github.com/user-attachments/assets/98e099f3-901c-4ca4-a301-a4f8e330b7fd)
