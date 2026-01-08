package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.codebuild.IProjectRef
import software.amazon.awscdk.services.events.targets.CodeBuildProject

@Generated
public fun buildCodeBuildProject(project: IProjectRef, initializer: @AwsCdkDsl CodeBuildProject.Builder.() -> Unit = {}): CodeBuildProject = CodeBuildProject.Builder.create(project).apply(initializer).build()
