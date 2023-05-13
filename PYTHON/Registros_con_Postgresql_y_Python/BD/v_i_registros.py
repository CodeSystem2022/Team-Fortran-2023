import psycopg2  # Esto es para poder conectarnos a base de datos Postgre (Se abrio y se cerro)

conexion = psycopg2.connect(user='postgres', password='us00', host='127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)'  # PLACEHOLDER
            valores = (
                ('Carlos', 'Lara', 'clara@mail.com'),
                ('Marcos', 'Canto', 'mcanto@mail.com'),
                ('Marcelo', 'Cuenca', 'cuencaM@mail.com')
            )  # Es una tupla de tuplas
            cursor.executemany(sentencia, valores)                 # De esta manera ejecutamos la sentencia
            # conexion.commit() esto se utiliza para guardar los cambios en la base de datos (en este caso no, porque utilizamos "with")
            registros_insertados = cursor.rowcount                     # Recuperamos todos los registros que serán una lista
            print(f'Los registros insertados son: {registros_insertados}')


except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()