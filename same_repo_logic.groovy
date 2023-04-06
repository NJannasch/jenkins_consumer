def custom_compliance_check() {
    println 'THIS IS NOT GOOD!1!!11'
}

return this


// you can also use branch dependend logic like gitflow or others and execute only logic if required: https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow
/*
when {
    expression { env.BRANCH_NAME == 'master' }
}
steps {
    ...
}
*/
