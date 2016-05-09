f[i][j] 代表 S中的前i个字符挑出T中前j个字符  有多少种方案。
初始化f[0][0] = 1 s的前0个挑出t的前0个有一种方案
S 包含 t(前提)
1. S包含当前位 like s= abcd t=cd
2.S不包含当前位 like s=abcd t=bc
if(S.charAt(i-1)==t.charAt(j-1)){
 两种情况都包含 f[i][j] = f[i-1][j]+f[i-1][j-1]
}
if(s.charAt(i-1)!=t.charAt(j-1)){
  只包含第二种情况 f[i][j] = f[i-1][j]
}