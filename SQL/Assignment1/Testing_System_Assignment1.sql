DROP DATABASE IF EXISTS testing_system;
CREATE DATABASE IF NOT EXISTS testing_system;
USE testing_system;
-- create table 1: department
CREATE TABLE  department
(
        department_id    	 TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
        department_name      VARCHAR(30) NOT NULL UNIQUE KEY
);
-- create table 2: position
CREATE TABLE  position
(
			position_id 	 TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            position_name	ENUM('Dev','Test','Scrum Master','PM') NOT NULL
);
-- create table 3: account
CREATE TABLE `account`
(
			account_id 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
			 email       	VARCHAR(50) NOT NULL UNIQUE KEY,
             username 		VARCHAR(50) NOT NULL UNIQUE KEY,
             fullname		NVARCHAR(50) NOT NULL ,
             department_id  TINYINT UNSIGNED NOT NULL,
             position_id  	TINYINT UNSIGNED NOT NULL,
             create_date    DATETIME DEFAULT NOW(),
             FOREIGN KEY(department_id) REFERENCES department (department_id),
             FOREIGN KEY(position_id)   REFERENCES `position` (position_id)
);
-- create table 4: group

CREATE TABLE `group`
(		
			group_id 	    TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            group_name		VARCHAR(50) NOT NULL UNIQUE KEY,
            creator_id		TINYINT UNSIGNED NOT NULL,
            create_date		DATE ,
            FOREIGN KEY(creator_id) REFERENCES `account` (account_id)
);
-- create table 5: group_account
CREATE TABLE `group_account`
(		
			group_id 	    TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            account_id		TINYINT UNSIGNED,
            Join_date		DATE ,
			FOREIGN KEY(group_id) REFERENCES `group` (group_id),
            FOREIGN KEY(account_id) REFERENCES `group` (creator_id)
);

-- create table 6: TypeQuestion

CREATE TABLE type_question
(
			type_id       	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            type_name 	  	ENUM('Essay','Multiple-Choice') NOT NULL
);
-- create table 7: CategoryQuestion
DROP TABLE IF EXISTS category_question;
CREATE TABLE  category_question
(
			category_id       TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            category_name 	  ENUM('Java','.NET','SQL','Postman','Ruby') NOT NULL
);

-- create table 8:Question
CREATE TABLE question
(
			question_id       TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            content			  VARCHAR(255) NOT NULL UNIQUE KEY,
            category_id       TINYINT UNSIGNED NOT NULL,
            type_id			  TINYINT UNSIGNED NOT NULL,
            creator_id		  TINYINT UNSIGNED NOT NULL,
            create_date 	  DATE,
            FOREIGN KEY(category_id) REFERENCES category_question (category_id),
            FOREIGN KEY(type_id) REFERENCES type_question (type_id)
);

-- create table 9:Answer
CREATE TABLE answer
(
			answer_id         TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            content			  VARCHAR(255) NOT NULL UNIQUE KEY,
            question_id       TINYINT UNSIGNED NOT NULL,
            isCorrect		  BIT NOT NULL,
            FOREIGN KEY (question_id) REFERENCES question (question_id)
);
-- create table 10:Exam
CREATE TABLE exam
(
			exam_id       	  TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            `code`		  	  VARCHAR(10) NOT NULL UNIQUE KEY,
            title     		  VARCHAR(10) NOT NULL UNIQUE KEY,
			category_id       TINYINT UNSIGNED NOT NULL,
            duration		  ENUM('60','90','120'),
            creator_id		  TINYINT UNSIGNED NOT NULL,
            create_date  	  DATETIME,
            FOREIGN KEY (category_id) REFERENCES category_question (category_id),
            FOREIGN KEY (creator_id) REFERENCES question (creator_id)
);
-- create table 11:ExamQuestion
CREATE TABLE exam_question
(
			exam_id         TINYINT UNSIGNED AUTO_INCREMENT,
            question_id       TINYINT UNSIGNED NOT NULL,
           PRIMARY KEY(exam_id,question_id),
           FOREIGN KEY(exam_id) REFERENCES exam(exam_id),
           FOREIGN KEY(question_id) REFERENCES question(question_id)
);



-- Chèn DATA bảng 1: department 
INSERT INTO department (department_name)
VALUES                 (	'Marketing' ),
					   (	'Ke Toan'  ),
					   (	'Bao ve'    ),
					   (	'Giam Doc'  ),
					   (	'Sale'      );
-- Chèn Data bảng 2: Position
INSERT INTO position (position_name)
VALUES  			 (	'Dev'	),
					 (	'Test'	),
					 (	'Scrum Master'	),
					 (	'PM'	);
-- Chèn Data bảng 3: Account
INSERT INTO  `account` ( email								, username			, fullname				, department_id	    , position_id,      create_date )
VALUES				   ('haidang29productions@gmail.com'	, 'dangblack'		, N'Nguyễn hải Đăng'		,   '5'			,   '1'		 ,		'2021-03-02'),
					   ('dapphatchetngay@gmail.com'			, 'khabanh'			, N'Ngô Bá Khá'				,   '4'			,   '2'		 ,		'2021-03-03'),
					   ('Dungeptrai@gmail.com'				, 'quocdung'		, N'Nguyễn Văn Dũng'		,   '1'			,   '1'		 ,		'2021-03-03'),
					   ('tuanvu@gmail.com'					, 'VuTuan'			, N'Bùi Tuấn Vũ'			,   '2'			,   '3'		 ,		'2021-03-04'),
					   ('binhthi12@gmail.com'				, 'ChuBinh'			, N'Chu Thị Bình'			,   '3'			,   '4'		 ,		'2021-03-05');
-- Chèn Data bảng 4: group
INSERT INTO `group` (group_name		  ,		creator_id	,	create_date)
VALUES				('Dream Makers'   ,     '6'		,	'2021-01-1'),
					('Bad Intentions' ,     '7'		,	'2021-02-12'),
                    ('Blaze Warriors' ,     '8'		,	'2021-02-14'),
                    ('Block Magic'    ,     '9'		,	'2021-03-01'),
                    ('Flames'   	  ,     '10'	,	'2021-03-02');

-- Chèn Data bảng 5: group_account
USE testing_system;
INSERT INTO `group_account` (group_id	,account_id	,	Join_date)
VALUES						('6'	 	,'6'		,	'2021-01-01'),
							('7'    	,'7'		,	'2021-02-01'),
							('8'		,'8'		,	'2021-02-02'),
							('9'  		, '9'		,	'2021-03-03'),
							('10'		, '10'		,	'2021-03-05');
-- Chèn Data bảng 6: type_question
USE testing_system;
INSERT INTO  type_question  (		type_name   		)
VALUES						(   	'Essay'				),
							(    	'Multiple-Choice'   ),
							(    	'Multiple-Choice'   ),
							(  		'Essay'				),
							(  		'Essay'				);
-- Chèn Data bảng 7: category_question
USE testing_system;
INSERT INTO  category_question  	(	 category_name   		)
VALUES								(   	'Java'				),
									(    	'.NET'   			),
									(    	'SQL'   			),
									(  		'Postman'			),
									(  		'Ruby'				);
-- Chèn Data bảng 8: question
USE testing_system;
INSERT INTO  question  	(content	            			 		,	category_id	,	type_id	,	creator_id	,	create_date )
VALUES					('Bạn biết gì về SQL?'	 			 		,  		'1'		,	  '2'   ,		'7'		,	'2020-03-01'	),
						( 'Hoa nở không màu của ca sĩ nào?'  		,		'2'		,	  '3'   ,		'9'		,	'2020-03-02'	),
						('Kể tên 5 con vật yêu thích?'   	 		,		'4'		,	  '1'   ,		'10'	,	'2020-03-04'	),
						('Bộ phim bom tấn đoạt giải Ocscar 2019?'	,		'3'		,	  '5'   ,		'6'		,	'2020-05-07'	),
						('Fanpage Đảo chó ai là Admin?'				,		'5'		,	  '4'   ,		'8'		,	'2020-05-09'	);
-- Chèn Data bảng 9: answer
USE testing_system;
INSERT INTO answer	(content								,	question_id		,	isCorrect	)
VALUES				('SQL là ngôn ngữ truy vấn dữ liệu.'	,		'1'			,		1		),
					('Lâm Chấn Huy'    						,		'2'			,		0		),
					('Chó,Mèo,Voi,Hổ,Chim'					,		'3'			,		1		),
					('Black Panther'  						, 		'4'			,		1		),
					('Triệu Quốc Dũng'						, 		'5'			,		0		);
-- Chèn Data bảng 10: exam
USE testing_system;
INSERT INTO exam	( `code`	,	title			,	category_id	,	duration	,	creator_id	,	create_date	)
VALUES				('N1'		,	'Khoa Học'		,		'1'		,	'60'		,		'1'		,	'2020-04-01'),
					('N2'    	,	'Tình Yêu'		,		'2'		,	'90'		,		'2'		,	'2020-05-02'),
					('N3'		,	'Triết Luận'	,		'3'		,	'90'		,		'3'		,	'2020-05-03'),
                    ('N4'		,	'Trí Tuệ'		,		'4'		,	'90'		,		'4'		,	'2020-05-06'),
					('N5'		, 	'Vật Lý'		,		'5'		,	'120'		,		'5'		,	'2020-05-07');
-- Chèn Data bảng 11: exam_question
USE testing_system;
INSERT INTO  exam_question (exam_id , question_id)
VALUES 					   ('1'		,	'2'		 ),
						   ('2'		,	'3'		 ),
						   ('3'		,	'4'		 ),
						   ('4'		,	'5'		 ),
						   ('5'		,	'1'		 );
							



             
            
            
		
		
        

