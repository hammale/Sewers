package me.hammale.Sewer;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class SewerBlockListener extends BlockListener {
	
	private final Tunnel tun = new Tunnel();
	private final pit pit = new pit();
	private final hut hut = new hut();
	private final SinkHole sink = new SinkHole();
	private final manhole man = new manhole();
	private final entrance ent = new entrance();
	
	public void onBlockPlace(BlockPlaceEvent e1)
	{
		Block b = e1.getBlock();
		Player p = e1.getPlayer();
		if (b.getType() == (Material.COAL_ORE)){
		b.setType(Material.AIR);
		Material m = (Material.SMOOTH_BRICK);
		BlockFace bf = BlockFace.SOUTH;
		Block set2 = b;
		com1(set2, m, bf, p);
		//ent(set2, m, bf, p);
	  }
	}

	
	public void ent(Block set, Material m, BlockFace bf, Player p){
		
		int test = ent.ent1(set, m, bf);
		
	}
	
	public void com1(Block set, Material m, BlockFace bf, Player p){

		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
		
		BlockFace bf0 = BlockFace.SOUTH;
		int sink1 = sink.sink1(set, m, set, bf0);
		
		Block down2 = set.getRelative(BlockFace.DOWN, 7);
		Block n2 = down2.getRelative(BlockFace.SOUTH, 1);
		int t0 = tun.nstStraight(n2, m, bf1);
		
		//5 BLOCKS TO MIDDLE!
		Block down = set.getRelative(BlockFace.DOWN, sink1);
		Block n = down.getRelative(BlockFace.SOUTH, 1);
		int t1 = tun.nstStraight(n, m, bf1);
		Block s = n.getRelative(BlockFace.SOUTH, 8);
		int t2 = tun.nstStraight(s, m, bf2);
	
		Block mid = n.getRelative(BlockFace.SOUTH, 4);
		Block e = mid.getRelative(BlockFace.EAST, 4);
		int t3 = tun.ewtStraight(e, m, bf3);
		Block w = mid.getRelative(BlockFace.WEST, 4);
		
		int t4 = tun.ewtStraight(w, m, bf4);
		
		Block w1 = w.getRelative(BlockFace.WEST, t4-1);
		int t5 = tun.ewtStraight(w1, m, bf4);
		Block hut0 = w.getRelative(BlockFace.WEST, t4-7);
		Block hut1 = hut0.getRelative(BlockFace.NORTH, 2);
		int h1 = hut.hut1(hut1, m, bf1);


		
		Block setter0 = w1.getRelative(BlockFace.WEST, t5+8);
		Block setter2 = setter0.getRelative(BlockFace.NORTH, 1);
		Block pit1 = setter2.getRelative(BlockFace.UP, 5);
		int pit01 = pit.pit1(pit1, m, bf3);
		
		Block setter1 = w1.getRelative(BlockFace.WEST, t5);
		Block w2 = setter1.getRelative(BlockFace.NORTH, 1);
		int t6 = tun.nstStraight(w2, m, bf1);
		
		Block n1 = w2.getRelative(BlockFace.WEST, 5);
		Block n3 = n1.getRelative(BlockFace.SOUTH, 5);
		int t13 = tun. nstStraight(n3, m, bf2);
		
		Block setter3 = setter2.getRelative(BlockFace.SOUTH, 3);
		//Block w3 = setter3.getRelative(BlockFace.SOUTH, 3);
		int t7 = tun.ewtStraight(setter3, m, bf4);	
	
		Block setter4 = setter3.getRelative(BlockFace.WEST, t7-1);
		//Block w3 = setter3.getRelative(BlockFace.SOUTH, 3);
		int t8 = tun.ewtStraight(setter4, m, bf4);
		
		Block w5 = setter3.getRelative(BlockFace.WEST, t7-3);
		Block w6 = w5.getRelative(BlockFace.SOUTH, 2);
		int t10 = tun.nstStraight(w6, m, bf2);
		
		Block w3 = setter3.getRelative(BlockFace.WEST, t7+5);
		Block w4 = w3.getRelative(BlockFace.SOUTH, 2);
		int t9 = tun.nstStraight(w4, m, bf2);
		
		Block hut2 = w4.getRelative(BlockFace.SOUTH, t9);
		Block hut3 = hut2.getRelative(BlockFace.NORTH, 3);
		int h2 = hut.hut1(hut3, m, bf2);
		
//		Block w7 = w6.getRelative(BlockFace.WEST, t10);
//		int t11 = tun.nstStraight(w7, m, bf1);
	
		Block w8 = setter3.getRelative(BlockFace.WEST, t7+6);
		Block w9 = w8.getRelative(BlockFace.NORTH, 2);

		Block setter5 = w9.getRelative(BlockFace.WEST, t8+1);
		Block setter6 = setter5.getRelative(BlockFace.NORTH, 1);
		Block pit2 = setter6.getRelative(BlockFace.UP, 5);
		int pit3 = pit.pit2(pit2, m, bf3);
		
		int t12 = tun.nstStraight(w9, m, bf1);
		
		Block w10 = setter3.getRelative(BlockFace.WEST, t7+6);
		Block w11 = w10.getRelative(BlockFace.NORTH, t9);
		int t14 = tun.nstStraight(w11, m, bf1);
		
		Block en = w6.getRelative(BlockFace.SOUTH, t10+4);
		Block en0 = en.getRelative(BlockFace.UP, 1);
		Block en1 = en0.getRelative(BlockFace.EAST, 3);
		int entr1 = ent.ent1(en1, m, bf1);
		
//		man.man1(set, m , bf);
		
		

		

	}		
}
