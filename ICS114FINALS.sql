CREATE DATABASE ICS114FINALS
DROP TABLE Orders;

CREATE TABLE Users(
	ID int IDENTITY(1,1) PRIMARY KEY,
	FirstName varchar(20)not null,
	LastName varchar(20)not null,
	Address varchar(50)not null,
	MobileNumber int not null,
	EmailAdd varchar(50) not null,
	Comments varchar(50) not null,
	Price int not null,
	ReferenceNumber int not null,
);
	
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
DROP TABLE Products
SELECT * FROM Products
CREATE TABLE Products(
	ID int IDENTITY(1,1) PRIMARY KEY,
	ProductName varchar(50) not null,
	Price int not null,
	ImagePic varchar(20) not null,
	Category varchar(50) not null,

	);