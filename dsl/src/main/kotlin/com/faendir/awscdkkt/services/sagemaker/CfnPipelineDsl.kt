@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnPipeline
import software.amazon.awscdk.services.sagemaker.CfnPipelineProps
import software.constructs.Construct

public fun Construct.cfnPipeline(
  id: String,
  props: CfnPipelineProps,
  initializer: CfnPipeline.() -> Unit = {},
): CfnPipeline = CfnPipeline(this, id, props).apply(initializer)
