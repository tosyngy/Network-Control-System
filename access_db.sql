-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 29, 2015 at 11:04 AM
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `access_control`
--
CREATE DATABASE `access_control` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `access_control`;

-- --------------------------------------------------------

--
-- Table structure for table `access`
--

CREATE TABLE IF NOT EXISTS `access` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `ip` varchar(30) NOT NULL,
  `location` text NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `sysid` varchar(30) NOT NULL,
  `sys_other` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `last_connect_period` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `access`
--

INSERT INTO `access` (`id`, `name`, `ip`, `location`, `mobile`, `sysid`, `sys_other`, `username`, `password`, `last_connect_period`, `status`) VALUES
(1, 'TOSIN oloa', '127.0.0.1', 'here or dre', '0908355653', 'null', '1189744190', 'Oginni', 'mypass', '2015-01-29 10:22:11', 2);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `role` int(1) NOT NULL DEFAULT '1',
  `status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `role`, `status`) VALUES
(1, 'admin', 'admin', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE IF NOT EXISTS `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sysid` varchar(100) NOT NULL,
  `ip` varchar(100) NOT NULL,
  `action` varchar(100) NOT NULL,
  `contime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Dumping data for table `log`
--

INSERT INTO `log` (`id`, `sysid`, `ip`, `action`, `contime`, `status`) VALUES
(1, 'null', '127.0.0.1', 'Admin login', '2015-01-29 10:14:47', 0),
(2, 'null', '127.0.0.1', 'New Network with name network 1', '2015-01-29 10:16:34', 0),
(3, 'null', '127.0.0.1', 'network 1 Denied Access by admin', '2015-01-29 10:17:41', 0),
(4, 'null', '127.0.0.1', 'network 1 Granted Access by admin', '2015-01-29 10:17:56', 0),
(5, 'null', '127.0.0.1', 'New Network with name network 2', '2015-01-29 10:18:23', 0),
(6, 'null', '127.0.0.1', 'network 2 Denied Access by admin', '2015-01-29 10:18:45', 0),
(7, 'null', '127.0.0.1', 'New User Registered with Oginni', '2015-01-29 10:22:12', 0),
(8, 'null', '127.0.0.1', 'oginni Test for network availability', '2015-01-29 10:23:05', 0),
(9, 'null', '127.0.0.1', 'Admin login', '2015-01-29 10:24:00', 0),
(10, 'null', '127.0.0.1', 'Oginni Granted Access by admin', '2015-01-29 10:24:27', 0),
(11, 'null', '127.0.0.1', 'Oginni Deniel Access by admin', '2015-01-29 10:24:41', 0),
(12, 'null', '127.0.0.1', 'Oginni Granted Access by admin', '2015-01-29 10:24:47', 0),
(13, 'null', '127.0.0.1', 'oginni connect to network 1', '2015-01-29 10:26:13', 0),
(14, 'null', '127.0.0.1', 'oginni Test for network availability', '2015-01-29 10:26:43', 0),
(15, 'null', '127.0.0.1', 'Admin login', '2015-01-29 10:33:08', 0);

-- --------------------------------------------------------

--
-- Table structure for table `network`
--

CREATE TABLE IF NOT EXISTS `network` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `owner` varchar(100) NOT NULL,
  `sys_id` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `limit` int(2) NOT NULL,
  `password` varchar(100) NOT NULL,
  `status` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `network`
--

INSERT INTO `network` (`id`, `owner`, `sys_id`, `name`, `limit`, `password`, `status`) VALUES
(1, 'network', '12345678', 'network 1', 2, 'mypass', 0),
(2, 'network', '123455', 'network 2', 20, 'pass', 1);

-- --------------------------------------------------------

--
-- Table structure for table `server_ip`
--

CREATE TABLE IF NOT EXISTS `server_ip` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sysid` varchar(100) NOT NULL,
  `ip` varchar(20) NOT NULL,
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `server_ip`
--

INSERT INTO `server_ip` (`id`, `sysid`, `ip`, `status`) VALUES
(1, '', '127.0.0.1', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
