@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
