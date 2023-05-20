@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps
import software.constructs.Construct

public fun Construct.cfnImagePipeline(
  id: String,
  props: CfnImagePipelineProps,
  initializer: CfnImagePipeline.() -> Unit = {},
): CfnImagePipeline = CfnImagePipeline(this, id, props).apply(initializer)
