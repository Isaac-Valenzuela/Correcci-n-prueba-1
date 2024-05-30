public class Hotel{
    //Atributos
    public int codigo;
    public String nombre;
    public String ciudad;
    public String sector;
    //Metodo constructor vacio
    public Hotel(){
    }
    //Metodo contructor con atributos
    public Hotel(int codigo, String nombre, String ciudad, String
            sector){
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.sector = sector;
    }
    //GETTERS Y SETTERS
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    //METODO PARA MOSTRAR LA INFORMACION
    public void mostrar(){
        System.out.println("Informacion del hotel");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Ciudad: " + getCiudad());
        System.out.println("Sector: " + getSector());
    }
    //METODO PARA ACTULIZAR ATRIBUTOS DE UN OBJETO
    public void actualizarHotel(int codigo, String nombre, String
            ciudad, String sector){
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.sector = sector;
    }
    //METODO PARA ACTUALIZAR ATRIBUTOS DE UN OBEJTO EN NULOS
    public void actualizarHotelnulos(){
        this.codigo = 0;
        this.nombre = null;
        this.ciudad = null;
        this.sector = null;
    }
}