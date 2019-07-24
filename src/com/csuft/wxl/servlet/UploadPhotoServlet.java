package com.csuft.wxl.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadPhotoServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String filename = null;
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		factory.setSizeThreshold(1024 * 1024);
		List items = null;
		try {
			items = upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator iter = items.iterator();
		String filename1 = null;
		while (iter.hasNext()) {
			
			FileItem item = (FileItem) iter.next();
			
			//判断是item.isFormField()返回true则item为常规字段
			//返回false则为文件字段，通过item.getFieldName()和item.getString()就知道分别是哪个字段，的哪个值了
			if (!item.isFormField()) {
				filename = System.currentTimeMillis() + ".png";
				String photoFolder = request.getServletContext().getRealPath("uploaded");
				File f = new File(photoFolder, filename);
				filename1 = f.getName();
				f.getParentFile().mkdirs();
				try {
					InputStream is = item.getInputStream();
					FileOutputStream fos = new FileOutputStream(f);
					byte b[] = new byte[1024 * 1024];
					int length = 0;
					while (-1 != (length = is.read(b))) {
						fos.write(b, 0, length);
					}
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println(item.getFieldName());
				String value = item.getString();
				value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
				System.out.println(value);
			}
		}
		String html = "<img src='uploaded/" + filename1 + "' />";
		System.out.println(filename1);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.format(html, filename);
	}

}
