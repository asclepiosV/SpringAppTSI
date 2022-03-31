CREATE TABLE `Boat` (
                           `id` int(11) NOT NULL,
                           `year` int(4) NOT NULL,
                           `name` varchar(20) NOT NULL,
                           `price` double NOT NULL,
                           PRIMARY KEY (`id`)
);

INSERT INTO Boat(id, year, name, price) values (1, 2011, "Dolce Vita", 1200000.00);
INSERT INTO Boat(id, year, name, price) values (2, 2003, "Sting", 200000.00);
INSERT INTO Boat(id, year, name, price) values (3, 2001, "Fury", 2400000.00);
INSERT INTO Boat(id, year, name, price) values (4, 2020, "Highlander", 7200000.00);
