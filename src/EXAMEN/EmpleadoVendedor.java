package EXAMEN;

    public class EmpleadoVendedor extends Empleado{
        private double montovendido;
        private double tasacomision;

        //Constructores

        public EmpleadoVendedor (String RFC, String apellidos, String nombres, double montovendido,
                                 double tasacomision) {
            super (RFC, apellidos, nombres);
            this.montovendido=montovendido;
            this.tasacomision=tasacomision;
        }
        //Encapsulamiento

        public double getMontoVendido ()
        {return montovendido ; }
        public void setMontovendido (double montovendido)
        {this.montovendido = montovendido ;}
        public double getTasacomision ()
        {return tasacomision ; }
        public void setTasacomision (double tasacomision)
        { this.tasacomision = tasacomision;}


        @Override
        public String getApellidos() {
            return super.getApellidos();
        }

        @Override
        public double ingresos() {
            return 0;
        }

        @Override
        public double bonificaciones() {
            return 0;
        }

        @Override
        public double descuentos() {
            return 0;

        }
    }

