package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnDelivery
import software.amazon.awscdk.services.logs.CfnDeliveryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDelivery(
  id: String,
  props: CfnDeliveryProps,
  initializer: @AwsCdkDsl CfnDelivery.() -> Unit = {},
): CfnDelivery = CfnDelivery(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDelivery(id: String, initializer: @AwsCdkDsl CfnDelivery.Builder.() -> Unit = {}): CfnDelivery = CfnDelivery.Builder.create(this, id).apply(initializer).build()
