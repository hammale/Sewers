package me.hammale.Sewer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

public class SinkHole {
	
	public int sink1(Block set, Material m, Block b, BlockFace bf){
		int x = 1;
		int a = (int) (Math.random() * 30);
		if (a < 22){
			a = 21;
		}
		int newx = x-1;
		while (x < a) {						
				Block set1 = b.getRelative(BlockFace.DOWN, x);									
				//
				Block set2 = set1.getRelative(BlockFace.WEST, 1);
				Block set3 = set2.getRelative(BlockFace.WEST, 1);
				Block air1 = set3.getRelative(BlockFace.WEST, 1);
				Block set4 = air1.getRelative(BlockFace.SOUTH, 1);
				Block air2 = set4.getRelative(BlockFace.WEST, 1);
				Block set5 = air2.getRelative(BlockFace.SOUTH, 1);
				Block air3 = set5.getRelative(BlockFace.WEST, 1);
				Block set6 = air3.getRelative(BlockFace.SOUTH, 1);
				Block fix1 = air3.getRelative(BlockFace.NORTH, 2);
				//
				Block set7 = fix1.getRelative(BlockFace.SOUTH, 1);//
				Block set8 = set7.getRelative(BlockFace.SOUTH, 1);
				Block set9 = set8.getRelative(BlockFace.SOUTH, 1);
				Block set10 = set9.getRelative(BlockFace.SOUTH, 1);
				Block set11 = set10.getRelative(BlockFace.SOUTH, 1);					
				Block set12 = set11.getRelative(BlockFace.SOUTH, 1);
				Block set13 = set12.getRelative(BlockFace.SOUTH, 1);//
				//
				Block air10 = set13.getRelative(BlockFace.EAST, 1);
				Block set17 = air10.getRelative(BlockFace.SOUTH, 1);
				Block air11 = set17.getRelative(BlockFace.EAST, 1);
				Block set18 = air11.getRelative(BlockFace.SOUTH, 1);
				Block air12 = set18.getRelative(BlockFace.EAST, 1);
				Block set19 = air12.getRelative(BlockFace.SOUTH, 1);				
				
				Block set20 = set19.getRelative(BlockFace.EAST, 1);
				Block set21 = set20.getRelative(BlockFace.EAST, 1);
			
				//
				
				Block set22 = set1.getRelative(BlockFace.EAST, 1);
				Block set23 = set22.getRelative(BlockFace.EAST, 1);

			
				Block air4 = set23.getRelative(BlockFace.EAST, 1);
				Block set24 = air4.getRelative(BlockFace.SOUTH, 1);
				Block air5 = set24.getRelative(BlockFace.EAST, 1);
				Block set25 = air5.getRelative(BlockFace.SOUTH, 1);
				Block air6 = set25.getRelative(BlockFace.EAST, 1);
				Block set26 = air6.getRelative(BlockFace.SOUTH, 1);
				Block fix2 = set26.getRelative(BlockFace.NORTH, 3);

				
				//
				Block set27 = fix2.getRelative(BlockFace.SOUTH, 1);
				Block set28 = set27.getRelative(BlockFace.SOUTH, 1);
				Block set29 = set28.getRelative(BlockFace.SOUTH, 1);
				Block set210 = set29.getRelative(BlockFace.SOUTH, 1);
				Block set211 = set210.getRelative(BlockFace.SOUTH, 1);					
				Block set212 = set211.getRelative(BlockFace.SOUTH, 1);
				Block set213 = set212.getRelative(BlockFace.SOUTH, 1);				
//				Block set214 = set213.getRelative(BlockFace.SOUTH, 1);
//				Block set215 = set214.getRelative(BlockFace.SOUTH, 1);
//				Block set216 = set215.getRelative(BlockFace.SOUTH, 1);
				//				

				Block air7 = set213.getRelative(BlockFace.WEST, 1);
				Block set217 = air7.getRelative(BlockFace.SOUTH, 1);
				Block air8 = set217.getRelative(BlockFace.WEST, 1);
				Block set218 = air8.getRelative(BlockFace.SOUTH, 1);
				Block air9 = set218.getRelative(BlockFace.WEST, 1);
				Block set219 = air9.getRelative(BlockFace.SOUTH, 1);
				//
				Block set220 = set219.getRelative(BlockFace.WEST, 1);
				Block set221 = set220.getRelative(BlockFace.WEST, 1);

				//*************************START CLEARS***************************//
				
				int clr = 1;
				
				while (clr < 10) {
				Block clr1 = set8.getRelative(BlockFace.EAST, clr);
				clr1.setType(Material.AIR);
				clr++;
				}
				clr = 1;					
				while (clr < 10) {
				Block clr2 = set9.getRelative(BlockFace.EAST, clr);
				clr2.setType(Material.AIR);
				clr++;
				}
				clr = 1;
				while (clr < 10) {
				Block clr3 = set10.getRelative(BlockFace.EAST, clr);
				clr3.setType(Material.AIR);
				clr++;
				}
				clr = 1;
				while (clr < 10) {
				Block clr4 = set11.getRelative(BlockFace.EAST, clr);
				clr4.setType(Material.AIR);
				clr++;
				}
				clr = 1;
				while (clr < 10) {
				Block clr5 = set7.getRelative(BlockFace.EAST, clr);
				clr5.setType(Material.AIR);
				clr++;
				}
				clr = 1;
				while (clr < 10) {
					Block clr4 = set12.getRelative(BlockFace.EAST, clr);
					clr4.setType(Material.AIR);
					clr++;
					}
					clr = 1;
					while (clr < 10) {
						Block clr4 = set13.getRelative(BlockFace.EAST, clr);
						clr4.setType(Material.AIR);
						clr++;
						}
						clr = 1;
						while (clr < 10) {
							Block clr4 = set17.getRelative(BlockFace.EAST, clr);
							clr4.setType(Material.AIR);
							clr++;
							}
						clr = 1;
						while (clr < 10) {
							Block clr4 = set18.getRelative(BlockFace.EAST, clr);
							clr4.setType(Material.AIR);
							clr++;
							}
												
						if (a-1 == x || a-2 == x){
							while (clr < 10) {
								clr = 1;
								Block fix = set8.getRelative(BlockFace.UP, 1);
								Block clr1 = fix.getRelative(BlockFace.EAST, clr);
								clr1.setType(Material.WATER);
								clr++;
								}
								clr = 1;					
								while (clr < 10) {
								Block clr2 = set9.getRelative(BlockFace.EAST, clr);
								clr2.setType(Material.WATER);
								clr++;
								}
								clr = 1;
								while (clr < 10) {
								Block clr3 = set10.getRelative(BlockFace.EAST, clr);
								clr3.setType(Material.WATER);
								clr++;
								}
								clr = 1;
								while (clr < 10) {
								Block clr4 = set11.getRelative(BlockFace.EAST, clr);
								clr4.setType(Material.WATER);
								clr++;
								}
								clr = 1;
								while (clr < 10) {
								Block clr5 = set7.getRelative(BlockFace.EAST, clr);
								clr5.setType(Material.WATER);
								clr++;
								}
								clr = 1;
								while (clr < 10) {
									Block clr4 = set12.getRelative(BlockFace.EAST, clr);
									clr4.setType(Material.WATER);
									clr++;
									}
									clr = 1;
									while (clr < 10) {
										Block clr4 = set13.getRelative(BlockFace.EAST, clr);
										clr4.setType(Material.WATER);
										clr++;
										}
										clr = 1;
										while (clr < 10) {
											Block clr4 = set17.getRelative(BlockFace.EAST, clr);
											clr4.setType(Material.WATER);
											clr++;
											}
										clr = 1;
										while (clr < 10) {
											Block clr4 = set18.getRelative(BlockFace.EAST, clr);
											clr4.setType(Material.WATER);
											clr++;
											}				
						}
						//*****/////////////////****//
				//*************************END CLEARS***************************//					
																				
				Byte ran2 = (byte) (Math.random() * 3);
				Byte ran3 = (byte) (Math.random() * 3);
				Byte ran4 = (byte) (Math.random() * 3);
				Byte ran5 = (byte) (Math.random() * 3);
				Byte ran6 = (byte) (Math.random() * 3);
				Byte ran7 = (byte) (Math.random() * 3);
				Byte ran8 = (byte) (Math.random() * 3);
				Byte ran9 = (byte) (Math.random() * 3);
				Byte ran10 = (byte) (Math.random() * 3);
				Byte ran11 = (byte) (Math.random() * 3);
				Byte ran12 = (byte) (Math.random() * 3);
				Byte ran13 = (byte) (Math.random() * 3);
				Byte ran14 = (byte) (Math.random() * 3);
				Byte ran15 = (byte) (Math.random() * 3);
				Byte ran16 = (byte) (Math.random() * 3);
				Byte ran116 = (byte) (Math.random() * 3);
				Byte ran117 = (byte) (Math.random() * 3);
				Byte ran118 = (byte) (Math.random() * 3);
				
				Byte ran22 = (byte) (Math.random() * 3);
				Byte ran23 = (byte) (Math.random() * 3);
				Byte ran24 = (byte) (Math.random() * 3);
				Byte ran25 = (byte) (Math.random() * 3);
				Byte ran26 = (byte) (Math.random() * 3);
				Byte ran27 = (byte) (Math.random() * 3);
				Byte ran28 = (byte) (Math.random() * 3);
				Byte ran29 = (byte) (Math.random() * 3);
				Byte ran210 = (byte) (Math.random() * 3);
				Byte ran211 = (byte) (Math.random() * 3);
				Byte ran212 = (byte) (Math.random() * 3);
				Byte ran213 = (byte) (Math.random() * 3);
				Byte ran214 = (byte) (Math.random() * 3);
				Byte ran215 = (byte) (Math.random() * 3);
				Byte ran216 = (byte) (Math.random() * 3);
				Byte ran2116 = (byte) (Math.random() * 3);
				Byte ran2117 = (byte) (Math.random() * 3);
				Byte ran2118 = (byte) (Math.random() * 3);
				
				set1.setType(m);
				set1.setData(ran2);
				
				set2.setType(m);
				set2.setData(ran2);
				
				set3.setType(m);
				set3.setData(ran3);
				
				set4.setType(m);
				set4.setData(ran4);
				
				set5.setType(m);
				set5.setData(ran5);
									
				set6.setType(m);
				set6.setData(ran6);
				
				set9.setType(m);
				set9.setData(ran9);					
				
				set10.setType(m);
				set10.setData(ran10);
				
				set11.setType(m);
				set11.setData(ran11);
				
				set12.setType(m);
				set12.setData(ran12);
								
				set13.setType(m);
				set13.setData(ran13);					
				
//				set14.setType(m);
//				set14.setData(ran14);							
//				
//				set15.setType(m);
//				set15.setData(ran15);
//									
//				set16.setType(m);
//				set16.setData(ran16);
				
				set17.setType(m);
				set17.setData(ran116);							
				
				set18.setType(m);
				set18.setData(ran117);
				
				set19.setType(m);
				set19.setData(ran7);
				
				set20.setType(m);
				set20.setData(ran8);
				
				set21.setType(m);
				set21.setData(ran12);
				
				//
				
				set22.setType(m);
				set22.setData(ran22);
				
				set23.setType(m);
				set23.setData(ran23);
				
				set24.setType(m);
				set24.setData(ran24);
				
				set25.setType(m);
				set25.setData(ran2);
				
				set26.setType(m);
				set26.setData(ran26);
				
				set29.setType(m);
				set29.setData(ran29);					
				
				set210.setType(m);
				set210.setData(ran210);
				
				set211.setType(m);
				set211.setData(ran211);
				
				set212.setType(m);
				set212.setData(ran212);
								
				set213.setType(m);
				set213.setData(ran213);					
				
//				set214.setType(m);
//				set214.setData(ran214);							
				
//				set215.setType(m);
//				set215.setData(ran215);
//									
//				set216.setType(m);
//				set216.setData(ran216);
				
				set217.setType(m);
				set217.setData(ran2116);							
				
				set218.setType(m);
				set218.setData(ran2117);
				
				set219.setType(m);
				set219.setData(ran118);
				
				set220.setType(m);
				set220.setData(ran2118);
				
				set221.setType(m);
				set221.setData(ran210);
				//
				//START BOTTOM//
				if (a-1 == x){
					set8 = set8.getRelative(BlockFace.DOWN, 1);
					clr = 1;
					while (clr < 10) {
						Byte ran = (byte) (Math.random() * 3);
						Block clr2 = set9.getRelative(BlockFace.EAST, clr);
						clr2.setTypeId(98);
						clr2.setData(ran);
						clr++;
						}
						clr = 1;
						Block fix = set8.getRelative(BlockFace.UP, 1);
						while (clr < 10) {
						Byte ran = (byte) (Math.random() * 3);
						Block clr2 = fix.getRelative(BlockFace.EAST, clr);
						clr2.setTypeId(98);
						clr2.setData(ran);
						clr++;
						}
						clr = 1;
						while (clr < 10) {
						Byte ran = (byte) (Math.random() * 3);
						Block clr3 = set10.getRelative(BlockFace.EAST, clr);
						clr3.setTypeId(98);
						clr3.setData(ran);
						clr++;
						}
						clr = 1;
						while (clr < 10) {
						Byte ran = (byte) (Math.random() * 3);
						Block clr4 = set11.getRelative(BlockFace.EAST, clr);
						clr4.setTypeId(98);
						clr4.setData(ran);
						clr++;
						}
						clr = 1;
						while (clr < 10) {
						Byte ran = (byte) (Math.random() * 3);
						Block clr5 = set7.getRelative(BlockFace.EAST, clr);
						clr5.setTypeId(98);
						clr5.setData(ran);
						clr++;
						}
						clr = 1;
						while (clr < 10) {
							Byte ran = (byte) (Math.random() * 3);
							Block clr4 = set12.getRelative(BlockFace.EAST, clr);
							clr4.setTypeId(98);
							clr4.setData(ran);
							clr++;
							}
							clr = 1;
							while (clr < 10) {
								Byte ran = (byte) (Math.random() * 3);
								Block clr4 = set13.getRelative(BlockFace.EAST, clr);
								clr4.setTypeId(98);
								clr4.setData(ran);
								clr++;
								}
								clr = 1;
								while (clr < 10) {
									Byte ran = (byte) (Math.random() * 3);
									Block clr4 = set17.getRelative(BlockFace.EAST, clr);
									clr4.setTypeId(98);
									clr4.setData(ran);
									clr++;
									}
								clr = 1;
								while (clr < 10) {
									Byte ran = (byte) (Math.random() * 3);
									Block clr4 = set18.getRelative(BlockFace.EAST, clr);
									clr4.setTypeId(98);
									clr4.setData(ran);
									clr++;
									}								
				}
				//END BOTTOM//
				
				
//				newx++;
				x++;
			}
		int value = a-1;
		return value;
	  }
	
}
