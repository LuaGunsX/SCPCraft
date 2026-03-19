/*    */ package SCPCraft;
/*    */ 
/*    */ import bev;
/*    */ import net.minecraftforge.client.event.sound.SoundLoadEvent;
/*    */ import net.minecraftforge.event.ForgeSubscribe;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SCPCraft_EventSounds
/*    */ {
/*    */   @ForgeSubscribe
/*    */   public void onSoundsLoaded(SoundLoadEvent event) {
/*    */     try {
/* 15 */       bev manager = event.manager;
/* 16 */       String[] soundFiles = { "/SCPCraft/sounds/096Cry.wav", "/SCPCraft/sounds/096Scream.wav", "/SCPCraft/sounds/096Seen.wav", "/SCPCraft/sounds/294use.wav", "/SCPCraft/sounds/914use.wav", "/SCPCraft/sounds/AlarmClassic.wav", "/SCPCraft/sounds/AlarmRetro.wav", "/SCPCraft/sounds/AlarmScary.wav", "/SCPCraft/sounds/AlarmSpeaker.wav", "/SCPCraft/sounds/doorClose.wav", "/SCPCraft/sounds/doorOpen.wav", "/SCPCraft/sounds/drop.wav", "/SCPCraft/sounds/heartbeat.wav", "/SCPCraft/sounds/MrBrass.wav", "/SCPCraft/sounds/Munch.wav", "/SCPCraft/sounds/oldman.wav", "/SCPCraft/sounds/Roar1.wav", "/SCPCraft/sounds/Roar2.wav", "/SCPCraft/sounds/rustle1.wav", "/SCPCraft/sounds/rustle2.wav", "/SCPCraft/sounds/rustle3.wav", "/SCPCraft/sounds/SCP789J.wav", "/SCPCraft/sounds/sculpture.wav", "/SCPCraft/sounds/stairs.wav", "/SCPCraft/sounds/Whispers.wav", "/SCPCraft/sounds/StepSounds/StepPD1.wav", "/SCPCraft/sounds/StepSounds/StepPD2.wav", "/SCPCraft/sounds/StepSounds/StepPD3.wav", "/SCPCraft/sounds/GameShow/Correct.wav", "/SCPCraft/sounds/GameShow/Die.wav", "/SCPCraft/sounds/GameShow/Ok.wav", "/SCPCraft/sounds/GameShow/Present.wav", "/SCPCraft/sounds/GameShow/Time.wav", "/SCPCraft/sounds/GameShow/Welcome.wav", "/SCPCraft/sounds/GameShow/Win.wav", "/SCPCraft/sounds/GameShow/Wrong.wav", "/SCPCraft/sounds/StoneDoorOpen.wav", "/SCPCraft/sounds/StoneDoorSlam.wav", "/SCPCraft/sounds/cowbell.wav", "/SCPCraft/sounds/173sound1.wav", "/SCPCraft/sounds/173sound2.wav", "/SCPCraft/sounds/173sound3.wav" };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 62 */       for (int i = 0; i < soundFiles.length; i++)
/*    */       {
/*    */         
/* 65 */         String soundName = soundFiles[i].substring(10);
/* 66 */         manager.b.addSound(soundName, getClass().getResource(soundFiles[i]));
/*    */       }
/*    */     
/* 69 */     } catch (Exception e) {
/*    */       
/* 71 */       e.printStackTrace();
/* 72 */       System.out.println("[SCPCraft] Failed to register one or more sounds.");
/*    */     }
/*    */     finally {
/*    */       
/* 76 */       System.out.println("[SCPCraft] Succesfully installed the sounds!");
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/luigi/Documents/JAR.jar!/SCPCraft/SCPCraft_EventSounds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */