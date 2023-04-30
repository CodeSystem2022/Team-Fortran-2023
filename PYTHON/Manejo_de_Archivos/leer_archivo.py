
archivo = open('prueba.txt', 'r', encoding='utf8') # las letras son: 'r' read, 'a' append, 'w' write, 'x'
# print(archivo.read())
# print(archivo.read(15))
# print(archivo.read(5)) #continua desde la linea anterior
#print(archivo.readline())
#print(archivo.readline())

#vamos a iterar el archivo, cada una de las lineas

#for linea in archivo:
    #print(linea): iteramos todos los elementos del archivo
    #print(archivo.readline()):accedemos al archivo como si fuera una linea
#print(archivo.readline()[3]) #aacedemos al archivocomo si fuera una lista

# Anexamos informacion, copiamos a otro

archivo2 = open('copia.txt','a',encoding='utf8')
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo2.close()
print('Se ha terminado el proceso de leer y copiar archivo\n')



