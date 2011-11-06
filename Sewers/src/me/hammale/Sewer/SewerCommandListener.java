package me.hammale.Sewer;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SewerCommandListener implements CommandExecutor {
    
	private final Tunnel tun = new Tunnel();
	private final pit pit = new pit();
	private final hut hut = new hut();
	private final SinkHole sink = new SinkHole();
	private final manhole man = new manhole();
	private final entrance ent = new entrance();
	
	private Sewer plugin;
 
	public SewerCommandListener(Sewer plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		Player p = null;
		if (sender instanceof Player) {
			p = (Player) sender;
		}
		
		if (command.getName().equalsIgnoreCase("sewer")) {
			
			if(args.length == 1){
			String arg = args[0];
			if(arg.equalsIgnoreCase("create")){
			
			if (p == null) {
				sender.sendMessage("This Command Can Only Be Run By A Player!");
			} else {

				Block b = p.getLocation().getBlock();
				p.sendMessage(ChatColor.GREEN + "Generating Sewer...");
				b.setType(Material.AIR);
				Material m = (Material.SMOOTH_BRICK);
				BlockFace bf = BlockFace.SOUTH;
				Block set2 = b;
				com1(set2, m, bf, p);
				//ent(set2, m, bf, p);
				p.sendMessage(ChatColor.GREEN + "Sewer Complete!");
										
			return true;
	}
  }
}
	}
		return false;
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
		
		
		//*****END WEST START EAST*****//
		
		
		Block e1 = e.getRelative(BlockFace.EAST, t3-1);
		int t11 = tun.ewtStraight(e1, m, bf3);
		
		Block s1 = e1.getRelative(BlockFace.EAST, t11-5);
		Block s2 = s1.getRelative(BlockFace.SOUTH, 2);
		int t15 = tun.nstStraight(s2, m, bf2);
		
		Block s01 = s1.getRelative(BlockFace.EAST, t15-5);
		Block s02 = s01.getRelative(BlockFace.SOUTH, 2);
		int t015 = tun.nstStraight(s02, m, bf2);
		
		Block s3 = s2.getRelative(BlockFace.SOUTH, t15-6);
		int t16 = tun.nstStraight(s3, m, bf2);

		Block en2 = e.getRelative(BlockFace.EAST, 12);
		Block en3 = en2.getRelative(BlockFace.UP, 1);
		Block en4 = en3.getRelative(BlockFace.SOUTH, 7);
		int entr2 = ent.ent1(en4, m, bf2);
		
		Block s4 = s3.getRelative(BlockFace.SOUTH, t16-7);
		Block s5 = s4.getRelative(BlockFace.WEST, 2);
		int t19 = tun.ewtStraight(s5, m, bf4);
		
		Block hut4 = s4.getRelative(BlockFace.NORTH, 2);
		Block hut5 = hut4.getRelative(BlockFace.WEST, t19-6);
		int h3 = hut.hut1(hut5, m, bf1);
		
		Block e04 = e.getRelative(BlockFace.NORTH, 2);
		Block e4 = e04.getRelative(BlockFace.EAST, t3-8);
		int t18 = tun.nstStraight(e4, m, bf1);
		
		Block e5 = e.getRelative(BlockFace.EAST, t3-2);
		int t20 = tun.nstStraight(e5, m, bf2);
				
		Block e6 = s4.getRelative(BlockFace.EAST, t19);
		Block e7 = e6.getRelative(BlockFace.NORTH, 5);
		int t22 = tun.ewtStraight(e7, m, bf4);
		
		//Block hut6 = s3.getRelative(BlockFace.SOUTH, 1);
		Block hut7 = s4.getRelative(BlockFace.EAST, t19-6);
		Block hut8 = hut7.getRelative(BlockFace.NORTH, 3);
		int h4 = hut.hut1(hut8, m, bf2);
		
		Block e9 = e6.getRelative(BlockFace.EAST, t22-2);
		Block e10 = e9.getRelative(BlockFace.SOUTH, 5);
		int t23 = tun.ewtStraight(e10, m, bf4);
		
		Block n4 = e9.getRelative(BlockFace.EAST, t23-5);
		Block n5 = n4.getRelative(BlockFace.SOUTH, 2);
		int t24 = tun.ewtStraight(n4, m, bf4);
		
		Block e11 = e4.getRelative(BlockFace.EAST, t18-2);
		int t25 = tun.nstStraight(e11, m, bf1);
		
		//*****END EAST START NORTH*****//
			
		Block n6 = n.getRelative(BlockFace.NORTH, t1-1);
		int t26 = tun.nstStraight(n6, m, bf1);
		
		Block e12 = n6.getRelative(BlockFace.NORTH, t26-8);
		Block e13 = n6.getRelative(BlockFace.EAST, 2);
		int t28 = tun.ewtStraight(e12, m, bf3);		
		
		Block n7 = n6.getRelative(BlockFace.NORTH, t26-1);
		int t27 = tun.nstStraight(n7, m, bf);
		
		Block e14 = n6.getRelative(BlockFace.NORTH, t26-5);
		Block e15 = e14.getRelative(BlockFace.WEST, 1);
		int t29 = tun.ewtStraight(e15, m, bf4);
		
		Block n8 = e14.getRelative(BlockFace.WEST, t29-5);
		Block n9 = n8.getRelative(BlockFace.NORTH, 2);
		int t31 = tun.nstStraight(n9, m, bf1);	
		
		Block e16 = e14.getRelative(BlockFace.WEST, t29-1);
		int t30 = tun.ewtStraight(e16, m, bf4);
		
		Block hut9 = e16.getRelative(BlockFace.WEST, t30-6);
		Block hut10 = hut9.getRelative(BlockFace.SOUTH, 2);
		int h5 = hut.hut1(hut10, m, bf2);
		
		Block n10 = n9.getRelative(BlockFace.NORTH, t31-1);
		int t32 = tun.nstStraight(n10, m, bf1);
		
		Block setter7 = n10.getRelative(BlockFace.NORTH, t32);
		Block setter8 = setter7.getRelative(BlockFace.WEST, 3);
		Block pit4 = setter8.getRelative(BlockFace.UP, 5);
		int p4 = pit.pit2(pit4, m, bf3);
				
		Block e17 = n6.getRelative(BlockFace.NORTH, t26-8);
		Block e18 = e17.getRelative(BlockFace.EAST, 2);
		int t33 = tun.ewtStraight(e18, m, bf3);	
				
		Block ent5 = e17.getRelative(BlockFace.EAST, t33);
		Block ent6 = ent5.getRelative(BlockFace.UP, 1);
		Block ent7 = ent6.getRelative(BlockFace.SOUTH, 7);
		int entr3 = ent.ent1(ent7, m, bf2);
		
		Block e19 = n9.getRelative(BlockFace.NORTH, t31-2);
		Block e20 = e19.getRelative(BlockFace.WEST, 2);
		int t34 = tun.ewtStraight(e20, m, bf4);	
		
		Block e21 = e20.getRelative(BlockFace.NORTH, t34-1);
		int t35 = tun.ewtStraight(e21, m, bf4);	
		
		//*****END NORTH START SOUTH*****//
		
	}		
	
}


