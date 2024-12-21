package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

@SuppressWarnings("serial")
public class MediaStore extends JPanel{
	private Media media;
	Cart cart = new Cart();
	public MediaStore(Media media) {
		// TODO Auto-generated constructor stub
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel("" + media.getCost() + " $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton cart_button = new JButton("Add to cart");
		JButton play_button = new JButton("Play");
		container.add(cart_button);
		if (media instanceof Playable) {
			container.add(play_button);
		}
		
		cart_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					cart.addMedia(media);
			}
		});
		
		play_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Playable) media).play();
			}
		});
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		
	}
	
	
	
	
}
	
	
	
