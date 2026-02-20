#  Git

## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es una carpeta que contiene los archivos de un proyecto junto con toda la información de cambios realizados a lo largo del tiempo. La diferencia con un proyecto normal es que el repositorio permite controlar versiones, guardar historial y trabajar en equipo sin perder información.

---

## 2. ¿Cuáles son las tres áreas principales de Git y qué papel cumple cada una?

Git maneja tres áreas principales:

- **Working Directory (Directorio de trabajo):** donde se editan los archivos normalmente.
- **Staging Area (Área de preparación):** espacio donde se seleccionan los cambios antes de guardarlos definitivamente.
- **Repository (Repositorio):** lugar donde se almacenan los commits con el historial del proyecto.

---

## 3. ¿Cómo representa Git los cambios internamente?

Git utiliza objetos internos:

- **Blob:** almacena el contenido de archivos.
- **Tree:** representa carpetas y organización de archivos.
- **Commit:** guarda un punto del historial con cambios.
- **Tag:** marca versiones importantes del proyecto.

---

## 4. ¿Cómo se crea un commit y qué información almacena?

Un commit se crea usando `git commit`.  
Almacena información como:

- Autor
- Fecha
- Mensaje descriptivo
- Referencia al commit anterior
- Cambios realizados

---

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

- **git fetch:** descarga cambios del repositorio remoto pero no los mezcla automáticamente.
- **git pull:** descarga y combina los cambios directamente en la rama actual.

---

## 6. ¿Qué es un branch y cómo Git gestiona los punteros?

Un branch es una rama de desarrollo independiente dentro del proyecto.  
Git usa punteros que señalan al último commit de cada rama, permitiendo cambiar entre versiones fácilmente.

---

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir?

Un merge combina cambios de dos ramas con `git merge`.  
Puede haber conflictos cuando se modifican las mismas líneas de un archivo. Se resuelven editando manualmente el archivo y confirmando el cambio.

---

## 8. ¿Cómo funciona git add y qué pasa si se omite?

`git add` mueve los cambios al área de staging.  
Si se omite, los cambios no se incluirán en el commit.

---

## 9. ¿Qué es el archivo .gitignore?

Es un archivo donde se especifican los archivos que Git debe ignorar, como archivos temporales o configuraciones personales.

---

## 10. ¿Diferencia entre commit amend y un nuevo commit?

- **commit amend:** modifica el último commit.
- **nuevo commit:** crea un registro adicional en el historial.

---

## 11. ¿Cómo se utiliza git stash y cuándo es útil?

`git stash` guarda cambios temporales sin hacer commit.  
Es útil cuando se necesita cambiar de rama rápidamente sin perder trabajo.

---

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios?

Algunos comandos son:

- `git reset`: mueve el historial a un estado anterior.
- `git revert`: crea un commit que deshace cambios.
- `git checkout`: restaura archivos o cambia de rama.

---

## 13. ¿Cómo funciona la configuración de remotos?

Los remotos son versiones del repositorio en internet.

- **origin:** repositorio principal.
- **upstream:** repositorio original en forks.

Comandos comunes:

- `git remote add`
- `git push`
- `git pull`

---

## 14. ¿Cómo inspeccionar el historial de commits?

Comandos útiles:

- `git log`: muestra historial
- `git diff`: muestra diferencias
- `git show`: detalles de un commit