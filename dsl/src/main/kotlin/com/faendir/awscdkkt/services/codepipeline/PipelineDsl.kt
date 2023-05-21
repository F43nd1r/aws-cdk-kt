package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.constructs.Construct

@Generated
public fun Construct.pipeline(id: String, initializer: Pipeline.() -> Unit = {}): Pipeline =
    Pipeline(this, id).apply(initializer)

@Generated
public fun Construct.pipeline(
  id: String,
  props: PipelineProps,
  initializer: Pipeline.() -> Unit = {},
): Pipeline = Pipeline(this, id, props).apply(initializer)
