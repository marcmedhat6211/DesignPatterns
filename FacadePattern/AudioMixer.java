/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.FacadePattern;
import java.io.File;
/**
 *
 * @author marc
 */
public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
