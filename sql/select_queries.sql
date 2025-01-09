-- Показать все напитки
SELECT * FROM Drinks;

-- Показать все десерты
SELECT * FROM Desserts;

-- Показать информацию обо всех бариста
SELECT * FROM Staff
WHERE Position = 'Бариста';

-- Показать информацию обо всех официантах
SELECT * FROM Staff
WHERE Position = 'Официант';
-- Показать все заказы конкретного десерта
SELECT *
FROM Orders
JOIN Desserts ON Desserts.DessertID = Orders.OrderID
WHERE Desserts.Name_EN = 'Cheesecake';

-- Показать расписание работы на конкретный день
SELECT *
FROM Schedule
WHERE WorkDate = TO_DATE('2025-01-13', 'YYYY-MM-DD');

-- Показать все заказы конкретного официанта
SELECT *
FROM Orders
JOIN Staff ON Staff.StaffID = Orders.OrderID
WHERE Staff.Position = 'Официант';

-- Показать все заказы конкретного клиента
SELECT *
FROM Orders
WHERE ClientID = 1;