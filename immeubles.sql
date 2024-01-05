-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2024 at 02:06 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `immeubles`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `date_naissance` date DEFAULT NULL,
  `genre` varchar(5) NOT NULL,
  `cin` bigint(20) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `immeubles`
--

CREATE TABLE `immeubles` (
  `superficie` double DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `price, length=10, nullable= false` bigint(20) DEFAULT NULL,
  `code` varchar(10) DEFAULT NULL,
  `category` varchar(15) DEFAULT NULL,
  `name` varchar(30) NOT NULL,
  `image` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `immeubles_seq`
--

CREATE TABLE `immeubles_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `immeubles_seq`
--

INSERT INTO `immeubles_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `operation`
--

CREATE TABLE `operation` (
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `cin_client` bigint(20) DEFAULT NULL,
  `frais_loc` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `id_immeuble` bigint(20) DEFAULT NULL,
  `nom_client` varchar(30) DEFAULT NULL,
  `garantie` varchar(255) DEFAULT NULL,
  `montant_garantie` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`cin`);

--
-- Indexes for table `immeubles`
--
ALTER TABLE `immeubles`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_lpvj2thvfw0yr2jiwpomkie9v` (`code`);

--
-- Indexes for table `operation`
--
ALTER TABLE `operation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKdy9cpteurc1kpcbvu52e4sqr8` (`cin_client`),
  ADD KEY `FKt55ieynnvuj14aqtwvn5ao5u` (`id_immeuble`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `operation`
--
ALTER TABLE `operation`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `operation`
--
ALTER TABLE `operation`
  ADD CONSTRAINT `FKdy9cpteurc1kpcbvu52e4sqr8` FOREIGN KEY (`cin_client`) REFERENCES `client` (`cin`),
  ADD CONSTRAINT `FKt55ieynnvuj14aqtwvn5ao5u` FOREIGN KEY (`id_immeuble`) REFERENCES `immeubles` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
