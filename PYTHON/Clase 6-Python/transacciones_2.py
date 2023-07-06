import psycopg2 as bd

# Esto es para poder conectarnos a Postgres

conexion = bd.connect(user='postgres', password='Alumno2013', host='localhost', port='8090', database='test_bd')
try:
    conexion.autocommit = False
    # Esto no deberia estar inicia la transaccion
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    valores = ('Jorge', 'Prol', 'jprol@gmail.com')
    cursor.execute(sentencia, valores)
    sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    valores = ('Juan', 'Juarez', 'jcjuarez@gmail.com', 1)
    cursor.execute(sentencia, valores)


    conexion.commit()
    # Hacemos el commit manualmente se cierra la transaccion
    print('Termina la transacción')

except Exception as e:
    print("Se hizo un rollback")
    conexion.rollback()  # Revertir los cambios en caso de error
    print(f'Ocurrió un error: {e}')


finally:
    if conexion is not None:
        cursor.close()
        conexion.close()
