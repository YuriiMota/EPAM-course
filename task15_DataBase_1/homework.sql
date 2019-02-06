use labor_sql;
-- 1
-- SELECT  maker, type from product WHERE type='Laptop' ORDER BY maker;
-- 2
-- SELECT model, ram, screen, price from laptop WHERE price>1000 ORDER BY 2, 4 DESC;
-- 3
-- SELECT * from printer WHERE color='y' ORDER BY price DESC;
-- 4
-- SELECT model, speed, hd, cd, price from PC WHERE (cd='12x' OR cd='24x') AND price<600 ORDER BY speed DESC;
-- 5
 -- SELECT name, class from ships WHERE name=class ORDER BY name; 
 -- 6
 -- SELECT * from pc WHERE speed>=500 AND price<800 ORDER BY price DESC;
 -- 7
 -- SELECT * from printer WHERE NOT type = 'matrix' AND price<300 ORDER BY type DESC;
 -- 8
 -- SELECT model, speed from pc WHERE price BETWEEN 400 and 600 ORDER BY hd;
 -- 9
 -- !!!SELECT model, speed, hd from pc WHERE (ram=10 OR ram= 20) AND maker = 'A' ORDER BY speed;
 -- 10
 -- SELECT model, speed, hd, price from laptop WHERE screen>=12 ORDER BY price DESC;
 -- 11
 -- SELECT model, type, price from printer WHERE price<300 ORDER BY type DESC;
 -- 12
 -- SELECT model, ram, price from laptop WHERE ram=64 ORDER BY screen ;
 -- 13
  -- SELECT model, ram, price from pc WHERE ram=64 ORDER BY hd ;
  -- 14
  -- SELECT model, speed, price from pc WHERE speed BETWEEN 500 AND 750 ORDER BY hd DESC;
  -- 15
  
  -- ?SELECT * FROM outcome_o WHERE outcome_o.out>2000 ORDER BY date DESC;
  -- 16 
  -- SELECT  * from  income_o  WHERE inc  BETWEEN 5000 AND 10000  ORDER BY inc;
  -- 17
-- SELECT  * FROM income WHERE point = 1 ORDER BY inc;
-- 18
-- ???SELECT  * FROM outcome WHERE point = 2 ORDER BY out;
-- 19
-- SELECT class FROM classes WHERE country = 'Japan' ORDER BY type DESC;
-- 20 
-- SELECT name, launched  FROM ships  WHERE launched BETWEEN 1922 AND 1942 ORDER BY launched DESC;
-- 21
-- SELECT ship, battle, result  FROM outcomes WHERE battle='Guadalcanal'  AND result != 'sunk' ORDER BY ship DESC;
-- 22
-- SELECT ship, battle, result FROM outcomes WHERE result = 'sunk' ORDER BY ship DESC ;
-- 23
-- SELECT class, displacement FROM classes WHERE displacement >= 40000 ORDER BY type;
-- 24
--  SELECT trip_no, town_from, town_to FROM  trip WHERE 'London' in (town_to, town_from) ORDER BY time_out;
 -- 25
 -- SELECT trip_no, plane, town_from, town_to FROM  trip WHERE plane = 'TU-134' ORDER BY time_out DESC;
 -- 26
 -- SELECT trip_no, plane, town_from, town_to FROM  trip WHERE plane != 'IL-86' ORDER BY plane;
 -- 27
 -- SELECT trip_no,  town_from, town_to FROM  trip WHERE town_from != 'Rostov' AND town_to != 'Rostov' ORDER BY plane;
-- 2.
-- 2.1
-- SELECT model from pc  WHERE model  RLIKE '.*1.*1.*';
-- 2.2
-- SELECT * FROM outcome WHERE date LIKE '%-03-%';
-- 2.3
-- SELECT * FROM outcome_o WHERE DAYOFMONTH(date) = 14;
-- 2.4
-- SELECT name FROM ships WHERE name LIKE 'W%n';
-- 2.5
 -- SELECT name FROM ships WHERE name LIKE '%e%e%';
 -- 2.6
 -- SELECT name, launched FROM ships WHERE name NOT RLIKE 'a$';
  -- 2.7
 -- ??SELECT name from battles WHERE name LIKE '% %'; 
 -- 2.8
 -- SELECT * FROM trip WHERE HOUR(time_out) BETWEEN '12' AND '17';
 -- 2.9
 --  SELECT * FROM trip WHERE HOUR(time_in) BETWEEN '17' AND '23';
   -- 2.10
 -- SELECT date FROM pass_in_trip WHERE place Rlike '1[a-d]';
 -- 2.11
  -- SELECT date, place FROM pass_in_trip WHERE place Rlike 'c$';
 -- 2.12
 -- SELECT name FROM passenger WHERE name  LIKE '% C%';
 -- 2.13
-- SELECT name FROM passenger WHERE name NOT LIKE '% J%';
 -- 3.1
 -- SELECT p.maker, p.type, pc.speed, pc.hd FROM product AS p JOIN pc ON p.model = pc.model where pc.hd<=8;
 -- 3.2
 --  SELECT p.maker FROM product AS p JOIN pc ON p.model = pc.model WHERE pc.speed>600;
 -- 3.3
  --  SELECT p.maker FROM product AS p JOIN pc ON  p.model = pc.model WHERE  pc.speed>600;
 -- 3.4
 -- SELECT  * from laptop  l1 join  laptop l2  on  l1.hd=l2.hd AND l2.ram = l1.ram AND l1.model >= l2.model AND l1.code>l2.code; 
 -- 3.5
  -- SELECT country  FROM Classes WHERE type IN ('bb','bc') group by country having count(c.country)=2; 
 --  select * from (SELECT oki.country from classes as oki 
 -- group by oki.country,oki.type) as c group by c.country having count(c.country)=2;

 -- 3.6
 -- SELECT p.model, p.maker from product  AS p JOIN pc ON p.model=pc.model WHERE pc.price<600;
 -- 3.7
 -- SELECT p.model, p.maker from product  AS p JOIN printer ON p.model=printer.model WHERE printer.price>300;
-- 3.8
 -- SELECT p.model, p.maker, pc.price  from product p JOIN pc on p.model=pc.model    
--  UNION ALL 
--  SELECT p.model, p.maker, laptop.price  from product p JOIN laptop on p.model=laptop.model ;
-- 3.9
-- SELECT p.maker, p.model, pc.price FROM product AS p JOIN pc ON p.model=pc.model WHERE pc.price  is not null ;
-- 3.10
-- SELECT p.maker, p.type, p.model, laptop.speed FROM product p 
-- JOIN laptop ON p.model=laptop.model WHERE laptop.speed >600;
-- 3.11
-- SELECT s.name,  c.displacement from ships as s JOIN classes as c on s.class=c.class;
-- 3.12
-- SELECT b.name, b.date, o.result FROM battles b JOIN outcomes o ON b.name=o.battle WHERE o.result='OK';
-- 3.13
-- SELECT  s.name, c.country FROM ships s JOIN classes c ON s.class=c.class;
-- 3.14
-- SELECT t.plane, c.name FROM trip AS t JOIN Company AS c ON t.id_comp=c.id_comp;
-- 3.15
-- SELECT p.name, d.date FROM Passenger AS p JOIN pass_in_trip AS d ON p.id_psg=d.id_psg;
 
 
 








 