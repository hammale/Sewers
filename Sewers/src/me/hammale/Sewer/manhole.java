package me.hammale.Sewer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public class manhole {
	
	public int man1(Block set, Material m, BlockFace bf){
		int x = 1;
		int a = (int) (Math.random() * 30);
		if (a < 12){
			a = 12;
		}
		BlockFace down = BlockFace.DOWN;
		while (x < a) {
				int newx = x-1;
				//START//
				Block otherset = set.getRelative(down, newx);
				Block set1 = otherset.getRelative(BlockFace.NORTH, 1);
				Block set2 = set1.getRelative(BlockFace.NORTH, 1);
				Block set3 = set2.getRelative(BlockFace.WEST, 1);
				Block set4 = set3.getRelative(BlockFace.WEST, 1);
				Block set5 = set4.getRelative(BlockFace.SOUTH, 1);
				Block set6 = set5.getRelative(BlockFace.SOUTH, 1);
				Block set8 = set6.getRelative(BlockFace.EAST, 1);
				Block set9 = set8.getRelative(BlockFace.EAST, 1);
				
				
				Block clr1 = set1.getRelative(BlockFace.WEST, 1);
								
				clr1.setType(Material.AIR);

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
				set8.setType(m);
				set8.setData(ran6);
				//
				Byte ran11 = (byte) (Math.random() * 3);
				Byte ran8 = (byte) (Math.random() * 3);
				Byte ran9 = (byte) (Math.random() * 3);
				Byte ran10 = (byte) (Math.random() * 3);
				set1.setType(m);
				set1.setData(ran11);
				set2.setType(m);
				set2.setData(ran8);
				set3.setType(m);
				set3.setData(ran9);
				set4.setType(m);
				set4.setData(ran10);
				//
				Byte ran12 = (byte) (Math.random() * 3);
				set9.setType(m);
				set9.setData(ran12);
				
				if (x == 1) {
					clr1.setType(Material.IRON_FENCE);
				} else {
					byte flags = ( byte )8;
					flags = ( byte )( flags | 0x4 );
					clr1.setTypeIdAndData( 65, flags, true );
				}
				
								
				newx++;
				x++;
			}
		return a;
	  }
}