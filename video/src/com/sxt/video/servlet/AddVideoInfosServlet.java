package com.sxt.video.servlet;//这行代码用于自动识别包，并导包

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.sxt.video.model.Users;
import com.sxt.video.model.VideoInfos;
import com.sxt.video.service.VideoInfosService;
import com.sxt.video.service.impl.VideoInfosServiceImpl;

public class AddVideoInfosServlet extends HttpServlet {
	String videoGroupIDStr,title,videoImage,duration,videoPath,description,tag1,tag2,tag3,tag4,tag5;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于get请求的乱码解决，先采用iso8859-1编码，再使用utf-8解码
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
		
		String pathStr = request.getServletContext().getRealPath("/upload");
		File path = new File(pathStr);
		if(!path.exists()){
			path.mkdirs();//创建目录
		}
		
		//String realPath = request.getServletContext().getRealPath("/upload");
		//String realPath="E:/upload";
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload upload=new ServletFileUpload(diskFileItemFactory);
		try {
			List<FileItem> fileItemList = upload.parseRequest(request);
			for(FileItem fileItem:fileItemList){
				if(fileItem.isFormField()){
					String fieldName = fileItem.getFieldName();
					String value = fileItem.getString();
					if("videoGroupID".equals(fieldName)){
						videoGroupIDStr=value;	
					}else if("title".equals(fieldName)){
						title=value;
					}else if("duration".equals(fieldName)){
						duration=value;
					}else if("description".equals(fieldName)){
						description=value;
					}else if("tag1".equals(fieldName)){
						tag1=value;
					}else if("tag2".equals(fieldName)){
						tag2=value;
					}else if("tag3".equals(fieldName)){
						tag3=value;
					}else if("tag4".equals(fieldName)){
						tag4=value;
					}else if("tag5".equals(fieldName)){
						tag5=value;
					}
				}else{
					String fullName = fileItem.getName();
					String name = fullName.substring(fullName.lastIndexOf("/")+1);
					System.out.println(name);
					if(name.endsWith(".jpg")||name.endsWith(".gif")||name.endsWith(".png")){	
						videoImage = "upload/"+name;  
					}else if(name.endsWith(".mp4")||name.endsWith(".avi")||name.endsWith("wmv")){
						videoPath = "upload/"+name;
					}
					File file = new File(path,name);
					fileItem.write(file);
					
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Users user = (Users)request.getSession().getAttribute("user");
		System.out.println(user.getUserGroup()+"woshigougou");
		VideoInfos video=new VideoInfos(Integer.parseInt(videoGroupIDStr), user.getUserID(), title, videoImage, Double.parseDouble(duration), videoPath, description, tag1, tag2, tag3, tag4, tag5);
		VideoInfosService vds = new VideoInfosServiceImpl();
		int count = vds.add(video);
		if(count>0){
			response.sendRedirect("/video/teacher/welcom.jsp");
		}
	}
}
