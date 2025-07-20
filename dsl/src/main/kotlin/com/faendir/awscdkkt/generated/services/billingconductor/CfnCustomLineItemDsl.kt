package com.faendir.awscdkkt.generated.services.billingconductor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomLineItem(
  id: String,
  props: CfnCustomLineItemProps,
  initializer: @AwsCdkDsl CfnCustomLineItem.() -> Unit = {},
): CfnCustomLineItem = CfnCustomLineItem(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomLineItem(id: String, initializer: @AwsCdkDsl CfnCustomLineItem.Builder.() -> Unit = {}): CfnCustomLineItem = CfnCustomLineItem.Builder.create(this, id).apply(initializer).build()
