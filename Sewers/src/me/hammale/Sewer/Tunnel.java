package me.hammale.Sewer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class Tunnel {
	
	public int ewtStraight(Block set, Material m, BlockFace bf){
		int x = 1;
		int a = (int) (Math.random() * 40);
		if (a < 12){
			a = 12;
		}
		while (x < a) {
				int newx = x-1;
//				if (x == 1){
//					Material m1 = Material.IRON_FENCE;
//					Block otherset = set.getRelative(bf, newx);
//					Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
//					Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
//					Block set3 = otherset.getRelative(BlockFace.SOUTH, 1);
//					Block set4 = set3.getRelative(BlockFace.SOUTH, 1);
//					Block clr1 = set3.getRelative(BlockFace.UP, 1);
//					Block clr2 = clr1.getRelative(BlockFace.UP, 1);
//					Block clr3 = clr2.getRelative(BlockFace.UP, 1);
//					Block clr4 = set1.getRelative(BlockFace.UP, 1);
//					Block clr5 = clr4.getRelative(BlockFace.UP, 1);
//					Block clr6 = clr5.getRelative(BlockFace.UP, 1);
//					Block clr7 = otherset.getRelative(BlockFace.UP, 1);
//					Block clr8 = clr7.getRelative(BlockFace.UP, 1);
//					Block clr9 = clr8.getRelative(BlockFace.UP, 1);
//									
//					clr1.setType(Material.IRON_FENCE);
//					clr2.setType(Material.IRON_FENCE);
//					clr3.setType(Material.IRON_FENCE);
//					clr4.setType(Material.IRON_FENCE);
//					clr5.setType(Material.IRON_FENCE);
//					clr6.setType(Material.IRON_FENCE);
//					clr7.setType(Material.IRON_FENCE);				
//					clr8.setType(Material.IRON_FENCE);	
//					clr9.setType(Material.IRON_FENCE);
//
//					otherset.setType(m1);						
//					set3.setType(m1);
//					set4.setType(m1);
//					set1.setType(m1);			
//					set2.setType(m1);
//						
//					//
//					Block set5 = set4.getRelative(BlockFace.UP, 1);
//					Block set6 = set5.getRelative(BlockFace.UP, 1);
//					Block set7 = set6.getRelative(BlockFace.UP, 1);
//					Block set8 = set7.getRelative(BlockFace.UP, 1);
//					set5.setType(m1);
//					set6.setType(m1);
//					set7.setType(m1);
//					set8.setType(m1);
//					//
//					Block set9 = set8.getRelative(BlockFace.SOUTH, 1);
//					Block set10 = set9.getRelative(BlockFace.SOUTH, 1);
//					Block set11 = set10.getRelative(BlockFace.SOUTH, 1);
//					Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
//					set9.setType(m1);
//					set10.setType(m1);
//					set11.setType(m1);
//					set12.setType(m1);
//					//
//					Block set13 = set12.getRelative(BlockFace.DOWN, 1);
//					Block set14 = set13.getRelative(BlockFace.DOWN, 1);
//					Block set15 = set14.getRelative(BlockFace.DOWN, 1);
//					Block set16 = set15.getRelative(BlockFace.DOWN, 1);
//					set13.setType(m1);
//					set14.setType(m1);
//					set15.setType(m1);
//					set16.setType(m1);
//				}
				//START//
				Block otherset = set.getRelative(bf, newx);
				Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
				Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
				Block set3 = otherset.getRelative(BlockFace.NORTH, 1);
				Block set4 = set3.getRelative(BlockFace.NORTH, 1);
				Block clr1 = set3.getRelative(BlockFace.UP, 1);
				Block clr2 = clr1.getRelative(BlockFace.UP, 1);
				Block clr3 = clr2.getRelative(BlockFace.UP, 1);
				Block clr4 = set1.getRelative(BlockFace.UP, 1);
				Block clr5 = clr4.getRelative(BlockFace.UP, 1);
				Block clr6 = clr5.getRelative(BlockFace.UP, 1);
				Block clr7 = otherset.getRelative(BlockFace.UP, 1);
				Block clr8 = clr7.getRelative(BlockFace.UP, 1);
				Block clr9 = clr8.getRelative(BlockFace.UP, 1);
								
				clr1.setType(Material.WATER);
				int i0 = (int) (Math.random() * 10);
				if (i0 == 3){
					clr2.setType(Material.IRON_FENCE);	
				}
				else {
					clr2.setType(Material.AIR);
				}
				clr6.setType(Material.AIR);
				int i1 = (int) (Math.random() * 10);
				if (i1 == 3){
					clr3.setType(Material.IRON_FENCE);	
				}
				else {
				clr3.setType(Material.AIR);
				}
				clr4.setType(Material.WATER);
				int i2 = (int) (Math.random() * 10);
				if (i2 == 3){
					clr5.setType(Material.IRON_FENCE);	
				}
				else {
				clr5.setType(Material.AIR);
				}				
				int i3 = (int) (Math.random() * 10);
				if (i3 == 2){
					clr7.setTypeId(97);
				}
				else {
					clr7.setType(Material.WATER);
				}				
				if (i2 == 3){
					clr8.setType(Material.IRON_FENCE);	
				}
				else {
					clr8.setType(Material.AIR);
				}	
				clr9.setType(Material.AIR);

				Byte other = (byte) (Math.random() * 3);
				otherset.setType(m);
				otherset.setData(other);
				
				Byte ran2 = (byte) (Math.random() * 3);
				set3.setType(m);
				set3.setData(ran2);
				
				Byte ran4 = (byte) (Math.random() * 3);
				set4.setType(m);
				set4.setData(ran4);
				
				Byte ran = (byte) (Math.random() * 3);
				set1.setType(m);
				set1.setData(ran);
				
				Byte ran1 = (byte) (Math.random() * 3);
				set2.setType(m);
				set2.setData(ran1);
					
				//
				Block set5 = set4.getRelative(BlockFace.UP, 1);
				Block set6 = set5.getRelative(BlockFace.UP, 1);
				Block set7 = set6.getRelative(BlockFace.UP, 1);
				Block set8 = set7.getRelative(BlockFace.UP, 1);
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
				//
				Block set9 = set8.getRelative(BlockFace.SOUTH, 1);
				Block set10 = set9.getRelative(BlockFace.SOUTH, 1);
				Block set11 = set10.getRelative(BlockFace.SOUTH, 1);
				Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
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
				//
				Block set13 = set12.getRelative(BlockFace.DOWN, 1);
				Block set14 = set13.getRelative(BlockFace.DOWN, 1);
				Block set15 = set14.getRelative(BlockFace.DOWN, 1);
				Block set16 = set15.getRelative(BlockFace.DOWN, 1);
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
				
				if (x == a-1) {
					clr1.setType(Material.IRON_FENCE);
					clr2.setType(Material.IRON_FENCE);
					clr3.setType(Material.IRON_FENCE);
					clr6.setType(Material.IRON_FENCE);
					clr4.setType(Material.IRON_FENCE);
					clr5.setType(Material.IRON_FENCE);			
					clr7.setType(Material.IRON_FENCE);
					clr7.setType(Material.IRON_FENCE);				
					clr8.setType(Material.IRON_FENCE);	
					clr9.setType(Material.IRON_FENCE);
				}
				
				int spawn = (int) (Math.random() * 2);
				World world = clr4.getWorld();
				Location loc = clr1.getLocation();
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
	
	public int nstStraight(Block set, Material m, BlockFace bf){
		int x = 1;
		int a = (int) (Math.random() * 40);
		if (a < 12){
			a = 12;
		}
		while (x < a) {
			int newx = x-1;
//			if (x == 1){
//				Material m1 = Material.IRON_FENCE;
//				Block otherset = set.getRelative(bf, newx);
//				Block set1 = otherset.getRelative(BlockFace.WEST, 1);
//				Block set2 = set1.getRelative(BlockFace.WEST, 1);
//				Block set3 = otherset.getRelative(BlockFace.EAST, 1);
//				Block set4 = set3.getRelative(BlockFace.EAST, 1);
//				Block clr1 = set3.getRelative(BlockFace.UP, 1);
//				Block clr2 = clr1.getRelative(BlockFace.UP, 1);
//				Block clr3 = clr2.getRelative(BlockFace.UP, 1);
//				Block clr4 = set1.getRelative(BlockFace.UP, 1);
//				Block clr5 = clr4.getRelative(BlockFace.UP, 1);
//				Block clr6 = clr5.getRelative(BlockFace.UP, 1);
//				Block clr7 = otherset.getRelative(BlockFace.UP, 1);
//				Block clr8 = clr7.getRelative(BlockFace.UP, 1);
//				Block clr9 = clr8.getRelative(BlockFace.UP, 1);
//								
//				clr1.setType(Material.IRON_FENCE);
//				clr2.setType(Material.IRON_FENCE);
//				clr3.setType(Material.IRON_FENCE);
//				clr4.setType(Material.IRON_FENCE);
//				clr5.setType(Material.IRON_FENCE);
//				clr6.setType(Material.IRON_FENCE);
//				clr7.setType(Material.IRON_FENCE);				
//				clr8.setType(Material.IRON_FENCE);	
//				clr9.setType(Material.IRON_FENCE);
//
//				otherset.setType(m1);						
//				set3.setType(m1);
//				set4.setType(m1);
//				set1.setType(m1);			
//				set2.setType(m1);
//					
//				//
//				Block set5 = set4.getRelative(BlockFace.UP, 1);
//				Block set6 = set5.getRelative(BlockFace.UP, 1);
//				Block set7 = set6.getRelative(BlockFace.UP, 1);
//				Block set8 = set7.getRelative(BlockFace.UP, 1);
//				set5.setType(m1);
//				set6.setType(m1);
//				set7.setType(m1);
//				set8.setType(m1);
//				//
//				Block set9 = set8.getRelative(BlockFace.SOUTH, 1);
//				Block set10 = set9.getRelative(BlockFace.SOUTH, 1);
//				Block set11 = set10.getRelative(BlockFace.SOUTH, 1);
//				Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
//				set9.setType(m1);
//				set10.setType(m1);
//				set11.setType(m1);
//				set12.setType(m1);
//				//
//				Block set13 = set12.getRelative(BlockFace.DOWN, 1);
//				Block set14 = set13.getRelative(BlockFace.DOWN, 1);
//				Block set15 = set14.getRelative(BlockFace.DOWN, 1);
//				Block set16 = set15.getRelative(BlockFace.DOWN, 1);
//				set13.setType(m1);
//				set14.setType(m1);
//				set15.setType(m1);
//				set16.setType(m1);
//			}
			//START//
				Block otherset = set.getRelative(bf, newx);
				Block set1 = otherset.getRelative(BlockFace.WEST, 1);
				Block set2 = set1.getRelative(BlockFace.WEST, 1);
				Block set3 = otherset.getRelative(BlockFace.EAST, 1);
				Block set4 = set3.getRelative(BlockFace.EAST, 1);
				Block clr1 = set3.getRelative(BlockFace.UP, 1);
				Block clr2 = clr1.getRelative(BlockFace.UP, 1);
				Block clr3 = clr2.getRelative(BlockFace.UP, 1);
				Block clr4 = set1.getRelative(BlockFace.UP, 1);
				Block clr5 = clr4.getRelative(BlockFace.UP, 1);
				Block clr6 = clr5.getRelative(BlockFace.UP, 1);
				Block clr7 = otherset.getRelative(BlockFace.UP, 1);
				Block clr8 = clr7.getRelative(BlockFace.UP, 1);
				Block clr9 = clr8.getRelative(BlockFace.UP, 1);
								
				clr1.setType(Material.WATER);
				int i0 = (int) (Math.random() * 10);
				if (i0 == 3){
					clr2.setType(Material.IRON_FENCE);	
				}
				else {
					clr2.setType(Material.AIR);
				}
				clr6.setType(Material.AIR);
				int i1 = (int) (Math.random() * 10);
				if (i1 == 3){
					clr3.setType(Material.IRON_FENCE);	
				}
				else {
				clr3.setType(Material.AIR);
				}
				clr4.setType(Material.WATER);
				int i2 = (int) (Math.random() * 10);
				if (i2 == 3){
					clr5.setType(Material.IRON_FENCE);	
				}
				else {
				clr5.setType(Material.AIR);
				}				
				int i3 = (int) (Math.random() * 10);
				if (i3 == 2){
					clr7.setTypeId(97);
				}
				else {
					clr7.setType(Material.WATER);
				}				
				clr8.setType(Material.AIR);	
				clr9.setType(Material.AIR);

				Byte other = (byte) (Math.random() * 3);
				otherset.setType(m);
				otherset.setData(other);
				
				Byte ran2 = (byte) (Math.random() * 3);
				set3.setType(m);
				set3.setData(ran2);
				
				Byte ran4 = (byte) (Math.random() * 3);
				set4.setType(m);
				set4.setData(ran4);
				
				Byte ran = (byte) (Math.random() * 3);
				set1.setType(m);
				set1.setData(ran);
				
				Byte ran1 = (byte) (Math.random() * 3);
				set2.setType(m);
				set2.setData(ran1);
				//
				Block set5 = set4.getRelative(BlockFace.UP, 1);
				Block set6 = set5.getRelative(BlockFace.UP, 1);
				Block set7 = set6.getRelative(BlockFace.UP, 1);
				Block set8 = set7.getRelative(BlockFace.UP, 1);
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
				//
				Block set9 = set8.getRelative(BlockFace.WEST, 1);
				Block set10 = set9.getRelative(BlockFace.WEST, 1);
				Block set11 = set10.getRelative(BlockFace.WEST, 1);
				Block set12 = set11.getRelative(BlockFace.WEST, 1);
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
				//
				Block set13 = set12.getRelative(BlockFace.DOWN, 1);
				Block set14 = set13.getRelative(BlockFace.DOWN, 1);
				Block set15 = set14.getRelative(BlockFace.DOWN, 1);
				Block set16 = set15.getRelative(BlockFace.DOWN, 1);
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
						
				if (x == a-1) {
					clr1.setType(Material.IRON_FENCE);
					clr2.setType(Material.IRON_FENCE);
					clr3.setType(Material.IRON_FENCE);
					clr6.setType(Material.IRON_FENCE);
					clr4.setType(Material.IRON_FENCE);
					clr5.setType(Material.IRON_FENCE);			
					clr7.setType(Material.IRON_FENCE);
					clr7.setType(Material.IRON_FENCE);				
					clr8.setType(Material.IRON_FENCE);	
					clr9.setType(Material.IRON_FENCE);
				}
				
				int spawn = (int) (Math.random() * 2);
				World world = clr4.getWorld();
				Location loc = clr1.getLocation();
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
