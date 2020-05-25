public class Cedulas {

        private int image;
        private String nombres;
        private String pApell;
        private String sApell;
        private String fecha;
        private String lugar;
        private String nCedula;

        public Cedulas(int image, String nombres, String pApell, String sApell, String fecha, String lugar, String nCedula) {
            this.image = image;
            this.nombres = nombres;
            this.pApell = pApell;
            this.sApell = sApell;
            this.fecha = fecha;
            this.lugar = lugar;
            this.nCedula = nCedula;
        }


        public int getImage() {
            return image;
        }

        public void setImage(int image) {
            this.image = image;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getpApell() {
            return pApell;
        }

        public void setpApell(String pApell) {
            this.pApell = pApell;
        }

        public String getsApell() {
            return sApell;
        }

        public void setsApell(String idPost) {
            this.sApell = sApell;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
        this.fecha = fecha;
    }

        public String getLugar() {
            return lugar;
        }

        public void setLugar(String lugar) {
            this.lugar = lugar;
        }

        public String getnCedula() {
            return nCedula;
        }

        public void setnCedula(String lugar) {
            this.nCedula = nCedula;
        }

}
