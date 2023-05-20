@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnAccessPoint
import software.amazon.awscdk.services.efs.CfnAccessPointProps
import software.constructs.Construct

public fun Construct.cfnAccessPoint(
  id: String,
  props: CfnAccessPointProps,
  initializer: CfnAccessPoint.() -> Unit = {},
): CfnAccessPoint = CfnAccessPoint(this, id, props).apply(initializer)
