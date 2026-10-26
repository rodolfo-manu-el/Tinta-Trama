# 🖋️ Tinta & Trama

<p align="center">
  <strong>Atelier literario, estudio editorial y arquitectura de trama para autores.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android%208.0%2B%20(API%2026%2B)-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android Platform" />
  <img src="https://img.shields.io/badge/Language-Kotlin%202.0%2B-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin" />
  <img src="https://img.shields.io/badge/UI-Jetpack%20Compose%20%2B%20M3-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white" alt="Jetpack Compose" />
  <img src="https://img.shields.io/badge/Database-Room%20(SQLite)-FFA000?style=for-the-badge&logo=sqlite&logoColor=white" alt="Room DB" />
  <img src="https://img.shields.io/badge/CI%2FCD-GitHub%20Actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white" alt="CI/CD" />
  <img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge" alt="License" />
</p>

---

## 📖 Acerca del Proyecto

**Tinta & Trama** es una aplicación Android nativa diseñada específicamente para novelistas, dramaturgos, guionistas y narradores que buscan un entorno de creación literaria estructurado, liberador y visualmente cómodo.

A diferencia de editores de notas convencionales, Tinta & Trama integra el flujo creativo completo de un autor: desde la concepción de la obra, la arquitectura por actos y capítulos, el modelado del reparto y la referencia editorial, hasta la lectura crítica del manuscrito en un formato inmersivo.

---

# Tinta Trama

## Capturas de pantalla

<div align="center">
  <img width="220" alt="personajes" src="https://github.com/user-attachments/assets/8bdf0b61-5905-4123-83fe-0be4496aaa94" />
  <img width="220" alt="editor" src="https://github.com/user-attachments/assets/879a68a0-4155-46ca-a996-660755fa6ab4" />
  <img width="220" alt="biblioteca" src="https://github.com/user-attachments/assets/f37c2c7d-7d07-416b-bd8a-3d44a9f60a56" />
</div>

<p align="center">
  <em>Biblioteca Editorial · Editor Inmersivo · Reparto de Personajes · Lector 3D Flip-Book</em>
</p>

---

## ✨ Características Principales

### 📚 1. Biblioteca Editorial Multimanuscrito
- **Gestión integral de obras:** Creación y seguimiento de múltiples manuscritos con metas globales de palabras y porcentajes de finalización calculados en tiempo real.
- **Portadas personalizadas en formato editorial (2:3):** Selector de portadas desde la galería del dispositivo mediante Android Photo Picker (cero permisos intrusivos) o portadas temáticas integradas.
- **Filtros y vistas adaptativas:** Alternancia fluida entre vista de cuadrícula y lista detallada, con filtrado por estado (en curso, revisión, completado, archivado).
- **Importación y respaldo:** Carga de documentos de texto y respaldos locales.

### ✍️ 2. Atelier de Escritura & Modo Inmersivo
- **Entorno sin distracciones:** Área de redacción con tipografías literarias embebidas (*Newsreader* serifada clásica y *Plus Jakarta Sans* moderna).
- **Barra de formato y atajos:** Inserción ágil de encabezados, negrita, cursiva, diálogos con raya editorial (`—`) y citas.
- **Tonos de papel personalizables:** Cuatro atmósferas de contraste visual diseñadas para cuidar la vista: *Papiro cálido*, *Crema editorial*, *Blanco puro* y *Noche profunda*.
- **Contador en vivo:** Métrica inmediata de palabras, caracteres y tiempo estimado de lectura.

### 📖 3. Modo Lectura Flip-Book 3D Realista
- **Experiencia de lectura física:** Transición tridimensional auténtica inspirada en libros reales: la hoja activa pivota sobre el lomo encuadernado.
- **Lectura completa sin cortes:** Encabezados y foliado editorial fijos, con desplazamiento vertical continuo en cada página para no perder ni una sola línea de texto.
- **Ajustes de lectura:** Control rápido de tamaño de tipografía (A±) y tono de papel en pantalla completa.

### ⏱️ 4. Temporizador Zen & Sesiones de Escritura
- **Cronómetro de enfoque:** Sesiones cronometradas de redacción (Sprint literario / Técnica Pomodoro) para incentivar la constancia diaria.
- **Feedback acústico Zen:** Alarma suave generada mediante `ToneGenerator` que notifica la finalización de la sesión de escritura sin necesidad de archivos de audio externos pesados.

### 👥 5. Dramatis Personae & Red de Vínculos
- **Fichas profundas de personajes:** Registro de roles narrativos (Protagonista, Antagonista, Secundario), arquetipos, objetivos, debilidades, notas biográficas y avatar personalizado.
- **Matriz de relaciones:** Registro de vínculos interpersonales (alianzas, rivalidades, lazos familiares o secretos) para mantener la coherencia dramática en tramas corales.

### 🏛️ 6. Guía de Estilo & Plantillas Literarias Integradas
- **Consejos y metodologías maestras:** Biblioteca de consulta con estructuras narrativas clásicas y contemporáneas:
  - *El Monomito (El Viaje del Héroe de Campbell/Vogler)*.
  - *Estructura en Tres Actos y Puntos de Giro*.
  - *Arcos de Transformación de Personaje*.
  - *Regulación del Ritmo y Tensión Dramática*.
- **Inserción directa:** Posibilidad de volcar la plantilla de escaleta directamente en el editor para comenzar a escribir sin bloqueo de página en blanco.

---

## 🛠️ Stack Tecnológico & Arquitectura

El proyecto está construido siguiendo los estándares modernos de **Android Jetpack** y **Clean Architecture**:

| Componente | Tecnología | Propósito |
| :--- | :--- | :--- |
| **Lenguaje** | [Kotlin 2.0+](https://kotlinlang.org/) | Código conciso, seguro ante nulos y moderno |
| **Interfaz de Usuario** | [Jetpack Compose](https://developer.android.com/jetpack/compose) | UI declarativa con Material Design 3 (M3) |
| **Base de Datos** | [Room Database](https://developer.android.com/training/data-storage/room) | Persistencia local SQLite offline-first reactiva |
| **Concurrencia** | [Kotlin Coroutines & Flow](https://kotlinlang.org/docs/coroutines-overview.html) | Operaciones asíncronas y flujo de datos reactivo |
| **Gestión de Estado** | [Jetpack ViewModel & StateFlow](https://developer.android.com/topic/libraries/architecture/viewmodel) | Arquitectura MVVM con flujo unidireccional (UDF) |
| **Carga de Imágenes** | [Coil Compose](https://coil-kt.github.io/coil/) | Carga asíncrona de portadas y avatares locales |
| **Gestión de Dependencias** | [Gradle Version Catalog](https://docs.gradle.org/current/userguide/platforms.html) (`libs.versions.toml`) | Control centralizado y seguro de dependencias |
| **Pruebas** | [JUnit 4](https://junit.org/) & [Robolectric](https://robolectric.org/) | Pruebas unitarias de ViewModel y lógica en JVM |

---

## 📂 Estructura del Código Fuente

```text
app/src/main/
├── java/com/example/
│   ├── data/
│   │   ├── dao/                 # Data Access Objects (NovelDao, ChapterDao, CharacterDao, RelationshipDao)
│   │   ├── model/               # Entidades Room (Novel, Chapter, Character, Relationship, WritingSession)
│   │   ├── TintaDatabase.kt     # Definición de Room Database y callbacks de pre-poblado
│   │   └── TintaRepository.kt   # Repositorio unificado que orquesta la persistencia
│   ├── ui/
│   │   ├── components/          # Componentes reusables (modales, selector de fuentes, botones)
│   │   ├── screens/
│   │   │   ├── BibliotecaScreen.kt   # Vista de estantería de obras, filtros y acciones
│   │   │   ├── ObraScreen.kt         # Gestión de trama, actos y sinopsis
│   │   │   ├── EscribirScreen.kt     # Editor enriquecido y Lector Flip-Book 3D
│   │   │   ├── PersonajesScreen.kt   # Fichas de reparto y mapa de vínculos
│   │   │   └── GuiaEstiloScreen.kt   # Guía de estilo y plantillas literarias
│   │   ├── theme/               # ColorScheme M3, Tipografías, Formas y Paleta Editorial
│   │   └── TintaViewModel.kt    # ViewModel central que expone StateFlow y casos de uso
│   └── MainActivity.kt          # Actividad principal con navegación Compose y Edge-to-Edge
├── assets/                      # Manuscritos y plantillas iniciales (summer_love.json)
└── res/
    ├── drawable/                # Portadas de arte vectorial, fondos e iconos adaptativos
    ├── font/                    # Fuentes TTF locales (Newsreader y Plus Jakarta Sans)
    └── values/                  # Strings, colores y estilos del sistema
```

---

## 🚀 Requisitos de Compilación y Ejecución

Para clonar y compilar este proyecto localmente:

1. **Android Studio:** Versión *Ladybug (2024.2+)* o superior.
2. **Java Development Kit:** JDK 17 o superior.
3. **Android SDK:**
   - `compileSdk`: 35
   - `targetSdk`: 34
   - `minSdk`: 26 (Android 8.0 Oreo)

### Instrucciones paso a paso

```bash
# 1. Clonar el repositorio
git clone https://github.com/tu-usuario/tinta-y-trama.git

# 2. Entrar al directorio
cd tinta-y-trama

# 3. Compilar la aplicación en modo Debug
# En Linux / macOS:
./gradlew assembleDebug
# En Windows (PowerShell / CMD):
gradlew.bat assembleDebug

# 4. Ejecutar la suite de pruebas unitarias
# En Linux / macOS:
./gradlew testDebugUnitTest
# En Windows:
gradlew.bat testDebugUnitTest
```

---

## 🧪 Calidad de Código y Pruebas

El repositorio incluye pruebas unitarias automatizadas que validan los flujos críticos de la aplicación:
- **Gestión de obras y estado de lectura** (`toggleNovelRead`).
- **Navegación y selección de capítulos activos**.
- **Cálculo de metas y progreso de palabras**.
- **Ejecución rápida:**
  ```bash
  ./gradlew testDebugUnitTest
  ```

---

## 📚 Documentación del Repositorio

Para facilitar la colaboración y el mantenimiento a largo plazo:
- 📋 [**Registro de Cambios (CHANGELOG.md)**](./CHANGELOG.md): Historial de versiones y mejoras.
- 🤝 [**Guía de Contribución (CONTRIBUTING.md)**](./CONTRIBUTING.md): Normas de commits, ramas y Pull Requests.
- 📜 [**Código de Conducta (CODE_OF_CONDUCT.md)**](./CODE_OF_CONDUCT.md): Estándares de convivencia de la comunidad.
- 🗺️ [**Hoja de Ruta (ROADMAP.md)**](./ROADMAP.md): Próximas funcionalidades planificadas.

---

## 🔒 Privacidad & Filosofía Offline-First

- **100% Privado:** Todas tus historias, personajes y notas se almacenan exclusivamente en la base de datos local SQLite de tu dispositivo.
- **Sin cuentas obligatorias:** No requiere registro, inicios de sesión de terceros ni recopilación de datos de telemetría.
- **Zero Storage Permissions:** Utiliza el Android Photo Picker oficial del sistema, sin solicitar permisos invasivos de almacenamiento del dispositivo (`READ_EXTERNAL_STORAGE`).

---

## 📄 Licencia

Este proyecto está bajo la Licencia [MIT](./LICENSE). Eres libre de usarlo, modificarlo y distribuirlo con atribución.

---

<p align="center">
  Hecho con 🖋️ y pasión literaria para autores independientes.
</p>
