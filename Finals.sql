CREATE DATABASE ICS114FINALS
DROP TABLE Orders;
DROP Table Users;
CREATE TABLE Users(
	ID int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(20)not null,
	LastName varchar(20)not null,
	Address varchar(50)not null,
	MobileNumber varchar(20) not null,
	EmailAdd varchar(50) not null,
	Comments varchar(50) not null,
	Price int not null,
	ReferenceNumber int not null,
);
	SELECT * FROM Users WHERE ReferenceNumber=59472
	SELECT * FROM Orders WHERE FirstName='Rabin'AND LastName='Bote'
INSERT INTO Users (FirstName, LastName, Address, MobileNumber, EmailAdd, Comments, Price, ReferenceNumber)
	VALUES ('Hans', 'Ty', 'Manila', '09153721611', 'tyhansdaryl@gmail.com', 'Contact me when shipped', 35000, 96);

INSERT INTO Users (FirstName, LastName, Address, MobileNumber, EmailAdd, Comments, Price, ReferenceNumber)
	VALUES ('Daryl', 'Javier', 'Ortigas', '09170505050', 'daryl123@gmail.com', 'Hello', 31235000, 123);
	
DROP TABLE Orders
CREATE TABLE Orders(
	ID int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(20)not null,
	LastName varchar(20)not null,
	Size varchar(10) not null,
	ImagePic varchar(20) not null,
	ProductName varchar(50)not null,
	Price int not null,
	Quantity int not null,
	TotalPrice int not null,

);

SELECT * FROM Orders
INSERT INTO Orders (FirstName, LastName, Size, ImagePic, ProductName, Price, Quantity, TotalPrice) VALUES
	('Hans', 'Ty', 'Medium', '400x200(10).gif','Balenciaga - "Sinners" T-Shirt', 17000, 2, 34000);
	

INSERT INTO Orders (FirstName, LastName, Size, ImagePic, ProductName, Price, Quantity, TotalPrice) VALUES
	('Hans', 'Ty', 'US 10.5', '400x200(4).gif', 'Adidas - Yeezy Wave Runner', 50000, 1, 50000);
	
SELECT * FROM Orders
	
SELECT * FROM Orders
DROP TABLE Products
SELECT * FROM Products
CREATE TABLE Products(
	ID int IDENTITY(1,1) PRIMARY KEY,
	ProductName varchar(50) not null,
	Price int not null,
	ImagePic varchar(20) not null,
	Category varchar(50) not null,

	); 
	
	DROP TABLE Products
INSERT INTO Products VALUES
	('Adidas - Raf Simons Stan Smith', 20000, '400x200(1).gif', 'Footwear');
INSERT INTO Products VALUES
	('Adidas - Yeezy Boost 350 V2 Cream', 25750,'400x200.gif', 'Footwear');
INSERT INTO Products VALUES
	('Adidas - Yeezy Powerphase Calabasas', 30000, '400x200(3).gif', 'Footwear');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Adidas - Yeezy Wave Runner', 50000, '400x200(4).gif', 'Footwear');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Nike - Air Force 1 Travis Scott', 25000, '400x200(5).gif','Footwear');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Nike - Air Jordan 1 Off-White', 70000, '400x200(6).gif', 'Footwear');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Nike - Air Max 97 Silver Bullet', 10000, '400x200(7).gif', 'Footwear');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Nike - Air Vapormax CDG', 25000, '400x200(8).gif','Footwear');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Nike - Blazer Mid Off-White', 40000, '400x200(9).gif','Footwear');
	
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Balenciaga - Sinners T-Shirt', 17000, '400x200(10).gif', 'Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Fendi - Black Picasso John Boots Pullover', 28000,'400x200(11).gif', 'Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Gosha Rubchinskiy - Grey Sweatshirt', 10000, '400x200(12).gif','Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Gucci - Blue & Red Exit 32 Inchiostro Vest', 29000, '400x200(13).gif','Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Helmut Lang - Austria T-Shirt', 7000,'400x200(14).gif', 'Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('PLAY by Comme des Garcons - Grey Patch Hoodie', 15000, '400x200(15).gif','Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('PLAY by Comme des Garcons - White Patch Shirt', 13500, '400x200(16).gif','Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Prada	- Beige & Grey Shetland Village Sweater', 40750, '400x200(17).gif','Clothing');
INSERT INTO Products (ProductName, Price, ImagePic, Category) VALUES
	('Vetements - Reversible Bomber Jacket', 109000, '400x200(18).gif','Clothing');

SELECT * FROM Products
