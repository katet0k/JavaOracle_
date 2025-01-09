
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