from Dominio.pelicula import Pelicula
from Catalogo_pelicula import CatalogoPeliculas as cp


opcion = None
while opcion != 4:
    try:
        print("Opciones")
        print("1-Agregar Pelicula")
        print("2-Listar Peliculas")
        print("3-Eliminar catalogo Pelicula")
        print("4-Salir")

        opcion = int(input("Digite Una Opcion: "))
        if opcion == 1:
            nombre_pelicula = input("Digite una pelicula: ")
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_peliculas(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas

    except Exception as e:
        print(f"Error {e}")
        opcion = None
    else:
        print("Salimos del programa")