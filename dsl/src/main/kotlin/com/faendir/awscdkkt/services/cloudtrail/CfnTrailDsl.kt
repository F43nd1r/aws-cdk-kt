@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps
import software.constructs.Construct

public fun Construct.cfnTrail(
  id: String,
  props: CfnTrailProps,
  initializer: CfnTrail.() -> Unit = {},
): CfnTrail = CfnTrail(this, id, props).apply(initializer)
