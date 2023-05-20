@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ram

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ram.CfnResourceShare
import software.amazon.awscdk.services.ram.CfnResourceShareProps
import software.constructs.Construct

public fun Construct.cfnResourceShare(
  id: String,
  props: CfnResourceShareProps,
  initializer: CfnResourceShare.() -> Unit = {},
): CfnResourceShare = CfnResourceShare(this, id, props).apply(initializer)
