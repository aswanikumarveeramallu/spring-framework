This home budget rest services uses hsql db , As it is simple project we need only few tables. Below comands will be helpful

HSQLDB
Start hsqldb admin tool
java -cp hsqldb.jar org.hsqldb.util.DatabaseManagerSwing

start database
java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:homebudgetdb/db  --dbname.0  homebudgetdb

DB tables
----------
create table login  (user_name  char(20) not null , password char(8) not null);

create table payment_type (payment_id int primary key, payment_type  char(50) not null)

create table payment_info( payment_info_id int primary key, payment_type_id int foreign key  references payment_type(payment_id),amount bigint not null)

create table item_info( item_id int primary key not null, item_name char(100) not null, item_price BIGINT not null,
ITEM_VENDOR char(200) not null,item_vendor_address char(300), payment_id int foreign key references payment_info(payment_info_id))


dummy data
----------

insert into login values('local','local);


Integration Testing with Postman , google chrome plugin
------------------
http://localhost:8080/login
Request headers
Content-Type  application/json

Request -body  JSON

{
    "username": "local",
    "password":"local"
  }
