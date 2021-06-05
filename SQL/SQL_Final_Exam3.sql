DROP DATABASE IF EXISTS ThuaTap;
CREATE DATABASE IF NOT EXISTS ThuaTap;
USE ThuaTap;
-- create table 1: country
DROP TABLE IF EXISTS country;
CREATE TABLE  country
(
      country_id    	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
	  country_name      VARCHAR(50) NOT NULL
);
-- create table 2: Location
DROP TABLE IF EXISTS Location;
CREATE TABLE  Location
(
			location_id 	 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            street_address		VARCHAR(100) NOT NULL,
            postal_code			VARCHAR(10) NOT NULL,
            country_id    		TINYINT UNSIGNED NOT NULL,
            FOREIGN KEY(country_id) REFERENCES country (country_id)
);
-- create table 3: Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
			employee_id 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
			fullname			VARCHAR(50) NOT NULL,	
			email				VARCHAR(100)NOT NULL UNIQUE KEY,
			location_id 	 	TINYINT UNSIGNED NOT NULL,
			FOREIGN KEY(location_id)   REFERENCES Location (location_id) 
);

-- Chèn DATA bảng 1: country 

INSERT INTO country	(country_name)	 
VALUES 				('Viet Nam'	),
					('Franch'	),
                    ('Campuchia');
              
-- Chèn Data bảng 2: location

INSERT INTO location (street_address	, postal_code	, country_id) 
VALUES 				( '18 Lac Trung'	,	'VN003'		,		1	),
					('	99 Pari	'		,	'FC001'		,		2	),
                    ('90 Phnôm Pênh'	,	'CP001'		,		3	),
                    ('1002 Láng'		,	'VN005'		,		1	);

-- Chèn Data bảng 3: Employee

INSERT INTO Employee (   fullname		, 		email				, location_id) 
VALUES 				( 	'Ngoc Ngan'		,	'nn03@gmail.com'		,		1	),
					('	Back School	'	,	'backscholl@gmail.com'	,		2	),
                    ('	Elsa David'		,	'elsadavid@gmail.com'	,		3	),
                    ('	Singed Obama'	,	'Obama@gmail.com'		,		4	);
                    
    
    
		

	
    
	

	
                    
				
                
