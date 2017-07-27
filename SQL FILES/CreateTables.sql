DROP TABLE IF EXISTS car;

CREATE TABLE car(

	VIN VARCHAR (17) NOT NULL,
	MAKE VARCHAR (25),
	MODEL VARCHAR (25),
	YEAR VARCHAR (4),
	COLOR VARCHAR (35),
	PRICE FLOAT (20),
	WEIGHT VARCHAR (10),
	DRIVETRAIN VARCHAR (15),
	BODYSTYLE VARCHAR (15),
	MILEAGE VARCHAR (10),
	FUELTYPE VARCHAR (10),
   
   PRIMARY KEY (VIN)
);

DROP TABLE IF EXISTS engine;

CREATE TABLE engine(

	VIN VARCHAR (17) NOT NULL,
	DISPLACEMENT VARCHAR (5),
	NUMOFCYLINDERS VARCHAR (10),
	MODEL VARCHAR (20),
	HORSEPOWER VARCHAR (5),
	TORQUE VARCHAR (5),
   
   PRIMARY KEY(VIN)
);

DROP TABLE IF EXISTS transmission;

CREATE TABLE transmission(

	VIN VARCHAR (17) NOT NULL,
    	TYPE VARCHAR (10),
    	MODEL VARCHAR (15),
    	NUMOFGEARS VARCHAR(4),
    
    PRIMARY KEY (VIN)
);
