package me.hammale.Sewer;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

public class entrance {
	
	private final manhole man = new manhole();
	
int i = 1;
public int ent1(Block set, Material m, BlockFace bf){
	int x = 0;
	int a = (int) (Math.random() * 20);
	if (a < 12){
		a = 12;
	}
	BlockFace up = BlockFace.UP;
	Block setter = set.getRelative(BlockFace.UP, 1);

	while (x < 4) {
			int newx = x-1;
			setter = set.getRelative(BlockFace.UP, x);
			//START//
			Block otherset = set.getRelative(up, x);
			Block set1 = otherset.getRelative(BlockFace.NORTH, 1);
			Block set2 = set1.getRelative(BlockFace.NORTH, 1);
			Block set3 = set2.getRelative(BlockFace.NORTH, 1);
			Block set4 = set3.getRelative(BlockFace.NORTH, 1);
			Block set5 = set4.getRelative(BlockFace.NORTH, 1);
						
			Block set6 = set5.getRelative(BlockFace.WEST, 1);
			Block set7 = set6.getRelative(BlockFace.WEST, 1);
			Block set8 = set7.getRelative(BlockFace.WEST, 1);
			Block set9 = set8.getRelative(BlockFace.WEST, 1);
			Block set10 = set9.getRelative(BlockFace.WEST, 1);
			Block set11 = set10.getRelative(BlockFace.WEST, 1);
			
			Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
			Block set13 = set12.getRelative(BlockFace.SOUTH, 1);
			Block set14= set13.getRelative(BlockFace.SOUTH, 1);
			Block set15 = set14.getRelative(BlockFace.SOUTH, 1);
			Block set16 = set15.getRelative(BlockFace.SOUTH, 1);
			
			Block set17 = set16.getRelative(BlockFace.EAST, 1);
			Block set18 = set17.getRelative(BlockFace.EAST, 1);
			Block set19 = set18.getRelative(BlockFace.EAST, 1);
			Block set20 = set19.getRelative(BlockFace.EAST, 1);
			Block set21 = set20.getRelative(BlockFace.EAST, 1);
				
			Block set27 = set18.getRelative(BlockFace.NORTH, 1);
			Block set28 = set20.getRelative(BlockFace.NORTH, 1);
									
			if(x == 1){
				
				int c = 1;
				while (c <= 4){
					Block clr1 = set17.getRelative(BlockFace.NORTH, c);
					Block down = clr1.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set17.getRelative(BlockFace.NORTH, c);
					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr2 = set18.getRelative(BlockFace.NORTH, c);
					Block down = clr2.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set18.getRelative(BlockFace.NORTH, c);
					clr.setType(Material.AIR);							
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr3 = set19.getRelative(BlockFace.NORTH, c);
					Block down = clr3.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set8.getRelative(BlockFace.SOUTH, c);
					clr.setType(Material.AIR);
					c++;
				}			
				c = 1;
				while (c <= 4){
					Block clr4 = set20.getRelative(BlockFace.NORTH, c);
					Block down = clr4.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set20.getRelative(BlockFace.NORTH, c);
					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr5 = set21.getRelative(BlockFace.NORTH, c);
					Block down = clr5.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set21.getRelative(BlockFace.NORTH, c);
					clr.setType(Material.AIR);
					c++;
				}
				
			}else if(x == 3){
				
				int c = 1;
				while (c <= 4){
					Block clr1 = set17.getRelative(BlockFace.NORTH, c);
					clr1.setType(Material.SMOOTH_BRICK);
//					Block clr = set17.getRelative(BlockFace.NORTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr2 = set18.getRelative(BlockFace.NORTH, c);
					clr2.setType(Material.SMOOTH_BRICK);	
//					Block clr = set18.getRelative(BlockFace.NORTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c < 4){
					Block clr3 = set8.getRelative(BlockFace.SOUTH, c);
					clr3.setType(Material.SMOOTH_BRICK);	
//					Block clr = set18.getRelative(BlockFace.SOUTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				Block clrtop = set8.getRelative(BlockFace.SOUTH, 4);
				clrtop.setType(Material.AIR);
			
				c = 1;
				while (c <= 4){
					Block clr4 = set20.getRelative(BlockFace.NORTH, c);
					clr4.setType(Material.SMOOTH_BRICK);
//					Block clr = set20.getRelative(BlockFace.NORTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr5 = set21.getRelative(BlockFace.NORTH, c);
					clr5.setType(Material.SMOOTH_BRICK);	
//					Block clr = set21.getRelative(BlockFace.NORTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				
			}else{
			int c = 1;
			while (c <= 4){
				Block clr1 = set17.getRelative(BlockFace.NORTH, c);
				clr1.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr2 = set18.getRelative(BlockFace.NORTH, c);
				clr2.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr3 = set19.getRelative(BlockFace.NORTH, c);
				clr3.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr4 = set20.getRelative(BlockFace.NORTH, c);
				clr4.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr5 = set21.getRelative(BlockFace.NORTH, c);
				clr5.setType(Material.AIR);				
				c++;
			}
		}
//			c = 1;
//			while (c <= 4){
//				Block clr6 = set17.getRelative(BlockFace.WEST, c);
//				clr6.setType(Material.AIR);				
//				c++;
//			}
//			
			Block set22 = set2.getRelative(BlockFace.WEST, 1);
			Block set23 = set22.getRelative(BlockFace.WEST, 1);
			Block set24= set23.getRelative(BlockFace.WEST, 1);
			Block set25 = set24.getRelative(BlockFace.WEST, 1);
			Block set26 = set25.getRelative(BlockFace.WEST, 1);
			
			
//			Block set8 = set6.getRelative(BlockFace.EAST, 1);
//			Block set9 = set8.getRelative(BlockFace.EAST, 1);
							
//			Block clr1 = set1.getRelative(BlockFace.WEST, 1);
//							
//			clr1.setType(Material.AIR);

			Byte ran = (byte) (Math.random() * 3);
			otherset.setType(m);
			otherset.setData(ran);
			
			Byte ran1 = (byte) (Math.random() * 3);
			set1.setType(m);
			set1.setData(ran1);
			
			Byte ran2 = (byte) (Math.random() * 3);
			set2.setType(m);
			set2.setData(ran2);
			
			Byte ran3 = (byte) (Math.random() * 3);
			set3.setType(m);
			set3.setData(ran3);
			
			Byte ran4 = (byte) (Math.random() * 3);
			set4.setType(m);
			set4.setData(ran4);
			
			Byte ran5 = (byte) (Math.random() * 3);
			set5.setType(m);
			set5.setData(ran5);
			
			Byte ran6 = (byte) (Math.random() * 3);
			set6.setType(m);
			set6.setData(ran6);
			
			Byte ran7 = (byte) (Math.random() * 3);
			set7.setType(m);
			set7.setData(ran7);
			
			if (x == 2 || x == 3){
			Byte ran8 = (byte) (Math.random() * 3);
			set8.setType(m);
			set8.setData(ran8);
			}else{
				set8.setType(Material.AIR);
				
			}
			if (x == 1){
			Block clr3 = set8.getRelative(BlockFace.DOWN, 2);
			clr3.setType(Material.SMOOTH_BRICK);
			}
			
			Byte ran9 = (byte) (Math.random() * 3);
			set9.setType(m);
			set9.setData(ran9);
			
			Byte ran10 = (byte) (Math.random() * 3);
			set10.setType(m);
			set10.setData(ran10);
			
			Byte ran11 = (byte) (Math.random() * 3);
			set11.setType(m);
			set11.setData(ran11);
			
			Byte ran12 = (byte) (Math.random() * 3);
			set12.setType(m);
			set12.setData(ran12);
			
			Byte ran13 = (byte) (Math.random() * 3);
			set13.setType(m);
			set13.setData(ran13);
			
			Byte ran14 = (byte) (Math.random() * 3);
			set14.setType(m);
			set14.setData(ran14);
			
			Byte ran15 = (byte) (Math.random() * 3);
			set15.setType(m);
			set15.setData(ran15);
			
			Byte ran16 = (byte) (Math.random() * 3);
			set16.setType(m);
			set16.setData(ran16);
			
			Byte ran17 = (byte) (Math.random() * 3);
			set17.setType(m);
			set17.setData(ran17);
			
			Byte ran18 = (byte) (Math.random() * 3);
			set18.setType(m);
			set18.setData(ran18);
			
			Byte ran19 = (byte) (Math.random() * 3);
			set19.setType(m);
			set19.setData(ran19);
			
			Byte ran20 = (byte) (Math.random() * 3);
			set20.setType(m);
			set20.setData(ran20);
			
			Byte ran21 = (byte) (Math.random() * 3);
			set21.setType(m);
			set21.setData(ran21);
			
			Byte ran22 = (byte) (Math.random() * 3);
			set22.setType(m);
			set22.setData(ran22);
			
			Byte ran23 = (byte) (Math.random() * 3);
			set23.setType(m);
			set23.setData(ran23);
						
			if (x == 2 || x == 3){
				Byte ran24 = (byte) (Math.random() * 3);
				set24.setType(m);
				set24.setData(ran24);
			}else{
				set24.setType(Material.AIR);
			}	
			
			Byte ran25 = (byte) (Math.random() * 3);
			set25.setType(m);
			set25.setData(ran25);
			
			Byte ran26 = (byte) (Math.random() * 3);
			set26.setType(m);
			set26.setData(ran26);
			
			Byte ran27 = (byte) (Math.random() * 3);
			set27.setType(m);
			set27.setData(ran27);
			
			Byte ran28 = (byte) (Math.random() * 3);
			set28.setType(m);
			set28.setData(ran28);		
			if(x == 1){
				
				Block bench = set21.getRelative(BlockFace.NORTH, 3);
				Block down1 = bench.getRelative(BlockFace.DOWN, 1);
				down1.setType(Material.WORKBENCH);
				
				Block furnace = set21.getRelative(BlockFace.NORTH, 4);
				Block down2 = furnace.getRelative(BlockFace.DOWN, 1);
				down2.setType(Material.FURNACE);
				
				Block chest1 = set17.getRelative(BlockFace.NORTH, 3);
				Block down3 = chest1.getRelative(BlockFace.DOWN, 1);
				down3.setType(Material.CHEST);
				
				Block chest2 = set17.getRelative(BlockFace.NORTH, 4);
				Block down4 = chest2.getRelative(BlockFace.DOWN, 1);
				down4.setType(Material.CHEST);
				int i = 1;
				int chestran = (int) (Math.random() * 10);
							
				while (i <= chestran){
				int matran = (int) (Math.random() * 10);
				Material mat = null;
				if(matran == 0){
				mat = Material.IRON_SWORD;
				}
				if(matran == 0){
					mat = Material.GRILLED_PORK;
					}
				if(matran == 1){
					mat = Material.TNT;
					}
				if(matran == 2){
					mat = Material.BOW;
					}
				if(matran == 3){
					mat = Material.WOOD_SWORD;
					}
				if(matran == 4){
					mat = Material.CHAINMAIL_HELMET;
					}
				if(matran == 5){
					mat = Material.COOKED_FISH;
					}
				if(matran == 6){
					mat = Material.ARROW;
					}
				if(matran == 7){
					mat = Material.GOLD_LEGGINGS;
					}
				if(matran == 8){
					mat = Material.MELON;
					}
				if(matran == 9){
					mat = Material.BOAT;
					}
				Chest chest = (Chest)down4.getState();
				int amt = (int) (Math.random() * 10);
				chest.getInventory().addItem(new ItemStack[] { new ItemStack(mat, amt) });
				i++;
				}
			}
			if (x < 2) {
				set8.setType(Material.IRON_FENCE);
//				if(x == 1){
//					Byte data = (byte)(0x8);
//					set8.setTypeIdAndData(64, data, true);
//				}
			}
				
			if(x == 3){
				Block manhole0 = set8.getRelative(BlockFace.SOUTH, 5);
				Block manhole1 = manhole0.getRelative(BlockFace.DOWN, 1);
				Block manhole = manhole1.getRelative(BlockFace.EAST, 1);
				man.man1(manhole, Material.SMOOTH_BRICK , BlockFace.SOUTH);
				}
			
//				if (i == 2){
//				clr1.setType(Material.IRON_FENCE);
//				i = 1;
//				}else{
//					byte flags = ( byte )3;
//					clr1.setType(Material.LADDER);
//					clr1.setData(flags);
//					i++;
//				}
//				
//			} else {
//				byte flags = ( byte )3;
//				clr1.setType(Material.LADDER);
//				clr1.setData(flags);
//			}
			
							
			//newx++;
			x++;
		}
	return a;
  }

public int starter(Block set, Material m, BlockFace bf){
	int x = 0;
	int a = (int) (Math.random() * 20);
	if (a < 12){
		a = 12;
	}
	BlockFace up = BlockFace.UP;
	Block setter = set.getRelative(BlockFace.UP, 1);

	while (x < 4) {
			int newx = x-1;
			setter = set.getRelative(BlockFace.UP, x);
			//START//
			Block otherset = set.getRelative(up, x);
			Block set1 = otherset.getRelative(BlockFace.SOUTH, 1);
			Block set2 = set1.getRelative(BlockFace.SOUTH, 1);
			Block set3 = set2.getRelative(BlockFace.SOUTH, 1);
			Block set4 = set3.getRelative(BlockFace.SOUTH, 1);
			Block set5 = set4.getRelative(BlockFace.SOUTH, 1);
						
			Block set6 = set5.getRelative(BlockFace.EAST, 1);
			Block set7 = set6.getRelative(BlockFace.EAST, 1);
			Block set8 = set7.getRelative(BlockFace.EAST, 1);
			Block set9 = set8.getRelative(BlockFace.EAST, 1);
			Block set10 = set9.getRelative(BlockFace.EAST, 1);
			Block set11 = set10.getRelative(BlockFace.EAST, 1);
			
			Block set12 = set11.getRelative(BlockFace.NORTH, 1);
			Block set13 = set12.getRelative(BlockFace.NORTH, 1);
			Block set14= set13.getRelative(BlockFace.NORTH, 1);
			Block set15 = set14.getRelative(BlockFace.NORTH, 1);
			Block set16 = set15.getRelative(BlockFace.NORTH, 1);
			
			Block set17 = set16.getRelative(BlockFace.WEST, 1);
			Block set18 = set17.getRelative(BlockFace.WEST, 1);
			Block set19 = set18.getRelative(BlockFace.WEST, 1);
			Block set20 = set19.getRelative(BlockFace.WEST, 1);
			Block set21 = set20.getRelative(BlockFace.WEST, 1);
				
			Block set27 = set18.getRelative(BlockFace.SOUTH, 1);
			Block set28 = set20.getRelative(BlockFace.SOUTH, 1);
									
			if(x == 1){
				
				int c = 1;
				while (c <= 4){
					Block clr1 = set17.getRelative(BlockFace.SOUTH, c);
					Block down = clr1.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set17.getRelative(BlockFace.SOUTH, c);
					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr2 = set18.getRelative(BlockFace.SOUTH, c);
					Block down = clr2.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set18.getRelative(BlockFace.SOUTH, c);
					clr.setType(Material.AIR);							
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr3 = set19.getRelative(BlockFace.SOUTH, c);
					Block down = clr3.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set8.getRelative(BlockFace.NORTH, c);
					clr.setType(Material.AIR);
					c++;
				}			
				c = 1;
				while (c <= 4){
					Block clr4 = set20.getRelative(BlockFace.SOUTH, c);
					Block down = clr4.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set20.getRelative(BlockFace.SOUTH, c);
					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr5 = set21.getRelative(BlockFace.SOUTH, c);
					Block down = clr5.getRelative(BlockFace.DOWN, 2);
					down.setType(Material.SMOOTH_BRICK);
					Block clr = set21.getRelative(BlockFace.SOUTH, c);
					clr.setType(Material.AIR);
					c++;
				}
				
			}else if(x == 3){
				
				int c = 1;
				while (c <= 4){
					Block clr1 = set17.getRelative(BlockFace.SOUTH, c);
					clr1.setType(Material.SMOOTH_BRICK);
//					Block clr = set17.getRelative(BlockFace.SOUTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr2 = set18.getRelative(BlockFace.SOUTH, c);
					clr2.setType(Material.SMOOTH_BRICK);	
//					Block clr = set18.getRelative(BlockFace.SOUTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c < 4){
					Block clr3 = set8.getRelative(BlockFace.NORTH, c);
					clr3.setType(Material.SMOOTH_BRICK);	
//					Block clr = set18.getRelative(BlockFace.NORTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				Block clrtop = set8.getRelative(BlockFace.NORTH, 4);
				clrtop.setType(Material.AIR);
			
				c = 1;
				while (c <= 4){
					Block clr4 = set20.getRelative(BlockFace.SOUTH, c);
					clr4.setType(Material.SMOOTH_BRICK);
//					Block clr = set20.getRelative(BlockFace.SOUTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				c = 1;
				while (c <= 4){
					Block clr5 = set21.getRelative(BlockFace.SOUTH, c);
					clr5.setType(Material.SMOOTH_BRICK);	
//					Block clr = set21.getRelative(BlockFace.SOUTH, c);
//					clr.setType(Material.AIR);
					c++;
				}
				
			}else{
			int c = 1;
			while (c <= 4){
				Block clr1 = set17.getRelative(BlockFace.SOUTH, c);
				clr1.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr2 = set18.getRelative(BlockFace.SOUTH, c);
				clr2.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr3 = set19.getRelative(BlockFace.SOUTH, c);
				clr3.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr4 = set20.getRelative(BlockFace.SOUTH, c);
				clr4.setType(Material.AIR);				
				c++;
			}
			c = 1;
			while (c <= 4){
				Block clr5 = set21.getRelative(BlockFace.SOUTH, c);
				clr5.setType(Material.AIR);				
				c++;
			}
		}
//			c = 1;
//			while (c <= 4){
//				Block clr6 = set17.getRelative(BlockFace.EAST, c);
//				clr6.setType(Material.AIR);				
//				c++;
//			}
//			
			Block set22 = set2.getRelative(BlockFace.EAST, 1);
			Block set23 = set22.getRelative(BlockFace.EAST, 1);
			Block set24= set23.getRelative(BlockFace.EAST, 1);
			Block set25 = set24.getRelative(BlockFace.EAST, 1);
			Block set26 = set25.getRelative(BlockFace.EAST, 1);
			
			
//			Block set8 = set6.getRelative(BlockFace.WEST, 1);
//			Block set9 = set8.getRelative(BlockFace.WEST, 1);
							
//			Block clr1 = set1.getRelative(BlockFace.EAST, 1);
//							
//			clr1.setType(Material.AIR);

			Byte ran = (byte) (Math.random() * 3);
			otherset.setType(m);
			otherset.setData(ran);
			
			Byte ran1 = (byte) (Math.random() * 3);
			set1.setType(m);
			set1.setData(ran1);
			
			Byte ran2 = (byte) (Math.random() * 3);
			set2.setType(m);
			set2.setData(ran2);
			
			Byte ran3 = (byte) (Math.random() * 3);
			set3.setType(m);
			set3.setData(ran3);
			
			Byte ran4 = (byte) (Math.random() * 3);
			set4.setType(m);
			set4.setData(ran4);
			
			Byte ran5 = (byte) (Math.random() * 3);
			set5.setType(m);
			set5.setData(ran5);
			
			Byte ran6 = (byte) (Math.random() * 3);
			set6.setType(m);
			set6.setData(ran6);
			
			Byte ran7 = (byte) (Math.random() * 3);
			set7.setType(m);
			set7.setData(ran7);
			
			if (x == 2 || x == 3){
			Byte ran8 = (byte) (Math.random() * 3);
			set8.setType(m);
			set8.setData(ran8);
			}else{
				set8.setType(Material.AIR);
				
			}
			if (x == 1){
			Block clr3 = set8.getRelative(BlockFace.DOWN, 2);
			clr3.setType(Material.SMOOTH_BRICK);
			}
			
			Byte ran9 = (byte) (Math.random() * 3);
			set9.setType(m);
			set9.setData(ran9);
			
			Byte ran10 = (byte) (Math.random() * 3);
			set10.setType(m);
			set10.setData(ran10);
			
			Byte ran11 = (byte) (Math.random() * 3);
			set11.setType(m);
			set11.setData(ran11);
			
			Byte ran12 = (byte) (Math.random() * 3);
			set12.setType(m);
			set12.setData(ran12);
			
			Byte ran13 = (byte) (Math.random() * 3);
			set13.setType(m);
			set13.setData(ran13);
			
			Byte ran14 = (byte) (Math.random() * 3);
			set14.setType(m);
			set14.setData(ran14);
			
			Byte ran15 = (byte) (Math.random() * 3);
			set15.setType(m);
			set15.setData(ran15);
			
			Byte ran16 = (byte) (Math.random() * 3);
			set16.setType(m);
			set16.setData(ran16);
			
			Byte ran17 = (byte) (Math.random() * 3);
			set17.setType(m);
			set17.setData(ran17);
			
			Byte ran18 = (byte) (Math.random() * 3);
			set18.setType(m);
			set18.setData(ran18);
			
			Byte ran19 = (byte) (Math.random() * 3);
			set19.setType(m);
			set19.setData(ran19);
			
			Byte ran20 = (byte) (Math.random() * 3);
			set20.setType(m);
			set20.setData(ran20);
			
			Byte ran21 = (byte) (Math.random() * 3);
			set21.setType(m);
			set21.setData(ran21);
			
			Byte ran22 = (byte) (Math.random() * 3);
			set22.setType(m);
			set22.setData(ran22);
			
			Byte ran23 = (byte) (Math.random() * 3);
			set23.setType(m);
			set23.setData(ran23);
						
			if (x == 2 || x == 3){
				Byte ran24 = (byte) (Math.random() * 3);
				set24.setType(m);
				set24.setData(ran24);
			}else{
				set24.setType(Material.AIR);
			}	
			
			Byte ran25 = (byte) (Math.random() * 3);
			set25.setType(m);
			set25.setData(ran25);
			
			Byte ran26 = (byte) (Math.random() * 3);
			set26.setType(m);
			set26.setData(ran26);
			
			Byte ran27 = (byte) (Math.random() * 3);
			set27.setType(m);
			set27.setData(ran27);
			
			Byte ran28 = (byte) (Math.random() * 3);
			set28.setType(m);
			set28.setData(ran28);		
			if(x == 1){
				
				Block bench = set21.getRelative(BlockFace.SOUTH, 3);
				Block down1 = bench.getRelative(BlockFace.DOWN, 1);
				down1.setType(Material.WORKBENCH);
				
				Block furnace = set21.getRelative(BlockFace.SOUTH, 4);
				Block down2 = furnace.getRelative(BlockFace.DOWN, 1);
				down2.setType(Material.FURNACE);
				
				Block chest1 = set17.getRelative(BlockFace.SOUTH, 3);
				Block down3 = chest1.getRelative(BlockFace.DOWN, 1);
				down3.setType(Material.CHEST);
				
				Block chest2 = set17.getRelative(BlockFace.SOUTH, 4);
				Block down4 = chest2.getRelative(BlockFace.DOWN, 1);
				down4.setType(Material.CHEST);
				int i = 1;
				int chestran = (int) (Math.random() * 10);
							
				while (i <= chestran){
				int matran = (int) (Math.random() * 10);
				Material mat = null;
				if(matran == 0){
				mat = Material.IRON_SWORD;
				}
				if(matran == 0){
					mat = Material.GRILLED_PORK;
					}
				if(matran == 1){
					mat = Material.TNT;
					}
				if(matran == 2){
					mat = Material.BOW;
					}
				if(matran == 3){
					mat = Material.WOOD_SWORD;
					}
				if(matran == 4){
					mat = Material.CHAINMAIL_HELMET;
					}
				if(matran == 5){
					mat = Material.COOKED_FISH;
					}
				if(matran == 6){
					mat = Material.ARROW;
					}
				if(matran == 7){
					mat = Material.GOLD_LEGGINGS;
					}
				if(matran == 8){
					mat = Material.MELON;
					}
				if(matran == 9){
					mat = Material.BOAT;
					}
				Chest chest = (Chest)down4.getState();
				int amt = (int) (Math.random() * 10);
				chest.getInventory().addItem(new ItemStack[] { new ItemStack(mat, amt) });
				i++;
				}
			}
			if (x < 2) {
				set8.setType(Material.IRON_FENCE);
//				if(x == 1){
//					Byte data = (byte)(0x8);
//					set8.setTypeIdAndData(64, data, true);
//				}
			}				
			
//				if (i == 2){
//				clr1.setType(Material.IRON_FENCE);
//				i = 1;
//				}else{
//					byte flags = ( byte )3;
//					clr1.setType(Material.LADDER);
//					clr1.setData(flags);
//					i++;
//				}
//				
//			} else {
//				byte flags = ( byte )3;
//				clr1.setType(Material.LADDER);
//				clr1.setData(flags);
//			}
			
							
			//newx++;
			x++;
		}
	return a;
  }
}
