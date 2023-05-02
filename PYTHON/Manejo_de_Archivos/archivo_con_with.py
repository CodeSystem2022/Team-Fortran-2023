from ManejoArchivos import ManejoArchivos

# MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra archivos
# with open('prueba.txt','r',encoding='utf8') as archivo:
# print(archivo.read())
# No hace falta el try, ni el finally
# en el contexto de whit lo que ejecuta de manera automatica
# utilizamos diferentes métodos: _enter_ este es que abre
# ahora el siguiente método es el que cierra: _exit_

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
