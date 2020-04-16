-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: store_sales_system
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Current Database: `store_sales_system`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `store_sales_system` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `store_sales_system`;

--
-- Table structure for table `goods_detail`
--

DROP TABLE IF EXISTS `goods_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goods_detail` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '编号',
  `sortId` bigint NOT NULL COMMENT '分类编号',
  `name` varchar(50) NOT NULL COMMENT '商品名称',
  `address` varchar(50) NOT NULL COMMENT '产地名称',
  `price` decimal(10,2) NOT NULL COMMENT '单价',
  `createDate` date NOT NULL COMMENT '生产日期',
  `remaining` int NOT NULL COMMENT '剩余数量',
  PRIMARY KEY (`id`),
  KEY `goods_detail_goods_sort_id_fk` (`sortId`),
  CONSTRAINT `goods_detail_goods_sort_id_fk` FOREIGN KEY (`sortId`) REFERENCES `goods_sort` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='商品明细表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods_detail`
--

LOCK TABLES `goods_detail` WRITE;
/*!40000 ALTER TABLE `goods_detail` DISABLE KEYS */;
INSERT INTO `goods_detail` VALUES (1,1,'毛笔','河北省石家庄市',12.00,'2011-10-15',65),(2,1,'铅笔盒','湖南长沙',29.00,'2012-05-15',21),(3,2,'台灯','河北省唐山市',34.00,'2011-08-11',12),(4,3,'锅巴','北京市大兴区',15.00,'2012-05-09',20),(5,3,'臭豆腐','湖南省长沙',4.00,'2012-06-16',30),(6,4,'拖把','陕西省西安市',19.00,'2011-11-21',6),(11,3,'方便面','中国',5.00,'2020-04-16',22);
/*!40000 ALTER TABLE `goods_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goods_sort`
--

DROP TABLE IF EXISTS `goods_sort`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goods_sort` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '分类编号',
  `name` varchar(20) NOT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='商品分类表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods_sort`
--

LOCK TABLES `goods_sort` WRITE;
/*!40000 ALTER TABLE `goods_sort` DISABLE KEYS */;
INSERT INTO `goods_sort` VALUES (1,'文具'),(2,'小电器'),(3,'零食'),(4,'日用百货');
/*!40000 ALTER TABLE `goods_sort` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-16 17:40:56
