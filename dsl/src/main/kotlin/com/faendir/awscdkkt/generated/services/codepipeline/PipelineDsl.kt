package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.Pipeline
import software.amazon.awscdk.services.codepipeline.PipelineProps
import software.constructs.Construct

@Generated
public fun Construct.pipeline(id: String): Pipeline = Pipeline(this, id)

@Generated
public fun Construct.pipeline(id: String, initializer: @AwsCdkDsl Pipeline.() -> Unit): Pipeline =
    Pipeline(this, id).apply(initializer)

@Generated
public fun Construct.pipeline(id: String, props: PipelineProps): Pipeline = Pipeline(this, id,
    props)

@Generated
public fun Construct.pipeline(
  id: String,
  props: PipelineProps,
  initializer: @AwsCdkDsl Pipeline.() -> Unit,
): Pipeline = Pipeline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPipeline(id: String, initializer: @AwsCdkDsl Pipeline.Builder.() -> Unit):
    Pipeline = Pipeline.Builder.create(this, id).apply(initializer).build()
