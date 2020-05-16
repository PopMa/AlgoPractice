package 程序员面试金典;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * created by popma
 * created time: 2020/4/28, 15:22
 * LRU 缓存算法的核心数据结构就是哈希链表，双向链表和哈希表的结合体。
 * LinkedList + HashMap?
 */
public class Pid16_25_LRU缓存 {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}

class LRUCache {
    private LinkedList<Integer> cache; // 存放key 双向链表
    private Map<Integer, Integer> map; // 存放key,val
    private int cap; // 上限

    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new LinkedList();
        map = new HashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int val = map.get(key);
            put(key, val); // 更换位置
            return val;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) { // 已经有,更新数据,更换位置
            cache.remove((Integer) key);
            cache.addFirst(key);
            // 更新 map 中对应的数据
            map.put(key, value);
        } else {
            if (map.size() == cap) {
                int last = cache.removeLast();
                map.remove(last);
            }
            cache.addFirst(key);
            // 新加 map 中对应的数据
            map.put(key, value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */