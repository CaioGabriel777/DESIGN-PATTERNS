package com.designpatterns.builder.server;

public class ServerConfiguration {

    private final String ipAddress;
    private final int port;
    private final boolean isEncrypted;
    private final String clusterName;

    private ServerConfiguration(Builder builder) {
        this.ipAddress = builder.ipAddress;
        this.port = builder.port;
        this.isEncrypted = builder.isEncrypted;
        this.clusterName = builder.clusterName;
    }

    public String getIpAddress() { return ipAddress; }
    public int getPort() { return port; }
    public boolean isEncrypted() { return isEncrypted; }
    public String getClusterName() { return clusterName; }

    public void printServerConfiguration() {
        System.out.println("\n------------------------------------------------");
        System.out.println("IP Address: " + ipAddress + "\nPort: " + port + "\nEncrypted: " + isEncrypted + "\nCluster: " + clusterName);
    }

    public static class Builder {

        private final String ipAddress;
        private int port = 8080;
        private boolean isEncrypted = false;
        private String clusterName = "default-cluster";

        public Builder(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder enableEncrypted() {
            this.isEncrypted = true;
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public ServerConfiguration build() {
            return new ServerConfiguration(this);
        }
    }
}
