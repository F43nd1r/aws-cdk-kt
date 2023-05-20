@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.pipelines.CodePipeline
import software.amazon.awscdk.pipelines.CodePipelineProps
import software.constructs.Construct

public fun Construct.codePipeline(
  id: String,
  props: CodePipelineProps,
  initializer: CodePipeline.() -> Unit = {},
): CodePipeline = CodePipeline(this, id, props).apply(initializer)
