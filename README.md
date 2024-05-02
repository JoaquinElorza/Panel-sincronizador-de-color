# Panel-sincronizador-de-color

# Descripción
Este componente Java consta de un registro de usuarios con un panel que se adapta al logo que le proporcionemos.
Tiene un campo para ingresar un nombre de usuario y una contraseña, etiquetas que sirven para mostrar y ocultar la contraseña, y un boton que guarda los datos.
Este boton hace una llamada a algunos métodos, para comprobar que el usuario no ha sido registrado antes; para comprobar que la contraseña tenga un minimo de 8 caracteres, una mayuscua y una minuscula. El componente principal es un atrubuto llamado rutaImagen en la que seleccionamos el logo de nuestra empresa o instutucion y el panel de la izquiera tomará el color predominante de nuestra imagen.

# Usos

1. Acceso a aplicaciones de escritorio: Utilizado en aplicaciones de escritorio para permitir que los usuarios accedan a funciones protegidas o personalizadas.
2. Ingreso a eventos: Utilizado en eventos como conferencias, conciertos o exposiciones para registrar la asistencia de los participantes y proporcionar acceso a áreas restringidas.
3. Registro de membresía: Permitir que los usuarios se registren como miembros de un club, organización o programa de fidelización, proporcionando acceso a beneficios exclusivos o contenido premium.
4. Participación en foros y comunidades en línea: Permitir que los usuarios se registren en foros de discusión, plataformas de preguntas y respuestas, redes sociales temáticas, etc., para participar en conversaciones y compartir información con otros usuarios.

# Caracteristicas
1. Campos de entrada de datos básicos: Incluir campos para que los usuarios ingresen información esencial, como nombre de usuario y contraseña.
2. Validación de datos: Verificar la validez de los datos ingresados por los usuarios, como el nombre de usuario y la fortaleza de la contraseña.
3. Capacidad de registro de nuevos usuarios: Permitir que los usuarios nuevos se registren proporcionando la información necesaria y creando una cuenta en el sistema.
4. Personalización del color de fondo: La capacidad de cambiar dinámicamente el color de fondo del formulario de registro según el logo proporcionado por el usuario. Esto puede mejorar la estética y la marca del proceso de registro.
5. Mensajes de retroalimentación: Proporcionar mensajes claros y descriptivos para guiar a los usuarios a través del proceso de registro, informándoles sobre cualquier error de validación o confirmación exitosa de la cuenta.

# Requisitos
-Java JDK o superior
-IDE con soporte para Swing (como neatBeans)

# API
### Clases

1. **panelRegistro**:
   - **Métodos:**
     - `setRutaImagen(File rutaImagen)`: Establece la ruta de la imagen para cambiar el color de fondo.
     - `validarUsuario()`: Valida si el nombre de usuario ingresado es válido y no está duplicado.
     - `validarContraseña()`: Valida si la contraseña ingresada cumple con los requisitos mínimos.
     - `escribirArray()`: Escribe la información del usuario en un archivo de texto.
   - **Variables de instancia:**
     - `rutaImagen`: Ruta de la imagen para cambiar el color de fondo.
     - `Contraseña`: Contraseña ingresada por el usuario.
     - `Usuarios`: ArrayList que almacena objetos de tipo Usuario.
   - **Métodos de interfaz gráfica:**
     - `initComponents()`: Inicializa los componentes de la interfaz gráfica.
     - `paintComponent(Graphics g)`: Sobrescribe el método `paintComponent` para mostrar la imagen y cambiar el color de fondo.
     - `txtUsuarioMouseClicked(java.awt.event.MouseEvent evt)`, `txtUsuarioActionPerformed(java.awt.event.ActionEvent evt)`, `txtContraseñaMouseClicked(java.awt.event.MouseEvent evt)`, `ojoCerradoMouseClicked(java.awt.event.MouseEvent evt)`, `ojoAbiertoMouseClicked(java.awt.event.MouseEvent evt)`, `btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)`: Métodos relacionados con la interacción del usuario con los campos de entrada y botones.

### Variables de instancia

- `btnRegistrar`: JButton para iniciar el proceso de registro.
- `errorContraseña`: JLabel para mostrar mensajes de error relacionados con la contraseña.
- `errorUsuario`: JLabel para mostrar mensajes de error relacionados con el nombre de usuario.
- `iconoCandado`, `iconoUsuario`: JLabels para mostrar iconos relacionados con la contraseña y el nombre de usuario.
- `jPanel1`: JPanel para mostrar la imagen de fondo y cambiar su color.
- `lblLogo`: JLabel para mostrar el logo proporcionado.
- `ojoAbierto`, `ojoCerrado`: JLabels para mostrar iconos relacionados con la visualización de la contraseña.
- `txtContraseña`, `txtUsuario`: JTextFields para que los usuarios ingresen su nombre de usuario y contraseña.

### Otros

- `Usuario`: Clase para representar un usuario con un nombre de usuario y una contraseña.

# Instalación
Para saber cómo instalar este componente y nuestros botones animados entra al siguiente enlace -> https://youtu.be/I2DW3I4hKTQ

# Funcionamiento
Para saber cómo usar nuestros componentes una vez instalados entra al siguente video -> https://www.youtube.com/watch?v=r2ObpNvyoOM
