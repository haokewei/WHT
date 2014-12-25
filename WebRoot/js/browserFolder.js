function browseFolder(lujing) {
    try {
        var Message = "\u8bf7\u9009\u62e9\u6587\u4ef6\u5939";  //ѡ�����ʾ��Ϣ
        var Shell = new ActiveXObject("Shell.Application");
        var Folder = Shell.BrowseForFolder(0, Message, 64, 17);//��ʼĿ¼Ϊ���ҵĵ���
  //var Folder = Shell.BrowseForFolder(0,Message,0); //��ʼĿ¼Ϊ������
        if (Folder != null) {
             Folder = Folder.items();  // ���� FolderItems ����
             Folder = Folder.item();  // ���� Folderitem ����
             Folder = Folder.lujing;   // ����·��
            if (Folder.charAt(Folder.length - 1) != "\\") {
                 Folder = Folder + "\\";
             }
             document.getElementById(lujing).value = Folder;
            return Folder;
         }
     }
    catch (e) {
         alert(e.message);
     }
}