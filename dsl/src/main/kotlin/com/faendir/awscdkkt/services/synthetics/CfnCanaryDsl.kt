package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.amazon.awscdk.services.synthetics.CfnCanaryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCanary(
  id: String,
  props: CfnCanaryProps,
  initializer: CfnCanary.() -> Unit = {},
): CfnCanary = CfnCanary(this, id, props).apply(initializer)
