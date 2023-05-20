@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnDetector
import software.amazon.awscdk.services.frauddetector.CfnDetectorProps
import software.constructs.Construct

public fun Construct.cfnDetector(
  id: String,
  props: CfnDetectorProps,
  initializer: CfnDetector.() -> Unit = {},
): CfnDetector = CfnDetector(this, id, props).apply(initializer)
