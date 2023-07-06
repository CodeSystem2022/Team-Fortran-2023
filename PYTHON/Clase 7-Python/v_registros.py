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
            sentencia = 'SELECT * FROM persona WHERE id_persona IN %s' #Placeholder
            entrada = input('Digite los id_persona a buscar(separados por coma): ')
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.execute(sentencia, llaves_primarias) #ejecucion de la sentencia
            registros = cursor.fetchall() #recuperamos todos los registros que seran una lista
            for registro in registros:
                print(registro)

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()