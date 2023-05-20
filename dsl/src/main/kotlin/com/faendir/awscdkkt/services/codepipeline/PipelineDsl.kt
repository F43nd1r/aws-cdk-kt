@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.constructs.Construct

public fun Construct.pipeline(
  id: String,
  props: PipelineProps,
  initializer: Pipeline.() -> Unit = {},
): Pipeline = Pipeline(this, id, props).apply(initializer)

public fun Construct.pipeline(id: String, initializer: Pipeline.() -> Unit = {}): Pipeline =
    Pipeline(this, id).apply(initializer)
