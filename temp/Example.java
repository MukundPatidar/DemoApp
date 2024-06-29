public void process() {
    try {
        // some code that may throw IOException
    } catch (IOException e) {
        throw new RuntimeException("Processing failed", e);
    }
}
