-- ++++++++++++++++++ FUNTION ++++++++++++++++++++++++

SET GLOBAL log_bin_trust_function_creators = 1;
DROP 	FUNCTION IF EXISTS FindDepartment;
DELIMITER $$
CREATE  FUNCTION FindDepartment (f_department_id TINYINT) RETURNS NVARCHAR(30)
	BEGIN
		DECLARE f_department_name NVARCHAR(30);
        SELECT	department_name INTO f_department_name
        FROM	department
        WHERE	department_id = f_department_id;
	RETURN  f_department_name;
    END$$
DELIMITER ;

SELECT FindDepartment('1');

-- +++++++++++++++++++++++ STORE PROCEDURE ++++++++++++++

	DROP PROCEDURE IF EXISTS type_id_max_question;
	DELIMITER $$
    CREATE PROCEDURE type_id_max_question (OUT out_type_id TINYINT UNSIGNED)
		BEGIN
			WITH MAX_TYPE_ID AS	
				(SELECT		COUNT(type_id) 
				 FROM 		question	
                 GROUP BY	type_id
                 ORDER BY	COUNT(type_id) 	DESC
                 LIMIT		1	)
			SELECT 		type_id INTO out_type_id
            FROM 		question
            GROUP BY	type_id
            HAVING 		COUNT(type_id) = (SELECT type_id  FROM MAX_TYPE_ID);
		END$$
    DELIMITER ;
    
    SET @v_out_type_id = 0;
    CALL type_id_max_question(@v_out_type_id);
    SELECT @v_out_type_id;
    

-- +++++++++++++++++++++ TRIGGER ++++++++++++++++++++

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