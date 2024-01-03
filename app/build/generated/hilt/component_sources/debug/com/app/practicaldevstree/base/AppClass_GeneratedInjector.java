package com.app.practicaldevstree.base;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = AppClass.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface AppClass_GeneratedInjector {
  void injectAppClass(AppClass appClass);
}
