import java.util.Scanner;

/*
사성전자는 올해 새로운 혁신적인 스마트폰 “갤럭시” 와 “갤럭시 플러스” 를 출시하려고 한다.
이름에서도 볼 수 있듯이, “갤럭시 플러스” 는 “갤럭시” 보다 좋은 성능을 가진 프리미엄 제품이다.
현재 "갤럭시 플러스" 제품의 생산 준비는 완료되었지만, 가격이 아직 정해지지 않았다.

애널리스트들은 n명의 잠재적 소비자들을 대상으로 설문 조사를 했고, 다음과 같은 사실을 알아냈다.

i번째 소비자는 갤럭시 플러스의 가격이 ai이하이면 갤럭시 플러스를 구매하고, 그렇지 않으나 갤럭시의 가격이 bi이하이면 갤럭시를 구매하고, 둘 다 아니면 아무것도 구매하지 않는다. 이 때 ai>=bi 이다.

사성전자는 “갤럭시 플러스”의 가격이 “갤럭시”의 가격 이상이며, 두 가격이 모두 정수이고, 잠재적 소비자들을 대상으로 한 총 수익의 합을 최대화되도록 가격을 책정할 생각이다. 이 때의 최대 수익은 얼마인가?


[입력]

첫 번째 줄에 테스트 케이스의 수 TC가 주어진다. 이후 TC개의 테스트 케이스가 새 줄로 구분되어 주어진다. 각 테스트 케이스는 다음과 같이 구성되었다.

- 첫 번째 줄에 잠재적 소비자의 수 n(1<=n<=150000) 이 주어진다.

- 이후 n개의 줄에 두 정수 ai,bi가 주어진다. (0<=bi<=ai<=109)


[출력]

각 테스트 케이스 마다, 최대 이득을 출력하라.
*/
public class Galaxy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] ai = new int[N];
            int[] bi = new int[N];
            for (int j = 0; j < N; j++) {
                ai[j] = sc.nextInt();
                bi[j] = sc.nextInt();
            }
            int maxprofit = getMaxProfit(ai, bi);
            System.out.println("#" + (i + 1) + " " + maxprofit);
        }
    }

    private static int getMaxProfit(int[] ai, int[] bi) {
        int maxprofit = Integer.MIN_VALUE;
        int size = ai.length;
        int[]index = new int[size];
        int aiprice = 0;
        int biprice = 0;
        for (int i = 0; i < ai.length; i++) {
            for (int j = 0; j < bi.length; j++) {
                for (int t : index) {

                }
                int profit = 0;
                int cnt = 0;
                for (int k = 0; k < size; k++) {
                    aiprice = ai[i];
                    biprice = bi[j];
                    if (aiprice <= ai[k]) {
                        profit += aiprice;
                        index[cnt++] = i;
                    }
                    else if (biprice <= bi[k]) profit += biprice;
                }
                if (maxprofit < profit) maxprofit = profit;
            }
        }

        return maxprofit;
    }
}

/*
ai 높으면 무조건 플러스
그러면 이 사람들을 제외한 사람들의 bi 최대
--8000 2000--
--6000 5000--
4000 4000
1500 1000
--7000 3000--
6000 * 3 + 4000 * 1 = 22000
 */