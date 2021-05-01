-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Address` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `street` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `state_abbreviation` CHAR(2) NULL,
  `zip_code` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`climate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`climate` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`lighting`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`lighting` (
  `id` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`water`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`water` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `watercol` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Subscription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Subscription` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `flowering` TINYINT(1) NULL,
  `climate_id` INT NOT NULL,
  `lighting_id` INT NOT NULL,
  `water_id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `Address_id` INT NOT NULL,
  `Subscription_id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Plant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Plant` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `flowering` TINYINT(1) NULL,
  `name` VARCHAR(45) NULL,
  `water_id` INT NOT NULL,
  `lighting_id` INT NOT NULL,
  `climate_id` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Subscription_has_Plant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Subscription_has_Plant` (
  `Subscription_id` INT NOT NULL,
  `Plant_id` INT NOT NULL,
  PRIMARY KEY (`Subscription_id`, `Plant_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Shipment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Shipment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `number_plants` INT NULL,
  `Subscription_id` INT NOT NULL,
  `shipment_date` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Shipment_has_Plant`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Shipment_has_Plant` (
  `Shipment_id` INT NOT NULL,
  `Plant_id` INT NOT NULL,
  PRIMARY KEY (`Shipment_id`, `Plant_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `mydb`.`Address`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`Address` (`id`, `street`, `city`, `state_abbreviation`, `zip_code`) VALUES (1, '1234 Street', 'Denver', 'CO', '80203');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`climate`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`climate` (`id`) VALUES (1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`lighting`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`lighting` (`id`) VALUES (1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`water`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`water` (`id`, `watercol`) VALUES (1, 'Heavy');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`Subscription`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`Subscription` (`id`, `name`, `flowering`, `climate_id`, `lighting_id`, `water_id`) VALUES (1, 'cactus', true, 1, 1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`User`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`User` (`id`, `username`, `password`, `first_name`, `last_name`, `email`, `Address_id`, `Subscription_id`) VALUES (1, 'DrFuzz', 'fuzzy', 'Pierce', 'Steward', 'drfuzz@gmail.com', 1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`Plant`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`Plant` (`id`, `flowering`, `name`, `water_id`, `lighting_id`, `climate_id`) VALUES (1, true, 'cactus', 1, 1, 1);

COMMIT;
