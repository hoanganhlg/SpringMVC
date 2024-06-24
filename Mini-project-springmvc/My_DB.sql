-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema miniproject
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema miniproject
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `miniproject` DEFAULT CHARACTER SET utf8mb3 ;
USE `miniproject` ;

-- -----------------------------------------------------
-- Table `miniproject`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miniproject`.`account` (
  `accountID` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `createBy` VARCHAR(45) NULL DEFAULT NULL,
  `updateBy` VARCHAR(45) NULL DEFAULT NULL,
  `createAt` DATETIME NULL DEFAULT NULL,
  `updateAt` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`accountID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `miniproject`.`project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miniproject`.`project` (
  `projectID` INT NOT NULL AUTO_INCREMENT,
  `projectName` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`projectID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `miniproject`.`team`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miniproject`.`team` (
  `teamID` INT NOT NULL AUTO_INCREMENT,
  `teamName` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`teamID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `miniproject`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `miniproject`.`employee` (
  `empID` INT NOT NULL,
  `empName` VARCHAR(255) NULL DEFAULT NULL,
  `empGender` TINYINT NULL DEFAULT NULL,
  `empBirthday` DATE NULL DEFAULT NULL,
  `empPhone` VARCHAR(45) NULL DEFAULT NULL,
  `empEmail` VARCHAR(255) NULL DEFAULT NULL,
  `empAddress` VARCHAR(45) NULL DEFAULT NULL,
  `empStartDate` DATE NULL DEFAULT NULL,
  `empStatus` TINYINT NULL DEFAULT NULL,
  `createBy` VARCHAR(45) NULL DEFAULT NULL,
  `updateBy` VARCHAR(45) NULL DEFAULT NULL,
  `createAt` DATETIME NULL DEFAULT NULL,
  `updateAt` DATETIME NULL DEFAULT NULL,
  `teamID` INT NOT NULL,
  `projectID` INT NOT NULL,
  `isLeader` TINYINT NOT NULL,
  PRIMARY KEY (`empID`, `teamID`, `projectID`),
  INDEX `fk_employee_team1_idx` (`teamID` ASC) VISIBLE,
  INDEX `fk_employee_project1_idx` (`projectID` ASC) VISIBLE,
  CONSTRAINT `fk_employee_project1`
    FOREIGN KEY (`projectID`)
    REFERENCES `miniproject`.`project` (`projectID`),
  CONSTRAINT `fk_employee_team1`
    FOREIGN KEY (`teamID`)
    REFERENCES `miniproject`.`team` (`teamID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
