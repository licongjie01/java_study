##### 配置个人的用户名和电子邮箱

```
$ git config --global user.name "runoob"
$ git config --global user.email test@runoob.com
#使用 --global 每个项目都会使用这个配置信息，如果去掉就只有当前项目能使用（使用其他名字或邮箱）
```

##### 保存配置信息

```
git config --global credential.helper store #保存后不用每次都输入配置信息
```



##### 查看已有的配置信息

```
git config --list
```

##### 编辑git配置文件

```
$ git config -e    # 针对当前仓库 
$ git config -e --global   # 针对系统上所有仓库
```



##### git的工作流程

<img src=".\git-process.png" alt="git-process" style="zoom:50%;" />

##### 创建仓库

```
git init 	#本地目录创建仓库   在后面加入名称的话可以在当前目录再生成一个并目录并创建仓库
git clone	#远程服务器上克隆一个已经存在的仓库
```

##### 管理仓库

```
git status 				#查看仓库状态			可以查看当前仓库有那些文件 哪些分支 以及这些文件处于什么状态
git add 				#添加到暂存区			将文件提交到暂存区，等待后续的提交操作
git commit -m "message"	#提交				   提交到仓库，但不会提交未被添加到暂存区的文件，message信息会被记录到can'ku
```



##### git文件分类

| 状态              | 描述                                        |
| :---------------- | ------------------------------------------- |
| 未跟踪  Untrack   | 新创建还未被git管理起来的文件               |
| 未修改 Unmodified | 已经被git管理起来，但文件的内容未发生变化， |
| 已修改 Modified   | 修改了的文件，但未放在暂存区里面            |
| 已暂存 staged     | 修改后已经添加到暂存区里面的文件            |

