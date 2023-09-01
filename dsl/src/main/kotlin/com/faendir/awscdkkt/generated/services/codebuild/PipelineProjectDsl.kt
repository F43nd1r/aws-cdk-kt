package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.PipelineProject
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.constructs.Construct

@Generated
public fun Construct.pipelineProject(id: String, initializer: @AwsCdkDsl PipelineProject.() -> Unit
    = {}): PipelineProject = PipelineProject(this, id).apply(initializer)

@Generated
public fun Construct.pipelineProject(
  id: String,
  props: PipelineProjectProps,
  initializer: @AwsCdkDsl PipelineProject.() -> Unit = {},
): PipelineProject = PipelineProject(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPipelineProject(id: String, initializer: @AwsCdkDsl
    PipelineProject.Builder.() -> Unit = {}): PipelineProject = PipelineProject.Builder.create(this,
    id).apply(initializer).build()
