-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema rzk
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema rzk
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rzk` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `rzk` ;

-- -----------------------------------------------------
-- Table `rzk`.`film`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rzk`.`film` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ime` VARCHAR(100) NULL DEFAULT NULL,
  `zanr` VARCHAR(100) NULL DEFAULT NULL,
  `reziser` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rzk`.`sala`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rzk`.`sala` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ime` VARCHAR(45) NULL DEFAULT NULL,
  `fotelja` INT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rzk`.`prikaz`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rzk`.`prikaz` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `vreme` DATE NOT NULL,
  `film_id` INT NOT NULL,
  `sala_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_prikaz_film1_idx` (`film_id` ASC) VISIBLE,
  INDEX `fk_prikaz_sala1_idx` (`sala_id` ASC) VISIBLE,
  CONSTRAINT `fk_prikaz_film1`
    FOREIGN KEY (`film_id`)
    REFERENCES `rzk`.`film` (`id`),
  CONSTRAINT `fk_prikaz_sala1`
    FOREIGN KEY (`sala_id`)
    REFERENCES `rzk`.`sala` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rzk`.`korisnik`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rzk`.`korisnik` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ime` VARCHAR(100) NULL DEFAULT NULL,
  `korIme` VARCHAR(100) NULL DEFAULT NULL,
  `sifra` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `rzk`.`karta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rzk`.`karta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `broj` INT NOT NULL,
  `prikaz_id` INT NOT NULL,
  `korisnik_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_karta_prikaz1_idx` (`prikaz_id` ASC) VISIBLE,
  INDEX `fk_karta_korisnik1_idx` (`korisnik_id` ASC) VISIBLE,
  CONSTRAINT `fk_karta_prikaz1`
    FOREIGN KEY (`prikaz_id`)
    REFERENCES `rzk`.`prikaz` (`id`),
  CONSTRAINT `fk_karta_korisnik1`
    FOREIGN KEY (`korisnik_id`)
    REFERENCES `rzk`.`korisnik` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO `rzk`.`film` (`ime`, `zanr`, `reziser`) VALUES 
("Nedelja", "Drama", "NemanjaCeranic"),
("Toma", "Drama","DraganBjelogrlic"),
("Superbad", "Komedija", "GregMatol")
;

INSERT INTO `rzk`.`korisnik` (`ime`, `korIme`, `sifra`) VALUES
("Predrag Nikolic", "PN", "pedja"),
("Nenad Nikolic", "NN", "nesa")
;

INSERT INTO `rzk`.`sala` (`ime`, `fotelja`) VALUES
("Sala 1", 20),
("Sala 2", 25),
("Sala 3", 40);

INSERT INTO `rzk`.`prikaz` (`vreme`, `film_id`, `sala_id`) VALUES
('2024-01-21', 1, 1),
('2024-01-22', 1, 2),
('2024-01-23', 1, 3),
('2024-01-24', 2, 1),
('2024-01-25', 2, 2),
('2024-01-26', 2, 3),
('2024-01-27', 3, 1),
('2024-01-28', 3, 2),
('2024-01-29', 3, 3)
;

select * from Prikaz;