package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImagePipeline(
  id: String,
  props: CfnImagePipelineProps,
  initializer: CfnImagePipeline.() -> Unit = {},
): CfnImagePipeline = CfnImagePipeline(this, id, props).apply(initializer)
