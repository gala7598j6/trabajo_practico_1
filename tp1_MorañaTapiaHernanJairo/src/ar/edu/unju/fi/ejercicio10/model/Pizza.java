package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private float precio;
	private float area;
	private boolean ingrdEspeciales;
	
	public static final float adicial20 = 500f;
	public static final float adicial30 = 750f;
	public static final float adicial40 = 1000f;
	
	public Pizza() {
		
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public boolean isIngrdEspeciales() {
		return ingrdEspeciales;
	}

	public void setIngrdEspeciales(boolean ingrdEspeciales) {
		this.ingrdEspeciales = ingrdEspeciales;
	}

	public static float getAdicial20() {
		return adicial20;
	}

	public static float getAdicial30() {
		return adicial30;
	}

	public static float getAdicial40() {
		return adicial40;
	}
	
	public float calcularPrecio() {
		float precio=0;
		
		switch (this.diametro) {
			case 20:
				precio = 4500f;
                if (this.ingrdEspeciales) {
                    precio += adicial20;
                }
                break;
			case 30:
				precio = 4800f;
				if (this.ingrdEspeciales) {
                    precio += adicial30;
                }
				break;
			case 40:
				precio = 5500f;
				if (this.ingrdEspeciales) {
                    precio += adicial40;
                }
				break;
			default:
                System.out.println("El diámetro ingresado no es válido.");
                break;
		
		}
		return precio;
	}
	
	
	
}
