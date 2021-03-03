import groovy.sql.Sql

def db = [url:'jdbc:postgresql://localhost/emp', user:'me', password:'password', driver:'org.postgresql.Driver']
def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

println 'Table: employee, Database: emp'
sql.eachRow('select * from employee') { row ->
    println " $row.id ${row.name.padRight(10)} ($row.date_of_birth)"
}
