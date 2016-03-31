-- MySQL dump 10.13  Distrib 5.5.27, for Win32 (x86)
--
-- Host: localhost    Database: drugs
-- ------------------------------------------------------
-- Server version	5.5.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `drugs`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `drugs` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `drugs`;

--
-- Table structure for table `drug_stock`
--

DROP TABLE IF EXISTS `drug_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drug_stock` (
  `drug_id` int(10) NOT NULL AUTO_INCREMENT,
  `drug_name` varchar(255) NOT NULL,
  `drug_type` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `drug_purpose` varchar(255) NOT NULL,
  `dosage` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `cost_per_unit` int(11) NOT NULL,
  `total_cost` int(11) NOT NULL,
  `expiry_date` date NOT NULL,
  `admin_email` varchar(255) NOT NULL,
  PRIMARY KEY (`drug_id`),
  UNIQUE KEY `drug_name` (`drug_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drug_stock`
--

LOCK TABLES `drug_stock` WRITE;
/*!40000 ALTER TABLE `drug_stock` DISABLE KEYS */;
INSERT INTO `drug_stock` VALUES (1,'Panadol','Tablets','Painkiller','pain','2x3',413,4,1652,'2015-04-16','shawnmbuvi@gmail.com'),(2,'Flugon','Capsules','Antibiotic','flu','1x2',434,5,2170,'2015-05-05','shawnmbuvi@gmail.com'),(3,'Maralatab','Tablets','Antibiotic','malaria','2x2',340,3,1020,'2015-04-30','shawnmbuvi@gmail.com'),(4,'Flugon50mg','Syrup','Antiseptic','common cold','1x3',55,3,135,'2015-04-24','shawnmbuvi@gmail.com');
/*!40000 ALTER TABLE `drug_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `drug_id` int(10) NOT NULL,
  `drug_name` varchar(255) NOT NULL,
  `drug_type` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `quantity_ordered` int(10) NOT NULL,
  `order_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `supplier_email` varchar(255) NOT NULL,
  PRIMARY KEY (`drug_id`),
  UNIQUE KEY `drug_name` (`drug_name`),
  UNIQUE KEY `drug_name_2` (`drug_name`),
  UNIQUE KEY `drug_name_4` (`drug_name`),
  UNIQUE KEY `drug_name_5` (`drug_name`),
  UNIQUE KEY `drug_name_6` (`drug_name`),
  KEY `drug_name_3` (`drug_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'Panadol','Tablets','Painkiller',30,'2015-03-16 12:59:47','singi@gmail.com'),(3,'Strepsils','Tablets','Antibiotic',21,'2015-03-16 13:06:24','singi@gmail.com');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales_details`
--

DROP TABLE IF EXISTS `sales_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales_details` (
  `drug_id` int(10) NOT NULL,
  `drug_name` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `drug_type` varchar(255) NOT NULL,
  `drug_purpose` varchar(255) NOT NULL,
  `expiry_date` date NOT NULL,
  `quantity_sold` int(10) NOT NULL,
  `quantity_left` int(10) NOT NULL,
  `total_cost` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales_details`
--

LOCK TABLES `sales_details` WRITE;
/*!40000 ALTER TABLE `sales_details` DISABLE KEYS */;
INSERT INTO `sales_details` VALUES (1,'Panadol','Painkiller','Tablets','pain','2015-04-16',10,430,30,'2015-03-16'),(4,'Paracetamol','Antibiotic','Tablets','pains','2015-03-25',70,270,210,'2015-03-16'),(5,'mataa','Antiseptic','Syrup','poai','2015-03-27',9,80,81,'2015-03-21'),(1,'Panadol','Painkiller','Tablets','pain','2015-04-16',27,413,88,'2015-03-22'),(5,'mataa','Antiseptic','Syrup','poai','2015-03-27',15,74,135,'2015-03-22'),(4,'Flugon50mg','Antiseptic','Syrup','common cold','2015-04-24',5,45,15,'2015-03-31');
/*!40000 ALTER TABLE `sales_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salesdeleted`
--

DROP TABLE IF EXISTS `salesdeleted`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salesdeleted` (
  `drug_id` int(10) NOT NULL,
  `drug_name` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `drug_type` varchar(255) NOT NULL,
  `drug_purpose` varchar(255) NOT NULL,
  `expiry_date` date NOT NULL,
  `quantity_sold` int(10) NOT NULL,
  `quantity_left` int(10) NOT NULL,
  `total_cost` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salesdeleted`
--

LOCK TABLES `salesdeleted` WRITE;
/*!40000 ALTER TABLE `salesdeleted` DISABLE KEYS */;
/*!40000 ALTER TABLE `salesdeleted` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suppliers` (
  `supplier_id` int(10) NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(255) NOT NULL,
  `supplier_mobile` int(15) NOT NULL,
  `supplier_email` varchar(255) NOT NULL,
  `supplier_location` varchar(255) NOT NULL,
  PRIMARY KEY (`supplier_id`),
  UNIQUE KEY `supplier_email` (`supplier_email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES (1,'Singi',735617776,'singi@gmail.com','Kanziko');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trash`
--

DROP TABLE IF EXISTS `trash`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trash` (
  `drug_id` int(10) NOT NULL,
  `drug_name` varchar(255) NOT NULL,
  `drug_type` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `drug_purpose` varchar(255) NOT NULL,
  `dosage` varchar(255) NOT NULL,
  `quantity` int(10) NOT NULL,
  `cost_per_unit` int(10) NOT NULL,
  `total_cost` int(10) NOT NULL,
  `expiry_date` date NOT NULL,
  `admin_email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trash`
--

LOCK TABLES `trash` WRITE;
/*!40000 ALTER TABLE `trash` DISABLE KEYS */;
INSERT INTO `trash` VALUES (5,'mataa','Syrup','Antiseptic','poai','6x8',74,9,666,'2015-03-27','shawnmbuvi@gmail.com');
/*!40000 ALTER TABLE `trash` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_accounts`
--

DROP TABLE IF EXISTS `user_accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_accounts` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_type` varchar(255) NOT NULL,
  `f_name` varchar(255) NOT NULL,
  `m_name` varchar(255) NOT NULL,
  `l_name` varchar(255) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `mobile` int(15) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_email` (`user_email`),
  UNIQUE KEY `user_email_2` (`user_email`),
  UNIQUE KEY `user_email_3` (`user_email`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_accounts`
--

LOCK TABLES `user_accounts` WRITE;
/*!40000 ALTER TABLE `user_accounts` DISABLE KEYS */;
INSERT INTO `user_accounts` VALUES (1,'Administrator','Shawn','Mbuvi','Andre','shawnmbuvi@gmail.com',732628560,'dre','12345','2015-01-30 10:03:35'),(3,'Normal user','Alice','Ndanya','Sean','alicetitus6@gmail.com',732034230,'liz','mbuvi','2015-01-30 10:10:45'),(6,'Normal user','Alice','Ndanya','Sean','alice6@gmail.com',707536954,'lizz','mbuvi','2015-01-30 10:20:04'),(9,'Normal user','Lilian','Wanza','Ngutu','lilian@gmail.com',987654635,'lili','wanza','2015-01-30 10:30:07'),(12,'Normal user','Maureen','Ndunge','Kariuki','ndunge@gmail.com',737098837,'mich','lol','2015-01-30 10:53:23'),(26,'Administrator','Karen','Muthoni','Sean','karmuthoni@gmail.com',733849543,'muthoni','dre','2015-03-06 17:10:32'),(27,'Normal user','kit','uio','pol;','ytu@gmail.com',987654343,'pol','polin','2015-03-22 06:13:18'),(28,'Administrator','polg','kil','uit','ol@yahoo.com',988776665,'poml','io','2015-03-22 06:14:09');
/*!40000 ALTER TABLE `user_accounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-31 11:21:27
