package nsc;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2684;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_465;
import net.minecraft.class_636;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;
import nsc.mixin.aabab;
import nsc.mixin.aababbba;
import nsc.mixin.aabbbabaa;
import nsc.mixin.ababaabb;
import nsc.mixin.abababbaa;
import nsc.mixin.abbaababb;
import nsc.mixin.abbaabb;
import nsc.mixin.baaabb;

@Environment(EnvType.CLIENT)
public final class bbbabaa {
   public static void aa(class_746 var0, float var1) {
      ((aabbbabaa)var0).yj$setLastYawClient(var1);
   }

   public static void ab(class_746 var0, float var1) {
      ((aabbbabaa)var0).yj$setLastPitchClient(var1);
   }

   public static int ba(class_636 var0) {
      return ((baaabb)var0).wq_getBbCooldown();
   }

   public static float bb(class_746 var0) {
      return ((aabbbabaa)var0).yj$getLastPitchClient();
   }

   public static class_306 aaa(class_304 var0) {
      return ((abbaababb)var0).yj$getBoundKey();
   }

   public static float aab(class_746 var0) {
      return ((aabbbabaa)var0).yj$getLastYawClient();
   }

   public static void aba(class_1661 var0, int var1) {
      ((aababbba)var0).wq_setSlot(var1);
   }

   public static int abb(class_310 var0) {
      return ((abbaabb)var0).wq_getAtkCd();
   }

   private bbbabaa() {
   }

   public static double baa(class_746 var0) {
      return ((aabbbabaa)var0).yj$getLastXClient();
   }

   public static void bab(class_1309 var0, int var1) {
      ((abababbaa)var0).yj$setJumpingCooldown(var1);
   }

   public static boolean bba(class_310 var0) {
      return ((abbaabb)var0).wq_doAttack();
   }

   public static int bbb(class_746 var0) {
      return ((aabbbabaa)var0).yj$getTicksSinceLastPositionPacketSent();
   }

   public static void aaaa(class_310 var0, int var1) {
      ((abbaabb)var0).wq_setUseCd(var1);
   }

   public static int aaab(class_2684 var0) {
      return ((ababaabb)var0).wq$getId();
   }

   public static void aaba(class_636 var0, class_1799 var1) {
      ((baaabb)var0).wq_setSelectedStack(var1);
   }

   public static int aabb(class_304 var0) {
      return ((abbaababb)var0).yj$getTimesPressed();
   }

   public static void abaa(class_636 var0, int var1) {
      ((baaabb)var0).wq_setBbCooldown(var1);
   }

   public static void abab(class_746 var0, double var1) {
      ((aabbbabaa)var0).yj$setLastYClient(var1);
   }

   public static void abba(class_636 var0) {
      ((baaabb)var0).wq_invokeSyncSelectedSlot();
   }

   public static class_1799 abbb(class_636 var0) {
      return ((baaabb)var0).wq_getSelectedStack();
   }

   public static void baaa(class_746 var0, int var1) {
      ((aabbbabaa)var0).yj$setTicksSinceLastPositionPacketSent(var1);
   }

   public static int baab(class_636 var0) {
      return ((baaabb)var0).wq_getLastSelectedSlot();
   }

   public static double baba(class_746 var0) {
      return ((aabbbabaa)var0).yj$getLastZClient();
   }

   public static boolean babb(class_636 var0) {
      return ((baaabb)var0).wq_isBreakingBlock();
   }

   public static void bbaa(class_304 var0, int var1) {
      ((abbaababb)var0).yj$setTimesPressed(var1);
   }

   public static void bbab(class_636 var0, int var1) {
      ((baaabb)var0).wq_setLastSelectedSlot(var1);
   }

   public static void bbba(class_310 var0) {
      ((abbaabb)var0).wq_doItemUse();
   }

   public static void bbbb(class_310 var0, int var1) {
      ((abbaabb)var0).wq_setUseCd(var1);
   }

   public static void b(class_746 var0, double var1) {
      ((aabbbabaa)var0).yj$setLastZClient(var1);
   }

   public static int aaaaa(class_310 var0) {
      return ((abbaabb)var0).wq_getUseCd();
   }

   public static int aaaab(class_1661 var0) {
      return ((aababbba)var0).wq_getSelectedSlot();
   }

   public static double aaaba(class_746 var0) {
      return ((aabbbabaa)var0).yj$getLastYClient();
   }

   public static void aaabb(class_746 var0, double var1) {
      ((aabbbabaa)var0).yj$setLastXClient(var1);
   }

   public static class_1735 aabaa(class_465 var0) {
      return ((aabab)var0).wq_fbb2be();
   }

   public static void a(class_310 var0, int var1) {
      ((abbaabb)var0).wq_setAtkCd(var1);
   }
}
