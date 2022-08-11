// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelZeusModel extends EntityModel<Entity> {
	private final ModelRenderer cuerpo;
	private final ModelRenderer cabeza;
	private final ModelRenderer pelo;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer pelotrase;
	private final ModelRenderer cube_r7;
	private final ModelRenderer colainferior;
	private final ModelRenderer cube_r8;
	private final ModelRenderer subcola;
	private final ModelRenderer cube_r9;
	private final ModelRenderer colafinal;
	private final ModelRenderer cube_r10;
	private final ModelRenderer barba;
	private final ModelRenderer cube_r11;
	private final ModelRenderer torzo;
	private final ModelRenderer righarm;
	private final ModelRenderer hombrodere;
	private final ModelRenderer cododere;
	private final ModelRenderer leftarm;
	private final ModelRenderer hombroizq;
	private final ModelRenderer codoizq;
	private final ModelRenderer piernas;
	private final ModelRenderer piernaderecha;
	private final ModelRenderer rodilladere;
	private final ModelRenderer piernaizquierda;
	private final ModelRenderer rodillaizq;
	private final ModelRenderer ropa;
	private final ModelRenderer falda;
	private final ModelRenderer back;
	private final ModelRenderer front;
	private final ModelRenderer cinturon;
	private final ModelRenderer cello;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public ModelZeusModel() {
		textureWidth = 144;
		textureHeight = 144;

		cuerpo = new ModelRenderer(this);
		cuerpo.setRotationPoint(0.0F, -2.0F, 0.0F);

		cabeza = new ModelRenderer(this);
		cabeza.setRotationPoint(0.0F, -9.0F, 0.0F);
		cuerpo.addChild(cabeza);
		cabeza.setTextureOffset(0, 0).addBox(-4.5F, -9.0F, -4.5F, 9.0F, 9.0F, 9.0F, 0.0F, false);

		pelo = new ModelRenderer(this);
		pelo.setRotationPoint(13.75F, -11.0F, 0.0F);
		cabeza.addChild(pelo);
		pelo.setTextureOffset(85, 87).addBox(-18.0F, 0.0F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(72, 86).addBox(-19.0F, 0.0F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(68, 0).addBox(-10.25F, 0.25F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(68, 13).addBox(-10.5F, 0.25F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(82, 56).addBox(-9.5F, 0.0F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(33, 83).addBox(-10.5F, 0.0F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(63, 72).addBox(-18.0F, 0.25F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(50, 70).addBox(-18.25F, 0.25F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(59, 85).addBox(-16.75F, 0.75F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(46, 84).addBox(-17.0F, 0.75F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(69, 46).addBox(-16.75F, 1.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(13, 67).addBox(-11.75F, 1.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(81, 15).addBox(-11.75F, 0.75F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(82, 44).addBox(-11.5F, 0.75F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(37, 67).addBox(-11.5F, 1.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(103, 26).addBox(-13.0F, 0.0F, -5.5F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		pelo.setTextureOffset(76, 74).addBox(-13.0F, -0.25F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(81, 2).addBox(-12.75F, -0.25F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(0, 65).addBox(-12.75F, 0.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(56, 57).addBox(-15.75F, 0.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(28, 37).addBox(-15.75F, -0.25F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(75, 32).addBox(-15.5F, -0.25F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(102, 66).addBox(-15.5F, 0.0F, -5.5F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		pelo.setTextureOffset(41, 55).addBox(-14.75F, 0.5F, -5.5F, 2.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(15, 55).addBox(-14.75F, 1.0F, -5.5F, 2.0F, 1.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(56, 44).addBox(-14.15F, 1.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(94, 0).addBox(-14.4F, 1.0F, -5.5F, 1.0F, 2.0F, 10.0F, 0.0F, false);
		pelo.setTextureOffset(69, 59).addBox(-17.0F, 1.0F, -5.5F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		pelo.setTextureOffset(0, 47).addBox(-19.5F, 1.0F, -5.25F, 1.0F, 6.0F, 12.0F, 0.0F, false);
		pelo.setTextureOffset(0, 29).addBox(-9.0F, 1.0F, -5.25F, 1.0F, 6.0F, 12.0F, 0.0F, false);
		pelo.setTextureOffset(14, 37).addBox(-9.25F, 1.0F, -5.25F, 1.0F, 6.0F, 12.0F, 0.0F, false);
		pelo.setTextureOffset(40, 37).addBox(-19.25F, 1.0F, -5.25F, 1.0F, 6.0F, 12.0F, 0.0F, false);
		pelo.setTextureOffset(0, 37).addBox(-15.7F, 8.9F, -4.6F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(36, 13).addBox(-15.7F, 8.4F, -4.6F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(41, 43).addBox(-16.5F, 4.7F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(42, 21).addBox(-16.25F, 4.95F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(35, 0).addBox(-12.0F, 4.7F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(36, 2).addBox(-12.25F, 4.7F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(35, 38).addBox(-12.25F, 4.95F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(8, 39).addBox(-12.0F, 4.95F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(35, 40).addBox(-16.5F, 4.95F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		pelo.setTextureOffset(42, 19).addBox(-16.25F, 4.7F, -5.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pelo.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, -0.7854F, -1.5708F);
		cube_r1.setTextureOffset(0, 94).addBox(-2.75F, 9.0F, 8.75F, 1.0F, 2.0F, 10.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		pelo.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(88, 27).addBox(3.75F, 1.0F, 9.25F, 3.0F, 2.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-15.25F, 9.0F, -1.5F);
		pelo.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(88, 38).addBox(5.15F, -3.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(21, 29).addBox(6.15F, -4.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r3.setTextureOffset(12, 94).addBox(-4.15F, -3.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(27, 3).addBox(-4.15F, -4.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-15.25F, 9.0F, -1.5F);
		pelo.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(54, 43).addBox(-3.9F, -6.25F, 1.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 52).addBox(4.85F, -5.25F, 1.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 47).addBox(4.85F, -6.25F, 1.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r4.setTextureOffset(16, 80).addBox(-3.9F, -5.25F, 1.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-11.5F, 3.8F, -4.9F);
		pelo.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.1745F);
		cube_r5.setTextureOffset(28, 41).addBox(-1.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(41, 39).addBox(-0.75F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-16.0F, 3.8F, -4.9F);
		pelo.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.1745F);
		cube_r6.setTextureOffset(41, 37).addBox(-0.75F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(41, 41).addBox(-1.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		pelotrase = new ModelRenderer(this);
		pelotrase.setRotationPoint(-13.75F, 3.4118F, 7.0374F);
		pelo.addChild(pelotrase);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(13.75F, -3.4118F, -8.0374F);
		pelotrase.addChild(cube_r7);
		setRotationAngle(cube_r7, 1.5708F, -1.4835F, -1.5708F);
		cube_r7.setTextureOffset(53, 19).addBox(5.5F, 3.5F, 8.25F, 2.0F, 5.0F, 11.0F, 0.0F, false);

		colainferior = new ModelRenderer(this);
		colainferior.setRotationPoint(0.0F, 5.0F, 0.0F);
		pelotrase.addChild(colainferior);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(13.75F, -8.4118F, -8.0374F);
		colainferior.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.5708F, -1.4835F, -1.5708F);
		cube_r8.setTextureOffset(27, 18).addBox(5.5F, 8.5F, 8.25F, 2.0F, 8.0F, 11.0F, 0.0F, false);

		subcola = new ModelRenderer(this);
		subcola.setRotationPoint(0.0F, 7.0F, 0.0F);
		colainferior.addChild(subcola);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 1.9532F, 0.0066F);
		subcola.addChild(cube_r9);
		setRotationAngle(cube_r9, 1.5708F, -1.3963F, -1.5708F);
		cube_r9.setTextureOffset(89, 68).addBox(-0.85F, -1.6F, -4.5F, 2.0F, 3.0F, 9.0F, 0.0F, false);

		colafinal = new ModelRenderer(this);
		colafinal.setRotationPoint(0.0F, 3.0F, 0.0F);
		subcola.addChild(colafinal);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -1.0468F, 0.0066F);
		colafinal.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.5708F, -1.309F, -1.5708F);
		cube_r10.setTextureOffset(93, 105).addBox(-1.05F, 1.3F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		barba = new ModelRenderer(this);
		barba.setRotationPoint(0.0F, 0.0F, 0.0F);
		cabeza.addChild(barba);
		barba.setTextureOffset(14, 37).addBox(-5.75F, -3.5F, -5.6F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(28, 37).addBox(-5.75F, -4.5F, -5.6F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(0, 18).addBox(-3.75F, -3.5F, -5.4F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(27, 6).addBox(-5.75F, -0.5F, -5.6F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(64, 0).addBox(-3.0F, -0.5F, -5.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(33, 42).addBox(2.0F, -4.0F, -5.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(28, 43).addBox(-3.0F, -4.0F, -5.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(64, 2).addBox(-3.0F, -4.75F, -5.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(69, 44).addBox(-4.25F, 0.5F, -5.6F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		barba.setTextureOffset(36, 15).addBox(-2.25F, 1.5F, -5.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(4.875F, -2.0F, -5.05F);
		barba.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -3.1416F);
		cube_r11.setTextureOffset(28, 39).addBox(-0.875F, 1.5F, -0.55F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(20, 37).addBox(-0.875F, -1.5F, -0.55F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(33, 18).addBox(1.125F, -1.5F, -0.35F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 39).addBox(-0.875F, -2.5F, -0.55F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		torzo = new ModelRenderer(this);
		torzo.setRotationPoint(0.0F, -9.1667F, -0.1333F);
		cuerpo.addChild(torzo);
		torzo.setTextureOffset(42, 19).addBox(0.5F, 4.6667F, -2.9667F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		torzo.setTextureOffset(30, 55).addBox(-4.5F, 10.6667F, -1.9667F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(42, 19).addBox(0.5F, 12.9167F, -1.9667F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(30, 55).addBox(-4.5F, 12.9167F, -1.9667F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(42, 19).addBox(0.5F, 15.1667F, -1.9667F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(30, 55).addBox(-4.5F, 15.1667F, -1.9667F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(42, 19).addBox(0.5F, 10.6667F, -1.9667F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(27, 0).addBox(-1.5F, 0.1667F, -0.8667F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		torzo.setTextureOffset(89, 80).addBox(-3.5F, 1.1667F, -1.8667F, 7.0F, 1.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(68, 26).addBox(4.5F, 1.1667F, -1.3667F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		torzo.setTextureOffset(81, 27).addBox(-9.5F, 1.1667F, -1.3667F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		torzo.setTextureOffset(42, 13).addBox(-7.0F, 2.1667F, -1.8667F, 14.0F, 2.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(30, 55).addBox(-6.5F, 4.6667F, -2.9667F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		torzo.setTextureOffset(36, 0).addBox(-6.0F, 10.1667F, -1.8667F, 12.0F, 8.0F, 4.0F, 0.0F, false);
		torzo.setTextureOffset(0, 18).addBox(-7.0F, 4.1667F, -2.3667F, 14.0F, 6.0F, 5.0F, 0.0F, false);

		righarm = new ModelRenderer(this);
		righarm.setRotationPoint(-9.5F, -5.25F, 0.0F);
		cuerpo.addChild(righarm);
		righarm.setTextureOffset(98, 99).addBox(-1.5F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		hombrodere = new ModelRenderer(this);
		hombrodere.setRotationPoint(0.0F, 0.0F, 0.0F);
		righarm.addChild(hombrodere);
		setRotationAngle(hombrodere, 0.3927F, 0.0F, 0.0F);
		hombrodere.setTextureOffset(95, 39).addBox(-2.0F, 0.25F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		hombrodere.setTextureOffset(40, 96).addBox(-2.0F, 4.25F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		cododere = new ModelRenderer(this);
		cododere.setRotationPoint(0.0F, 10.5F, 0.05F);
		hombrodere.addChild(cododere);
		setRotationAngle(cododere, -0.48F, 0.0F, 0.0F);
		cododere.setTextureOffset(98, 85).addBox(-1.5F, -0.25F, -2.05F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		cododere.setTextureOffset(0, 29).addBox(-1.0F, -1.25F, -1.45F, 2.0F, 5.0F, 3.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(9.5F, -5.25F, 0.0F);
		cuerpo.addChild(leftarm);
		leftarm.setTextureOffset(95, 48).addBox(-2.5F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		hombroizq = new ModelRenderer(this);
		hombroizq.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.addChild(hombroizq);
		setRotationAngle(hombroizq, -0.3491F, 0.0F, 0.0F);
		hombroizq.setTextureOffset(95, 56).addBox(-2.0F, 4.25F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		hombroizq.setTextureOffset(26, 67).addBox(-2.0F, 0.25F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);

		codoizq = new ModelRenderer(this);
		codoizq.setRotationPoint(0.0F, 10.5F, -0.2F);
		hombroizq.addChild(codoizq);
		setRotationAngle(codoizq, -0.6109F, 0.0F, 0.0F);
		codoizq.setTextureOffset(84, 99).addBox(-1.5F, -0.25F, -1.8F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		codoizq.setTextureOffset(14, 29).addBox(-1.0F, -1.25F, -1.2F, 2.0F, 5.0F, 3.0F, 0.0F, false);

		piernas = new ModelRenderer(this);
		piernas.setRotationPoint(0.0F, 9.5F, 0.0F);
		cuerpo.addChild(piernas);
		piernas.setTextureOffset(54, 35).addBox(-5.5F, -0.5F, -2.5F, 11.0F, 2.0F, 5.0F, 0.0F, false);

		piernaderecha = new ModelRenderer(this);
		piernaderecha.setRotationPoint(-3.5F, 1.25F, 0.0F);
		piernas.addChild(piernaderecha);
		setRotationAngle(piernaderecha, -0.6545F, 0.0F, 0.0F);
		piernaderecha.setTextureOffset(22, 80).addBox(-2.5F, 0.15F, -3.0F, 5.0F, 8.0F, 6.0F, 0.0F, false);

		rodilladere = new ModelRenderer(this);
		rodilladere.setRotationPoint(0.0F, 8.25F, 0.0F);
		piernaderecha.addChild(rodilladere);
		setRotationAngle(rodilladere, 0.5236F, 0.0F, 0.0F);
		rodilladere.setTextureOffset(22, 95).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
		rodilladere.setTextureOffset(70, 98).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		piernaizquierda = new ModelRenderer(this);
		piernaizquierda.setRotationPoint(3.5F, 1.25F, 0.0F);
		piernas.addChild(piernaizquierda);
		setRotationAngle(piernaizquierda, 0.3054F, 0.0F, 0.0F);
		piernaizquierda.setTextureOffset(0, 80).addBox(-2.5F, 0.15F, -3.0F, 5.0F, 8.0F, 6.0F, 0.0F, false);

		rodillaizq = new ModelRenderer(this);
		rodillaizq.setRotationPoint(0.0F, 8.25F, 0.0F);
		piernaizquierda.addChild(rodillaizq);
		setRotationAngle(rodillaizq, 0.48F, 0.0F, 0.0F);
		rodillaizq.setTextureOffset(56, 97).addBox(-1.5F, -1.0F, -2.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);
		rodillaizq.setTextureOffset(94, 14).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		ropa = new ModelRenderer(this);
		ropa.setRotationPoint(0.0F, 23.0F, 0.0F);

		falda = new ModelRenderer(this);
		falda.setRotationPoint(0.0F, 0.0F, 0.0F);
		ropa.addChild(falda);
		falda.setTextureOffset(0, 0).addBox(6.0F, -17.0F, -3.0F, 1.0F, 9.0F, 6.0F, 0.0F, false);
		falda.setTextureOffset(0, 0).addBox(-7.0F, -17.0F, -3.0F, 1.0F, 9.0F, 6.0F, 0.0F, false);

		back = new ModelRenderer(this);
		back.setRotationPoint(0.2F, -17.0F, 2.35F);
		falda.addChild(back);
		setRotationAngle(back, 2.7925F, 0.0F, 3.1416F);
		back.setTextureOffset(0, 0).addBox(-5.8F, 0.0F, -0.9F, 12.0F, 9.0F, 1.0F, 0.0F, false);
		back.setTextureOffset(0, 0).addBox(-6.7F, 0.5F, -0.8F, 1.0F, 8.0F, 5.0F, 0.0F, false);
		back.setTextureOffset(0, 0).addBox(6.1F, 0.5F, -0.8F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		front = new ModelRenderer(this);
		front.setRotationPoint(-0.2F, -17.0F, -2.4F);
		falda.addChild(front);
		setRotationAngle(front, -0.6545F, 0.0F, 0.0F);
		front.setTextureOffset(0, 0).addBox(-5.8F, 0.0F, -0.85F, 12.0F, 9.0F, 1.0F, 0.0F, false);
		front.setTextureOffset(0, 0).addBox(-6.7F, 0.5F, -0.65F, 1.0F, 8.0F, 6.0F, 0.0F, false);
		front.setTextureOffset(0, 0).addBox(6.1F, 0.5F, -0.65F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		cinturon = new ModelRenderer(this);
		cinturon.setRotationPoint(0.0F, 0.0F, 0.0F);
		ropa.addChild(cinturon);
		cinturon.setTextureOffset(0, 0).addBox(-7.0F, -20.0F, -3.4F, 14.0F, 3.0F, 1.0F, 0.0F, false);
		cinturon.setTextureOffset(0, 0).addBox(-7.0F, -20.0F, 2.5F, 14.0F, 3.0F, 1.0F, 0.0F, false);
		cinturon.setTextureOffset(0, 0).addBox(6.0F, -20.0F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		cinturon.setTextureOffset(0, 0).addBox(-7.0F, -20.0F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		cello = new ModelRenderer(this);
		cello.setRotationPoint(-0.4F, 1.25F, 4.75F);
		cinturon.addChild(cello);
		cello.setTextureOffset(0, 0).addBox(-2.06F, -21.0F, -8.4F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cello.setTextureOffset(0, 0).addBox(1.77F, -21.0F, -8.4F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cello.setTextureOffset(0, 0).addBox(-0.645F, -18.58F, -8.4F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cello.setTextureOffset(0, 0).addBox(-1.145F, -21.58F, -8.3F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.3257F, -18.4543F, -7.4F);
		cello.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.setTextureOffset(0, 0).addBox(0.3443F, -2.1157F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.3257F, -18.4543F, -7.4F);
		cello.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.setTextureOffset(0, 0).addBox(-1.2997F, -2.0707F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.3257F, -21.4543F, -7.4F);
		cello.addChild(cube_r14);
		setRotationAngle(cube_r14, -3.1416F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(0, 0).addBox(-0.9557F, -0.0377F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.3257F, -21.4543F, -7.4F);
		cello.addChild(cube_r15);
		setRotationAngle(cube_r15, 3.1416F, 0.0F, -0.7854F);
		cube_r15.setTextureOffset(0, 0).addBox(0.4093F, -2.0457F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.3257F, -21.4543F, -7.4F);
		cello.addChild(cube_r16);
		setRotationAngle(cube_r16, 3.1416F, 0.0F, 0.7854F);
		cube_r16.setTextureOffset(0, 0).addBox(-1.3657F, -2.0057F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		cuerpo.render(matrixStack, buffer, packedLight, packedOverlay);
		ropa.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}