package com.example.ui.screens

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.FolderZip
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.PictureAsPdf
import androidx.compose.material.icons.filled.PostAdd
import androidx.compose.material.icons.filled.Psychology
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.TheaterComedy
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.ui.TintaTab
import com.example.ui.TintaViewModel

/**
 * Modelo de datos para las plantillas maestras de consejos literarios y arquitectura de tramas.
 */
data class LiteraryTemplate(
    val id: String,
    val title: String,
    val subtitle: String,
    val category: String,
    val iconName: String,
    val tagColor: Color,
    val description: String,
    val keyStages: List<Pair<String, String>>,
    val promptQuestions: List<String>,
    val templateMarkdown: String
)

object LiteraryGuideData {
    val templates = listOf(
        LiteraryTemplate(
            id = "monomito",
            title = "El Monomito (Viaje del Héroe)",
            subtitle = "Estructura narrativa en 12 etapas universales",
            category = "Estructura",
            iconName = "auto_stories",
            tagColor = Color(0xFFF59E0B),
            description = "Estructura arquetípica analizada por Joseph Campbell y adaptada por Christopher Vogler. Conecta visceralmente con la psique humana al representar la muerte del ego y el renacimiento con propósito.",
            keyStages = listOf(
                "1. Mundo Ordinario" to "El héroe en su entorno cotidiano con una carencia interna no resuelta.",
                "2. Llamada a la Aventura" to "Un evento disruptivo que rompe el equilibrio y presenta un desafío vital.",
                "3. Rechazo de la Llamada" to "El miedo, la vacilación o las ataduras que le impiden dar el salto.",
                "4. Encuentro con el Mentor" to "Un guía sabio le proporciona entrenamiento, advertencia o un artefacto clave.",
                "5. Cruce del Primer Umbral" to "Punto de no retorno: entra de lleno en el Mundo Extraordinario.",
                "6. Pruebas, Aliados y Enemigos" to "Aprende las nuevas reglas, distingue traidores y forma su círculo de apoyo.",
                "7. Caverna Más Profunda" to "Preparación minuciosa para el corazón del conflicto central.",
                "8. La Ordalía Suprema" to "Muerte simbólica o literal; crisis máxima donde debe renunciar a su pasado.",
                "9. La Recompensa (Elixir)" to "Conquista del objeto sagrado, revelación o poder tras vencer la ordalía.",
                "10. El Camino de Vuelta" to "Urgencia o persecución frenética mientras escapa con el botín hacia su hogar.",
                "11. La Resurrección" to "Última prueba decisiva donde demuestra su verdadera transformación integral.",
                "12. Retorno con el Elixir" to "Vuelve transformado para sanar, inspirar o liderar a su comunidad."
            ),
            promptQuestions = listOf(
                "¿Cuál es la carencia interna del protagonista antes de iniciar el viaje?",
                "¿Qué umbral físico o moral separa el mundo ordinario del desconocido?",
                "¿A qué creencia arraigada debe renunciar en la Ordalía para vencer?"
            ),
            templateMarkdown = """## 🏛️ Esquema del Monomito (Viaje del Héroe)

### Acto I: La Salida
- [ ] **Mundo Ordinario:** (Describe la rutina y la herida del personaje)
- [ ] **Llamada a la Aventura:** (El detonante que cambia el juego)
- [ ] **Rechazo de la Llamada:** (¿Por qué vacila o intenta resistirse?)
- [ ] **Mentor / Guía:** (El consejo o amuleto que le da fuerza)
- [ ] **Cruce del Umbral:** (El momento exacto donde ya no hay vuelta atrás)

### Acto II: La Iniciación
- [ ] **Pruebas y Aliados:** (Obstáculos iniciales y formación del equipo)
- [ ] **Hacia la Caverna Profunda:** (Tensión en aumento antes del choque)
- [ ] **La Ordalía Suprema:** (El momento más oscuro; la muerte de su viejo yo)
- [ ] **La Recompensa:** (Lo que gana: verdad, poder o reliquia)

### Acto III: El Retorno
- [ ] **El Camino de Regreso:** (Consecuencias inmediatas del triunfo)
- [ ] **Resurrección Final:** (La prueba definitiva de fuego)
- [ ] **Retorno con el Elixir:** (Cómo sana su mundo con lo aprendido)
"""
        ),
        LiteraryTemplate(
            id = "arcos_personaje",
            title = "Arcos de Transformación de Personaje",
            subtitle = "La Mentira que cree vs. La Verdad que necesita",
            category = "Personajes",
            iconName = "psychology",
            tagColor = Color(0xFF38BDF8),
            description = "Un personaje memorable no cambia porque el argumento se lo exige, sino porque el dolor de mantener su vieja mentira se vuelve intolerable.",
            keyStages = listOf(
                "1. La Mentira Inicial" to "La creencia tóxica o falsa sobre sí mismo que usa como escudo protector.",
                "2. El Deseo (Externo)" to "Lo que el personaje cree que necesita para ser feliz (dinero, venganza, fama).",
                "3. La Necesidad (Interna)" to "La verdad espiritual o moral que realmente lo liberaría si la aceptase.",
                "4. El Momento Espejo" to "Mitad del relato: contempla quién es realmente y comprende que su vieja táctica falla.",
                "5. La Noche Oscura" to "Su peor miedo se cumple; todo parece perdido y debe elegir entre orgullo o verdad.",
                "6. La Elección Clímax" to "Sacrifica voluntariamente su deseo egoísta para consagrarse a su necesidad real."
            ),
            promptQuestions = listOf(
                "¿Qué evento del pasado le implantó la mentira que ahora gobierna su vida?",
                "¿Cómo choca su deseo superficial con lo que realmente necesita?",
                "En el clímax, ¿a qué debe renunciar para salvar lo que de verdad ama?"
            ),
            templateMarkdown = """## 🎭 Ficha de Arco de Transformación

- **Personaje:** 
- **La Mentira que cree:** (Ej: "Nadie es de fiar; la debilidad se castiga")
- **La Verdad que necesita:** (Ej: "La verdadera fuerza nace de la vulnerabilidad compartida")
- **Deseo Externo (Meta visible):** 
- **Necesidad Interna (Evolución moral):** 
- **Punto de Quiebre (Momento Espejo):** 
- **Sacrificio Clímax:** (¿Qué entrega para demostrar que cambió?)
"""
        ),
        LiteraryTemplate(
            id = "ritmo_pacing",
            title = "Ritmo Narrativo (Escena y Secuela)",
            subtitle = "Control de adrenalina y digestión dramática",
            category = "Ritmo",
            iconName = "speed",
            tagColor = Color(0xFF10B981),
            description = "El método de dos tiempos (Dwight Swain / Jim Butcher). Si solo hay acción, el lector se agota; si solo hay diálogo interior, se aburre. Alterna rítmicamente Escena (adrenalina) y Secuela (reflexión y decisión).",
            keyStages = listOf(
                "Fase A: Escena (Acción)" to "Meta urgente -> Conflicto frontal en cada línea -> Desastre o giro adverso.",
                "Fase B: Secuela (Digestión)" to "Reacción física/emocional -> Dilema ('¿Y ahora qué?') -> Decisión de nuevo plan.",
                "Cadencia de Frases" to "Frases cortas, verbos fuertes y poco adjetivo en combate; oraciones sensoriales en secuela.",
                "El Cliffhanger" to "Cierra el capítulo con una pregunta pendiente o una revelación que obligue a pasar la página."
            ),
            promptQuestions = listOf(
                "¿Cuál es el desastre inesperado que concluye la escena de acción?",
                "¿Qué dos malas opciones componen el dilema del protagonista en la secuela?",
                "¿La longitud de tus párrafos se ajusta a la urgencia emocional de la escena?"
            ),
            templateMarkdown = """## ⏱️ Plantilla de Escena & Secuela

### FASE 1: ESCENA (Ritmo Rápido)
- **Meta inmediata:** (¿Qué quiere lograr el personaje en los próximos 5 minutos?)
- **Conflicto en curso:** (¿Quién o qué se interpone directamente?)
- **Desastre final:** (Giro inesperado: "Sí, pero..." o "No, y además...")

### FASE 2: SECUELA (Ritmo Introspectivo)
- **Reacción:** (Impacto físico, dolor, euforia o shock visceral)
- **Dilema:** (Opciones disponibles: todas con costo elevado)
- **Decisión:** (El nuevo objetivo que dispara la siguiente escena)
"""
        ),
        LiteraryTemplate(
            id = "conflicto_niveles",
            title = "Conflicto en 4 Niveles de Presión",
            subtitle = "Tensión multidimensional simultánea",
            category = "Conflicto",
            iconName = "theater_comedy",
            tagColor = Color(0xFFA855F7),
            description = "Una escena floja suele tener conflicto en un solo plano. Las grandes escenas entrelazan simultáneamente fricción interna, choque interpersonal, presión social y peligro del entorno.",
            keyStages = listOf(
                "Nivel 1: Conflicto Interno" to "Remordimiento, duda ética, miedo o contradicción íntima.",
                "Nivel 2: Conflicto Interpersonal" to "Diferencia de agendas, secretos guardados o reproches entre los presentes.",
                "Nivel 3: Conflicto Social / Institucional" to "Leyes, prejuicios de casta, miradas de extraños o riesgo de expulsión.",
                "Nivel 4: Conflicto Ambiental / Físico" to "El reloj corre, la lluvia arrecia, el veneno avanza o el terreno es resbaladizo."
            ),
            promptQuestions = listOf(
                "¿Qué presión externa (clima, tiempo) añade urgencia a la conversación íntima?",
                "¿Qué secreto no dicho entre ambos personajes electrifica el diálogo?"
            ),
            templateMarkdown = """## ⚡ Matriz de Conflicto en 4 Niveles

- [ ] **1. Presión Interna:** (La culpa o duda que corroe al protagonista por dentro)
- [ ] **2. Choque Interpersonal:** (El desacuerdo directo con su interlocutor)
- [ ] **3. Amenaza Social:** (¿Quién los está observando o qué ley están quebrando?)
- [ ] **4. Hostilidad del Entorno:** (Frío, ruido, tiempo límite o peligro físico)
"""
        ),
        LiteraryTemplate(
            id = "show_dont_tell",
            title = "Show, Don't Tell (Muestra, No Expliques)",
            subtitle = "Inmersión sensorial y subtexto en diálogos",
            category = "Estilo",
            iconName = "visibility",
            tagColor = Color(0xFFFB7185),
            description = "El lector no debe ser informado de que un personaje está triste; debe ver cómo aparta el café frío, cómo evita la mirada y cómo sus dedos tiemblan al cerrar la puerta.",
            keyStages = listOf(
                "Anclaje de los 5 Sentidos" to "Incluye al menos un olor o textura por cada cambio de habitación.",
                "Síntomas en vez de Rótulos" to "Reemplaza 'estaba furioso' por 'el músculo de la mandíbula tenso y los nudillos blancos'.",
                "Subtexto en el Diálogo" to "Los humanos rara vez decimos la verdad cruda; hablamos del clima para evitar el divorcio.",
                "Acciones Reveladoras" to "Los gestos involuntarios delatan contradicciones entre lo que dice y lo que siente."
            ),
            promptQuestions = listOf(
                "¿Qué olor o sonido distintivo ancla la atmósfera de este lugar?",
                "¿Qué objeto físico manipula el personaje mientras oculta lo que piensa?"
            ),
            templateMarkdown = """## 👁️ Lista de Cotejo: Muestra, No Expliques

- [ ] **Revisión Sensorial:** ¿Hay texturas, olores o ruidos de fondo além de la vista?
- [ ] **Eliminación de Rótulos:** Reemplaza adjetivos abstractos ("triste", "furioso") por micro-acciones.
- [ ] **Subtexto:** ¿Qué es lo que los personajes EVITAN decir en esta conversación?
- [ ] **Acción con Objeto:** Un personaje haciendo algo con sus manos mientras habla.
"""
        )
    )
}

@Composable
fun GuiaEstiloScreen(
    viewModel: TintaViewModel,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var selectedCategory by remember { mutableStateOf("Todas") }
    val categories = listOf("Todas", "Estructura", "Personajes", "Ritmo", "Conflicto", "Estilo")

    val templates = remember(selectedCategory) {
        if (selectedCategory == "Todas") {
            LiteraryGuideData.templates
        } else {
            LiteraryGuideData.templates.filter { it.category.equals(selectedCategory, ignoreCase = true) }
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 14.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Hero Banner
        Card(
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.primaryContainer),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.AutoStories,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onPrimaryContainer,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                    Column {
                        Text(
                            text = "TALLER DE ESCRITURA & ESTILO",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 1.2.sp
                        )
                        Text(
                            text = "Guía de Estilo y Consejos",
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Text(
                    text = "Aprende los principios estructurales que distinguen los grandes manuscritos e inserta plantillas profesionales directamente en tu obra en curso.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // Category Filter Chips
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            categories.forEach { cat ->
                val isSelected = selectedCategory == cat
                FilterChip(
                    selected = isSelected,
                    onClick = { selectedCategory = cat },
                    label = { Text(cat, style = MaterialTheme.typography.labelMedium) },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = MaterialTheme.colorScheme.primary,
                        selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    shape = RoundedCornerShape(8.dp)
                )
            }
        }

        // Templates List
        Text(
            text = "PLANTILLAS Y PRINCIPIOS NARRATIVOS",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.2.sp
        )

        templates.forEach { template ->
            LiteraryTemplateCard(
                template = template,
                onInsertIntoEditor = {
                    viewModel.insertLiteraryTemplate(template.title, template.templateMarkdown)
                    viewModel.selectTab(TintaTab.ESCRIBIR)
                },
                onCopy = {
                    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                    clipboard.setPrimaryClip(ClipData.newPlainText(template.title, template.templateMarkdown))
                    viewModel.showToast("📋 Plantilla '${template.title}' copiada al portapapeles")
                }
            )
        }

        Spacer(modifier = Modifier.height(60.dp))
    }
}

@Composable
private fun LiteraryTemplateCard(
    template: LiteraryTemplate,
    onInsertIntoEditor: () -> Unit,
    onCopy: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.3f)),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = template.tagColor.copy(alpha = 0.15f),
                    border = BorderStroke(1.dp, template.tagColor.copy(alpha = 0.45f))
                ) {
                    Text(
                        text = template.category.uppercase(),
                        style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                        color = template.tagColor,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }

                IconButton(
                    onClick = { expanded = !expanded },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                        contentDescription = if (expanded) "Contraer" else "Expandir",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(
                    text = template.title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = template.subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Text(
                text = template.description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface
            )

            AnimatedVisibility(
                visible = expanded,
                enter = fadeIn() + expandVertically(),
                exit = fadeOut() + shrinkVertically()
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(
                        text = "Fases y Puntos Clave:",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = template.tagColor
                    )

                    template.keyStages.forEach { (phase, desc) ->
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = MaterialTheme.colorScheme.surfaceContainerHigh,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(
                                    text = phase,
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.primary
                                )
                                Text(
                                    text = desc,
                                    style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp),
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }

                    if (template.promptQuestions.isNotEmpty()) {
                        Text(
                            text = "Preguntas de Diagnóstico:",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        template.promptQuestions.forEach { q ->
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(6.dp),
                                verticalAlignment = Alignment.Top
                            ) {
                                Text("•", color = template.tagColor, fontWeight = FontWeight.Bold)
                                Text(q, style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp), color = MaterialTheme.colorScheme.onSurfaceVariant)
                            }
                        }
                    }
                }
            }

            // Action Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = onInsertIntoEditor,
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.PostAdd,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "Insertar en el Atelier",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold
                    )
                }

                OutlinedButton(
                    onClick = onCopy,
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant),
                    contentPadding = PaddingValues(horizontal = 12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ContentCopy,
                        contentDescription = "Copiar plantilla",
                        modifier = Modifier.size(16.dp),
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }
}

/**
 * BottomSheet interactivo que se despliega directamente mientras el autor está redactando
 * en el Atelier de Escritura sin sacarlo de su flujo de creación.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GuiaEstiloModalBottomSheet(
    onDismiss: () -> Unit,
    onInsertTemplate: (String, String) -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    var selectedCategory by remember { mutableStateOf("Todas") }
    val categories = listOf("Todas", "Estructura", "Personajes", "Ritmo", "Conflicto", "Estilo")

    val templates = remember(selectedCategory) {
        if (selectedCategory == "Todas") {
            LiteraryGuideData.templates
        } else {
            LiteraryGuideData.templates.filter { it.category.equals(selectedCategory, ignoreCase = true) }
        }
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        containerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(bottom = 28.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Lightbulb,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(22.dp)
                    )
                    Text(
                        text = "Guía de Estilo & Plantillas",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
                IconButton(onClick = onDismiss, modifier = Modifier.size(32.dp)) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Cerrar", tint = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }

            Text(
                text = "Despliega consejos literarios e inserta andamios de trama en tu escena actual con un solo toque.",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            // Category filter chips
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                categories.forEach { cat ->
                    val isSelected = selectedCategory == cat
                    FilterChip(
                        selected = isSelected,
                        onClick = { selectedCategory = cat },
                        label = { Text(cat, style = MaterialTheme.typography.labelSmall) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        ),
                        shape = RoundedCornerShape(8.dp)
                    )
                }
            }

            // Scrollable list of templates
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(420.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                templates.forEach { template ->
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = MaterialTheme.colorScheme.surfaceContainer,
                        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.25f)),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier.padding(14.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = template.title,
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.weight(1f)
                                )
                                Surface(
                                    shape = RoundedCornerShape(6.dp),
                                    color = template.tagColor.copy(alpha = 0.15f)
                                ) {
                                    Text(
                                        text = template.category,
                                        style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.sp),
                                        color = template.tagColor,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                    )
                                }
                            }

                            Text(
                                text = template.description,
                                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp),
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis
                            )

                            Button(
                                onClick = {
                                    onInsertTemplate(template.title, template.templateMarkdown)
                                    onDismiss()
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                                ),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(
                                    imageVector = Icons.Default.PostAdd,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Insertar en escena actual",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
