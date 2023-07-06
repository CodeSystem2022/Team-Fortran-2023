from psycopg2 import pool
from logger_base import log
import sys

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _BD_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPoll().getconn()
        log.debug(f'Conexion obtenienda del pool: {conexion}')
        return conexion

    @classmethod
    def obtenerCursor(cls):
        pass
    @classmethod
    def obtenerPoll(cls):
        if cls._pool is None:
            try:
                cls._pool =pool.SimpleConnectionPool(cls._MIN_CON,cls._MAX_CON,
                                                     host=cls._HOST,
                                                     user=cls._USERNAME,
                                                     password=cls._PASSWORD,
                                                     port=cls._BD_PORT,
                                                     database=cls._DATABASE)
                log.debug(f'creacion del poll exitosa:{cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f"Ocurrio un error al obtner el poll: {e}")
                sys.exit()
            else:
                return cls._pool
    @classmethod
    def liberarConexion(cls.conexion):
         cls.obtenerPoll().putconn(conexion)
         log.debug(f'Regresamos la conexion del pool:{conexion}')

    @classmethod
    def cerrarConexion(cls):
        cls.obtenerPoll().closeall()
if __name__ == ' __main__ ':
     conexion1 = Conexion.obtenerConexion()
     conexion.liberarConexion(conexion)
     #conexion2= Conexion.obtenerConexion()
     #conexion3 = Conexion.obtenerConexion()
     #conexion4 = Conexion.obtenerConexion()
     #conexion5 = Conexion.obtenerConexion()