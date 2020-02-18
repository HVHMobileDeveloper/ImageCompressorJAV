# ImageCompressorJAV
   
 File actualImage = FileUtil.from(context, your_uri);

 File compressedImage = new Compressor(getActivity()).compressToFile(actualImage);
 Uri uri = Uri.fromFile(compressedImage);
 img.setImageUri(uri);
