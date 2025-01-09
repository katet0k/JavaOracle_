
-- Удалить информацию о конкретном десерте
DELETE FROM Desserts
WHERE Name_EN = 'Cheesecake';

-- Удалить информацию об определенном официанте по причине увольнения
DELETE FROM Staff
WHERE Position = 'Официант' AND FullName = 'Waiter Name';

-- Удалить информацию об определенном бариста по причине увольнения
DELETE FROM Staff
WHERE Position = 'Бариста' AND FullName = 'John Doe';

-- Удалить информацию о конкретном клиенте
DELETE FROM Clients
WHERE FullName = 'Alice Brown';
-- Удалить конкретный заказ
DELETE FROM Orders
WHERE OrderID = 2;

-- Удалить заказы конкретного десерта
DELETE FROM Orders
WHERE OrderID IN (
    SELECT OrderID
    FROM Orders
    JOIN Desserts ON Desserts.DessertID = Orders.OrderID
    WHERE Desserts.Name_EN = 'Cheesecake'
);

-- Удалить расписание работы на конкретный день
DELETE FROM Schedule
WHERE WorkDate = TO_DATE('2025-01-13', 'YYYY-MM-DD');

-- Удалить расписание работы на конкретный промежуток между указанными датами
DELETE FROM Schedule
WHERE WorkDate BETWEEN TO_DATE('2025-01-10', 'YYYY-MM-DD') AND TO_DATE('2025-01-15', 'YYYY-MM-DD');
