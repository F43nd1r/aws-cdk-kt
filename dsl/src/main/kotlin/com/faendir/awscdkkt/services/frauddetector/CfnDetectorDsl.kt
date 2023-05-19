@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
