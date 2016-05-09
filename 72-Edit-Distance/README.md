DPII 题目 f[i][j] 代表 word1 的前i 个与word2的前j个的min Edit num
所以两个字母相同时不变，不同时找f[i-1][j], f[i][j-1], f[i-1][j-1] 最小