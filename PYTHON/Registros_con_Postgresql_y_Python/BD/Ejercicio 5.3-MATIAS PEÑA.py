import psycopg2


conexion = psycopg2.connect(user='postgres',password='Admin',host='127.0.0.1',port='5432',database='Test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
              sentencia = 'SELECT * FROM persona WHERE id_persona IN (1,2)' # Placeholder
              id_persona = input('Digite un numero para el id_persona: ')
              cursor.execute(sentencia,(id_persona,)) # De esta manera ejecutamos la sentencia
              registros = cursor.fetchall() # recupera todos los registros
              for registro in registros:

              print(registro)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()
