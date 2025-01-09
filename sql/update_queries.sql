-- Изменить расписание работы на ближайший вторник
UPDATE Schedule
SET Shift = 'Evening'
WHERE WorkDate = TO_DATE('2025-01-14', 'YYYY-MM-DD');

-- Изменить название уже существующего вида кофе
UPDATE Drinks
SET Name_EN = 'Americano', Name_OTHER = 'Американо'
WHERE DrinkID = 1;

-- Изменить информацию в существующем заказе
UPDATE Orders
SET TotalPrice = 5.00
WHERE OrderID = 2;

-- Изменить название уже существующего десерта
UPDATE Desserts
SET Name_EN = 'Brownie', Name_OTHER = 'Брауні'
WHERE DessertID = 1;
