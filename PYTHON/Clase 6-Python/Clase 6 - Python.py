import psycopg2
# Esto es para poder conectarnos a Postgres

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s'
            id_persona = input('Digite un numero para el id_persona: ')
            cursor.execute(sentencia, (id_persona,))
            # De esta manera ejecutamos la sentencia
            registros = cursor.fetchone()
            # Recuperamos todos los registros que de una lista
            print(registros)

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
# https://www.psycopg2.org/docs/usage.html

