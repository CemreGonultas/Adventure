
public class ToolStore extends NormalLocation {
	
	ToolStore(Player player) {
		super(player, "Mağaza");
	}
	public boolean getLocation() {
		System.out.println("Para: " + player.getMoney());
		System.out.println("1.Silahlar");
		System.out.println("2.Zırhlar");
		System.out.println("3.Çıkış");
		System.out.println("Seçiminiz: ");
		int selTool = scan.nextInt();
		int selItemID;
		switch(selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
			
		}
		return true;
	}
	public int armorMenu() {
		System.out.println("1. Hafif\t<Para:15 - Hasar: 1>");
		System.out.println("2. Orta\t<Para:25 - Hasar: 3>");
		System.out.println("3. Ağır\t<Para:40 - Hasar: 5>");
		System.out.println("4. Çıkış");
		System.out.println("Silah seçiniz: ");
		int selArmorID=scan.nextInt();
		return selArmorID;
	}
	public void buyArmor(int itemID) {
		int avoid = 0, price = 0;
		String aName = null;
		switch(itemID) {
		case 1:
			avoid = 1;
			aName = "Hafif";
			price = 15;
			break;
		case 2:
			avoid = 3;
			aName = "Orta";
			price = 25;
			break;
		case 3:
			avoid = 5;
			aName = "Ağır";
			price = 40;
			break;
		default:
			System.out.println("Geçersiz işlem!");
			break;
		
		}
		if (price > 0 ) {
			if(player.getMoney() > price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney() - price);
				System.out.println(aName + " satın aldınız." + "Engellenen Hasar: " + player.getInv().getArmor());
				
				System.out.println("Kalan para: " + player.getMoney());
				
			}
			else {
				System.out.println("Para yetersiz.");
			}		
		}
		
		
	}
	public int weaponMenu() {
		System.out.println("1. Tabanca\t <Para : 25 - Hasar : 2>");
		System.out.println("2. Kılıç\t <Para : 35 - Hasar : 3>");
		System.out.println("3. Tüfek\t <Para : 45 - Hasar : 7>");
		System.out.println("4. Çıkış");
		System.out.println("Silah seçiniz: ");
		int selWeaponID = scan.nextInt();
		return selWeaponID;


	}
	public void buyWeapon(int itemID) {
		int damage = 0, price = 0;
		String wName = null;
		switch(itemID) {
		case 1:
			damage = 2;
			wName = "Tabanca";
			price = 25;
			break;
		case 2:
			damage = 3;
			wName = "Kılıç";
			price = 35;
			break;
		case 3:
			damage = 7;
			wName = "Tüfek";
			price = 45;
			break;
		default:
			System.out.println("Geçersiz işlem!");
			break;
		
		}
		if (price > 0 ) {
			if(player.getMoney() > price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println(wName + " satın aldınız." + "Kalan Hasar" + player.getTotalDamage());
				
				System.out.println("Kalan para: " + player.getMoney());
				
			}
			else {
				System.out.println("Para yetersiz.");
			}		
		}
		
	}

}
