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
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' #Placeholder
            id_persona = input('Digite un numero para el id_persona: ')
            cursor.execute(sentencia, (id_persona,)) #ejecucion de la sentencia
            registros = cursor.fetchone() #recuperacion registros
            print(registros)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()

# https://www.psycopg.org/docs/usage.html

