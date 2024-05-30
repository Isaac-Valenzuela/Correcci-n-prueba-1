public class Main {
    public static void main(String[] args) {
        //OBJETOS QUEMADOS
        Hotel hotel1 = new Hotel(123, "Hilton", "Quito", "Elegido");
        Hotel hotel2 = new Hotel(124, "Marriot", "Quito", "Carolina");
        Hotel hotel3 = new Hotel(125, "Luz", "Quito", "Miraflores");
        Hotel hotel4 = new Hotel(126, "Cusco", "Quito", "Labrador");
        Hotel hotel5 = new Hotel(127, "Estrella", "Quito", "Roldos");
        //OBJETOS VACIOS
        Hotel hotel6 = new Hotel();
        Hotel hotel7 = new Hotel();
        //MOSTRAR EL OBJETO VACIO, SETEARLE CON NUEVOS ATRIBUTOS,
        hotel6.mostrar();
        hotel6.setCodigo(128);
        hotel6.setNombre("Nunca");
        hotel6.setCiudad("Quito");
        hotel6.setSector("Carapungo");
        hotel6.mostrar();
        //MOSTRAR EL OBJETO VACIO, SETEARLE CON NUEVOS ATRIBUTOS, Muestra EL OBJETO ACTUALIZADO
        hotel7.mostrar();
        hotel7.setCodigo(129);
        hotel7.setNombre("Nada");
        hotel7.setCiudad("Quito");
        hotel7.setSector("Pomasqui");
        hotel7.mostrar();
        //MOSTRAR TODOS LOS OBJETOS MEDIANTE LE METODO MOSTRAR DE LA CLASE HOTEL
        hotel1.mostrar();
        hotel2.mostrar();
        hotel3.mostrar();
        hotel4.mostrar();
        hotel5.mostrar();
        hotel6.mostrar();
        hotel7.mostrar();
        //ACTUALIZAR TODOS LOS DATOS DE UN OBJETO MEDIANTE EL METODO DE ACTUALIZAR DE LA CLASE HOTEL
        // Y MOSTRAR
        hotel7.actualizarHotel(130, "San Antonio", "Quito", "Mitad del mundo");
                hotel7.mostrar();
        // ACTUALIZAR TODOS LOS DATOS DE UN OBEJETO A NULOS MEDIANT EL METODO DE ACTUALIZAR NULOS DE LA
        //CLASE HOTEL Y MOSTRAR
        hotel1.actualizarHotelnulos();
        hotel2.actualizarHotelnulos();
        hotel3.actualizarHotelnulos();
        hotel1.mostrar();
        hotel2.mostrar();
        hotel3.mostrar();
    }
}