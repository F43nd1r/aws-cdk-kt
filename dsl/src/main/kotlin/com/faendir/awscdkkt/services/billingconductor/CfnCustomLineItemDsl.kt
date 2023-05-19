@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
