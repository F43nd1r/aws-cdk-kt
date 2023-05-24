package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuild
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildProps
import software.constructs.Construct

@Generated
public fun Construct.codeBuildStartBuild(id: String, props: CodeBuildStartBuildProps):
    CodeBuildStartBuild = CodeBuildStartBuild(this, id, props)

@Generated
public fun Construct.codeBuildStartBuild(
  id: String,
  props: CodeBuildStartBuildProps,
  initializer: @AwsCdkDsl CodeBuildStartBuild.() -> Unit,
): CodeBuildStartBuild = CodeBuildStartBuild(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCodeBuildStartBuild(id: String, initializer: @AwsCdkDsl
    CodeBuildStartBuild.Builder.() -> Unit): CodeBuildStartBuild =
    CodeBuildStartBuild.Builder.create(this, id).apply(initializer).build()
