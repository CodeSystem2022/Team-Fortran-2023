from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primero numero: '))
    b = int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Son iguales')
    resultado = a / b          #modificamos                             # capturamos la division con la excepcion
except TypeError as e:
    print(f'TypeError - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error: {type(e)}')
except Exception as e:                                                  # excepcion la renombramos con la variable e, para luego ser lllamada
    print(f'Exception - Ocurrió un error: {type(e)}')                   # capturamos un error, Expcion clase padre de division by zero\
else:
    print('No se arrojo ninguna excepcion')  # es opcional se ejecuta cuando no hay excepciones
finally:
    print('Ejecucion de este bloque finally')  # siempre se va a ejecutar

print(f'El resultado es: {resultado}')
print('seguimos...')
