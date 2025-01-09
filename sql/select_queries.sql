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
