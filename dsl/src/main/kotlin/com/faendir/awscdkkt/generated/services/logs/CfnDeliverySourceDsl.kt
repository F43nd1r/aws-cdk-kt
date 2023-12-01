package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnDeliverySource
import software.amazon.awscdk.services.logs.CfnDeliverySourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeliverySource(
  id: String,
  props: CfnDeliverySourceProps,
  initializer: @AwsCdkDsl CfnDeliverySource.() -> Unit = {},
): CfnDeliverySource = CfnDeliverySource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDeliverySource(id: String, initializer: @AwsCdkDsl
    CfnDeliverySource.Builder.() -> Unit = {}): CfnDeliverySource =
    CfnDeliverySource.Builder.create(this, id).apply(initializer).build()
