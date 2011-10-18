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
	
	public void onBlockPlace(BlockPlaceEvent e1)
	{
		Block b = e1.getBlock();
		Player p = e1.getPlayer();
		if (b.getType() == (Material.COAL_ORE)){
		b.setType(Material.AIR);
		Material m = (Material.SMOOTH_BRICK);
		BlockFace bf = BlockFace.SOUTH;
		Block set2 = b.getRelative(BlockFace.SOUTH, 2);
		com1(set2, m, b, bf, p);
	  }
	}

	
	public void com1(Block set, Material m, Block b, BlockFace bf, Player p){
//		Block ew = b.getRelative(BlockFace.WEST, 2);
//		BlockFace bf0 = BlockFace.EAST;
//		int a1 = ewtStraight(ew, m, b, bf0);
		
//		Block p = b.getRelative(BlockFace.UP, 5);
//		Block pit = p.getRelative(BlockFace.WEST, 2);
		BlockFace bf0 = BlockFace.SOUTH;
		int sink1 = sink.sink1(b, m, b, bf0);
		BlockFace bf1 = BlockFace.NORTH;
		BlockFace bf2 = BlockFace.SOUTH;
		BlockFace bf3 = BlockFace.EAST;
		BlockFace bf4 = BlockFace.WEST;
		//5 BLOCKS TO MIDDLE!
		Block down = b.getRelative(BlockFace.DOWN, sink1);
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
		
		Block setter2 = w1.getRelative(BlockFace.WEST, t5);
		Block pit1 = setter2.getRelative(BlockFace.UP, 5);
		int pit01 = pit.pit1(pit1, m, bf4);
		
		Block setter1 = w1.getRelative(BlockFace.WEST, t5-5);
		Block w2 = setter1.getRelative(BlockFace.NORTH, 1);
		int t6 = tun.nstStraight(w2, m, bf1);
		
		
		

		

//		int nxt = a1+a2;
//		Block ew1 = b.getRelative(BlockFace.WEST, nxt);
//		BlockFace bf3 = BlockFace.SOUTH;
//		int a3 = nstStraight(ew1, m, b, bf3);
	}		
}
