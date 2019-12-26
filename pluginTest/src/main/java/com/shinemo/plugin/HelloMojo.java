package com.shinemo.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * 用于输出消息的Mojo
 * @goal hello
 */
public class HelloMojo extends AbstractMojo {
 
	/**
	 * @parameter expression="${echo.message}" default-value="Hello Maven World..."
	 */
	private Object message;
 
	public void execute() throws MojoExecutionException {
		getLog().info(message.toString());
	}
}
