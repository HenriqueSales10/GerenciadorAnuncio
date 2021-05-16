-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bdanuncios
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdanuncios
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdanuncios` DEFAULT CHARACTER SET latin1 ;
USE `bdanuncios` ;

-- -----------------------------------------------------
-- Table `bdanuncios`.`anuncios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdanuncios`.`anuncios` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cliente` VARCHAR(45) NOT NULL,
  `data_inicio` DATE NOT NULL,
  `data_fim` DATE NOT NULL,
  `investimento_dia` DECIMAL(10,2) NOT NULL,
  `total_investido` DECIMAL(10,2) NULL DEFAULT NULL,
  `maxVisu` DOUBLE NULL DEFAULT NULL,
  `maxCliques` DOUBLE NULL DEFAULT NULL,
  `maxComp` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = MyISAM
AUTO_INCREMENT = 32
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
