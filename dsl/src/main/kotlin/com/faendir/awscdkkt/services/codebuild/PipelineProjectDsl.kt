package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.constructs.Construct

@Generated
public fun Construct.pipelineProject(id: String, initializer: PipelineProject.() -> Unit = {}):
    PipelineProject = PipelineProject(this, id).apply(initializer)

@Generated
public fun Construct.pipelineProject(
  id: String,
  props: PipelineProjectProps,
  initializer: PipelineProject.() -> Unit = {},
): PipelineProject = PipelineProject(this, id, props).apply(initializer)
