@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuild
import software.amazon.awscdk.services.stepfunctions.tasks.CodeBuildStartBuildProps
import software.constructs.Construct

public fun Construct.codeBuildStartBuild(
  id: String,
  props: CodeBuildStartBuildProps,
  initializer: CodeBuildStartBuild.() -> Unit = {},
): CodeBuildStartBuild = CodeBuildStartBuild(this, id, props).apply(initializer)
