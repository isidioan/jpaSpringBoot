create table person (id integer not null , name varchar(255) not null , location varchar(255), birth_date timestamp,
                    primary key (id));

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES
( 10001, 'Isidoros', 'Volos', sysdate );

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES
( 10002, 'Akis', 'Thessaloniki', sysdate );

insert into PERSON (ID, NAME, LOCATION, BIRTH_DATE) VALUES
( 10003, 'Kitsos', 'Athens', sysdate );