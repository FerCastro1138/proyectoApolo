import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    open: true
  },
  build: {
    rollupOptions: {
      output: {
        html: {
          tags: {
            meta: [
              {
                name: 'viewport',
                content: 'width=device-width, initial-scale=1'
              }
            ],
            title: {
              tag: 'title',
              content: 'Atención al Alumno FESC-UNAM'
            }
          }
        }
      }
    }
  }
})
