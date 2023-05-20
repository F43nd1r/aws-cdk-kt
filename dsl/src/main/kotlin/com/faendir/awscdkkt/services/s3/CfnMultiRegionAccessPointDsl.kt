@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps
import software.constructs.Construct

public fun Construct.cfnMultiRegionAccessPoint(
  id: String,
  props: CfnMultiRegionAccessPointProps,
  initializer: CfnMultiRegionAccessPoint.() -> Unit = {},
): CfnMultiRegionAccessPoint = CfnMultiRegionAccessPoint(this, id, props).apply(initializer)
