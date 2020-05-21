// failide hoidla
const formData = new FormData();
// lubatud failide formaadid
var allowedTextDocuments = [".doc",".docx",".odt",".pdf", ".txt"];
var allowedExcelDocuments = ["csv","dif","ods","tsv","xlm","xls","xlsb","xlsm","xlsx","xlt","xltm","xltx"];

function setVisible() {
    
    /*var container = document.getElementById("ok1");
    document.getElementById("ok1").style.visibility = "visible";
    var content = container.innerHTML;
    container.innerHTML= content;*/
    
    document.getElementById("ok1").style.visibility = "visible";

}



window.onload = function(){

    // avalduse upload
    const fakeAvaldusUploadButton = document.getElementById("avaldusUPfake");
    const realAvaldusUploadButton = document.getElementById("avaldusUP");

    fakeAvaldusUploadButton.addEventListener("click",function(){
        realAvaldusUploadButton.click();
    });
    
    realAvaldusUploadButton.addEventListener("click", e=> {
        //e.preventDefault();
    
        var filePath = String(realAvaldusUploadButton.value);
        filePath = filePath.substring(filePath.indexOf("."));
        var error = 1;        
    
        // Kontrollime faili lõppu
        allowedTextDocuments.forEach(element => {
            if (filePath == element) {
                error = 0;                
                this.setVisible();
            }
        });
    
        for (var pair of formData.entries()) {
            this.console.log(pair[0]+ ', ' + pair[1]); 
        }
    
        if (error == 0) {
            formData.set("avaldusUP", realAvaldusUploadButton.files[0]);
            document.getElementById("ok1").style.visibility = "visible";
            this.setVisible();
            
        }
    });

    // ariplaani upload
    const fakeAriplaanUploadButton = document.getElementById("ariplaanUPfake");
    const realAriplaanUploadButton = document.getElementById("ariplaanUP");

    fakeAriplaanUploadButton.addEventListener("click",function(){
        realAriplaanUploadButton.click();
    });

    realAriplaanUploadButton.addEventListener("click", e=> {

        var filePath = String(realAriplaanUploadButton.value);
        filePath = filePath.substring(filePath.indexOf("."));
        var error = 1;        

        // Kontrollime faili lõppu
        allowedTextDocuments.forEach(element => {
            if (filePath == element) {
                error = 0;
            }
        });

        if (error == 0) {
            formData.set("ariplaanUP", realAriplaanUploadButton.files[0]);
        }           
                
    });

    // finantsprognooside upload
    const fakeFinantsUploadButton = document.getElementById("finantsUPfake");
    const realFinantsUploadButton = document.getElementById("finantsUP");

    fakeFinantsUploadButton.addEventListener("click",function(){
        realFinantsUploadButton.click();
    });

    realFinantsUploadButton.addEventListener("click", e=> {

        var filePath = String(realFinantsUploadButton.value);
        filePath = filePath.substring(filePath.indexOf("."));
        var error = 1;        

        // Kontrollime faili lõppu
        allowedExcelDocuments.forEach(element => {
            if (filePath == element) {
                error = 0;
            }
        });

        if (error == 0) {
            formData.set("finantsUP", realFinantsUploadButton.files[0]);
            this.console.log(realFinantsUploadButton.files); 
        }
        
    });

    // cv upload
    const fakeCvUploadButton = document.getElementById("cvUPfake");
    const realCvUploadButton = document.getElementById("cvUP");

    fakeCvUploadButton.addEventListener("click",function(){
        realCvUploadButton.click();
    });

    realCvUploadButton.addEventListener("click", e=> {

        var filePath = String(realCvUploadButton.value);
        filePath = filePath.substring(filePath.indexOf("."));
        var error = 1;

        // Kontrollime faili lõppu
        allowedTextDocuments.forEach(element => {
            if (filePath == element) {
                error = 0;
            }
        });

        if (error == 0) {
            formData.set("cvUP", realCvUploadButton.files[0]);
            this.console.log(realCvUploadButton.files); 
        }
    
    });

    // lisade upload
    const fakeLisadUploadButton = document.getElementById("lisadUPfake");
    const realLisadUploadButton = document.getElementById("lisadUP");

    fakeLisadUploadButton.addEventListener("click",function(){
        realLisadUploadButton.click();
    });

    realLisadUploadButton.addEventListener("click", e=> {

        var failid = realLisadUploadButton.files;
        var error = 1;
        var counter = 0;        
        
        // Kontrollime failide lõppu
        allowedTextDocuments.forEach(element => {
            //iga failiga, kontrollime faili formaati
            for (const file of failid) {

                var filePath = String(file.name);
                filePath = filePath.substring(filePath.indexOf("."));
                if (filePath == element) {
                    error = 0;
                }
                if (error == 0) {
                    formData.append("lisadUP", realLisadUploadButton.files[counter]);
                    error = 1;
                    counter++;
                }
            }
        });
    });
};