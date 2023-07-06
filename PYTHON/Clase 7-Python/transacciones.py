import psycopg2 as bd

conexion = bd.connect(
    user = 'postgres',
    password = '1004',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_bd'
)
print(conexion)

try:
    #conexion.autocommit = False //no deberia estar
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() #commit manual
    print('Termina la transaccion')

except Exception as e:
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()

# https://www.psycopg.org/docs/usage.html