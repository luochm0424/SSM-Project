package com.lcm.pojo;

public class Filename {
    private Integer fileId;

    private String fileName;

    private Integer downloadCount;

    private String fileSize;

    @Override
    public String toString() {
        return "Filename{" +
                "fileId=" + fileId +
                ", fileName='" + fileName + '\'' +
                ", downloadCount=" + downloadCount +
                ", fileSize='" + fileSize + '\'' +
                '}';
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }
}