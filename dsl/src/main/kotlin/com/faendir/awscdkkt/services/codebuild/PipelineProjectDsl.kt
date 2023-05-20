@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.constructs.Construct

public fun Construct.pipelineProject(id: String, initializer: PipelineProject.() -> Unit = {}):
    PipelineProject = PipelineProject(this, id).apply(initializer)

public fun Construct.pipelineProject(
  id: String,
  props: PipelineProjectProps,
  initializer: PipelineProject.() -> Unit = {},
): PipelineProject = PipelineProject(this, id, props).apply(initializer)
