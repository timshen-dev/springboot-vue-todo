<template>
  <div class="container mt-5">
    <h1>📋 Task List</h1>

    <form @submit.prevent="addTask" class="input-group mb-4">
      <input v-model="newTask" type="text" class="form-control" placeholder="Enter task..." required />
      <button type="submit" class="btn btn-primary">Add</button>
    </form>

    <ul class="list-group">
      <li class="list-group-item d-flex justify-content-between align-items-center"
          v-for="task in tasks" :key="task.id">
        <div class="d-flex align-items-center">
          <input type="checkbox" class="form-check-input me-2"
                 :checked="task.completed" @change="toggleTask(task.id)" />
          <span :class="{'text-decoration-line-through text-muted': task.completed}">
            {{ task.title }}
          </span>
        </div>
        <button class="btn btn-sm btn-danger" @click="deleteTask(task.id)">Delete</button>
      </li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios'

const API_BASE = 'http://localhost:8080/api/tasks'

export default {
  data() {
    return {
      tasks: [],
      newTask: ''
    }
  },
  methods: {
    fetchTasks() {
      axios.get(API_BASE).then(res => {
        this.tasks = res.data
      })
    },
    addTask() {
      if (!this.newTask.trim()) return
      axios.post(API_BASE, { title: this.newTask }).then(() => {
        this.newTask = ''
        this.fetchTasks()
      })
    },
    deleteTask(id) {
      axios.delete(`${API_BASE}/${id}`).then(() => {
        this.fetchTasks()
      })
    },
    toggleTask(id) {
      axios.put(`${API_BASE}/${id}/toggle`).then(() => {
        this.fetchTasks()
      })
    }
  },
  mounted() {
    this.fetchTasks()
  }
}
</script>