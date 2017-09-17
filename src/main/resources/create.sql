CREATE TABLE if NOT EXISTS current_rates (CURRENCY varchar(3) NOT NULL, RATE_DATE DATE, RATE numeric(8,4));
DELETE current_rates;
insert into current_rates(CURRENCY, RATE_DATE, RATE) VALUES ('EUR', '2017-09-16', 4.6612);
commit;