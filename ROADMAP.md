# 🗺️ Hoja de Ruta (Roadmap) - Tinta & Trama

Este documento define la hoja de ruta de desarrollo técnico y funcional para la evolución del proyecto **Tinta & Trama**.

---

## 🎯 Fase 1: Arquitectura y Experiencia Base (Completado)
- [x] **Persistencia Local Robusta:** Room Database con Entities, DAOs y Repositorio unificado reactivo con Kotlin Coroutines y Flow.
- [x] **Editor Inmersivo y Tipografías:** Soporte de negritas, cursivas, listas, citas y títulos con fuentes locales (*Newsreader* y *Plus Jakarta Sans*).
- [x] **Modo Lectura Flip-Book 3D:** Vista de lectura en pantalla completa con simulación tridimensional de paso de página física y sombras de curvatura.
- [x] **Cronómetro Zen & Sprint de Escritura:** Bloques de concentración con alerta sonora acústica integrada mediante `ToneGenerator`.
- [x] **Elenco & Dramatis Personae:** Registro de personajes, psicología, arquetipos y red de relaciones/vínculos interpersonales.
- [x] **Guía de Estilo y Plantillas Literarias:** Módulo pedagógico con el Monomito, Los 3 Actos, Arcos de Personaje y Ritmo Narrativo con volcado directo al editor.
- [x] **Pruebas Unitarias de Arquitectura:** Validación de CUJs y operaciones clave con JUnit y Robolectric.

---

## 🎯 Fase 2: Producción Editorial y Exportación Avanzada (En curso)
- [x] **Importación de Documentos y Respaldo:** Carga y lectura de textos locales.
- [ ] **Exportación Multiformato:** Generación y descarga directa en formatos **PDF editorial con maquetación**, **EPUB 3** y **Markdown (.md)** empaquetado.
- [ ] **Historial de Revisiones (Versionado de Capítulos):** Sistema de snapshots o ramas para guardar borradores anteriores y comparar cambios de escena.
- [ ] **Buscador Global con Regex:** Búsqueda y reemplazo de términos o nombres en todos los capítulos de la obra.

---

## 🎯 Fase 3: Worldbuilding & Visualización Conceptual (Mediano Plazo)
- [ ] **Matriz de Vínculos en Canvas Interactivo:** Visualización gráfica con nodos y líneas vectoriales para arrastrar personajes y ver la red de relaciones.
- [ ] **Líneas Temporales (Timelines):** Cronología interactiva de eventos clave de la trama organizados por fecha o época dentro de la historia.
- [ ] **Códice de Lore y Glosario:** Fichas para ubicaciones, facciones, magia, tecnología y artefactos literarios.

---

## 🎯 Fase 4: Modularización y Multiplataforma (Largo Plazo)
- [ ] **Sincronización Opcional en la Nube:** Copia de seguridad y sincronización cifrada mediante Firebase / Cloud Storage.
- [ ] **Layouts Adaptativos para Pantallas Grandes:** Optimización para tablets y plegables mediante Navigation Rail y paneles duales maestro-detalle.
- [ ] **Modularización por Features:** Separación del código en módulos Gradle independientes (`:feature:library`, `:feature:editor`, `:feature:characters`, `:core:database`).
