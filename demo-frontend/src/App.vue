<script setup>
import {User,Lock} from '@element-plus/icons-vue'
</script>

<template>
  <div style="width: 100vw;height: 100vh;overflow:hidden;display: flex">
    <div style="flex: 1">
      <el-image style="height: 100%;width: 100%;" fit="cover"
          src="https://img1.baidu.com/it/u=2463514011,1142503686&fm=253&fmt=auto&app=138&f=JPEG?w=888&h=500"/>
    </div>
    <div style="width: 400px;background-color: white">
      <div style="text-align: center;margin: 0 20px">
        <div style="margin-top: 150px">
          <div style="font-size: 25px">登录</div>
          <div style="font-size: 14px;color: gray">请输入用户名和密码进行登录</div>
        </div>

        <div style="margin-top: 50px">
          <el-input style="width: 400px" type="text" placeholder="用户名/邮箱">
            <template #prefix>
              <el-icon><User /></el-icon>
            </template>
          </el-input>
          <el-input type="password" style="margin-top: 10px;width: 400px" placeholder="密码">
            <template #prefix>
              <el-icon><Lock /></el-icon>
            </template>
          </el-input>
        </div>

        <div>
          <el-row style="margin-top: 5px">
            <el-col :span="12" style="text-align: left">
              <el-checkbox v-model="checked1" label="记住密码"/>
            </el-col>
            <el-col :span="12" style="text-align: right">
              <el-link>忘记密码</el-link>
            </el-col>
          </el-row>
        </div>

        <div style="margin-top: 40px">
          <el-button style="width: 100px" type="success" plain>立即登录</el-button>
        </div>
        <div>
          <el-divider>
            <span style="color: gray">还没有账号？</span>
          </el-divider>
          <div>
            <el-button style="width: 100px" type="warning" plain>注册账号</el-button>
          </div>
        </div>

      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
