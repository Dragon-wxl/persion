package com.csuft.wxl.hutool;

import java.io.IOException;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.ftp.Ftp;
import cn.hutool.extra.ftp.FtpMode;

public class TestFTP {
	public static void main(String[] args) {
		//注意添加用户权限
		//没有读写权限，不能完成响应的操作
		String localFile4Upload = "d:/asd.png";
		String localFile4Download = "d:/index.html";
		String remoteFolder = "/";
		String remoteFile = "index.html";
		String ftpServer = "*****";
		String anonymous = "*****";
		String password = "****";
		Ftp ftp = new Ftp(ftpServer,21,anonymous,password);
		ftp.setMode(FtpMode.Passive);
		ftp.cd(remoteFolder);
		boolean success = ftp.upload(remoteFolder,FileUtil.file(localFile4Upload));
		System.out.println("上传是否成功:"+success);
		ftp.download(remoteFolder, remoteFile, FileUtil.file(localFile4Download));
		System.out.println("用于上传的文件大小:"+FileUtil.file(localFile4Upload).length());
		System.out.println("下载下来之后的文件大小:"+FileUtil.file(localFile4Download).length());
		try {
			ftp.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
