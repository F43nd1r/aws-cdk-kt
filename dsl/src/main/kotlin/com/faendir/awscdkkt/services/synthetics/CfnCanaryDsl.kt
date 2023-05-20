@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary
import software.amazon.awscdk.services.synthetics.CfnCanaryProps
import software.constructs.Construct

public fun Construct.cfnCanary(
  id: String,
  props: CfnCanaryProps,
  initializer: CfnCanary.() -> Unit = {},
): CfnCanary = CfnCanary(this, id, props).apply(initializer)
