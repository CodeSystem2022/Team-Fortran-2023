class Persona:
    def __init__(self, id_persona, nombre, apellido, email, ):
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


