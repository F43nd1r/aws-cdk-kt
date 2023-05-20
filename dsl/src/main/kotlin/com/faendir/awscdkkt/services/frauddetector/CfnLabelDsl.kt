@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnLabel
import software.amazon.awscdk.services.frauddetector.CfnLabelProps
import software.constructs.Construct

public fun Construct.cfnLabel(
  id: String,
  props: CfnLabelProps,
  initializer: CfnLabel.() -> Unit = {},
): CfnLabel = CfnLabel(this, id, props).apply(initializer)
