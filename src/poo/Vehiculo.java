package poo;

public class Vehiculo {
    // una clase contiene propiedades y métodos
    /* 
        //principio de OCULTACIÓN entre clases de la POO
        ambito (prop/met): publib, private, protected
        public: visible a clae cliente y a clase que hereda
        private: oculta a cliente y hereda
        protected: oculta a cliente y visible a hereda
        //Principio de Responsabilidad
        No se deben modificar las propiedades desde el cliente (exterior)
        //añadir color, potencia (w), y velocidad(km/h)
        //CLASE Moto : nRuedas, tipo (cros, trial, sport)
        //Clase Camion: nRuedas, tipo (triler, reparto, ..), nEjes
        /********* REGLAS DE NEGOCIO ********
         * marca y modelo se guardan en mayusculas y se devuelven en minusculas
         * velocidad debe de ser > 100
         */
    

    private String marca;
    private String modelo;
    int velocidad;

    //SOBRECARGA del método: se puede repetir el nombre de métodos en una clase y Java
    //los diferencia por el NUMERO y TIPO  de los argumentos
    //1-. Métodos Constructores
    //constructor vacio
    public Vehiculo(){ }
        //crear el objeto vacio. Sin referenciar las propiedades
    
    //constructor con parámetros para inicializar sus propiedades 
    // public Vehiculo (String marca, String modelo, int vel){}
    // public Vehiculo (int marca, String modelo){}
    public Vehiculo (String marca, String modelo, int velocidad){
        // this.velocidad = velocidad;
        // this.marca = marca;
        // this.modelo = modelo;
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVelocidad(velocidad);
    }


    //2-. métodos getters y setters (R/W)
    public void setVelocidad(int vel){
        if (vel < 100){ //condiciones
            this.velocidad = 100;
            System.out.println("Error en Velocidad, asignando xDef velocidad minima");
        }else {
            this.velocidad = vel;
        }
        
    }
    //responsables de modificar las propiedades de clase
    public void setMarca(String marca){
        this.marca = marca.toUpperCase();
    }
    public void setModelo(String modelo){
        this.modelo = modelo.toUpperCase();
    }

    //responsables de leer las propiedades de clase
    public int getVelocidad(){
        return this.velocidad;
    }
    public String getMarca(){
        return this.marca.toLowerCase();
    }
    public String getModelo(){
        return this.modelo.toLowerCase();
    }

    //3-. Impresión de datos
    //visualización de datos de la clase
    public void Info(){
        System.out.println("Vehiculo: " + this.getMarca() + " " + this.getModelo());
    }

    public String toString(){
        //devolver un string con toda la SALIDA FORMATEADA
        String info = "";
        info = " Vehiculo { \n" 
                 + "Marca: " + this.marca + " \n" 
                 + "Modelo: " + this.modelo + " \n"
                 + "Velocidad: " + this.velocidad + "Km/h \n"  
                + "}";
        String Kmdias = "";
        for (int i=0; i<DIA; i++){
        


        

        }
        info = info.concat("viajes: " ).concat(Kmdias).concat(Str:"}")



        //
        return info;
    }




}