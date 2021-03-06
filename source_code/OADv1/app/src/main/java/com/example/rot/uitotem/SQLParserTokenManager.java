package com.example.rot.uitotem;/* Generated By:JavaCC: Do not edit this line. SQLParserTokenManager.java */
import java.util.ArrayList;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/** Token Manager. */
public class SQLParserTokenManager implements SQLParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40000000L) != 0L)
            return 53;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 3;
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 39:
         return jjStartNfaWithStates_0(0, 30, 53);
      case 40:
         return jjStopAtPos(0, 10);
      case 41:
         return jjStopAtPos(0, 12);
      case 42:
         return jjStopAtPos(0, 39);
      case 43:
         return jjStopAtPos(0, 37);
      case 44:
         return jjStopAtPos(0, 11);
      case 45:
         jjmatchedKind = 38;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 46:
         return jjStopAtPos(0, 28);
      case 47:
         return jjStopAtPos(0, 40);
      case 59:
         return jjStopAtPos(0, 9);
      case 60:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x300000000L);
      case 61:
         return jjStopAtPos(0, 34);
      case 62:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 61:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 62:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStopAtPos(1, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 169;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAdd(56);
                  }
                  else if (curChar == 39)
                     jjCheckNAdd(53);
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     jjCheckNAdd(55);
                  }
                  break;
               case 52:
                  if (curChar == 39)
                     jjCheckNAdd(53);
                  break;
               case 53:
                  if ((0x3ff000100002400L & l) != 0L)
                     jjCheckNAddTwoStates(53, 54);
                  break;
               case 54:
                  if (curChar == 39 && kind > 41)
                     kind = 41;
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAdd(55);
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(56);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAdd(56);
                  }
                  if (curChar == 100)
                     jjAddStates(0, 1);
                  else if (curChar == 68)
                     jjAddStates(2, 3);
                  else if (curChar == 97)
                     jjAddStates(4, 5);
                  else if (curChar == 65)
                     jjAddStates(6, 7);
                  else if (curChar == 115)
                     jjAddStates(8, 10);
                  else if (curChar == 83)
                     jjAddStates(11, 13);
                  else if (curChar == 105)
                     jjAddStates(14, 16);
                  else if (curChar == 73)
                     jjAddStates(17, 19);
                  else if (curChar == 99)
                     jjAddStates(20, 22);
                  else if (curChar == 67)
                     jjAddStates(23, 25);
                  else if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 50;
                  else if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 47;
                  else if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 44;
                  else if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 42;
                  else if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 40;
                  else if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 34;
                  else if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 28;
                  else if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 77 && kind > 15)
                     kind = 15;
                  break;
               case 1:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 4:
                  if (curChar == 109 && kind > 15)
                     kind = 15;
                  break;
               case 5:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 69 && kind > 16)
                     kind = 16;
                  break;
               case 9:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 101 && kind > 16)
                     kind = 16;
                  break;
               case 14:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 119)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 83 && kind > 20)
                     kind = 20;
                  break;
               case 19:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 115 && kind > 20)
                     kind = 20;
                  break;
               case 25:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 69 && kind > 23)
                     kind = 23;
                  break;
               case 31:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 32:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 36:
                  if (curChar == 101 && kind > 23)
                     kind = 23;
                  break;
               case 37:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 82 && kind > 25)
                     kind = 25;
                  break;
               case 43:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 114 && kind > 25)
                     kind = 25;
                  break;
               case 45:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if (curChar == 84 && kind > 27)
                     kind = 27;
                  break;
               case 47:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 116 && kind > 27)
                     kind = 27;
                  break;
               case 50:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 51:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 53:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjAddStates(26, 27);
                  break;
               case 56:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(56);
                  break;
               case 57:
                  if (curChar == 67)
                     jjAddStates(23, 25);
                  break;
               case 58:
                  if (curChar == 69 && kind > 5)
                     kind = 5;
                  break;
               case 59:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 61:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 63:
                  if (curChar == 83 && kind > 6)
                     kind = 6;
                  break;
               case 64:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 67:
                  if (curChar == 82 && kind > 8)
                     kind = 8;
                  break;
               case 68:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 70:
                  if (curChar == 99)
                     jjAddStates(20, 22);
                  break;
               case 71:
                  if (curChar == 101 && kind > 5)
                     kind = 5;
                  break;
               case 72:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 115 && kind > 6)
                     kind = 6;
                  break;
               case 77:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 76;
                  break;
               case 78:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 77;
                  break;
               case 79:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 78;
                  break;
               case 80:
                  if (curChar == 114 && kind > 8)
                     kind = 8;
                  break;
               case 81:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 82:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if (curChar == 73)
                     jjAddStates(17, 19);
                  break;
               case 84:
                  if (curChar == 84 && kind > 7)
                     kind = 7;
                  break;
               case 85:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 84 && kind > 18)
                     kind = 18;
                  break;
               case 87:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 88:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 79 && kind > 19)
                     kind = 19;
                  break;
               case 92:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 93:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 92;
                  break;
               case 94:
                  if (curChar == 105)
                     jjAddStates(14, 16);
                  break;
               case 95:
                  if (curChar == 116 && kind > 7)
                     kind = 7;
                  break;
               case 96:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 97:
                  if (curChar == 116 && kind > 18)
                     kind = 18;
                  break;
               case 98:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 100:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 101:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 102:
                  if (curChar == 111 && kind > 19)
                     kind = 19;
                  break;
               case 103:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 102;
                  break;
               case 104:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 103;
                  break;
               case 105:
                  if (curChar == 83)
                     jjAddStates(11, 13);
                  break;
               case 106:
                  if (curChar == 89 && kind > 13)
                     kind = 13;
                  break;
               case 107:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 106;
                  break;
               case 108:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 107;
                  break;
               case 109:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 110:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 111:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 110;
                  break;
               case 112:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 111;
                  break;
               case 113:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 112;
                  break;
               case 114:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 113;
                  break;
               case 115:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 114;
                  break;
               case 116:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 115;
                  break;
               case 117:
                  if (curChar == 84 && kind > 22)
                     kind = 22;
                  break;
               case 118:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 117;
                  break;
               case 119:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 118;
                  break;
               case 120:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 119;
                  break;
               case 121:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 120;
                  break;
               case 122:
                  if (curChar == 84 && kind > 24)
                     kind = 24;
                  break;
               case 123:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 122;
                  break;
               case 124:
                  if (curChar == 115)
                     jjAddStates(8, 10);
                  break;
               case 125:
                  if (curChar == 121 && kind > 13)
                     kind = 13;
                  break;
               case 126:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 125;
                  break;
               case 127:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 126;
                  break;
               case 128:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 127;
                  break;
               case 129:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 128;
                  break;
               case 130:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 129;
                  break;
               case 131:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 130;
                  break;
               case 132:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 131;
                  break;
               case 133:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 132;
                  break;
               case 134:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 133;
                  break;
               case 135:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 134;
                  break;
               case 136:
                  if (curChar == 116 && kind > 22)
                     kind = 22;
                  break;
               case 137:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 136;
                  break;
               case 138:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 137;
                  break;
               case 139:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 138;
                  break;
               case 140:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 139;
                  break;
               case 141:
                  if (curChar == 116 && kind > 24)
                     kind = 24;
                  break;
               case 142:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 141;
                  break;
               case 143:
                  if (curChar == 65)
                     jjAddStates(6, 7);
                  break;
               case 144:
                  if (curChar == 83 && kind > 14)
                     kind = 14;
                  break;
               case 145:
                  if (curChar == 68 && kind > 26)
                     kind = 26;
                  break;
               case 146:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 145;
                  break;
               case 147:
                  if (curChar == 97)
                     jjAddStates(4, 5);
                  break;
               case 148:
                  if (curChar == 115 && kind > 14)
                     kind = 14;
                  break;
               case 149:
                  if (curChar == 100 && kind > 26)
                     kind = 26;
                  break;
               case 150:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 149;
                  break;
               case 151:
                  if (curChar == 68)
                     jjAddStates(2, 3);
                  break;
               case 152:
                  if (curChar == 80 && kind > 17)
                     kind = 17;
                  break;
               case 153:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 152;
                  break;
               case 154:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 153;
                  break;
               case 155:
                  if (curChar == 69 && kind > 21)
                     kind = 21;
                  break;
               case 156:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 155;
                  break;
               case 157:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 156;
                  break;
               case 158:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 157;
                  break;
               case 159:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 158;
                  break;
               case 160:
                  if (curChar == 100)
                     jjAddStates(0, 1);
                  break;
               case 161:
                  if (curChar == 112 && kind > 17)
                     kind = 17;
                  break;
               case 162:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 161;
                  break;
               case 163:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 162;
                  break;
               case 164:
                  if (curChar == 101 && kind > 21)
                     kind = 21;
                  break;
               case 165:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 164;
                  break;
               case 166:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 165;
                  break;
               case 167:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 166;
                  break;
               case 168:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 167;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 169 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   163, 168, 154, 159, 148, 150, 144, 146, 135, 140, 142, 116, 121, 123, 96, 101, 
   104, 85, 90, 93, 75, 79, 82, 62, 66, 69, 53, 54, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\73", "\50", "\54", 
"\51", null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\56", "\55\76", "\47", "\76\75", "\74\75", "\74\76", "\75", "\76", 
"\74", "\53", "\55", "\52", "\57", null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[169];
private final int[] jjstateSet = new int[338];
protected char curChar;
/** Constructor. */
public SQLParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public SQLParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 169; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100000400L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
