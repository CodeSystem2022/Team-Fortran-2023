import psycopg2



conexion = psycopg2.connect(user='postgres',password='Admin',host='127.0.0.1',port='5432',database='Test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
              sentencia = 'SELECT * FROM persona WHERE id_persona IN %s ' #place holder
              entrada = input('Digite los_persona a buscar (separados por coma):')
              llaves_primarias = (tuple(entrada.split(',')),)

              cursor.execute(sentencia,(llaves_primarias,)) # se ejecuta la sentencia
              registros = cursor.fetchall() # recupera todos los registros
              print(registros)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()