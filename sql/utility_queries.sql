-- Добавление строки
INSERT INTO Clients (ClientID, FullName, BirthDate, ContactPhone, ContactEmail, Discount)
VALUES (2, 'Bob White', TO_DATE('1985-03-10', 'YYYY-MM-DD'), '555-987-6543', 'bobwhite@example.com', 5);

-- Удаление строки
DELETE FROM Clients
WHERE ClientID = 2;

-- Обновление строки
UPDATE Clients
SET Discount = 20
WHERE ClientID = 1;