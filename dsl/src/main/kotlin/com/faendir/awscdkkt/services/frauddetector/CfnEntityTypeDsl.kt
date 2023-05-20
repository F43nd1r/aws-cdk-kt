@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnEntityType
import software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps
import software.constructs.Construct

public fun Construct.cfnEntityType(
  id: String,
  props: CfnEntityTypeProps,
  initializer: CfnEntityType.() -> Unit = {},
): CfnEntityType = CfnEntityType(this, id, props).apply(initializer)
