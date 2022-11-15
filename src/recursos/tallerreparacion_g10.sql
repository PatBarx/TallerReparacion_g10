-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-11-2022 a las 21:36:26
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tallerreparacion_g10`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bicicleta`
--

CREATE TABLE `bicicleta` (
  `serie` int(11) NOT NULL,
  `marca` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `clienteDni` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `item_reparacion`
--

CREATE TABLE `item_reparacion` (
  `reparacionId` int(11) DEFAULT NULL,
  `repuestoSerie` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `costo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reparacion`
--

CREATE TABLE `reparacion` (
  `id` int(11) NOT NULL,
  `servicioCodigo` int(11) DEFAULT NULL,
  `clienteDni` int(11) DEFAULT NULL,
  `bicicletaSerie` int(11) DEFAULT NULL,
  `fecha_entrada` date DEFAULT NULL,
  `costoTotal` float DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

CREATE TABLE `repuesto` (
  `serie` int(11) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `costo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `costo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD PRIMARY KEY (`serie`),
  ADD KEY `clienteDni` (`clienteDni`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `item_reparacion`
--
ALTER TABLE `item_reparacion`
  ADD UNIQUE KEY `reparacionId_2` (`reparacionId`,`repuestoSerie`),
  ADD KEY `reparacionId` (`reparacionId`),
  ADD KEY `repuestoSerie` (`repuestoSerie`);

--
-- Indices de la tabla `reparacion`
--
ALTER TABLE `reparacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `servicioCodigo` (`servicioCodigo`),
  ADD KEY `clienteDni` (`clienteDni`),
  ADD KEY `bicicletaSerie` (`bicicletaSerie`);

--
-- Indices de la tabla `repuesto`
--
ALTER TABLE `repuesto`
  ADD PRIMARY KEY (`serie`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`codigo`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD CONSTRAINT `bicicleta_ibfk_1` FOREIGN KEY (`clienteDni`) REFERENCES `cliente` (`dni`);

--
-- Filtros para la tabla `item_reparacion`
--
ALTER TABLE `item_reparacion`
  ADD CONSTRAINT `item_reparacion_ibfk_1` FOREIGN KEY (`reparacionId`) REFERENCES `reparacion` (`id`),
  ADD CONSTRAINT `item_reparacion_ibfk_2` FOREIGN KEY (`repuestoSerie`) REFERENCES `repuesto` (`serie`);

--
-- Filtros para la tabla `reparacion`
--
ALTER TABLE `reparacion`
  ADD CONSTRAINT `reparacion_ibfk_1` FOREIGN KEY (`bicicletaSerie`) REFERENCES `bicicleta` (`serie`),
  ADD CONSTRAINT `reparacion_ibfk_2` FOREIGN KEY (`servicioCodigo`) REFERENCES `servicios` (`codigo`),
  ADD CONSTRAINT `reparacion_ibfk_3` FOREIGN KEY (`clienteDni`) REFERENCES `cliente` (`dni`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
