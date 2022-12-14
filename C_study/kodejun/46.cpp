// learn operator overloading...
#include <iostream>

class Coord_2D{
private:
	int x;
	int y;
public:
	Coord_2D(int _x, int _y) : x(_x), y(_y) {}
	void showCoord();
	
	// operator loading
	Coord_2D operator+(Coord_2D& _k);
};

Coord_2D Coord_2D::operator+(Coord_2D& _k){
	Coord_2D temp(x + _k.x, y + _k.y);
	return temp;
}

void Coord_2D::showCoord(){
	std::cout << "( " << x << "," << y << " )" << std::endl;
}

int main(void){
	Coord_2D a(10, 10);
	Coord_2D b(20, 20);
	
	a.showCoord();
	b.showCoord();
	
	Coord_2D c = a + b;
	c.showCoord();
	
	Coord_2D d = a + b + c;
	d.showCoord();
	
	return 0;
}
