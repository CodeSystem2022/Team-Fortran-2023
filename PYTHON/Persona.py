from logger_base import log

class Persona:
    def __init__(self, id_persona=None, nombre=None, apellido=None, email=None):
        self._id_persona = id_persona
        self.nombre = nombre
        self.apellido = apellido
        self.email = email
    def __str__(self):
        return f"""
       Id Persona: {self._id_persona}, 
       Nombre: {self.nombre}, 
       Apellido: {self.apellido}, 
       Email: {self.email} 
"""
# Metodos Getters and Setters
@property
def id_persona(self):
    return self._id_persona
@id_persona.setter
def id_persona (self, id_persona):
    self._id_persona = id_persona


@property
def nombre(self):
    return self.nombre
@nombre.setter
def nombre (self, nombre):
    self.nombre = nombre

@property
def apellido(self):
    return self.apellido
@apellido.setter
def apellido (self, apellido):
    self.apellido = apellido

@property
def email(self):
    return self.email
@email.setter
def email (self, email):
    self.email = email

if __name__ == '__main__':
    persona1 = Persona(1, 'Juan', 'Perez', 'jperez@gmail.com')
    log.debug(persona1)
    persona2 = Persona(nombre='Jose', apellido='Lepez', email='ljose@gmail.com')
    log.debug(persona2)
    persona1 = Persona(id_persona = 1)
    log.debug(persona1)
