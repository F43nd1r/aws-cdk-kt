@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
