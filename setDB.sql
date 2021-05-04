DROP DATABASE IF EXISTS `game-generator`;
CREATE DATABASE  IF NOT EXISTS `game`;
USE `game`;

--
--
DROP TABLE IF EXISTS `tournoi`;

CREATE TABLE `tournoi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `pouls` int(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `team`;

CREATE TABLE `team` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `poul` int(11) NOT NULL,
  `tournoi` int(11) NOT NULL,
  PRIMARY KEY (`id`),
    FOREIGN KEY (`tournoi`) 
  REFERENCES `tournoi` (`id`) 
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `game`;


CREATE TABLE `game` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
	`hometeam` int(11) NOT NULL,
  `awayteam` int(11) NOT NULL,
  `schedule` varchar(45) DEFAULT NULL,
  `score` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
    FOREIGN KEY (`hometeam`)   REFERENCES  `team`(`id`),
  FOREIGN KEY (`awayteam`)   REFERENCES  `team`(`id`) 


) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;



