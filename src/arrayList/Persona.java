package arrayList;

public class Persona {
	
	//Atributos
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private int identificador;
	protected static int contador=0;
		
	//Constructores, vacio y con los atributos
	public Persona() {
		super();
		System.out.println("Se ha creado una instancia de la clase PADRE");
	}
	
	public Persona(String dni, String nombre, String apellidos, String direccion, String telefono, int identificador) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.identificador = identificador;
		System.out.println("Se ha creado una instancia de la clase PADRE con valores");
	}
	
	//Getter y setter
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}
	
	//Crear el metodo fichaPersona
	public void fichaPersona() {
		System.out.println("Nombre: ");
		System.out.println("Apellidos: ");
		System.out.println("DNI: ");
		System.out.println("Dirección: ");
		System.out.println("Teléfono: ");
		System.out.println("Identificador: ");		
		
	}	
	

}
