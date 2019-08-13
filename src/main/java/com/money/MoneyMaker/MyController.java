package com.money.MoneyMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.money.MoneyMaker.Repository.RewardTaskRepository;
import com.money.MoneyMaker.Repository.UserInfoRepository;
import com.money.MoneyMaker.Repository.applistRepository;
import com.money.MoneyMaker.table.userinfo;
import com.money.MoneyMaker.table.applist;
import com.money.MoneyMaker.table.giftcard;
import com.money.MoneyMaker.table.rewardtask;
//import antlr.collections.List;

@RestController
public class MyController {

	
	@Autowired
	private UserInfoRepository userinforepository;
	@Autowired
	private RewardTaskRepository rewardtaskrepository;
	@Autowired
	private applistRepository applistrepository;

	@GetMapping("/referalcode")

	public HashMap<String, Object> getReferalCode() {
		HashMap<String, Object> map = new HashMap();
		ArrayList<userinfo> alluserdata = new ArrayList<userinfo>();
		ArrayList<String> allreferalcode = new ArrayList<String>();
		alluserdata = (ArrayList<userinfo>) userinforepository.findAll();
		for (int i = 0; i < alluserdata.size(); i++) {
			userinfo userdata = alluserdata.get(i);
			allreferalcode.add(userdata.getReferalcode());
		}
		map.put("referalcode", allreferalcode);
		return map;
	}

	@PostMapping("/addgoogleuser")

	public HashMap<String, Object> addgoogleuser(@RequestBody userinfo userinfo) {
		HashMap<String, Object> map = new HashMap();
		String email = userinfo.getUemail();
		userinforepository.save(userinfo);
		ArrayList<userinfo> alluserdata = new ArrayList<userinfo>();
		int userid=0;
		alluserdata = (ArrayList<userinfo>) userinforepository.findAll();
		for (int i = 0; i < alluserdata.size(); i++) {
			userinfo userdata = alluserdata.get(i);
			String emailid = userdata.getUemail();
			if (email.equalsIgnoreCase(emailid)) {
				userid = userdata.getUserid();
			}

		}
		map.put("userid", userid);
		map.put("Result", "Register Sucessfully");

		return map;

	}
	
	@GetMapping("/getrewardlist")
	public List<rewardtask> getrewardlist(){
		List<rewardtask> list=new ArrayList<rewardtask>();
		List<rewardtask> list2=rewardtaskrepository.findAll();
		for(rewardtask rewardtask : list2) {
			if(rewardtask.isLive()) {
				list.add(rewardtask);
			}
		}
		
		return list;
	}
	
	@PostMapping("/editprofile/{id}")
	public HashMap<String,String> editprofile(@RequestBody int id,userinfo userinfo){
		userinforepository.save(userinfo);
		HashMap<String,String> map=new HashMap();
		map.put("Result", "Profile Edited Sucessfully");
		return map;


}
	@GetMapping("/getprofile/{id}")
	public HashMap<String,Object> getprofile(@RequestBody int id){
		HashMap<String,Object> map = new HashMap();
		Optional<userinfo> userdata=userinforepository.findById(id);
		String name=userdata.get().getUname();
		String email=userdata.get().getUemail();
		long mob=userdata.get().getUmobile();
		map.put("name", name);
		map.put("email", email);
		map.put("mobile", mob);
		return map;
	}
	
	@GetMapping("/getalltask/{id}")
	public List<applist> getalltaskapp(@RequestBody int id){
		List<applist> list = new ArrayList<applist>();
		
		return list;
	}
	
	@GetMapping("/allranklist/{id}")
	public HashMap<String,Object> allranklist(@RequestBody int id){
		HashMap<String,Object> map=new HashMap();
		ArrayList<userinfo> alluserdata = new ArrayList<userinfo>();
		int userid=0;
		alluserdata = (ArrayList<userinfo>) userinforepository.findAll();
		for(userinfo userdata: alluserdata) {
			
		}
		
		return map;
	}
	
	@GetMapping("/giftcardlist/{id}")
	public List<giftcard> giftcardlist(@RequestBody int id){
		List<giftcard> list=new ArrayList();
		return list;
	}
	
}
