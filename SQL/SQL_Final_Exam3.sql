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
			location_id 	 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ON,
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

INSERT INTO Employee (fullname			, 		email				, location_id) 
VALUES 				( 	'Ngoc Ngan'		,	'nn03@gmail.com'		,		1	),
					('	Back School	'	,	'backscholl@gmail.com'	,		2	),
                    ('	Elsa David'		,	'elsadavid@gmail.com'	,		3	),
                    ('	Singed Obama'	,	'Obama@gmail.com'		,		4	);
                    
-- --------------------------------------------Questions--------------------------
-- 2:a) Lấy tất cả các nhân viên thuộc Việt nam
	
	SELECT 	e.fullname
    FROM	Employee e
    JOIN 	Location L ON e.location_id = L.location_id
    JOIN	country	c  ON L.country_id	= c.country_id
    WHERE	country_name = 'Viet Nam';
    
-- 2:b) Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
	
	SELECT 	c.country_name
    FROM	country c
    JOIN 	Location L ON c.country_id = L.country_id
    JOIN	Employee e ON L.location_id	= e.location_id
    WHERE	e.email = 'nn03@gmail.com';
    
-- 2:c) Thống kê mỗi country, mỗi location có bao nhiêu employee đang
-- làm việc.
	SELECT		c.country_name, l.street_address, 
				COUNT(e.employee_id) AS Count_employee_online
    FROM		Employee e
	JOIN 		Location l ON e.location_id = l.location_id
    JOIN		country  c ON l.country_id	= c.country_id
	GROUP BY	e.employee_id
	ORDER BY	e.employee_id ASC;
    
-- 3 Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa
-- 10 employee

INSERT INTO Employee (   fullname		, 		email					, location_id	) 
VALUES 				('Ashton Boase'		, 'aboase0@elpais.com'			,		1	 	),
					('Bealle Hannaby'	, 'bhannaby1@mediafire.com'		,		1	 	),
					('Natalya Lowdham'	, 'nlowdham2@howstuffworks.com'	,		1	 	);
					
    
    DROP TRIGGER IF EXISTS Trigger_Max_Employee_in_country;
    DELIMITER $$
    CREATE TRIGGER Trigger_Max_Employee_in_country
    BEFORE INSERT ON Employee
	FOR EACH ROW
		BEGIN
			IF
				(SELECT 	 	c.country_name,COUNT(e.employee_id) 
				FROM 		country c
				JOIN 		Location l ON c.country_id = l.country_id
				JOIN		Employee e ON l.location_id	= e.location_id
                GROUP BY 	e.employee_id
				HAVING		COUNT(e.employee_id) > 3 ) THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT ='insert up to 3 employees';
			END IF;
        END$$
    DELIMITER ;
    
    -- 4 Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở
	-- location đó sẽ có location_id = null
    

    
		

	
    
	

	
                    
				
                
