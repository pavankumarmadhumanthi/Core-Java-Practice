package com.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/productdetails")
public class ProductController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String productname = req.getParameter("productname");
	 String productprice = req.getParameter("productprice");
	 String productQty = req.getParameter("productQty");
	 resp.setContentType("text/html");
	 PrintWriter writer = resp.getWriter();
	 RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
	 ProductModel productModel=new ProductModel();
	 productModel.setProductname(productname);
	 productModel.setProductprice(Integer.parseInt(productprice));
	 productModel.setProductQuantity(Integer.parseInt(productQty));
	 ProductDao dao=new ProductDao();
	 try {
		boolean insertProduct = dao.insertProduct(productModel);
		writer.write("Product inserted successfully");
		dispatcher.include(req, resp);
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		writer.write("Product inserted successfully");
		dispatcher.include(req, resp);
	}
	
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productid = req.getParameter("productid");
		 resp.setContentType("text/html");
		 PrintWriter writer = resp.getWriter();
		 ProductModel productModel=new ProductModel();
		 RequestDispatcher dispatcher = req.getRequestDispatcher("Searchproduct.jsp");
		 ProductDao dao=new ProductDao();
		 if(productid=="") {
			 List<ProductModel> searchAllProducts = dao.searchAllProducts();
			 req.setAttribute("productdeatails",searchAllProducts);
			 dispatcher.include(req, resp);
			 
		 }else {
		try {
			productModel.setProductid(Integer.parseInt(productid));
			List<ProductModel> searchByProductId = dao.searchByProductId(productModel);
			 req.setAttribute("productdeatails",searchByProductId);
			dispatcher.include(req, resp);
		}
		catch(Exception e) {
			writer.write("enter the valid product id");
			dispatcher.include(req, resp);
			
			throw e;
			
		}
		
	}
	}

}
