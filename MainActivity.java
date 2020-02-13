public static int updateImage(){
      int ret = 0;
      try{
          OkHttpClient Client = new OkHttpClient();
          final MediaType MEDIA_TYPE_PNG = MediaType.parse("image/png");
          RequestBody requestBody = new MultipartBody.Builder()
                  .setType(MultipartBody.FORM)
                  .addFormDataPart("appId","iov2049586751b9bc6bd9631abe7a021146")
                  .addFormDataPart("timestamp","1499159290")
                  .addFormDataPart("api","iov331.cardvr.uploadimg")
                  .addFormDataPart("sign","a869173746864fc4163b02530745130e")
                  .addFormDataPart("daId","DNTC2019120833")
                  .addFormDataPart("uploadType","4")
                  .addFormDataPart("imageFile","test.png",
                          RequestBody.create(MEDIA_TYPE_PNG,new File("/storage/emulated/0/Pictures/test.png")))
                  .build();
                   Request Request = new Request.Builder()
                           .url("https://vitappkf.venucia.com/iov_gw/gw")
                           .post(requestBody)
                           .build();
                   Response response = Client.newCall(Request).execute();
                   String responseData = response.body().string();
          Log.d(TAG, "updateImage: "+responseData);
          JSONObject ret_json = new JSONObject(responseData);
          ret = ret_json.getInt("result");
          Log.d(TAG, "updateImage result value is : "+ ret);
      }catch(Exception e){
          e.printStackTrace();
      }
      return ret;
  }
