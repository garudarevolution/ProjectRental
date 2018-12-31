-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2018 at 01:26 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `nama`) VALUES
(1, 'admin1', 'admin1', 'Serilda'),
(2, 'admin2', 'admin2', 'Nofita');

-- --------------------------------------------------------

--
-- Table structure for table `adminps`
--

CREATE TABLE `adminps` (
  `idps` int(11) NOT NULL,
  `jenisps` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminps`
--

INSERT INTO `adminps` (`idps`, `jenisps`, `harga`, `jumlah`) VALUES
(1, 'PS2', 10000, 100),
(2, 'PS3', 15000, 100),
(3, 'PS4', 20000, 100);

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian`
--

CREATE TABLE `pengembalian` (
  `TanggalKembali` date NOT NULL,
  `TanggalPinjam` date NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenisps` varchar(100) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `nohp` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengembalian`
--

INSERT INTO `pengembalian` (`TanggalKembali`, `TanggalPinjam`, `nama`, `jenisps`, `alamat`, `nohp`) VALUES
('2031-12-18', '2030-12-18', 'seril', 'PS2', 'jalan suhat', 987654321);

-- --------------------------------------------------------

--
-- Table structure for table `ps`
--

CREATE TABLE `ps` (
  `idps` int(11) NOT NULL,
  `jenisps` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ps`
--

INSERT INTO `ps` (`idps`, `jenisps`, `harga`) VALUES
(1, 'PS2', 10000),
(2, 'PS3', 15000),
(3, 'PS4', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `TanggalPinjam` varchar(11) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `jenisps` varchar(100) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Nohp` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`TanggalPinjam`, `Nama`, `jenisps`, `Alamat`, `Nohp`) VALUES
('311218', 'seri', 'PS2', 'jalan suhat', 987654321);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `idpemilik` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`idpemilik`, `username`, `password`) VALUES
(1, 'member1', 'member1'),
(2, 'member2', 'member2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `adminps`
--
ALTER TABLE `adminps`
  ADD PRIMARY KEY (`idps`);

--
-- Indexes for table `ps`
--
ALTER TABLE `ps`
  ADD PRIMARY KEY (`idps`);

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`idpemilik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
