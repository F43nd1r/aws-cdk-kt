package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.scheduler.targets.CodeBuildStartBuild

@Generated
public fun buildCodeBuildStartBuild(project: IProject, initializer: @AwsCdkDsl
    CodeBuildStartBuild.Builder.() -> Unit = {}): CodeBuildStartBuild =
    CodeBuildStartBuild.Builder.create(project).apply(initializer).build()
