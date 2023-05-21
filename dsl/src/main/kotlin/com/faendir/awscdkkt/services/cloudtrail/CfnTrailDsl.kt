package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail
import software.amazon.awscdk.services.cloudtrail.CfnTrailProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrail(
  id: String,
  props: CfnTrailProps,
  initializer: CfnTrail.() -> Unit = {},
): CfnTrail = CfnTrail(this, id, props).apply(initializer)
