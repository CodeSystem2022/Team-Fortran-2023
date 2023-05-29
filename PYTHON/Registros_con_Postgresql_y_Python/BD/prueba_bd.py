import psycopg2


conexion = psycopg2.connect(user='postgres',password='Admin',host='127.0.0.1',port='5432',database='Test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
              sentencia = 'SELECT * FROM persona WHERE id_persona = %s' #place holder
              id_persona = input('Digite un numero para el id persona: ')
              cursor.execute(sentencia,(id_persona,)) # se ejecuta la sentencia
              registros = cursor.fetchone() # recupera todos los registros
              print(registros)
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()