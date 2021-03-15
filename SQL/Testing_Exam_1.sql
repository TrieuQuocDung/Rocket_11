DROP DATABASE IF EXISTS RDBMS;
CREATE DATABASE IF NOT EXISTS RDBMS;
USE RDBMS;
-- create table 1: customer
CREATE TABLE  customer
(
     customer_id    	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
       `name`      		VARCHAR(50) 	NOT NULL,
       phone			VARCHAR(20)		NOT NULL UNIQUE KEY,
       email			VARCHAR(50)	NOT NULL UNIQUE KEY,
       address			VARCHAR(100)	NOT NULL,
       note				VARCHAR(50)	NOT NULL
);
-- create table 2: car
CREATE TABLE  car
(
			car_id 	 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            maker		ENUM('HONDA','TOYOTA','NISSAN') NOT NULL,
            model		VARCHAR(50) NOT NULL,
            `year`		SMALLINT NOT NULL,
            color		VARCHAR(50) NOT NULL,
            note		VARCHAR(50)	NOT NULL
);
-- create table 3: car_order
DROP TABLE IF EXISTS car_order;
CREATE TABLE car_order
(
			order_id 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
			customer_id       	TINYINT UNSIGNED NOT NULL,
			car_id				TINYINT UNSIGNED NOT NULL,
            amount				TINYINT UNSIGNED NOT NULL DEFAULT '1',
			sale_price 			DOUBLE NOT NULL,
			order_date  		DATETIME NOT NULL,
			delivery_date    	DATETIME NOT NULL,
			delivery_address	VARCHAR(100) NOT NULL,
			`status`			ENUM('0','1','2') NOT NULL DEFAULT '0',
			note				VARCHAR(50)	NOT NULL,
			FOREIGN KEY(customer_id) REFERENCES customer (customer_id),
			FOREIGN KEY(car_id)   REFERENCES car (car_id)
);

-- Chèn DATA bảng 1: customer 

INSERT INTO customer(`name`				, phone			, 	email					, address				,		note				)	 
VALUES 				('Torry Arzu'		, '958-246-0474', 'tarzu0@gmail.com'		, '8 Lake View Junction',	'Khách hàng mới'		),
					('Blithe Dibley'	, '513-487-2327', 'bdibley1@gmail.com' 		,  'Victoria Terrace'	,	'Khách hàng quen'		),
					('Arabelle Entreis' , '627-453-7131', 'aentreis2@gmail.com'		,  '390 Eagan Lane'		,	'Khách hàng đặc biệt'	),
					('Florri Fransewich', '984-477-1049', 'ffransewich3@gmail.com'	, '44 Buell Drive'		,	'Khách hàng quen'		),
					('Chery Spataro'	, '772-317-7065', 'cspataro4@gmail.com'		, '85891 4th Plaza'		,	'Khách hàng mới'		);
              
                    
-- Chèn Data bảng 2: car

INSERT INTO car (maker		, model			, `year`, 	color	, 			note		) 
VALUES 			('HONDA'	, 'HR-v'		, 2003  , 	'Pink'	, 		'New car'		),
				('HONDA'	, 'Civic Sedans', 1998  , 	'Mauv'	, 		'used car'		),
				('TOYOTA'	, 'camry'		, 1998  , 	'Blue'	, 		'New car'		),
				('NISSAN'	, '370Z'		, 1998  , 	'Yellow', 		'used car'		),
				('NISSAN'	, 'maxcima'		, 2001	, 	'Aquamarine', 	'New car'		);

                
-- Chèn Data bảng 3: car_order

INSERT INTO car_order (customer_id, car_id, amount, sale_price, order_date  , delivery_date , delivery_address		, 	`status`	, 		note			)
VALUES 				 (		1	 , 	5	 ,   1 	  , '3000.19', '2019-09-22', '2019-09-28', '8 Messerschmidt Point'	,		'2'		,	'Đã hủy'			),
					 (		2	 , 	2	 ,   1 	  , '3555.06', '2019-10-02', '2019-10-12', '2 Roth Parkway'			,		'1'	    ,   'Đã xuất'			),
					 (		3	 , 	1	 ,   1    , '7773.92', '2020-05-09', '2020-05-17', '8465 Arrowood Center'	,		'1'		,	'Đã xuất'			),
					 (		4	 , 	4	 , 	 1    , '2883.77', '2021-02-03', '2021-02-07', '7 Fair Oaks Place'		,		'0'		,	'Đang vận chuyển'	),
					 (		5	 , 	3	 , 	 1    , '9883.32', '2021-03-06', '2021-03-12', '473 Cody Road'			,		'0'		,	'Đang vận chuyển'	);
                     
-- Q2: Viết lệnh lấy ra thông tin của khách hàng: tên, số lượng oto khách hàng đã 
-- mua và sắp sếp tăng dần theo số lượng oto đã mua
	USE RDBMS;
    SELECT 		C.`name`, CO.amount
    FROM		customer C
    JOIN		car_order CO ON C.customer_id = Co.customer_id
    ORDER BY	CO.amount	ASC
   ;
-- 3. Viết hàm (không có parameter) trả về tên hãng sản xuất đã bán được nhiều 
-- oto nhất trong năm nay.
	
    DROP PROCEDURE IF EXISTS MAX_car_id_of_maker;
    DELIMITER $$
    CREATE 	PROCEDURE MAX_car_id_of_maker()
      BEGIN 
		SELECT 		C.maker , COUNT(C.car_id)
		FROM  		car C
		GROUP BY	C.maker		  
		HAVING		COUNT(C.car_id) =(SELECT MAX(SL_car)
											FROM
												(SELECT 	C.maker ,COUNT(C.car_id) AS SL_car
												FROM 		car C
												LEFT JOIN	car_order OC ON C.car_id = OC.car_id
												GROUP BY	C.maker)  AS SOCAR);
	  END$$					
	DELIMITER ;
    CALL MAX_car_id_of_maker();
	
	

-- 4. Viết 1 thủ tục (không có parameter) để xóa các đơn hàng đã bị hủy của 
-- những năm trước. In ra số lượng bản ghi đã bị xóa

	DROP PROCEDURE IF EXISTS sp_DeleteCarOrder;
	DELIMITER $$
	CREATE PROCEDURE sp_DeleteCarOrder()
	BEGIN
		
			DELETE 	
			FROM 	car_order
			WHERE	`status` = '2' AND (YEAR(delivery_date) < YEAR(NOW()));
			SELECT ROW_COUNT() AS delete_record;
	END$$
	DELIMITER ;
    
    CALL sp_DeleteCarOrder();

-- 5. Viết 1 thủ tục (có CustomerID parameter) để in ra thông tin của các đơn 
-- hàng đã đặt hàng bao gồm: tên của khách hàng, mã đơn hàng, số lượng oto 
-- và tên hãng sản xuất

	DROP PROCEDURE IF EXISTS sp_infor_order;
	DELIMITER $$
    CREATE PROCEDURE sp_infor_order(IN in_customer_id TINYINT UNSIGNED)
		BEGIN
			SELECT 	C.`name`, CO.order_id , CO.amount , CA.maker
            FROM	customer C
            JOIN	car_order CO ON C.customer_id = CO.customer_id
            JOIN	car CA 		 ON CO.car_id 	  = CA.car_id
            WHERE	(`status` = '0' AND C.customer_id = in_customer_id);
      END$$
    DELIMITER ;
    
    CALL sp_infor_order('4');
    
-- 6. Viết trigger để tránh trường hợp người dụng nhập thông tin không hợp lệ 
-- vào database (DeliveryDate < OrderDate + 15)
	
    INSERT INTO car_order (customer_id, car_id, amount, sale_price, order_date  , delivery_date , delivery_address		, 	`status`	, 		note			)
    VALUES				(		5	 , 	2	 , 	 1    , '3555.06', '2021-01-12' , '2021-01-28'	, '473 Cody Road'		,		'0'		,	'Đang vận chuyển'	);
    
    DROP TRIGGER IF EXISTS Trigger_Check_delivery_date;
    DELIMITER $$
    CREATE TRIGGER Trigger_Check_delivery_date
    BEFORE INSERT ON car_order
	FOR EACH ROW
		BEGIN
			DECLARE Delivery_deadlines TINYINT;
            SELECT DATEDIFF(NEW.delivery_date, NEW.order_date)  INTO Delivery_deadlines;
            IF	Delivery_deadlines > 15	THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT ='delivery_date không hợp lệ';
			END IF;
        END$$
    DELIMITER ;

    
    
                 

