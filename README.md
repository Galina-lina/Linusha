# Технологии разработки программного обеспечения

## Лабораторная работа № 1: создание микросервиса на Spring Boot с базой данных

-  Выполнила: Ледяева Г.А
-  Группа: МБД2131

-  Цель лабораторной работы: знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов) 

### Запуск проекта

- Склонируйте проект с репозитория 
```
$ git clone https://github.com/Galina-lina/SampleApi.git

```
### Запуск Docker контейнера с БД PostgreSQL
- Необходимо перейти в директорию с БД
```
$ cd SampleApi/src/main/resources
```
- Собираем docker с БД
```
$ docker build . -t postgres:latest
```
- Запускаем docker с БД
```
$ docker run -p 5432:5432 postgres:latest
```
### Запуск приложения
- Переход в директория проекта 
```
$ cd ~/SampleApi
```
- Сборка Maven 
```
$ mvn package
```
- Собираем docker образ 
```
$ docker build . -t sampleapi:latest
```
- Запускаем docker с приложением 
```
$ docker run -p 8080:8080 sampleapi:latest
```

### Примеры запросов к API
- Получение имени хоста
-- Тип запроса GET ``` http://localhost:8080/api/v1/status ```
- Получение всех записей из БД 
-- Тип запроса GET ``` http://localhost:8080/api/v1/products ```
- Получение конкретной записи из БД по известному id
-- Тип запроса GET ``` http://localhost:8080/api/v1/products/2 ```
- Запись в БД нового продукта
-- Тип запроса POST ``` http://localhost:8080/api/v1/products/ ```
--- Запрос JSON ``` 
{
		"name": "New Book2",
		"brand": "New Brand2 ",
		"price": 10002,
		"quantity": 12
}
```
