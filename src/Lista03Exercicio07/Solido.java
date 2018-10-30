package Lista03Exercicio07;

/*Crie duas classes PrismaRegular e Cilindro. Utilize os desenvolvimentos anteriores
para garantir uma forma de c�alcular �area das bases, �area lateral, �area total e volume
para ambas estas classes.*/
abstract class Solido {
	private FormaGeometrica base;
	private double perimetroBase;
	private double areaDaBase;
	private double areaLateral;
	private double areaTotal;
	private double altura;

	public double calculaVolume() {
		return this.areaDaBase * this.altura;
	}

	public double calculaAreaLateral() {
		return this.perimetroBase * this.altura;
	}

	public double calculaAreaBases() {
		return areaDaBase * 2;
	}

	public String nomePrisma() {
		switch (this.base.getNumLados()) {
		case 0: 
			return "Cilindro";
		case 3:
			return "prisma tri�ngular";
		case 4:
			return "prisma quadr�ngular";
		case 5:
			return "prisma pent�gonal";
		case 6:
			return "prisma hex�gonal";
		case 7:
			return "prisma hept�gonal";
		case 8:
			return "prisma oct�gonal";
		case 9:
			return "prisma ene�gonal";
		case 10:
			return "prisma dec�gonal";
		case 11:
			return "prisma undec�gonal";
		case 12:
			return "prisma dodec�gonal";
		case 15:
			return "prisma pentadec�gonal";
		case 20:
			return "prisma icos�gonal";
		default:
			return "O prisma n�o possui nome";
		}
	}

	public double getPerimetroBase() {
		return this.perimetroBase;
	}

	public double getAreaBase() {
		return this.areaDaBase;
	}

	Solido(FormaGeometrica base, double altura) {
		this.perimetroBase = base.perimetro();
		this.areaDaBase = base.area();
		this.areaLateral = this.perimetroBase * altura;
		this.areaTotal = this.areaLateral + this.calculaAreaBases();
		this.base = base;
		this.altura = altura;
	}
}
