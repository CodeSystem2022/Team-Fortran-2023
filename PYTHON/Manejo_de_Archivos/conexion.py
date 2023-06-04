import psycopg2 as db
from logger_base import log
import sys 

class Conexion:
    _DATABASE = 'test_db'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion = db.connect(host=cls._HOST,
                                           user=cls._USER,
                                           password=cls._PASSWORD,
                                           port=cls._DB_PORT,
                                           database=cls._DADABASE)
                log.debug(f'Conecion exitosa: {cls._conexion}')
                return cls._conexion
            except Exception as e:
                log.error(f'Ocurrio un error {e}')
                sys.exit()
            else:
                return cls._conexion