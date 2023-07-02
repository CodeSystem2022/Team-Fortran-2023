import psycopg2 as bd

# Esto es para poder conectarnos a Postgres

conexion = bd.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
    conexion.autocommit = False
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mersparza@gmail.com')
    cursor.execute(sentencia, valores)
    conexion.commit()  # Guardar los cambios en la base de datos
    print('Termina la transacción')

except Exception as e:
    print(f'Ocurrió un error: {e}')
    conexion.rollback()  # Revertir los cambios en caso de error

finally:
    if conexion is not None:
        cursor.close()
        conexion.close()

