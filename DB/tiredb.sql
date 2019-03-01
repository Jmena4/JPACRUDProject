-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema tiredb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `tiredb` ;

-- -----------------------------------------------------
-- Schema tiredb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tiredb` DEFAULT CHARACTER SET utf8 ;
USE `tiredb` ;

-- -----------------------------------------------------
-- Table `tire`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tire` ;

CREATE TABLE IF NOT EXISTS `tire` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(150) NOT NULL,
  `manufactured_date` DATE NOT NULL,
  `size` DOUBLE UNSIGNED NULL DEFAULT NULL,
  `purchase_price` DECIMAL(11,2) NULL DEFAULT NULL,
  `product_description` TEXT NULL DEFAULT NULL,
  `origin_country_code` VARCHAR(2) NULL DEFAULT NULL,
  `image_url` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE = '';
DROP USER IF EXISTS tireuser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'tireuser'@'localhost' IDENTIFIED BY 'tireuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'tireuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `tire`
-- -----------------------------------------------------
START TRANSACTION;
USE `tiredb`;
INSERT INTO `tire` (`id`, `name`, `manufactured_date`, `size`, `purchase_price`, `product_description`, `origin_country_code`, `image_url`) VALUES (1, 'Sonata', '2012-02-02', 22.5, 173.00, 'A better choice', 'CN', NULL);
INSERT INTO `tire` (`id`, `name`, `manufactured_date`, `size`, `purchase_price`, `product_description`, `origin_country_code`, `image_url`) VALUES (2, 'Sonomo', '2009-12-10', 22.5, 150.00, 'A not so better choice', 'US', NULL);
INSERT INTO `tire` (`id`, `name`, `manufactured_date`, `size`, `purchase_price`, `product_description`, `origin_country_code`, `image_url`) VALUES (3, 'Bridestone', '2009-12-10', 17, 225.00, 'A not so better choice', 'US', NULL);

COMMIT;
