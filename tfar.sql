-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: localhost    Database: tfarMysql
-- ------------------------------------------------------
-- Server version	8.0.25-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `DATABASECHANGELOG`
--

DROP TABLE IF EXISTS `DATABASECHANGELOG`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DATABASECHANGELOG` (
  `ID` varchar(255) NOT NULL,
  `AUTHOR` varchar(255) NOT NULL,
  `FILENAME` varchar(255) NOT NULL,
  `DATEEXECUTED` datetime NOT NULL,
  `ORDEREXECUTED` int NOT NULL,
  `EXECTYPE` varchar(10) NOT NULL,
  `MD5SUM` varchar(35) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `COMMENTS` varchar(255) DEFAULT NULL,
  `TAG` varchar(255) DEFAULT NULL,
  `LIQUIBASE` varchar(20) DEFAULT NULL,
  `CONTEXTS` varchar(255) DEFAULT NULL,
  `LABELS` varchar(255) DEFAULT NULL,
  `DEPLOYMENT_ID` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOG`
--

LOCK TABLES `DATABASECHANGELOG` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOG` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOG` VALUES ('00000000000001','jhipster','config/liquibase/changelog/00000000000000_initial_schema.xml','2021-03-30 22:33:37',1,'EXECUTED','8:d41d8cd98f00b204e9800998ecf8427e','empty','',NULL,'4.3.1',NULL,NULL,'7136417676');
/*!40000 ALTER TABLE `DATABASECHANGELOG` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DATABASECHANGELOGLOCK`
--

DROP TABLE IF EXISTS `DATABASECHANGELOGLOCK`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DATABASECHANGELOGLOCK` (
  `ID` int NOT NULL,
  `LOCKED` bit(1) NOT NULL,
  `LOCKGRANTED` datetime DEFAULT NULL,
  `LOCKEDBY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DATABASECHANGELOGLOCK`
--

LOCK TABLES `DATABASECHANGELOGLOCK` WRITE;
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` DISABLE KEYS */;
INSERT INTO `DATABASECHANGELOGLOCK` VALUES (1,_binary '\0',NULL,NULL);
/*!40000 ALTER TABLE `DATABASECHANGELOGLOCK` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cytogeneticien`
--

DROP TABLE IF EXISTS `cytogeneticien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cytogeneticien` (
  `code` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `service` varchar(200) DEFAULT NULL,
  `etab` varchar(200) DEFAULT NULL,
  `adresse` varchar(200) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `poste` varchar(20) DEFAULT NULL,
  `fax` varchar(20) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `photo` varchar(200) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `login` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `code_hopital` int NOT NULL,
  `code_service` int NOT NULL,
  PRIMARY KEY (`code`),
  KEY `code_hopital` (`code_hopital`),
  KEY `code_service` (`code_service`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cytogeneticien`
--

LOCK TABLES `cytogeneticien` WRITE;
/*!40000 ALTER TABLE `cytogeneticien` DISABLE KEYS */;
INSERT INTO `cytogeneticien` VALUES (4,'string','string','string','string','string','string','string','string','string','string','string','string','string','string',1,1),(3,'string','string','string','string','string','string','string','string','string','string','string','string','string','string',1,1),(5,'string','string','string','string','string','string','string','string','string@gmail.com','string','string','string','string','string',1,1),(6,'string','string','string','string','string','string','string','string','string','string','string','string','string','string',1,2),(7,'string','string','string','string','string','string','string','string','string@gmail.com','string','string','string','string','string',5,1);
/*!40000 ALTER TABLE `cytogeneticien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopital`
--

DROP TABLE IF EXISTS `hopital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopital` (
  `code` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `tel` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopital`
--

LOCK TABLES `hopital` WRITE;
/*!40000 ALTER TABLE `hopital` DISABLE KEYS */;
INSERT INTO `hopital` VALUES (1,'string','string','string','string','string'),(2,'string','string','string','string','string'),(5,'hopital militaire','route mazel chaker','55555555','gggggg','hm@gmail.com');
/*!40000 ALTER TABLE `hopital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratoire`
--

DROP TABLE IF EXISTS `laboratoire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laboratoire` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratoire`
--

LOCK TABLES `laboratoire` WRITE;
/*!40000 ALTER TABLE `laboratoire` DISABLE KEYS */;
INSERT INTO `laboratoire` VALUES (1,'lab1'),(2,'lab2'),(4,'s44474747');
/*!40000 ALTER TABLE `laboratoire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medecin`
--

DROP TABLE IF EXISTS `medecin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medecin` (
  `cin` int NOT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `grade` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT 'Part',
  `gouvernorat` enum('Ariana','Beja','BenArous','Bizerte','Gabes','Gafsa','Jendouba','Kairouan','Kasserine','Kebili','LeKef','Mahdia','LaManouba','Medenine','Monastir','Nabeul','Sfax','SidiBouzid','Siliana','Sousse','Tataouine','Tozeur','Tunis','Zaghouan','NP') DEFAULT 'NP',
  `adresse` varchar(100) DEFAULT NULL,
  `tel` varchar(15) DEFAULT NULL,
  `poste` varchar(8) DEFAULT NULL,
  `fax` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `image` varchar(100) DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `code_hopital` int NOT NULL,
  `code_service` int NOT NULL,
  KEY `code_hopital` (`code_hopital`),
  KEY `code_service` (`code_service`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medecin`
--

LOCK TABLES `medecin` WRITE;
/*!40000 ALTER TABLE `medecin` DISABLE KEYS */;
INSERT INTO `medecin` VALUES (0,'string','string','string','string','Ariana','string','string','string','string','string','string','string','string','string',1,1),(1,'string','string','string','string','Ariana','string','string','string','string','string','string','string','string','string',1,2);
/*!40000 ALTER TABLE `medecin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scientifique`
--

DROP TABLE IF EXISTS `scientifique`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scientifique` (
  `code` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) DEFAULT NULL,
  `prenom` varchar(20) DEFAULT NULL,
  `service` varchar(100) DEFAULT NULL,
  `centre` varchar(100) DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `tel` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `photo` varchar(100) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `login` varchar(10) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `code_universite` int NOT NULL,
  PRIMARY KEY (`code`),
  KEY `code_universite` (`code_universite`)
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scientifique`
--

LOCK TABLES `scientifique` WRITE;
/*!40000 ALTER TABLE `scientifique` DISABLE KEYS */;
INSERT INTO `scientifique` VALUES (9,'string','string','string','string','string','string','string','string','string','string','string','string',8),(8,'string','string','string','string','string','string','string','string','string','string','string','string',7);
/*!40000 ALTER TABLE `scientifique` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service` (
  `code` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'string'),(2,'string'),(4,'service_m1');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `universite`
--

DROP TABLE IF EXISTS `universite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `universite` (
  `code_universite` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) DEFAULT NULL,
  `adresse` varchar(100) DEFAULT NULL,
  `tel` varchar(30) DEFAULT NULL,
  `contact` varchar(100) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`code_universite`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `universite`
--

LOCK TABLES `universite` WRITE;
/*!40000 ALTER TABLE `universite` DISABLE KEYS */;
INSERT INTO `universite` VALUES (1,'universite de sfax','sfax','24242424','contact1','s@gmail.com'),(2,'universite de sousse','sousse','24142414','contact2','s2@gmail.com'),(3,'universite de mahdia','mahdia','11441144','contact3','s3@gmail.com'),(5,'universite 1','adresse 1','22115588','string','st@gmail.com'),(6,'universite 2','adresse 2','22115588','string','st2@gmail.com'),(7,'string','string','string','string','string'),(8,'string','string','string','string12','string');
/*!40000 ALTER TABLE `universite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-13 12:21:18
