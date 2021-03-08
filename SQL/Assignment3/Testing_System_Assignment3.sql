-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
	
    CREATE VIEW DS_Sale AS  
	SELECT *
	FROM `account` 
	WHERE department_id = ( SELECT department_id
						FROM   department 
						WHERE  department_name = 'sale'); 

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
-- B1: Thống kê mỗi account vào bn group 
	USE testing_system;
	SELECT      account_id 	,COUNT(account_id) AS SOLUONG
    FROM   		group_account 
    GROUP BY	account_id;
-- B2: Lấy max
	CREATE VIEW AccountThamGiaGroupNhieuNhat AS
	SELECT      account_id,COUNT(account_id) AS SOLUONG
    FROM   		`account`   
    GROUP BY	account_id
    HAVING     SOLUONG 		= (SELECT MAX(SL)
								FROM  	(SELECT	COUNT(GA.account_id) AS SL
										 FROM	 `account`     A
										LEFT JOIN  group_account GA ON A.account_id = GA.account_id
                                        GROUP BY	GA.account_id) AS MAXSL
							  ); 

 
	   WITH AccountThamGiaGroupNhieuNhat AS (
											SELECT      account_id 	,COUNT(account_id) AS SOLUONG
											FROM   		group_account 
											GROUP BY	account_id  )
	  SELECT * FROM AccountThamGiaGroupNhieuNhat;
     
     SELECT MAX(SOLUONG)
      FROM  AccountThamGiaGroupNhieuNhat;
      
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ
-- được coi là quá dài) và xóa nó 
      
	 
      
											
	   
   

	
								
                                
                                
    
    
    
    