-- -------------------------EXERCISE 1: SUBQUERY ------------------------------------------

-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name
-- của ProductSubcategory là 'Saddles'
	USE         adventureworks;
    SELECT		P.`Name`
    FROM		product P
    JOIN		productsubcategory	PS ON P.ProductSubcategoryID = PS.ProductSubcategoryID
    WHERE		P.ProductSubcategoryID =(       SELECT 		ProductSubcategoryID
												FROM		productsubcategory
												WHERE 		`Name` = 'Saddles'
										);

-- Question 2: Thay đổi câu Query 1 để lấy được kết quả sau

	USE         adventureworks;
    SELECT		P.`Name`
    FROM		product P
    JOIN		productsubcategory	PS ON P.ProductSubcategoryID = PS.ProductSubcategoryID
    WHERE		P.`Name` LIKE '%Bo%';      

-- Question 3:
-- Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring 
-- Bike (nghĩa là ProductSubcategoryID = 3)
-- B1 : thống kê các sản phẩm có ProductSubcategoryID = 3 và giá của nó
	USE         adventureworks;
    WITH			PSC3 	AS
    (SELECT 		P.`Name`, P.ListPrice
	FROM			product	P									
	WHERE			P.ProductSubcategoryID =3)
--  lấy min 
    SELECT		`Name`
    FROM		PSC3
	WHERE	 	ListPrice  = (SELECT	MIN(ListPrice)
								FROM	PSC3
							)
	;

-- -----------------------EXERCISE 2: JOIN NHIỀU BẢNG---------------------------

-- Question 1: Viết query lấy danh sách tên country và province được lưu trong 
-- AdventureWorks2008sample database.

	SELECT	CR.`Name`AS country , SP.`Name` AS province 
	FROM 	countryregion  CR
	JOIN	stateprovince SP ON CR.CountryRegionCode = SP.CountryRegionCode;

-- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country 
-- Germany và Canada
	
    SELECT 	CR.`Name` AS country, SP.`Name` AS province
	FROM	countryregion CR INNER JOIN stateprovince SP
	ON		CR.CountryRegionCode = SP.CountryRegionCode
	WHERE	CR.`Name` = 'Germany' 
	OR 		CR.`Name` = 'Canada';

-- Question 3:SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột 
-- BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale 
-- được bao nhiêu người trong năm nay)
	
	SELECT  SalesPersonID , Bonus ,SalesYTD, SalesOrderID,OrderDate
    FROM 	salesperson sp 
    

