mysql> use banksytem;
ERROR 1049 (42000): Unknown database 'banksytem'
mysql> use banksystem;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_banksystem |
+----------------------+
| bankdemo             |
| customer             |
+----------------------+
2 rows in set (0.01 sec)

mysql> drop bankdemo;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'bankdemo' at line 1
mysql> drop table bankdemo;
Query OK, 0 rows affected (0.04 sec)

mysql> drop table customer;
Query OK, 0 rows affected (0.03 sec)

mysql> show tables;
Empty set (0.00 sec)

mysql> create table bank (bkname varchar(255), bkaddress varchar(255), bkcode bigint primary key not null);
Query OK, 0 rows affected (0.02 sec)

mysql> desc bank;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| bkname    | varchar(255) | YES  |     | NULL    |       |
| bkaddress | varchar(255) | YES  |     | NULL    |       |
| bkcode    | bigint       | NO   | PRI | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> create table customer (csid bigint primary key not null, csname varchar(255), csemail varchar(255), cspassword varchar(255),csphno longint, cscardno longint);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'longint, cscardno longint)' at line 1
mysql> create table customer (csid bigint primary key not null, csname varchar(255), csemail varchar(255), cspassword varchar(255),csphno bigint, cscardno bigint);
Query OK, 0 rows affected (0.02 sec)

mysql> desc customer;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| csid       | bigint       | NO   | PRI | NULL    |       |
| csname     | varchar(255) | YES  |     | NULL    |       |
| csemail    | varchar(255) | YES  |     | NULL    |       |
| cspassword | varchar(255) | YES  |     | NULL    |       |
| csphno     | bigint       | YES  |     | NULL    |       |
| cscardno   | bigint       | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
6 rows in set (0.00 sec)

mysql> create table account (bkid  bigint foreign key,csid bigint foreign key refernces customer (csid),accno bigit,accbalance float,acctype varchar(255));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'foreign key,csid bigint foreign key refernces customer (csid),accno bigit,accbal' at line 1
mysql> alter table bank add bkid varchar(255) primary key;
ERROR 1068 (42000): Multiple primary key defined
mysql> alter table bank delete bkcode;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'delete bkcode' at line 1
mysql> alter table bank drop bkcode;
Query OK, 0 rows affected (0.05 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table bank add bkcode bigint,bkid bigint primary key not null;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'bkid bigint primary key not null' at line 1
mysql> alter table bank add bkcode bigint;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> alter table bank add bkid bigint primary key not null;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc bank;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| bkname    | varchar(255) | YES  |     | NULL    |       |
| bkaddress | varchar(255) | YES  |     | NULL    |       |
| bkcode    | bigint       | YES  |     | NULL    |       |
| bkid      | bigint       | NO   | PRI | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

mysql> create table account (bkid  bigint foreign key refernces bank (bkid),csid bigint foreign key refernces customer (csid),accno bigit,accbalance float,acctype varchar(255));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'foreign key refernces bank (bkid),csid bigint foreign key refernces customer (cs' at line 1
mysql> create table account (accno bigint primary key auto_increment, accbalance float, acctype varchar(255),csid bigint,bkid bigint, foreign key (csid) references (csid), foreign key (bkid) references (bkid);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '(csid), foreign key (bkid) references (bkid)' at line 1
mysql> create table account (accno bigint primary key auto_increment, accbalance float, acctype varchar(255),csid bigint,bkid bigint, foreign key (csid) references customer (csid), foreign key (bkid) references bank (bkid);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> create table account (accno bigint primary key auto_increment, accbalance float, acctype varchar(255),csid bigint,bkid bigint;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> create table account (accno bigint primary key auto_increment, accbalance float, acctype varchar(255),csid bigint,bkid bigint, foreign key (csid) references customer (csid), foreign key (bkid) references bank (bkid));
Query OK, 0 rows affected (0.04 sec)

mysql> desc account;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| accno      | bigint       | NO   | PRI | NULL    | auto_increment |
| accbalance | float        | YES  |     | NULL    |                |
| acctype    | varchar(255) | YES  |     | NULL    |                |
| csid       | bigint       | YES  | MUL | NULL    |                |
| bkid       | bigint       | YES  | MUL | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
5 rows in set (0.02 sec)

mysql> create table transaction (trid bigint auto_increament primary key, trdate date, tramount float, trtype varchar,accid bigint, foreign key (accid) references account (accid));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'auto_increament primary key, trdate date, tramount float, trtype varchar,accid b' at line 1
mysql> create table transaction (trid bigint auto_increment primary key, trdate date, tramount float, trtype varchar,accid bigint, foreign key (accid) references account (accid));
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ',accid bigint, foreign key (accid) references account (accid))' at line 1
mysql> create table transaction (trid bigint auto_increment primary key, trdate date, tramount float, trtype varchar(255),accid bigint, foreign key (accid) references account (accid));
ERROR 3734 (HY000): Failed to add the foreign key constraint. Missing column 'accid' for constraint 'transaction_ibfk_1' in the referenced table 'account'
mysql> create table transaction (trid bigint auto_increment primary key, trdate date, tramount float, trtype varchar(255),accno bigint, foreign key (accno) references account (accno));
Query OK, 0 rows affected (0.03 sec)

mysql> desc transaction;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| trid     | bigint       | NO   | PRI | NULL    | auto_increment |
| trdate   | date         | YES  |     | NULL    |                |
| tramount | float        | YES  |     | NULL    |                |
| trtype   | varchar(255) | YES  |     | NULL    |                |
| accno    | bigint       | YES  | MUL | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
5 rows in set (0.00 sec)

mysql> create table atm ( ATM_ID int primary key auto_increment, Deposit bool, Withdraw bool, Check_Balance bool,foreign key(ATM_ID) references transaction(Transaction_ID) );

mysql> desc atm;
+--------------+------------+------+-----+---------+----------------+
| Field        | Type       | Null | Key | Default | Extra          |
+--------------+------------+------+-----+---------+----------------+
| atmid        | bigint     | NO   | PRI | NULL    | auto_increment |
| deposit      | tinyint(1) | YES  |     | NULL    |                |
| withdraw     | tinyint(1) | YES  |     | NULL    |                |
| checkbalance | tinyint(1) | YES  |     | NULL    |                |
+--------------+------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)
