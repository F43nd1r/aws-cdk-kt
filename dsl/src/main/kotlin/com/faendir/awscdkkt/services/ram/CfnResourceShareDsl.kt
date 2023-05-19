@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
