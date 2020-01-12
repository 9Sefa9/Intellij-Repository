public class Train {

	// Kann fuer die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		int anzahlWaggon = 0;
		if (this.head == null) {
			return anzahlWaggon;
		} // for(:)只能array?
		else {
			Waggon current = this.head;
			do {
				anzahlWaggon += 1;
				current = current.getNext();
			} while (current != null);
			return anzahlWaggon;
		}
	}

	public int getPassengerCount() { // Fehler
		int anzahlPassenger = 0;
		Waggon current = this.head;
		while (current != null) {
			anzahlPassenger += current.getPassengers();
			current = current.getNext();
		}
		return anzahlPassenger;
	}

	// null -> int可以吗？
	public int getCapacity() {
		int capacityZug = 0;
		// 先开一个缓存将head储存起身先,而非直接在head上做手脚
		Waggon current = this.head;
		while (current != null) {
			capacityZug += current.getCapacity();
			current = current.getNext();
		}
		return capacityZug;
	}

	public void appendWaggon(Waggon waggon) {
		if (waggon != null) {
			if (this.head == null) {
				this.head = waggon;
//this.head.setNext(null);  这行应该不需要写吧？？而且其只系一个Waggon而非list??
			} else {
				Waggon prev = null;
				Waggon current = this.head;
				while (current != null) {
					prev = current;
					current = current.getNext();
				}
				prev.setNext(waggon);
			}
		} // ??
	}

	public void boardPassengers(int numberOfPassengers) {

		// & numberofPassengers <= this.getSize()*

//可以用for循环么？for(i=current.getPassengers();current.getPassengers()<current.getCapacity(); current.setPassengers(current.getPassengers()+1) {

		// 方法二： // 这方法如何优化？
//				int temp = numberOfPassengers;
//				Waggon current = this.head;
//				while(current!=null & temp >0){  // 两次temp!=0不系蠢, 因为每个temp!=0都系在不同的循环中作为该循环的循环条件
//					while(temp > 0 & current.getPassengers()!=current.getCapacity()) {
//						current.getPassengers()+=1;
//						temp-=1; // numberOfPassengers --得么？numberOfPassengers-=1得么？这行与上一行这样的先后顺序可行吗？
//					}current = current.getNext();
//				}

		// 方法一：
		int temp = numberOfPassengers;
		Waggon current = this.head;
		while (current != null && temp > 0) {
			int frei = current.getCapacity() - current.getPassengers(); // 这样的习惯很好！之后会再用的函数新开个变量来装
			if (temp > 0 & temp <= frei) {
				// while(temp!=0) {
				// current.setPassengers(current.getPassengers()+1);
				current.setPassengers(current.getPassengers() + temp);
				temp = 0;
				// temp-=1;
				// }
			} else {
				current.setPassengers(current.getCapacity());
				temp = temp - frei;
				current = current.getNext();
			}
		}
	}

	public Train uncoupleWaggons(int index) {

		Train train2 = new Train();
		if (index < 0 || this.head == null || index >= this.getSize() - 1)
			return null;
		else if (index == 0) {
			train2 = this;
			this.head = null;
		} else {
			Waggon prev = null; // null -> null得么？
			Waggon current = this.head;
			int position = 0;
			while (position < index) {
				position += 1;
				prev = current;
				current = current.getNext();
			} // 双向链点用？ 这里可以直接check当index = 0然后zug刚好又系1个车厢的做法吗？
			train2.head = current; // 点set head?? current的值系getNext还是this.head? train2在if外就不被认识了
			prev.setNext(null);
		}
		return train2;

//		if(index<=((this.getSize()-1)/2)) // 4分法比2分法更优？
//		{	
//			int position = 0;
//			Waggon prev = null;
//			Waggon current = this.head;
//			while(position!=index) {
//				position+=1;
//				prev = current;
//				current = current.getNext();
//			}
//			prev.setNext(null);
//			Train train2 = new Train(); //双向链点用？
//			train2.head = current;		//点set head??   current的值系getNext还是this.head? train2在if外就不被认识了
//			return train2;
//		}else {
//			int position = this.getSize()-1; //独立继续霖霖这里点写？
//			Waggon current =;
//			Waggon pre =
//		}	
	}

	public void insertWaggon(Waggon waggon, int index) { // 有简单d既答案么？

		Waggon prev = null;
		Waggon current = this.head;
		int position = 0;
// null.head = wagon gilt nicht? null.getNext() gilt auch nicht? null.setNext(waggon) gilt auch nicht??!
		if (waggon != null) {
			if (current == null) {
				this.head = waggon;
			} else if (index == 0) {
//				waggon.setNext(current); // 这行与下一行这两行顺序很重要，若调转就错了；
				this.head = waggon; // 因为每一步都要保持其每个Knoten之间可以连住不断开，
				waggon.setNext(current); // 若这两行顺序调转代表先断开Knoten,这样就再也连不起来了
			} else if (index >= this.getSize()) { // >=比=要好因为让position的各个可能性都被讨论了
				current.setNext(waggon);
			} else {
				// &&表前面falsch就不会check后面了
				while (position < index) { // 用if break可以吗？
					prev = current;
					current = current.getNext();
					position++;
				}
				prev.setNext(waggon);
				waggon.setNext(current);
//			current.setNext(null); // nicht notwendig, null ist default
			}
		}
	}

//		Waggon prev = null;		
//		Waggon current = head; 
//		if(index+1 > this.getSize()){
//			if(this.head == null) {
//				this.head = waggon;
//				waggon.setNext(null); //这步必要吗？
//			}else {
////				Waggon prev = null;		
////				Waggon current = head;  这两行完全可以拿出去作为globale Varrible
//				while(current!=null) {
//					prev = current;
//					current = current.getNext();
//				}prev.setNext(waggon);
//				 waggon.setNext(null); //这步必要吗？
//				}
//		}else{ 
//			int zaehler = 1;
//			while(zaehler != index+1) {
//				prev = current;
//				current = current.getNext();
//				zaehler+=1;
//			}prev.setNext(waggon);  
//			 waggon.setNext(current);
//		}

	public void turnOver() {
		// 可能有两种方法：方法一：2分法，每对互换位置；方法二：每个schieben全个位置,
		// 然后系先添加，全部添加完之后再删前面一半的knoten，独立试试2种方法是否可行？

		// 如何用双链实现？

//		for (int zaehler = 0; zaehler < this.getSize() - 1; zaehler++) {
//			Waggon temp = this.head;
//			Waggon current = this.head;
//			for (int position = 0; position < this.getSize() - 1; position++) { // 这里的变量可以看到外循环的变量position吗
//				current = current.getNext();
//			}
//			this.head = temp.getNext();
//			temp.setNext(null); // 必要写出来？
//			current.setNext(temp);// 这个Knoten后setNext(null) 必要写出来？
//		}

		Train train2 = new Train();
		Waggon prev = null;
		Waggon current = this.head;
		int pointer = 0; // position还是zaehler好？pointer?
		if (this.head != null) {
			while (pointer != this.getSize() - 1) {
				prev = current;
				current = current.getNext();
				pointer++;
			}
//			if(this.getSize()==1) {
//			train2.head = current; // 错误显示misplaced construct(s) warum??
//			}
			if (this.getSize() != 1) { // 让人更清晰易懂的话可以改成this.getSize()>1
				prev.setNext(null);
				train2.head = current;
			} else {
				while (pointer != this.getSize() - 2) {
					Waggon temp = this.head;
					while (pointer < this.getSize()) {
						prev = temp;
						temp = temp.getNext();
						pointer++;
					}
					prev.setNext(null);
					;
					train2.appendWaggon(temp);
				}
			}
		}
	}

	public void removeWaggon(Waggon waggon) { // Fehler

		// &与&&的区别？

//		if (waggon != null) {
//			Waggon prev = null;
//			Waggon current = this.head;
//			while (!current.equals(waggon) && current != null) { // 有无!运算符？
//				prev = current;
//				current = current.getNext();
//			}
//			if (current != null) {
//				prev.setNext(current.getNext()); // 删除第一个元素都可行？而不需要用current.setNext(this.head);？
//				current.setNext(null); // 这两行可否直接用在null上？
//			}
//		}

		// while循环里的循环条件最好不要用等式,因为有可能不小心犯错
		// 导致循环nicht terminiert,所以用大于号或者小于号最稳妥
		if (waggon != null && this.getSize() != 0) {
			Waggon prev = null;
			Waggon current = this.head;
			int zaehler = 0;
			if (this.getSize() == 1) {
				current = null;
			} else {
				while (zaehler < this.getSize() && !current.equals(waggon)) {
					prev = current;
					current = current.getNext();
					zaehler++;
				}
				if (current.equals(waggon) && zaehler == this.getSize() - 1) {
					prev.setNext(null);
				} else {
					prev.setNext(current.getNext());
					current = null;
				}
			}
		}
	}

//	
//public void removeWaggon(Waggon waggon) {
//		
//		if (waggon == this.head) {
//			
//			this.head = waggon.getNext();
//		
//			return;
//			
//		}
//		
//		if (waggon != null) {
//			
//			Waggon w = this.head.getNext();
//			
//			int zahlVariable=1;
//			
//			while (w != waggon && zahlVariable <= this.getSize() ) {
//				
//				w = w.getNext();
//				
//				zahlVariable++;
//			}
//			
//			if (w == waggon) {
//				
//				w.setNext(w.getNext());			
//				
//			}
//		}
//	}
	
	
	public Waggon getWaggonAt(int index) { // Fehler

		Waggon current = this.head;
		int position = 0;
		// 有无其他方法让其弄成1个部分而非像宜家分开2部分
		// return null; darf man????
		if (this.getSize() != 0 && index < this.getSize() && index >= 0) {
			while (position < index) { // 提醒：while (position - 1 != index),这样用等号写循环条件很不好
				current = current.getNext();
				position += 1;
			}
		}
		return current;
	}

	@Override
	public String toString() {
		if (getSize() == 0) {
			return LOCOMOTIVE;
		}

		StringBuilder str = new StringBuilder(LOCOMOTIVE);

		Waggon pointer = head;
		while (pointer != null) {
			str.append(" <---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		return str.toString();
	}

	public Waggon getHead() {
		return head;
	}

}
