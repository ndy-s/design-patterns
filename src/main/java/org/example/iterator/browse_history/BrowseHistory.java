package org.example.iterator.browse_history;

public class BrowseHistory {
    // private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        // urls.add(url);
        urls[count++] = url;
    }

    public String pop() {
        // return urls.removeLast();
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

//    public class ListIterator implements Iterator<String> {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
