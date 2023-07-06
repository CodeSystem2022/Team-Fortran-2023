import psycopg2 as bd

# Esto es para poder conectarnos a Postgres

conexion = bd.connect(user='postgres', password='admin', host='localhost', port='8090', database='test_bd')
try:
    # conexion.autocommit = False #Esto no deberia estar
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mersparza@gmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit()  # Hacemos el commit manualmente
    print('Termina la transacción')

except Exception as e:
    conexion.rollback()  # Revertir los cambios en caso de error
    print(f'Ocurrió un error: {e}')


finally:
    if conexion is not None:
        cursor.close()
        conexion.close()

