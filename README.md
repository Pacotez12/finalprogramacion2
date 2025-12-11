# Sistema de Reporte de Problemas en la Ciudad

## Descripción
Aplicación Android (Kotlin) con arquitectura MVVM, Room (Base de datos local) y Retrofit (Sincronización API).

## Características
- **Arquitectura**: MVVM con Repositorio.
- **Base de Datos**: Room con tabla de Reportes y Logs.
- **Red**: Retrofit para enviar reportes a servidor Mock.
- **Cámara**: Uso de ActivityResultContracts.

## Ejecución
1. Abrir en Android Studio.
2. Sincronizar Gradle.
3. Ejecutar en Emulador/Dispositivo.

## Documentación de imágenes
![Main Activity](images/Imagen%201.jpg) | ![Creación de reportes](images/Imagen%202.jpg) |

### Vistas Secundarias

* **Vista 3:** Añadir imagenes de prueba y explicación del reporte
  ![Vista 3](images/Imagen%203.jpg)

* **Vista 4:** Vuelta al MainActivity donde se ve reflejado el nuevo reporte
  ![Vista 4](images/Imagen%204.jpg)

* **Vista 5:** Proceso de sincronización para envio de datos a la API (en este caso WebHook)
  ![Vista 5](images/Imagen%205.jpg)

* **Vista 6:** Sincronización Exitosa
  ![Vista 6](images/Imagen%206.jpg)

* **Vista 7:** Registro de Logs
  ![Vista 7](images/Imagen%207.jpg)

* **Vista 8 (PNG):** Datos en el WebHook
  ![Vista 8](images/Imagen%208.png)
