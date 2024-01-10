# Tasca S4.02 Api Rest amb Spring boot

Nivell 1

- Exercici CRUD amb H2

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

- PROJECT (gestor de dependències): Maven

- LANGUAGE: Java.

- SPRING BOOT: La darrera versió estable.

- PROJECT METADATA

  - Group: cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01

  - Artifact: S04T02N01CognomsNom

  - Name: S04T02N01CognomsNom

  - Description: S04T02N01CognomsNom

  - Package name: cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01

- PACKAGING: Jar

- JAVA: Mínim versió 11 

- Dependències:

  - Spring Boot DevTools

  - Spring Web
    
  - Spring Data JPA
    
  - H2 Database

Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

    int id
    String nom
    Int quantitatQuilos

Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2, seguint el patró MVC. Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services
    cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.repository

La classe ubicada al paquet controllers (FruitaController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

http://localhost:8080/fruita/add

http://localhost:8080/fruita/update

http://localhost:8080/fruita/delete/{id}

http://localhost:8080/fruita/getOne/{id}

http://localhost:8080/fruita/getAll
