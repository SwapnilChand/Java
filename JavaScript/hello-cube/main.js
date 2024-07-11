import './style.css'
import * as THREE from 'three';

const scene = new THREE.Scene();

//parameters - fov, aspect ratio, view frustum
const camera = new THREE.PerspectiveCamera(75, window.innerWidth/window.innerHeight, 0.1, 1000);

const renderer = new THREE.WebGLRenderer({
  canvas: document.querySelector('#bg'),
});

renderer.setPixelRatio(window.devicePixelRatio);
renderer.setSize(window.innerWidth, window.innerHeight);
camera.position.setZ(30);

renderer.render(scene, camera);

const geometry = new THREE.TorusGeometry(10, 2, 12, 112);
const material = new THREE.MeshBasicMaterial({color: 0xFF6378, wireframe: true}); // no light source for basic material
const torus = new THREE.Mesh(geometry, material);

scene.add(torus)

function animate(){
  requestAnimationFrame(animate);
  renderer.render(scene, camera);

}
animate()