# App pago prompt mobile

### 🚀 Pasos para ejecutar la aplicación

### Prerequisitos
* Java. (openJDK 21.0.2)
* 26 API Android emulador como minimo.

### Android Studio
1. Abrir AS.
2. Abrir el proyecto *pago-prompt-mobile*.
3. Seleccionar la vista de Andrid en el explorador del proyecto.
4. Ejecutar el emulador de su preferencia con un versión mayor de 26 API.
5. Ejecutar la aplicación en el emulador.


# 📱 Flujos de la aplicación

* ## Aplazar alarma (@EneiderVelandia)
  
  | Paso | 1 | 2 | 3 |
  | :--: | :--: | :--: | :--: |
  | Activity | activity_main.xml | activity_list.xml | activity_postpone.xml |
  | Descripción | Ingresar a la aplicación. Se ingresa con usuario y contreseña. | Visualizar los servicios disponibles de pago y seleccionar _POSPONER_. | Realizar reconocimiento facial para aplazar alarma. |
  | View | <img width="230" alt="image" src="https://github.com/sneiderV/pago-prompt-mobile/assets/20799651/4d39efc4-fee4-4ad9-988d-0cf4ad5a7b2c"> | <img width="230" alt="image" src="https://github.com/sneiderV/pago-prompt-mobile/assets/20799651/e717f469-eaa1-44e2-8459-d81d23f1c0cf"> | <img width="230" alt="image" src="https://github.com/sneiderV/pago-prompt-mobile/assets/20799651/23c22bb7-d1ed-4840-8a87-d044b08beb93"> |


* ## Aplazar alarma (@FabianPayan)

  | Paso | 1 | 2 | 3 |
  | :--: | :--: | :--: | :--: |
  | Activity | activity_list.xml | activity_pay.xml | activity_redirect.xml |
  | Descripción | Desde la lista de los servicios disponibles de pago, seleccionar _PAGAR_. | Continuar con el redireccionamiento de a la paguina del comercio configurado. | Esperar a ser redireccionado al comercio del servicio configurado. |
  | View | <img width="230" alt="image" src="https://github.com/sneiderV/pago-prompt-mobile/assets/20799651/e717f469-eaa1-44e2-8459-d81d23f1c0cf"> | <img width="230" alt="image" src="https://github.com/sneiderV/pago-prompt-mobile/assets/20799651/a106d170-7e32-4ae2-bc34-216620b12e88"> | <img width="230" alt="image" src="https://github.com/sneiderV/pago-prompt-mobile/assets/20799651/38c8cf02-7fe5-4d99-be49-da19d5820791"> |

