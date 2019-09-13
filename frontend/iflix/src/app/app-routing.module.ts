import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { ShowComponent } from './components/show/show.component';


const routes: Routes = [
  {path :'login', component:LoginComponent},
  {path :'show',component:ShowComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
