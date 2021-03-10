-- ------------------SQL Assignment4-----------------------------------

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các 
 -- account thuộc phòng ban đó
    DROP PROCEDURE IF EXISTS getDepartmentbyAccount;
    DELIMITER $$ 
    CREATE PROCEDURE getDepartmentbyAccount (IN search VARCHAR(30))
		BEGIN			
			SELECT  *
            FROM	testing_system. department 	D
            JOIN	testing_system.`account` A	ON D.department_id = A.department_id
            WHERE	D.department_name LIKE CONCAT('%',search,'%');
        END$$
	DELIMITER ;
    
    CALL getDepartmentbyAccount('Marketing');
    
-- Question 2: Tạo store để in ra số lượng account trong mỗi group
	DROP PROCEDURE IF EXISTS account_of_group;
	DELIMITER $$
    CREATE PROCEDURE account_of_group (IN in_group_id TINYINT)
    BEGIN	
		SELECT 		GA.group_id ,COUNT(GA.account_id)
        FROM  		testing_system.group_account GA
        WHERE 		group_id = in_group_id
        GROUP BY	GA.group_id;
    END$$
    DELIMITER ;
    CALL account_of_group(6);

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo 
 -- trong tháng hiện tại
 
	DROP PROCEDURE IF EXISTS countTypeQuestionOfMonth;
	DELIMITER $$
	CREATE PROCEDURE countTypeQuestionOfMonth()
	BEGIN
	
		SELECT		COUNT(type_id)
		FROM		question
		WHERE		MONTH(create_date) = Month(NOW());
		
	END$$
	DELIMITER ;
	
	call testing_system.countTypeQuestionOfMonth();
	
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
	
    USE 		testing_system;
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
    
    
    
    
    
-- Viet 1 store , nhap vao id phong ban va tra ra ten phong ban do 

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
	
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question

	USE 		testing_system;
	SELECT 		TQ.type_name
	FROM 		question Q
	JOIN		type_question TQ ON Q.type_id = TQ.type_id
	WHERE 		Q.type_id = @v_out_type_id;
          
    
-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên 
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa 
-- chuỗi của người dùng nhập vào 

    
   
    
    

	
 
  
    
	
	