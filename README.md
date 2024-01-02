# Cemexport
## Backend
Para la realización del backend se usó java, spring boot, maven, arquitectura hexagonal y la base de datos postgres. El rest api está compuesto por un crud básico que permite: obtener todos los usuarios (metodo GET), obtener un usuario por id (metodo GET y se envia /{id}), guardar usuario (metodo POST), actualizar usuario (metodo PUT), eliminar usuario (metodo DELETE). El principal proyecto del backend es accounds, el commons es una librería que tiene código genérico y se puede usar en otros proyectos ya que está pensado en eso.


####  Data Used

- Json Body
    ```json

        {
	        "status": "OK",
            "message": "El proceso terminó con éxito",
            "className": "accountService",
            "result": [
                {
                    "id": "159b8950-b220-46dd-9080-c62d6df10613",
                    "firstName": "Luis",
                    "lastName": "Perez",
                    "phoneNumber": "0992526678",
                    "photoPath": ""
                },
                {
                    "id": "87fb404f-10e7-4cc1-bd72-cd6d24d1b413",
                    "firstName": "Gustavo",
                    "lastName": "Londa",
                    "phoneNumber": "0992323706",
                    "photoPath": ""
                }
            ],
            "module": "AccountModule"

        }

    ```
    

## Apicacion movil
Para el desarrollo de la aplicacion se uso la arquitetura MVVM. Tambien se uso las herramientas retrofit, gradle, ngrok y el lenguaje de programcion java. 
El proyecto se encuentra en la carpeta ComexportApp
<code><br><br><br></code>
<code><p align="center"><img height="600" src="https://github.com/gustavolonda/comexport/blob/main/image/app_examp.PNG" title="app" style="display: block;margin-left: auto;margin-right: auto;"></p></code>