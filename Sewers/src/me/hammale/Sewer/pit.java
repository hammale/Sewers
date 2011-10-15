package me.hammale.Sewer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class pit {
	
	public int pit1(Block set, Material m, Block b, BlockFace bf){
		int x = 1;
		int a = (int) (Math.random() * 30);
		if (a < 12){
			a = 12;
		}
		while (x < a) {
				int newx = x-1;
				Block otherset = set.getRelative(bf, newx);
				Block clr10 = otherset.getRelative(BlockFace.DOWN, 1);
				Block clr20 = otherset.getRelative(BlockFace.DOWN, 2);
				Block clr30 = otherset.getRelative(BlockFace.DOWN, 3);
				Block clr40 = otherset.getRelative(BlockFace.DOWN, 4);
				Block clr50 = otherset.getRelative(BlockFace.DOWN, 5);
				Block clr60 = otherset.getRelative(BlockFace.DOWN, 6);
				Block clr70 = otherset.getRelative(BlockFace.DOWN, 7);					
				Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
				Block clr1 = set1.getRelative(BlockFace.DOWN, 1);
				Block clr2 = set1.getRelative(BlockFace.DOWN, 2);
				Block clr3 = set1.getRelative(BlockFace.DOWN, 3);
				Block clr4 = set1.getRelative(BlockFace.DOWN, 4);
				Block clr5 = set1.getRelative(BlockFace.DOWN, 5);
				Block clr6 = set1.getRelative(BlockFace.DOWN, 6);
				Block clr7 = set1.getRelative(BlockFace.DOWN, 7);		
				Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
				Block clr11 = set2.getRelative(BlockFace.DOWN, 1);
				Block clr21 = set2.getRelative(BlockFace.DOWN, 2);
				Block clr31 = set2.getRelative(BlockFace.DOWN, 3);
				Block clr41 = set2.getRelative(BlockFace.DOWN, 4);
				Block clr51 = set2.getRelative(BlockFace.DOWN, 5);
				Block clr61 = set2.getRelative(BlockFace.DOWN, 6);
				Block clr71 = set2.getRelative(BlockFace.DOWN, 7);
				Block set1111 = set2.getRelative(BlockFace.SOUTH, 1);
				Block clr111 = set1111.getRelative(BlockFace.DOWN, 1);
				Block clr211 = set1111.getRelative(BlockFace.DOWN, 2);
				Block clr311 = set1111.getRelative(BlockFace.DOWN, 3);
				Block clr411 = set1111.getRelative(BlockFace.DOWN, 4);
				Block clr511 = set1111.getRelative(BlockFace.DOWN, 5);
				Block clr611 = set1111.getRelative(BlockFace.DOWN, 6);
				Block clr711 = set1111.getRelative(BlockFace.DOWN, 7);
				Block set2111 = set1111.getRelative(BlockFace.SOUTH, 1);
				Block clr1111 = set2111.getRelative(BlockFace.DOWN, 1);
				Block clr2111 = set2111.getRelative(BlockFace.DOWN, 2);
				Block clr3111 = set2111.getRelative(BlockFace.DOWN, 3);
				Block clr4111 = set2111.getRelative(BlockFace.DOWN, 4);
				Block clr5111 = set2111.getRelative(BlockFace.DOWN, 5);
				Block clr6111 = set2111.getRelative(BlockFace.DOWN, 6);
				Block clr7111 = set2111.getRelative(BlockFace.DOWN, 7);
				Block set3111 = set2111.getRelative(BlockFace.SOUTH, 1);
				Block clr11111 = set3111.getRelative(BlockFace.DOWN, 1);
				Block clr21111 = set3111.getRelative(BlockFace.DOWN, 2);
				Block clr31111 = set3111.getRelative(BlockFace.DOWN, 3);
				Block clr41111 = set3111.getRelative(BlockFace.DOWN, 4);
				Block clr51111 = set3111.getRelative(BlockFace.DOWN, 5);
				Block clr61111 = set3111.getRelative(BlockFace.DOWN, 6);
				Block clr71111 = set3111.getRelative(BlockFace.DOWN, 7);
				Block set4111 = set3111.getRelative(BlockFace.SOUTH, 1);
//				Block clr1111111 = set4111.getRelative(BlockFace.DOWN, 1);
//				Block clr2111111 = set4111.getRelative(BlockFace.DOWN, 2);
//				Block clr3111111 = set4111.getRelative(BlockFace.DOWN, 3);
//				Block clr4111111 = set4111.getRelative(BlockFace.DOWN, 4);
				Block clr5111111 = set4111.getRelative(BlockFace.DOWN, 5);
//				Block clr6111111 = set4111.getRelative(BlockFace.DOWN, 6);
//				Block clr7111111 = set4111.getRelative(BlockFace.DOWN, 7);
				Block set3 = otherset.getRelative(BlockFace.SOUTH, 1);
				Block clr111111 = set3.getRelative(BlockFace.DOWN, 1);
				Block clr211111 = set3.getRelative(BlockFace.DOWN, 2);
				Block clr311111 = set3.getRelative(BlockFace.DOWN, 3);
				Block clr411111 = set3.getRelative(BlockFace.DOWN, 4);
				Block clr511111 = set3.getRelative(BlockFace.DOWN, 5);
				Block clr611111 = set3.getRelative(BlockFace.DOWN, 6);
				Block clr711111 = set3.getRelative(BlockFace.DOWN, 7);
				
				Byte other = (byte) (Math.random() * 3);
				set3.setType(m);
				set3.setData(other);
				
				Byte ran2 = (byte) (Math.random() * 3);
				otherset.setType(m);
				otherset.setData(ran2);
				
				Byte ran = (byte) (Math.random() * 3);
				set1.setType(m);
				set1.setData(ran);
				
				Byte ran1 = (byte) (Math.random() * 3);
				set2.setType(m);
				set2.setData(ran1);
				
				Byte ran1111 = (byte) (Math.random() * 3);
				set1111.setType(m);
				set1111.setData(ran1111);
				
				Byte ran2111 = (byte) (Math.random() * 3);
				set2111.setType(m);
				set2111.setData(ran2111);
				
				Byte ran3111 = (byte) (Math.random() * 3);
				set3111.setType(m);
				set3111.setData(ran3111);
				
				Byte ran4111 = (byte) (Math.random() * 3);
				set4111.setType(m);
				set4111.setData(ran4111);
					
				//
				Block set5 = set4111.getRelative(BlockFace.DOWN, 1);
				Block set6 = set5.getRelative(BlockFace.DOWN, 1);
				Block set7 = set6.getRelative(BlockFace.DOWN, 1);
				Block set8 = set7.getRelative(BlockFace.DOWN, 1);
				Block set51 = set8.getRelative(BlockFace.DOWN, 1);
				Block set61 = set51.getRelative(BlockFace.DOWN, 1);
				Block set71 = set61.getRelative(BlockFace.DOWN, 1);
				Block set81 = set71.getRelative(BlockFace.DOWN, 1);
				Byte ran3 = (byte) (Math.random() * 3);
				Byte ran7 = (byte) (Math.random() * 3);
				Byte ran5 = (byte) (Math.random() * 3);
				Byte ran6 = (byte) (Math.random() * 3);
				set5.setType(m);
				int rtorch1 = (int) (Math.random() * 5);
				if (rtorch1 == 1){
					set5.setType(Material.GLOWSTONE);
				}
				set5.setData(ran3);
				set6.setType(m);
				set6.setData(ran7);
				set7.setType(m);
				set7.setData(ran5);
				set8.setType(m);
				set8.setData(ran6);
				
				Byte ran31 = (byte) (Math.random() * 3);
				Byte ran71 = (byte) (Math.random() * 3);
				Byte ran51 = (byte) (Math.random() * 3);
				Byte ran61 = (byte) (Math.random() * 3);
				set51.setType(m);
				int rtorch11 = (int) (Math.random() * 5);
				if (rtorch11 == 1){
					set5.setType(Material.GLOWSTONE);
				}
				set51.setData(ran31);
				set61.setType(m);
				set61.setData(ran71);
				set71.setType(m);
				set71.setData(ran51);
				set81.setType(m);
				set81.setData(ran61);
				
				//
				Block set9 = set81.getRelative(BlockFace.SOUTH, 1);
				Block set10 = set9.getRelative(BlockFace.SOUTH, 1);
				Block set11 = set10.getRelative(BlockFace.SOUTH, 1);
				Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
				Block set91 = set12.getRelative(BlockFace.SOUTH, 1);
				Block set101 = set91.getRelative(BlockFace.SOUTH, 1);
				Block set111 = set101.getRelative(BlockFace.SOUTH, 1);
				Block set121 = set111.getRelative(BlockFace.SOUTH, 1);
				Byte ran11 = (byte) (Math.random() * 3);
				Byte ran8 = (byte) (Math.random() * 3);
				Byte ran9 = (byte) (Math.random() * 3);
				Byte ran10 = (byte) (Math.random() * 3);
				set9.setType(m);
				set9.setData(ran11);
				set10.setType(m);
				set10.setData(ran8);
				set11.setType(m);
				set11.setData(ran9);
				set12.setType(m);
				set12.setData(ran10);				
				Byte ran91 = (byte) (Math.random() * 3);
				Byte ran101 = (byte) (Math.random() * 3);
				Byte ran111 = (byte) (Math.random() * 3);
				Byte ran121 = (byte) (Math.random() * 3);
				set91.setType(m);
				set91.setData(ran91);
				set101.setType(m);
				set101.setData(ran101);
				set111.setType(m);
				set111.setData(ran111);
				set121.setType(m);
				set121.setData(ran121);
				//
				Block set13 = set121.getRelative(BlockFace.UP, 1);
				Block set14 = set13.getRelative(BlockFace.UP, 1);
				Block set15 = set14.getRelative(BlockFace.UP, 1);
				Block set16 = set15.getRelative(BlockFace.UP, 1);
				Block set17 = set16.getRelative(BlockFace.UP, 1);
				Block set18 = set17.getRelative(BlockFace.UP, 1);
				Block set19 = set18.getRelative(BlockFace.UP, 1);
				Block set20 = set19.getRelative(BlockFace.UP, 1);
				Byte ran12 = (byte) (Math.random() * 3);
				Byte ran13 = (byte) (Math.random() * 3);
				Byte ran14 = (byte) (Math.random() * 3);
				Byte ran15 = (byte) (Math.random() * 3);
				set13.setType(m);
				set13.setData(ran12);
				set14.setType(m);
				set14.setData(ran13);
				set15.setType(m);
				set15.setData(ran14);
				set16.setType(m);
				set16.setData(ran15);
				Byte ran17 = (byte) (Math.random() * 3);
				Byte ran18 = (byte) (Math.random() * 3);
				Byte ran19 = (byte) (Math.random() * 3);
				Byte ran20 = (byte) (Math.random() * 3);
				set17.setType(m);
				set17.setData(ran17);
				set18.setType(m);
				set18.setData(ran18);
				set19.setType(m);
				set19.setData(ran19);
				set20.setType(m);
				set20.setData(ran20);
				
				clr1.setType(Material.AIR);
				clr10.setType(Material.AIR);
				clr11.setType(Material.AIR);
				clr111.setType(Material.AIR);
				clr1111.setType(Material.AIR);
				clr11111.setType(Material.AIR);
				clr111111.setType(Material.AIR);
				
				clr2.setType(Material.AIR);
				clr20.setType(Material.AIR);
				clr21.setType(Material.AIR);
				clr211.setType(Material.AIR);
				clr2111.setType(Material.AIR);
				clr21111.setType(Material.AIR);
				clr211111.setType(Material.AIR);
				
				clr3.setType(Material.AIR);
				clr30.setType(Material.AIR);
				clr31.setType(Material.AIR);
				clr311.setType(Material.AIR);
				clr3111.setType(Material.AIR);
				clr31111.setType(Material.AIR);
				clr311111.setType(Material.AIR);
				
				clr4.setType(Material.AIR);
				clr40.setType(Material.AIR);
				clr41.setType(Material.AIR);
				clr411.setType(Material.AIR);
				clr4111.setType(Material.AIR);
				clr41111.setType(Material.AIR);
				clr411111.setType(Material.AIR);
				
				clr5.setType(Material.AIR);
				clr50.setType(Material.AIR);
				clr51.setType(Material.AIR);
				clr511.setType(Material.AIR);
				clr5111.setType(Material.AIR);
				clr51111.setType(Material.WATER);
				clr511111.setType(Material.AIR);
				clr5111111.setType(Material.IRON_FENCE);
				
				clr6.setType(Material.WATER);
				clr60.setType(Material.WATER);
				clr61.setType(Material.WATER);
				clr611.setType(Material.WATER);
				clr6111.setType(Material.WATER);
				clr61111.setType(Material.WATER);
				clr611111.setType(Material.WATER);
				
				clr7.setType(Material.WATER);
				clr70.setType(Material.WATER);
				clr71.setType(Material.WATER);
				clr711.setType(Material.WATER);
				clr7111.setType(Material.WATER);
				clr71111.setType(Material.WATER);
				clr711111.setType(Material.WATER);
				
				int spawn = (int) (Math.random() * 1);
				World world = clr611.getWorld();
				Location loc = clr611.getLocation();
				int svar = 0;
				while (svar != spawn){
//				world.spawnCreature(loc, CreatureType.SILVERFISH);
				svar++;
				}
				
				newx++;
				x++;
			}
		return a;
	  }
	
	public int pit2(Block set, Material m, Block b, BlockFace bf){
		int x = 1;
		int a = (int) (Math.random() * 30);
		if (a < 12){
			a = 12;
		}
		while (x < a) {
				int newx = x-1;
				Block otherset = set.getRelative(bf, newx);
				Block clr10 = otherset.getRelative(BlockFace.DOWN, 1);
				Block clr20 = otherset.getRelative(BlockFace.DOWN, 2);
				Block clr30 = otherset.getRelative(BlockFace.DOWN, 3);
				Block clr40 = otherset.getRelative(BlockFace.DOWN, 4);
				Block clr50 = otherset.getRelative(BlockFace.DOWN, 5);
				Block clr60 = otherset.getRelative(BlockFace.DOWN, 6);
				Block clr70 = otherset.getRelative(BlockFace.DOWN, 7);					
				Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
				Block clr1 = set1.getRelative(BlockFace.DOWN, 1);
				Block clr2 = set1.getRelative(BlockFace.DOWN, 2);
				Block clr3 = set1.getRelative(BlockFace.DOWN, 3);
				Block clr4 = set1.getRelative(BlockFace.DOWN, 4);
				Block clr5 = set1.getRelative(BlockFace.DOWN, 5);
				Block clr6 = set1.getRelative(BlockFace.DOWN, 6);
				Block clr7 = set1.getRelative(BlockFace.DOWN, 7);		
				Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
				Block clr11 = set2.getRelative(BlockFace.DOWN, 1);
				Block clr21 = set2.getRelative(BlockFace.DOWN, 2);
				Block clr31 = set2.getRelative(BlockFace.DOWN, 3);
				Block clr41 = set2.getRelative(BlockFace.DOWN, 4);
				Block clr51 = set2.getRelative(BlockFace.DOWN, 5);
				Block clr61 = set2.getRelative(BlockFace.DOWN, 6);
				Block clr71 = set2.getRelative(BlockFace.DOWN, 7);
				Block set1111 = set2.getRelative(BlockFace.SOUTH, 1);
				Block clr111 = set1111.getRelative(BlockFace.DOWN, 1);
				Block clr211 = set1111.getRelative(BlockFace.DOWN, 2);
				Block clr311 = set1111.getRelative(BlockFace.DOWN, 3);
				Block clr411 = set1111.getRelative(BlockFace.DOWN, 4);
				Block clr511 = set1111.getRelative(BlockFace.DOWN, 5);
				Block clr611 = set1111.getRelative(BlockFace.DOWN, 6);
				Block clr711 = set1111.getRelative(BlockFace.DOWN, 7);
				Block set2111 = set1111.getRelative(BlockFace.SOUTH, 1);
				Block clr1111 = set2111.getRelative(BlockFace.DOWN, 1);
				Block clr2111 = set2111.getRelative(BlockFace.DOWN, 2);
				Block clr3111 = set2111.getRelative(BlockFace.DOWN, 3);
				Block clr4111 = set2111.getRelative(BlockFace.DOWN, 4);
				Block clr5111 = set2111.getRelative(BlockFace.DOWN, 5);
				Block clr6111 = set2111.getRelative(BlockFace.DOWN, 6);
				Block clr7111 = set2111.getRelative(BlockFace.DOWN, 7);
				Block set3111 = set2111.getRelative(BlockFace.SOUTH, 1);
				Block clr11111 = set3111.getRelative(BlockFace.DOWN, 1);
				Block clr21111 = set3111.getRelative(BlockFace.DOWN, 2);
				Block clr31111 = set3111.getRelative(BlockFace.DOWN, 3);
				Block clr41111 = set3111.getRelative(BlockFace.DOWN, 4);
				Block clr51111 = set3111.getRelative(BlockFace.DOWN, 5);
				Block clr61111 = set3111.getRelative(BlockFace.DOWN, 6);
				Block clr71111 = set3111.getRelative(BlockFace.DOWN, 7);
				Block set4111 = set3111.getRelative(BlockFace.SOUTH, 1);
//				Block clr1111111 = set4111.getRelative(BlockFace.DOWN, 1);
//				Block clr2111111 = set4111.getRelative(BlockFace.DOWN, 2);
//				Block clr3111111 = set4111.getRelative(BlockFace.DOWN, 3);
//				Block clr4111111 = set4111.getRelative(BlockFace.DOWN, 4);
				Block clr5111111 = set4111.getRelative(BlockFace.DOWN, 5);
//				Block clr6111111 = set4111.getRelative(BlockFace.DOWN, 6);
//				Block clr7111111 = set4111.getRelative(BlockFace.DOWN, 7);
				Block set3 = otherset.getRelative(BlockFace.SOUTH, 1);
				Block clr111111 = set3.getRelative(BlockFace.DOWN, 1);
				Block clr211111 = set3.getRelative(BlockFace.DOWN, 2);
				Block clr311111 = set3.getRelative(BlockFace.DOWN, 3);
				Block clr411111 = set3.getRelative(BlockFace.DOWN, 4);
				Block clr511111 = set3.getRelative(BlockFace.DOWN, 5);
				Block clr611111 = set3.getRelative(BlockFace.DOWN, 6);
				Block clr711111 = set3.getRelative(BlockFace.DOWN, 7);
				
				clr1.setType(Material.AIR);
				clr10.setType(Material.AIR);
				clr11.setType(Material.AIR);
				clr111.setType(Material.AIR);
				clr1111.setType(Material.AIR);
				clr11111.setType(Material.AIR);
				clr111111.setType(Material.AIR);
				
				clr2.setType(Material.AIR);
				clr20.setType(Material.AIR);
				clr21.setType(Material.AIR);
				clr211.setType(Material.AIR);
				clr2111.setType(Material.AIR);
				clr21111.setType(Material.AIR);
				clr211111.setType(Material.AIR);
				
				clr3.setType(Material.AIR);
				clr30.setType(Material.AIR);
				clr31.setType(Material.AIR);
				clr311.setType(Material.AIR);
				clr3111.setType(Material.AIR);
				clr31111.setType(Material.AIR);
				clr311111.setType(Material.AIR);
				
				clr4.setType(Material.AIR);
				clr40.setType(Material.AIR);
				clr41.setType(Material.AIR);
				clr411.setType(Material.AIR);
				clr4111.setType(Material.AIR);
				clr41111.setType(Material.AIR);
				clr411111.setType(Material.AIR);
				
				clr5.setType(Material.AIR);
				clr50.setType(Material.AIR);
				clr51.setType(Material.AIR);
				clr511.setType(Material.AIR);
				clr5111.setType(Material.AIR);
				clr51111.setType(Material.AIR);
				clr511111.setType(Material.AIR);
				clr5111111.setType(Material.AIR);
				
				clr6.setType(Material.WATER);
				clr60.setType(Material.WATER);
				clr61.setType(Material.WATER);
				clr611.setType(Material.WATER);
				clr6111.setType(Material.WATER);
				clr61111.setType(Material.WATER);
				clr611111.setType(Material.WATER);
				
				clr7.setType(Material.WATER);
				clr70.setType(Material.WATER);
				clr71.setType(Material.WATER);
				clr711.setType(Material.WATER);
				clr7111.setType(Material.WATER);
				clr71111.setType(Material.WATER);
				clr711111.setType(Material.WATER);
									
				Byte other = (byte) (Math.random() * 3);
				set3.setType(m);
				set3.setData(other);
				
				Byte ran2 = (byte) (Math.random() * 3);
				otherset.setType(m);
				otherset.setData(ran2);
				
				Byte ran = (byte) (Math.random() * 3);
				set1.setType(m);
				set1.setData(ran);
				
				Byte ran1 = (byte) (Math.random() * 3);
				set2.setType(m);
				set2.setData(ran1);
				
				Byte ran1111 = (byte) (Math.random() * 3);
				set1111.setType(m);
				set1111.setData(ran1111);
				
				Byte ran2111 = (byte) (Math.random() * 3);
				set2111.setType(m);
				set2111.setData(ran2111);
				
				Byte ran3111 = (byte) (Math.random() * 3);
				set3111.setType(m);
				set3111.setData(ran3111);
				
				Byte ran4111 = (byte) (Math.random() * 3);
				set4111.setType(m);
				set4111.setData(ran4111);
					
				//
				Block set5 = set4111.getRelative(BlockFace.DOWN, 1);
				Block set6 = set5.getRelative(BlockFace.DOWN, 1);
				Block set7 = set6.getRelative(BlockFace.DOWN, 1);
				Block set8 = set7.getRelative(BlockFace.DOWN, 1);
				Block set51 = set8.getRelative(BlockFace.DOWN, 1);
				Block set61 = set51.getRelative(BlockFace.DOWN, 1);
				Block set71 = set61.getRelative(BlockFace.DOWN, 1);
				Block set81 = set71.getRelative(BlockFace.DOWN, 1);
				Byte ran3 = (byte) (Math.random() * 3);
				Byte ran7 = (byte) (Math.random() * 3);
				Byte ran5 = (byte) (Math.random() * 3);
				Byte ran6 = (byte) (Math.random() * 3);
				set5.setType(m);
				int rtorch1 = (int) (Math.random() * 5);
				if (rtorch1 == 1){
					set5.setType(Material.GLOWSTONE);
				}
				set5.setData(ran3);
				set6.setType(m);
				set6.setData(ran7);
				set7.setType(m);
				set7.setData(ran5);
				set8.setType(m);
				set8.setData(ran6);
				
				Byte ran31 = (byte) (Math.random() * 3);
				Byte ran71 = (byte) (Math.random() * 3);
				Byte ran51 = (byte) (Math.random() * 3);
				Byte ran61 = (byte) (Math.random() * 3);
				set51.setType(m);
				int rtorch11 = (int) (Math.random() * 5);
				if (rtorch11 == 1){
					set5.setType(Material.GLOWSTONE);
				}
				set51.setData(ran31);
				set61.setType(m);
				set61.setData(ran71);
				set71.setType(m);
				set71.setData(ran51);
				set81.setType(m);
				set81.setData(ran61);
				
				//
				Block set9 = set81.getRelative(BlockFace.SOUTH, 1);
				Block set10 = set9.getRelative(BlockFace.SOUTH, 1);
				Block set11 = set10.getRelative(BlockFace.SOUTH, 1);
				Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
				Block set91 = set12.getRelative(BlockFace.SOUTH, 1);
				Block set101 = set91.getRelative(BlockFace.SOUTH, 1);
				Block set111 = set101.getRelative(BlockFace.SOUTH, 1);
				Block set121 = set111.getRelative(BlockFace.SOUTH, 1);
				Byte ran11 = (byte) (Math.random() * 3);
				Byte ran8 = (byte) (Math.random() * 3);
				Byte ran9 = (byte) (Math.random() * 3);
				Byte ran10 = (byte) (Math.random() * 3);
				set9.setType(m);
				set9.setData(ran11);
				set10.setType(m);
				set10.setData(ran8);
				set11.setType(m);
				set11.setData(ran9);
				set12.setType(m);
				set12.setData(ran10);				
				Byte ran91 = (byte) (Math.random() * 3);
				Byte ran101 = (byte) (Math.random() * 3);
				Byte ran111 = (byte) (Math.random() * 3);
				Byte ran121 = (byte) (Math.random() * 3);
				set91.setType(m);
				set91.setData(ran91);
				set101.setType(m);
				set101.setData(ran101);
				set111.setType(m);
				set111.setData(ran111);
				set121.setType(m);
				set121.setData(ran121);
				//
				Block set13 = set121.getRelative(BlockFace.UP, 1);
				Block set14 = set13.getRelative(BlockFace.UP, 1);
				Block set15 = set14.getRelative(BlockFace.UP, 1);
				Block set16 = set15.getRelative(BlockFace.UP, 1);
				Block set17 = set16.getRelative(BlockFace.UP, 1);
				Block set18 = set17.getRelative(BlockFace.UP, 1);
				Block set19 = set18.getRelative(BlockFace.UP, 1);
				Block set20 = set19.getRelative(BlockFace.UP, 1);
				Byte ran12 = (byte) (Math.random() * 3);
				Byte ran13 = (byte) (Math.random() * 3);
				Byte ran14 = (byte) (Math.random() * 3);
				Byte ran15 = (byte) (Math.random() * 3);
				set13.setType(m);
				set13.setData(ran12);
				set14.setType(m);
				set14.setData(ran13);
				set15.setType(m);
				set15.setData(ran14);
				set16.setType(m);
				set16.setData(ran15);
				Byte ran17 = (byte) (Math.random() * 3);
				Byte ran18 = (byte) (Math.random() * 3);
				Byte ran19 = (byte) (Math.random() * 3);
				Byte ran20 = (byte) (Math.random() * 3);
				set17.setType(m);
				set17.setData(ran17);
				set18.setType(m);
				set18.setData(ran18);
				set19.setType(m);
				set19.setData(ran19);
				set20.setType(m);
				set20.setData(ran20);
				
				int spawn = (int) (Math.random() * 1);
				World world = clr611.getWorld();
				Location loc = clr611.getLocation();
				int svar = 0;
				while (svar != spawn){
//				world.spawnCreature(loc, CreatureType.SILVERFISH);
				svar++;
				}
				
				newx++;
				x++;
			}
		return a;
	}
	
}