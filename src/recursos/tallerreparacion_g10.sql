-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2022 a las 01:29:06
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
  `clienteDni` int(11) DEFAULT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `bicicleta`
--

INSERT INTO `bicicleta` (`serie`, `marca`, `tipo`, `color`, `clienteDni`, `estado`) VALUES
(1234, 'Aurorita', 'Aurora', 'Fucsia', 20111111, 1),
(2345, 'Andes', 'Media Carrera', 'azul', 20111111, 1),
(3456, 'Venzo', 'Venzo', 'Violeta', 26666444, 1),
(4567, 'SP', 'paseo', 'rosa', 22555555, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `domicilio` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombre`, `domicilio`, `telefono`, `estado`) VALUES
(20111111, 'Pepe Gauna', 'Modulo 3 mz 45 casa 7', 266326678, 0),
(22555555, 'Pato Barcos', 'licitacion 1 mz 26 casa 2', 266582222, 1),
(26666444, 'Mauro Castro', 'Modulo 8 mz 3 casa 14', 266453333, 1),
(50123321, 'Lupe', 'Mod 8 - Mz 5- casa 2', 266558877, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `itemrep`
--

CREATE TABLE `itemrep` (
  `reparacionId` int(11) DEFAULT NULL,
  `repuestoSerie` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `costo` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `itemrep`
--

INSERT INTO `itemrep` (`reparacionId`, `repuestoSerie`, `cantidad`, `costo`) VALUES
(4, 4321, 1, 2500),
(5, 6543, 1, 2200),
(2, 4321, 1, 2500),
(2, 5432, 1, 1500),
(6, 6543, 1, 2200);

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

--
-- Volcado de datos para la tabla `reparacion`
--

INSERT INTO `reparacion` (`id`, `servicioCodigo`, `clienteDni`, `bicicletaSerie`, `fecha_entrada`, `costoTotal`, `estado`) VALUES
(1, 1, 20111111, 1234, '2022-05-14', 1000, 1),
(2, 2, 20111111, 2345, '2022-11-24', 9430, 1),
(3, 1, 20111111, 1234, '2022-05-14', 1000, 1),
(4, 1, 26666444, 3456, '2022-11-15', 3220, 0),
(5, 2, 50123321, 1234, '2022-12-01', 4830, 2),
(6, 3, 26666444, 4567, '2022-12-01', 3910, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuesto`
--

CREATE TABLE `repuesto` (
  `serie` int(11) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `repuesto`
--

INSERT INTO `repuesto` (`serie`, `descripcion`, `costo`, `estado`) VALUES
(4321, 'Cadena', 2500, 1),
(5432, 'Aceite', 1500, 1),
(6543, 'Pintura', 2200, 1),
(7654, 'Cubierta', 4500, 0),
(8765, 'Camara', 1500, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codigo` int(11) NOT NULL,
  `descripcion` varchar(50) DEFAULT NULL,
  `costo` float DEFAULT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`codigo`, `descripcion`, `costo`, `estado`) VALUES
(1, 'Cambio Camara', 300, 1),
(2, 'Esmaltado Cuadro', 2000, 1),
(3, 'Cambio Cadena', 1200, 1),
(4, 'Reemplazo Cubierta', 300, 1),
(5, 'Engrase', 200, 1),
(6, 'Emparchar', 100, 1),
(7, 'Inflado', 100, 1),
(8, 'PinturA', 5800, 0),
(9, 'Cromado', 5800, 1),
(10, 'Pintura', 5800, 0),
(11, 'Enderez Cuadro', 3000, 0);

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
-- Indices de la tabla `itemrep`
--
ALTER TABLE `itemrep`
  ADD UNIQUE KEY `reparacionId_2` (`reparacionId`,`repuestoSerie`);

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
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reparacion`
--
ALTER TABLE `reparacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bicicleta`
--
ALTER TABLE `bicicleta`
  ADD CONSTRAINT `bicicleta_ibfk_1` FOREIGN KEY (`clienteDni`) REFERENCES `cliente` (`dni`);

--
-- Filtros para la tabla `itemrep`
--
ALTER TABLE `itemrep`
  ADD CONSTRAINT `itemrep_ibfk_2` FOREIGN KEY (`repuestoSerie`) REFERENCES `repuesto` (`serie`),
  ADD CONSTRAINT `itemrep_ibfk_3` FOREIGN KEY (`reparacionId`) REFERENCES `reparacion` (`id`);

--
-- Filtros para la tabla `reparacion`
--
ALTER TABLE `reparacion`
  ADD CONSTRAINT `reparacion_ibfk_1` FOREIGN KEY (`bicicletaSerie`) REFERENCES `bicicleta` (`serie`),
  ADD CONSTRAINT `reparacion_ibfk_2` FOREIGN KEY (`servicioCodigo`) REFERENCES `servicio` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
