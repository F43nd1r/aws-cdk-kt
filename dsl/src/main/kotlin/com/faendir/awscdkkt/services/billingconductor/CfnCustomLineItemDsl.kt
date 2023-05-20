@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.billingconductor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps
import software.constructs.Construct

public fun Construct.cfnCustomLineItem(
  id: String,
  props: CfnCustomLineItemProps,
  initializer: CfnCustomLineItem.() -> Unit = {},
): CfnCustomLineItem = CfnCustomLineItem(this, id, props).apply(initializer)
