public class ProductionLineOptimizer {

    // Minimum toplam süreyi hesaplayan fonksiyon
    public static int minTotalTime(int n, int m, int[][] processingTime, int[][] transitionTime) {
        int[][] dp = new int[n][m];


        for (int j = 0; j < m; j++) {
            dp[0][j] = processingTime[0][j];
        }

        for (int i = 1; i < n; i++) { // her iş
            for (int j = 0; j < m; j++) { // bu iş için seçilen makine
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 0; k < m; k++) { // önceki işin yapıldığı makine
                    int cost = dp[i - 1][k] + transitionTime[k][j] + processingTime[i][j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        // Son işin minimum bitiş süresi
        int result = Integer.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            result = Math.min(result, dp[n - 1][j]);
        }

        return result;
    }


    public static void main(String[] args) {
        int n = 3; // iş sayısı
        int m = 2; // makine sayısı

        int[][] processingTime = {
                {4, 6},   // İş 0
                {5, 3},   // İş 1
                {2, 4}    // İş 2
        };

        int[][] transitionTime = {
                {0, 2},   // Makine 0'dan diğerlerine
                {1, 0}    // Makine 1'den diğerlerine
        };

        int result = minTotalTime(n, m, processingTime, transitionTime);
        System.out.println("Minimum Toplam Süre: " + result);
    }
}
