package org.demoClasePooc125.model;

public class GrupoCurso {
    private int id;
    private int grupoId;
    private int cursoId;

    public GrupoCurso(int id, int grupoId, int cursoId) {
        this.id = id;
        this.grupoId = grupoId;
        this.cursoId = cursoId;
    }

    public GrupoCurso(int grupoId, int cursoId) {
        this.id = 0;
        this.grupoId = grupoId;
        this.cursoId = cursoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
}