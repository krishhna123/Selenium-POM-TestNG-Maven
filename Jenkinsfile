pipeline
{
  agent any
  
  stages
  {
    stage('Build')
	{
	  steps
	  {
	    echo 'Build App'
	  }
	 }
	 stage('Test')
	{
	  steps
	  {
	    echo 'Test App'
	  }
	 } 
	 stage('Build')
	{
	  steps
	  {
	    echo 'Deploy App'
	  }
	 } 
	}
	
	post
	{
	 always
	 {
	   emailext body: 'New Pipeline was deployed into Tech solutions', subject: 'Pipeline Status notification', to: 'madhuy2j28@gmail.com'
	 }
	}
}
