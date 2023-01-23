import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet
import java.sql.Statement
import java.sql.PreparedStatement

class Jdbc {
    var conn:Connection?=null;
    fun createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn=DriverManager.getConnection("Jdbc:mysql://localhost:3306/banksystem", "root", "Horizon@11")
            if(conn!=null){
                print ("connect done")
            }
            print("connect")
        } catch (e:SQLException){
            print(e)
        }
    }
    fun createTableUsingStatement(){
        var stm:Statement?=null;
        var sql = "create table demo2(id int not null auto_increment,name varchar(255),age int not null, primary key(id));"
        try{
            stm=conn!!.createStatement();
            stm.execute(sql);
            print("table is created");
        } catch(e:SQLException){
            print(e)
        }
    }


    fun createTable(){
        var prestat:PreparedStatement?=null
        var sql="create table demo1(id int not null auto_increment,name varchar(255),age int not null, primary key(id));"
        try{
            prestat=conn!!.prepareStatement(sql);
            var status=prestat.executeUpdate();
            print(status)
            if(status>0){
                print("table is created");
            }
        } catch(e:SQLException){
            print(e)
        }
    }

    fun insertIntoTable(){
        println("insert data")
        var preState: PreparedStatement?=null
        val sql="insert into demo(name,age) values(?,?);"
        try{
            preState=conn!!.prepareStatement(sql);
            println("enter user name")
            preState.setString(1, readLine())
            println("enter user age")
            preState.setInt(2, readLine()!!.toInt())
            var status=preState.executeUpdate();
            print(status)
            if(status>0){
                print("data inserted into table")
            }
        } catch(e:SQLException){
            print(e)
        }
    }


    fun connectionClass(){
        if(conn!=null){
            //conn.close();
        }
    }
    fun executeQueryOfDatabase(){
        var stm:Statement?=null
        var res:ResultSet?=null
        var sql="show tables;"
        try{
            stm=conn!!.createStatement()
            res=stm!!.executeQuery(sql);
            print(res)
            while(res!!.next()){
                print(res.getString("Tables_in_banksystem"))
            }

        } catch(e:SQLException){
            print(e)
        } finally{
            if(res!=null){
                try{
                    res.close()
                } catch(e:SQLException){
                    print(e)
                }
            }
        }
    }

    fun updateTable(){
        var preStat:PreparedStatement?=null
        var sql="update demo SET name=? where id=?";
        try{
            preStat=conn!!.prepareStatement(sql);
            var name = readLine()
            preStat.setString(1,name)
            var id = readLine()!!.toInt()
            preStat.setInt(2,id)
            var status = preStat.executeUpdate();
            if(status>0){
                print("table is updated")
            }

        } catch(e:SQLException){
            print(e)
        }
    }

    fun deleteData(){
        var preStat:PreparedStatement?=null;
        var sql="Delete from demo where id=?;"
        try{
            preStat=conn!!.prepareStatement(sql);
            var id= readLine()!!.toInt()
            preStat.setInt(1,id)
            var status=preStat.executeUpdate();
            if(status>0){
                print("data is deleted from table")
            }
        } catch (e:SQLException){
            print(e)
        }
    }

    fun dropTable(){
        var preStat:PreparedStatement?=null;
        var sql="drop table demo2;"
        try{
            preStat=conn!!.prepareStatement(sql);
            var status=preStat.executeUpdate();
            if(status>0){
                print("table is deleted from the database")
            }
        } catch(e:SQLException){
            print(e)
        }

    }

    fun truncateTable(){
        var preStat:PreparedStatement?=null;
        var sql="truncate table demo2;"
        try{
            preStat=conn!!.prepareStatement(sql);
            var status=preStat.executeUpdate();
            if(status>0){
                print("table is truncate from the database")
            }
        } catch(e:SQLException){
            print(e)
        }

    }

    fun selectQuery(){
        var stm:Statement?=null
        var res:ResultSet?=null
        print ("enter user id")
        var id = readLine()!!.toInt();
        var sql="select * from account where accountno>"+ id+ ";"
//        var sql="select * from account;"
        try{
            stm=conn!!.createStatement()
            res=stm!!.executeQuery(sql);
            print(res)
            while(res!!.next()){
                print("${res.getInt("accno")}\t")
                print("${res.getFloat("accbalance")}\t")
                print("${res.getString("acctype")}\t")
            }

        } catch(e:SQLException){
            print(e)
        } finally{
            if(res!=null){
                try{
                    res.close()
                } catch(e:SQLException){
                    print(e)
                }
            }
        }
    }
}

fun main (){
    var jdbcobj = Jdbc();
    jdbcobj.createConnection();
//    jdbcobj.executeQueryOfDatabase();
//    jdbcobj.selectQuery();
//    jdbcobj.createTable();
//    jdbcobj.createTableUsingStatement();
//    jdbcobj.insertIntoTable();
//    jdbcobj.updateTable();
//    jdbcobj.deleteData();
//    jdbcobj.dropTable();
//    jdbcobj.truncateTable();


    loop@ while(true){
        println("1: Create table \n 2: Insert Values \n 3: Search  \n 4: Exit")
        var choice:Int= readln()!!.toInt();

        when(choice){
            1-> jdbcobj.createTable();
            2-> jdbcobj.insertIntoTable();
            3-> jdbcobj.selectQuery();
            4-> break@loop
        }
    }




}