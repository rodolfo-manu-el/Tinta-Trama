# 🤝 Guía de Contribución (Contributing Guide)

¡Gracias por tu interés en contribuir a **Tinta & Trama**! Este proyecto es un atelier literario de código abierto y agradecemos aportes de la comunidad de desarrolladores y autores.

---

## 🛠️ Cómo Empezar

1. **Haz un Fork** del repositorio en GitHub.
2. **Clona tu fork** localmente:
   ```bash
   git clone https://github.com/tu-usuario/tinta-y-trama.git
   cd tinta-y-trama
   ```
3. **Crea una rama (branch)** para tu funcionalidad o corrección:
   ```bash
   git checkout -b feature/nombre-de-la-funcionalidad
   # o
   git checkout -b fix/descripcion-del-bug
   ```

---

## 📜 Estándares de Código

- **Lenguaje:** Kotlin 2.0+ con sintaxis idiomática.
- **UI:** Jetpack Compose con componentes de Material 3 (`androidx.compose.material3`).
- **Arquitectura:** MVVM con Flujo de Datos Unidireccional (UDF). La lógica de negocio reside en `ViewModel` y `Repository`, nunca dentro de los `@Composable`.
- **Persistencia:** Cualquier cambio en entidades de Room debe contemplar migraciones o actualización del esquema de base de datos (`TintaDatabase`).
- **Pruebas:** Toda nueva funcionalidad de datos o lógica de negocio debe incluir su respectiva prueba unitaria en `app/src/test/`.

---

## 💬 Convención de Commits

Seguimos la convención de [Conventional Commits](https://www.conventionalcommits.org/es/v1.0.0/):

- `feat:` Nueva funcionalidad para el usuario.
- `fix:` Corrección de un error o bug.
- `refactor:` Cambios en el código que no corrigen errores ni añaden funcionalidades.
- `docs:` Cambios o adiciones en la documentación (`README`, `CHANGELOG`, etc.).
- `test:` Adición o corrección de pruebas automatizadas.
- `style:` Ajustes visuales, formateo de código o espaciados sin impacto lógico.

---

## 🚀 Flujo para Pull Requests (PR)

1. Asegúrate de que el proyecto compila y todas las pruebas unitarias pasan antes de enviar el PR:
   ```bash
   ./gradlew testDebugUnitTest
   ./gradlew assembleDebug
   ```
2. Haz `push` de tu rama a GitHub.
3. Abre un **Pull Request** detallando el problema resuelto o la mejora introducida. Utiliza la plantilla de PR disponible.
4. Mantén una conversación constructiva durante la revisión de código.
