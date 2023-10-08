-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: orestaurant
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `Emp_Id` int NOT NULL AUTO_INCREMENT,
  `Emp_Name` varchar(50) NOT NULL,
  `Emp_jobTitle` varchar(50) NOT NULL,
  `Emp_salary` double DEFAULT NULL,
  `dept_id` int DEFAULT NULL,
  PRIMARY KEY (`Emp_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Mohamed Alaa','cashier',5000,NULL),(2,'ahmed essam','cheif',6000,NULL),(3,'nada essam','captin',8500,NULL),(4,'hazem Alaa','delivery man',4000,NULL),(5,'esraa essam','cheif',4500,NULL),(6,'said mohamed','cheif',5000,NULL),(7,'Mohamed Hassan','cheif',4500,NULL),(8,'nada','chief',5000,NULL),(9,'mohamed alaa','Captin',9000,2),(10,'rana','Captin',4000,8);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rest_dept`
--

DROP TABLE IF EXISTS `rest_dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rest_dept` (
  `dept_id` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(50) DEFAULT NULL,
  `dept_loc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rest_dept`
--

LOCK TABLES `rest_dept` WRITE;
/*!40000 ALTER TABLE `rest_dept` DISABLE KEYS */;
INSERT INTO `rest_dept` VALUES (1,'employee','cairo'),(2,'manegment','cairo'),(3,'HR','cairo'),(4,'delivery','cairo'),(5,'selver','cairo'),(6,'take away','cairo'),(7,'employee','Alex'),(10,'manegment','Alex'),(11,'HR','Alex'),(12,'delivery','Alex'),(13,'selver','Alex'),(14,'take away','Alex');
/*!40000 ALTER TABLE `rest_dept` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-30 21:39:29
