//package org.example.ibroximjon.audio_converter;
//
//
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.sound.sampled.AudioFormat;
//import java.io.IOException;
//
//@RestController
//public class AudioConverterController {
//
//    @PostMapping("/convert")
//    public ResponseEntity<byte[]> convert(@RequestBody MultipartFile audioFile) throws IOException {
//        AudioFormat audioFormat = AudioFormat.guessFormat(audioFile.getInputStream());
//
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .body(convertedAudioBytes);
//    }
//}
