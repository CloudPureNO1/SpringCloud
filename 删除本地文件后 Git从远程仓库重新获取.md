### 删除本地文件后 Git从远程仓库重新获取

删除本地文件后，想从远程仓库中从新Pull最新版文件。

Git提示：up-to-date，但未得到删除的文件

原因：当前本地库处于另一个分支中，需将本分支发Head重置至master.
> git checkout master
>
> git reset hard

git 强行pull并覆盖本地文件
> git fetch --all
>
> git reset --hard origin/master
> 
> git pull

参考资料