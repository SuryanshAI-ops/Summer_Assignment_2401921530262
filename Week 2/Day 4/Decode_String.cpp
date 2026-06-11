class Solution {
public:
    string decodeString(string s) {
        stack<int> counts;
        stack<string> strings;

        string curr = "";
        int num = 0;

        for (char c : s) {
            if (isdigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '[') {
                counts.push(num);
                strings.push(curr);

                num = 0;
                curr = "";
            }
            else if (c == ']') {
                int k = counts.top();
                counts.pop();

                string prev = strings.top();
                strings.pop();

                while (k--) {
                    prev += curr;
                }

                curr = prev;
            }
            else {
                curr += c;
            }
        }

        return curr;
    }
};