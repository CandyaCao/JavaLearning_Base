package ex.md04;

public class Classroom {
	public Teacher teacher;						//�����ʦ	
	public Student[] students = new Student[40];//����ѧ��
	public int index = 0;						//����ѧ������

	public Teacher getTeacher(){
		//���ؽ����еĽ�ʦ
		return teacher;
	}

	public Student[] getStudents(){
		//�������е�ѧ��
		return getStudents();
		
	}

	public void setTeacher(Teacher tea){
		//������ʦ
		
	}

	public void addStudent(Student stu){
		//����ѧ��
		
	}

	public boolean removeStudent(int idx){
		return false;
		//ɾ��ѧ��
		
	}

	public int getStudentNum(){
		return index;
		//���ؽ�����ѧ��������
		
	}

	public void print(){
		//�����ǰ�����еĽ�ʦ��ѧ������Ϣ
		
	}

}
