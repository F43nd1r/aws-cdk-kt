@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.amazon.awscdk.services.s3outposts.CfnAccessPointProps
import software.constructs.Construct

public fun Construct.cfnAccessPoint(
  id: String,
  props: CfnAccessPointProps,
  initializer: CfnAccessPoint.() -> Unit = {},
): CfnAccessPoint = CfnAccessPoint(this, id, props).apply(initializer)
