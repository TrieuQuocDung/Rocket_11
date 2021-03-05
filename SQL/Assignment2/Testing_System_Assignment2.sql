-- Question 1:lấy ra tất cả các phòng ban

USE testing_system;
SELECT department_name FROM department;


-- Question 2: lấy ra id của phòng ban có tên là "Sale"

USE testing_system;
SELECT * 
FROM department WHERE department_name ='sale';

-- Question 3: lấy ra thông tin account có full name dài nhất

-- B1: Thống kê tên dài nhất
	 USE testing_system;
	SELECT fullname, (CHAR_LENGTH(fullname)) AS SoLuong
    FROM `account`;
-- B2 : Lấy Max
    SELECT fullname , MAX(CHAR_LENGTH(fullname)) AS SoLuong
    FROM `account`;
-- B3: In ra
	SELECT *,(CHAR_LENGTH(fullname)) AS SoLuong
    FROM `account` 
    WHERE CHAR_LENGTH(fullname) = (SELECT MAX(CHAR_LENGTH(fullname))
									FROM `account`);
-- Question 4: Lấy ra tên group đã tham gia trước ngày 20/12/2019
	SELECT *
    FROM `group`
	WHERE create_date < '2021-02-14';

-- Question 5: Lấy ra ID của question có >= 4 câu trả lời
	
    SELECT question_id, COUNT(answer_id) AS DapAn
    FROM answer 
    GROUP BY question_id
    HAVING DapAn >= 4;

-- Question 6: Lấy ra 2 group được tạo gần đây nhất
	
    SELECT * 
    FROM `group`
    ORDER BY create_date ASC
    LIMIT 2;

-- Question 8: Xóa tất cả các exam được tạo trước ngày 03/05/2021
	
    DELETE 
    FROM exam_question 
    WHERE exam_id IN (SELECT exam_id 
					  FROM exam
					  WHERE create_date < '2020-05-03');
	DELETE 
    FROM exam
    WHERE create_date < '2020-05-03';

-- Question 9: Update thông tin của account có id = 7 thành tên "Nguyễn Bá Lộc" và
 -- email thành loc.nguyenba@vti.com.vn
	
    UPDATE `account`
    SET fullname = 'Nguyễn Bá Lộc',
		email    = 'loc.nguyenba@vti.com.vn'
	WHERE account_id = 7;

-- Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
	
    SELECT *
    FROM `account` A
    JOIN department B ON A.department_id = B.department_id;

-- Question 11: Viết lệnh để lấy ra tất cả các developer 
	
    SELECT *
    FROM `account` C
    JOIN position D ON C.position_id = D.position_id
    WHERE position_name = 'Dev';
    
-- Question 12: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên

	SELECT * , COUNT(account_id) AS NhanVien
    FROM `account` 
    GROUP BY department_id
    HAVING NhanVien > 3;

-- Question 13: Viết lệnh để lấy ra ds câu hỏi được sử dụng trong đề thi nhiều nhat
 
	SELECT *, COUNT(Q.content) AS SoLuong
    FROM question Q
    JOIN exam_question EQ ON Q.question_id = EQ.question_id
    GROUP BY Q.content
    HAVING SoLuong = (SELECT MAX(SoCauHoi)
					 FROM
							(SELECT 		COUNT(Q.question_id) AS SoCauHoi
							FROM			exam_question EQ 
							JOIN 		question Q ON EQ.question_id = Q.question_id
							GROUP BY		Q.question_id) AS MaxContent);
-- Question 14: Thông kê mỗi category Question được sd trong bao nhiêu Question
    
    USE  		testing_system;
    SELECT		*, COUNT(CQ.category_id) AS SoLuong
	FROM		category_question CQ 
	LEFT JOIN 	question Q ON CQ.category_id = Q.category_id
	GROUP BY	CQ.category_id
	ORDER BY	CQ.category_id ASC;

-- Question 15: Lấy ra Question có nhiều câu trả lời nhất
-- B1: thông kế số câu hỏi 
    USE  		testing_system;
    SELECT		*, COUNT(A.question_id) AS SoLuong
    FROM 		question Q
    JOIN		answer   A ON Q.question_id = A.question_id
    GROUP BY	A.question_id;
-- B2 : thống kê số câu hỏi có ít nhất 1 câu trả lời Right Join
	SELECT 		* , COUNT(A.question_id) AS SoLuong
    FROM 		answer A 
    RIGHT JOIN	question Q ON A.question_id = Q.question_id
    GROUP BY 	A.question_id;
-- B3: Lấy MAX và in ra
	USE  		testing_system;
	SELECT 		Q.question_id, Q.content , COUNT(A.question_id)	AS SoLuong
    FROM 		question Q
    JOIN		answer   A  ON Q.question_id = A.question_id
    GROUP BY  	A.question_id
    HAVING      SoLuong = (SELECT  MAX(SOLUONG)
						   FROM		(SELECT	COUNT(A.question_id)  AS SOLUONG
											FROM 		answer A 
											RIGHT JOIN	question Q ON A.question_id = Q.question_id
											GROUP BY 	A.question_id) AS MAXSOLUONG);
    
-- Question 16: Tìm chức vụ có ít người nhất   
-- B1: thông kế số lượng phòng ban 
    SELECT 		position_name, COUNT(A.position_id) AS SoLuong
    FROM 		position P
	JOIN		`account` A ON	P.position_id = A.position_id
    GROUP BY	A.position_id;
-- B2 : thống kê số phòng ban có ít nhất 1 account LEFT JOIN
	SELECT 		position_name , COUNT(A.position_id) AS SoLuong
    FROM 		`account` A 
	LEFT JOIN	position  P ON	A.position_id = P.position_id
    GROUP BY	A.position_id;
-- B3 : Lấy MIN và in ra 
	SELECT 		position_name, COUNT(A.position_id) AS SoLuong
    FROM 		position P
	JOIN		`account` A ON	P.position_id = A.position_id
    GROUP BY	A.position_id
    HAVING 		SoLuong   = ( SELECT MIN(SOLUONG)
							  FROM     (SELECT  	COUNT(A.position_id) AS SOLUONG
										FROM 		`account` A 
                                        LEFT JOIN	position  P ON A.position_id = P.position_id
                                        GROUP BY	A.position_id) AS MINSOLUONG);
   
-- Question 17: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
	
    
   

  	

     
	
	



	

	
     

     
						
	

	
    
	