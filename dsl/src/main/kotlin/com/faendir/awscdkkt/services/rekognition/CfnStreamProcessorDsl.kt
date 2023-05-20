@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import software.amazon.awscdk.services.rekognition.CfnStreamProcessorProps
import software.constructs.Construct

public fun Construct.cfnStreamProcessor(
  id: String,
  props: CfnStreamProcessorProps,
  initializer: CfnStreamProcessor.() -> Unit = {},
): CfnStreamProcessor = CfnStreamProcessor(this, id, props).apply(initializer)
