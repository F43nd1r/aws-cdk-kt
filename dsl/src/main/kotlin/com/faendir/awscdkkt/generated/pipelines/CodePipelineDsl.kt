package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.CodePipelineProps
import software.constructs.Construct

@Generated
public fun Construct.codePipeline(id: String, props: CodePipelineProps): CodePipeline =
    CodePipeline(this, id, props)

@Generated
public fun Construct.codePipeline(
  id: String,
  props: CodePipelineProps,
  initializer: @AwsCdkDsl CodePipeline.() -> Unit,
): CodePipeline = CodePipeline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCodePipeline(id: String, initializer: @AwsCdkDsl
    CodePipeline.Builder.() -> Unit): CodePipeline = CodePipeline.Builder.create(this,
    id).apply(initializer).build()
