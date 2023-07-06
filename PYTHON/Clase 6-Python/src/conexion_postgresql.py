import psycopg2

try:
    connection=psycopg2.connect(
        host='localhost',
        user='postgres',
        password='Alumno2013',
        database='test_bd',
        port='8090',

    )
    cursor = connection.cursor()
    cursor.execute("SELECT version()")
    row = cursor.fetchone()
    print(row)
    print("Conexion exitosa")
except Exception as ex:
    print(ex)
