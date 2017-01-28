class EncodeMessage {
    public static void main(String[] args) {
        System.out.print("Type a message to be converted into binary: ");
        String message = System.console().readLine();
        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            int ascii = (int) character;
            System.out.print(Integer.toBinaryString(ascii) + " ");
        }
        System.out.println();
    }
}
