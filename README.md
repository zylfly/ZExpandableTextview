# ZExpandableTextview
借鉴大佬的项目修改为自己需求的->全文收起识别网址

### 1、在自己项目中添加本项目依赖：

    implementation 'com.github.zylRookie:ZExpandableTextview:v1.0.0'

### 2、在根目录中添加：

    allprojects {
        repositories {
           ...
          maven {
              url "https://jitpack.io"
          }
       }
    }
  
 ### 3、在项目中使用：
  
  <com.zyl.ezlibrary.ExpandableTextViews
            android:id="@+id/tvTest"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:layout_margin="15dp"
            android:lineSpacingExtra="4dp"
            android:textSize="14sp"
            app:ep_contract_color="#1073ed"
            app:ep_expand_color="#1073ed"
            app:ep_expand_text="全文"
            app:ep_link_color="@color/colorAccent"
            app:ep_max_line="5"
            app:ep_need_contract="true"
            app:ep_need_expand="true"
            app:ep_need_mention="false"
            app:ep_need_url="true"/>
            
            其他方法在library中查看

        tvTest.setContent(a)

        tvTest.setLinkClickListener { type, content, selfContent ->
            //根据类型去判断
            when (type) {
                LinkType.LINK_TYPE -> Toast.makeText(this, "你点击了链接 内容是：$content", Toast.LENGTH_SHORT).show()
                LinkType.MENTION_TYPE -> Toast.makeText(this, "你点击了@用户 内容是：$content", Toast.LENGTH_SHORT).show()
                LinkType.SELF -> Toast.makeText(this, "你点击了自定义规则 内容是：$content$selfContent",Toast.LENGTH_SHORT).show()
            }
        }
