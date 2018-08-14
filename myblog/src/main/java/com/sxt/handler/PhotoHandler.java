package com.sxt.handler;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.sxt.model.Photo;
import com.sxt.service.PhotoService;

@Controller
@RequestMapping("/photo")
public class PhotoHandler {
	@Autowired
	private PhotoService photoService;
	@RequestMapping("/upload")
	public String upload(MultipartFile uploadFile,Photo photo){
		File f = new File("E:/upload");
			String originalFilename = uploadFile.getOriginalFilename();
			try {
				uploadFile.transferTo(new File(f,originalFilename));
				photo.setPhotoPath("E:/upload/"+originalFilename);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		int count = photoService.add(photo);
		if(count>0){
		return "redirect:/photo/list.action";
		}
		return "error";
	}
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(int photoId) throws Exception{
		Photo photo = photoService.findById(photoId);
		String photoPath = photo.getPhotoPath();
		HttpHeaders headers = new HttpHeaders();
		String photoPath2 = new String(photoPath.getBytes("utf-8"),"iso-8859-1");
		headers.setContentDispositionFormData("attachment", photoPath2);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		ResponseEntity<byte[]> re=new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(new File(photoPath)), headers, HttpStatus.CREATED);
		return re;
	}
	@RequestMapping("delete")
	public String delete(int photoId){
		int count = photoService.delete(photoId);
		if(count>0){
			return "redirect:/photo_list.jsp";
		}
		return "error";
	}
	@RequestMapping("list")
	public String findAll(Model modle){
		List<Photo> photoList = photoService.findAll();
		modle.addAttribute("photoList", photoList);
		return "photo_list";
	}
}
