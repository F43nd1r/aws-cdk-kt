package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnDeliveryDestination
import software.amazon.awscdk.services.logs.CfnDeliveryDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeliveryDestination(
  id: String,
  props: CfnDeliveryDestinationProps,
  initializer: @AwsCdkDsl CfnDeliveryDestination.() -> Unit = {},
): CfnDeliveryDestination = CfnDeliveryDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeliveryDestination(id: String, initializer: @AwsCdkDsl
    CfnDeliveryDestination.Builder.() -> Unit = {}): CfnDeliveryDestination =
    CfnDeliveryDestination.Builder.create(this, id).apply(initializer).build()
