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
-- Добавление нового заказа кофе
INSERT INTO Orders (OrderID, ClientID, OrderDate, TotalPrice)
VALUES (2, 1, TO_DATE('2025-01-15', 'YYYY-MM-DD'), 3.50);

-- Добавление нового заказа десерта
INSERT INTO Orders (OrderID, ClientID, OrderDate, TotalPrice)
VALUES (3, 1, TO_DATE('2025-01-15', 'YYYY-MM-DD'), 4.00);

-- Добавление информации о графике работы в ближайший понедельник
INSERT INTO Schedule (ScheduleID, StaffID, WorkDate, Shift)
VALUES (1, 1, TO_DATE('2025-01-13', 'YYYY-MM-DD'), 'Morning');

-- Добавление нового вида кофе
INSERT INTO Drinks (DrinkID, Name_EN, Name_OTHER, Price)
VALUES (2, 'Espresso', 'Еспрессо', 2.50);