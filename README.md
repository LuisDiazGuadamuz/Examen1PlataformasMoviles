# Simulador de Modificación de Carros 4x4 para Autocross

Proyecto Java que simula la modificación de carros 4x4 para competencias de autocross, implementando conceptos avanzados de Programación Orientada a Objetos.

## 🎯 Características del Proyecto

- **Clase Abstracta**: `Carro` con método abstracto `tipoCarroOffRoad()`
- **Herencia**: Subclases `CarroGasolina` y `CarroDiesel`
- **Interfaces**: `Motor`, `RelacionesDiferenciales`, `Suspension`
- **Polimorfismo**: Ensamblaje dinámico de componentes
- **Inyección de Dependencias**: Componentes pasados por constructor
- **Composición**: `Carro` contiene componentes como atributos

## 🚗 Componentes Disponibles

### Motores
- Gasolina 5000cc
- Gasolina 6000cc
- Diesel 5000cc
- Diesel 6000cc

### Relaciones Diferenciales
- 4.7
- 4.9

### Suspensiones
- ARB 2.5 pulgadas
- TJM 3.5 pulgadas

## 📊 Combinaciones Generadas

El programa genera automáticamente **16 combinaciones posibles**:
- 4 motores × 2 relaciones × 2 suspensiones = 16 carros

## 🏗️ Estructura del Proyecto

```
src/
├── interfaces/
│   ├── Motor.java
│   ├── RelacionesDiferenciales.java
│   └── Suspension.java
├── modelos/
│   ├── Carro.java (abstract)
│   ├── CarroGasolina.java
│   └── CarroDiesel.java
├── implementaciones/
│   ├── MotorGasolina5000.java
│   ├── MotorGasolina6000.java
│   ├── MotorDiesel5000.java
│   ├── MotorDiesel6000.java
│   ├── Relacion47.java
│   ├── Relacion49.java
│   ├── SuspensionARB25.java
│   └── SuspensionTJM35.java
└── main/
    └── EnsambladorCarros.java
```

## 🚀 Cómo Ejecutar

### Requisitos
- Java JDK 8 o superior
- Visual Studio Code (opcional, pero recomendado)

### Ejecución desde Terminal
```bash
# Compilar
javac -d bin src/interfaces/*.java src/modelos/*.java src/implementaciones/*.java src/main/EnsambladorCarros.java

# Ejecutar
java -cp bin main.EnsambladorCarros
```

### Ejecución desde VS Code
1. Abrir la carpeta del proyecto en VS Code
2. Ejecutar `Terminal > Run Build Task` para compilar
3. Usar `Run > Start Debugging` con configuración `Launch EnsambladorCarros`

## 📝 Conceptos POO Aplicados

- **Composición**: La clase `Carro` contiene componentes como atributos
- **Inyección de Dependencias**: Componentes se pasan por constructor
- **Polimorfismo**: Referencias `Carro` para objetos de subclases
- **Sobrescritura**: Métodos `tipoCarroOffRoad()` en subclases
- **Abstracción**: Interfaces y clase abstracta
- **Encapsulamiento**: Atributos `protected final`

## 🎯 Salida del Programa

El programa muestra:
1. Mensajes de creación de cada carro ("Carro de Gasolina"/"Carro de Diesel")
2. Todas las combinaciones con sus componentes específicos
3. Cada combinación incluye tipo de carro y descripción de componentes

## 📄 Licencia

Este proyecto es parte del curso de Plataformas Móviles.