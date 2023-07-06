import psycopg2

conexion = psycopg2.connect(
    user = 'postgres',
    password = '1004',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_bd'
)
print(conexion)

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUE (%s, %s,%s)'
            valores = ('Carlos', 'Lara', 'clara@mail.com') #tupla
            cursor.execute(sentencia, valores) #ejecucion de la sentencia
            # conexion.commit()guarda cambios en la DB
            registros_insertados = cursor.rowcount
            print(f'Los registros insertados son: {registros_insertados}')

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()