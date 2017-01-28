class DecodeMessage {
    public static void main(String[] args) {
        System.out.print("Type a message to be converted into text: ");
        String[] message = System.console().readLine().split(" ");
        String decoded = "";
        for ( int i = 0; i < message.length; i++) {
            String current = message[i];
            int ascii = Integer.parseInt(current, 2);
            decoded += (char) ascii;
        }
        System.out.println(decoded);
    }
}
