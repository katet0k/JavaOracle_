-- Добавление напитков
INSERT INTO Drinks (DrinkID, Name_EN, Name_OTHER, Price)
VALUES (1, 'Latte', 'Латте', 3.50);

-- Добавление десертов
INSERT INTO Desserts (DessertID, Name_EN, Name_OTHER, Price)
VALUES (1, 'Cheesecake', 'Чизкейк', 4.00);

-- Добавление персонала
INSERT INTO Staff (StaffID, FullName, ContactPhone, ContactEmail, Position)
VALUES (1, 'John Doe', '123-456-7890', 'johndoe@example.com', 'Бариста');

INSERT INTO Staff (StaffID, FullName, ContactPhone, ContactEmail, Position)
VALUES (2, 'Jane Smith', '987-654-3210', 'janesmith@example.com', 'Кондитер');

-- Добавление клиентов
INSERT INTO Clients (ClientID, FullName, BirthDate, ContactPhone, ContactEmail, Discount)
VALUES (1, 'Alice Brown', TO_DATE('1990-05-15', 'YYYY-MM-DD'), '555-123-4567', 'alicebrown@example.com', 10);
