import java.util.Stack;

class WebBrowser {
    private Stack<String> backHistory;
    private Stack<String> forwardHistory;
    private String currentURL;

    public WebBrowser() {
        backHistory = new Stack<>();
        forwardHistory = new Stack<>();
        currentURL = "www.example.com";
    }

    public void visit(String url) {
        backHistory.push(currentURL);
        currentURL = url;
        forwardHistory.clear();
    }

    public void goBack() {
        if (!backHistory.isEmpty()) {
            forwardHistory.push(currentURL);
            currentURL = backHistory.pop();
        }
    }

    public void goForward() {
        if (!forwardHistory.isEmpty()) {
            backHistory.push(currentURL);
            currentURL = forwardHistory.pop();
        }
    }

    public String getCurrentPage() {
        return currentURL;
    }
}
