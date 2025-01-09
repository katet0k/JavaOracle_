-- Изменить цену на определенный вид кофе
UPDATE Drinks
SET Price = 4.00
WHERE Name_EN = 'Latte';

-- Изменить контактный, почтовый адрес кондитеру
UPDATE Staff
SET ContactEmail = 'newemail@example.com'
WHERE Position = 'Кондитер' AND FullName = 'Jane Smith';

-- Изменить контактный телефон бариста
UPDATE Staff
SET ContactPhone = '111-222-3333'
WHERE Position = 'Бариста' AND FullName = 'John Doe';

-- Изменить процент скидки конкретного клиента
UPDATE Clients
SET Discount = 15
WHERE FullName = 'Alice Brown';
