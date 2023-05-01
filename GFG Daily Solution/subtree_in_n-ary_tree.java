class Solution {
    HashMap<String, Integer> hm = new HashMap<>();

    int count = 0;

    public int duplicateSubtreeNaryTree(Node root) {
        String str = nodeToString(root);
        return count;
    }

    public String nodeToString(Node root) {

        StringBuilder sb = new StringBuilder();
        if (root.children.size() == 0) {
            sb.append(root.data + "null");
        }
        int cnt = 1;
        for (Node n : root.children) {
            sb.append("." + cnt + "." + nodeToString(n));
            cnt++;
        }
        hm.put(sb.toString(), hm.getOrDefault(sb.toString(), 0) + 1);
        if (hm.get(sb.toString()) == 2)
            count++;

        return sb.toString();
    }

}