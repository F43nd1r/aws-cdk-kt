@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
