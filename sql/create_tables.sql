
-- Создание таблиц для ассортимента кафе
CREATE TABLE Drinks (
    DrinkID NUMBER PRIMARY KEY,
    Name_EN VARCHAR2(50),
    Name_OTHER VARCHAR2(50),
    Price NUMBER(10, 2)
);

CREATE TABLE Desserts (
    DessertID NUMBER PRIMARY KEY,
    Name_EN VARCHAR2(50),
    Name_OTHER VARCHAR2(50),
    Price NUMBER(10, 2)
);

-- Создание таблицы для персонала
CREATE TABLE Staff (
    StaffID NUMBER PRIMARY KEY,
    FullName VARCHAR2(100),
    ContactPhone VARCHAR2(15),
    ContactEmail VARCHAR2(100),
    Position VARCHAR2(50)
);

-- Создание таблицы для клиентов
CREATE TABLE Clients (
    ClientID NUMBER PRIMARY KEY,
    FullName VARCHAR2(100),
    BirthDate DATE,
    ContactPhone VARCHAR2(15),
    ContactEmail VARCHAR2(100),
    Discount NUMBER(5, 2)
);

-- Создание таблицы для расписания работы персонала
CREATE TABLE Schedule (
    ScheduleID NUMBER PRIMARY KEY,
    StaffID NUMBER REFERENCES Staff(StaffID),
    WorkDate DATE,
    Shift VARCHAR2(50)
);

-- Создание таблицы для заказов
CREATE TABLE Orders (
    OrderID NUMBER PRIMARY KEY,
    ClientID NUMBER REFERENCES Clients(ClientID),
    OrderDate DATE,
    TotalPrice NUMBER(10, 2)
);
