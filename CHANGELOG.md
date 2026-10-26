# 📋 Registro de Cambios (Changelog) - Tinta & Trama

Todos los cambios notables en este proyecto serán documentados en este archivo.
El formato se basa en [Keep a Changelog](https://keepachangelog.com/es-ES/1.1.0/),
y este proyecto se adhiere a [Semantic Versioning](https://semver.org/lang/es/).

---

## [1.2.8] - 2026-10-26

### ✨ Añadido
- **Modo Lectura Flip-Book 3D:** Renderizado tridimensional de vuelta de página anclado al lomo del libro (`TransformOrigin(0f, 0.5f)`), con oclusión y sombras dinámicas de curvatura.
- **Desplazamiento Vertical Continuo:** Contenedor con `verticalScroll` desacoplado de encabezados fijos en el modo pantalla completa para lectura sin cortes.
- **Guía de Estilo y Escritura:** Módulo literario pedagógico con plantillas de Monomito (El Viaje del Héroe), Estructura en 3 Actos, Arcos de Personaje y Ritmo Narrativo.
- **Temporizador Zen con Alarma Sonora:** Alerta acústica generada mediante `ToneGenerator` al finalizar sesiones de concentración de escritura.
- **Documentación de Repositorio:** `CHANGELOG.md`, `CONTRIBUTING.md`, `CODE_OF_CONDUCT.md` y plantillas de Issues/PR para GitHub.

### 🎨 Mejorado
- **Armonización de Botones:** Unificación de alturas a 34 dp en tarjetas de cuadrícula y 36 dp en lista detallada con `contentPadding` proporcional para evitar cortes en teléfonos compactos.
- **Paginación Adaptativa:** Ajuste del umbral automático a ~190 palabras por carilla para visualización editorial óptima en dispositivos móviles.
- **Tipografía y Legibilidad:** Integración local de fuentes *Newsreader* y *Plus Jakarta Sans* sin dependencias de red en ejecución.

### 🐛 Corregido
- Eliminado indicador desalineado "En progreso" que provocaba saltos de línea antiestéticos en el encabezado de la Biblioteca.
- Resuelto problema de truncamiento de texto en el lector de pantalla completa causado por constraints `weight(1f)` dentro de columnas desplazables.

---

## [1.2.0] - 2026-10-24

### ✨ Añadido
- **Dramatis Personae & Red de Vínculos:** Fichas de personajes con roles narrativos, alineaciones, psicología y matriz de relaciones.
- **Selector de Portadas con Android Photo Picker:** Carga de imágenes locales seguras sin solicitar permisos intrusivos de almacenamiento (`READ_EXTERNAL_STORAGE`).
- **Alternancia de Vistas en Biblioteca:** Modo cuadrícula editorial y modo lista detallada con progreso de capítulos y recuento de palabras.

---

## [1.1.0] - 2026-10-20

### ✨ Añadido
- **Editor Inmersivo:** Atajos rápidos de formato Markdown (negrita, cursiva, diálogos con raya editorial `—`, encabezados y citas).
- **Paleta de Tonos de Papel:** Soporte para Papiro cálido, Crema editorial, Blanco puro y Noche profunda.
- **Persistencia Reactiva Room:** Esquema relacional para obras, capítulos y personajes con Kotlin Coroutines y Flow.

---

## [1.0.0] - 2026-10-15

### 🚀 Lanzamiento Inicial
- Estructura base de arquitectura MVVM con Jetpack Compose y Material Design 3.
- Biblioteca inicial de manuscritos y organizador de trama por capítulos.
- Integración de SQLite local mediante Room Database.
