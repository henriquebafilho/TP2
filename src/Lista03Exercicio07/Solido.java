package Lista03Exercicio07;

/*Crie duas classes PrismaRegular e Cilindro. Utilize os desenvolvimentos anteriores
para garantir uma forma de c´alcular ´area das bases, ´area lateral, ´area total e volume
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
			return "prisma triângular";
		case 4:
			return "prisma quadrângular";
		case 5:
			return "prisma pentágonal";
		case 6:
			return "prisma hexágonal";
		case 7:
			return "prisma heptágonal";
		case 8:
			return "prisma octógonal";
		case 9:
			return "prisma eneágonal";
		case 10:
			return "prisma decágonal";
		case 11:
			return "prisma undecágonal";
		case 12:
			return "prisma dodecágonal";
		case 15:
			return "prisma pentadecágonal";
		case 20:
			return "prisma icoságonal";
		default:
			return "O prisma não possui nome";
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
