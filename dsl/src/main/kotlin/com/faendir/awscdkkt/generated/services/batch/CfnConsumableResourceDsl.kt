package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnConsumableResource
import software.amazon.awscdk.services.batch.CfnConsumableResourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConsumableResource(
  id: String,
  props: CfnConsumableResourceProps,
  initializer: @AwsCdkDsl CfnConsumableResource.() -> Unit = {},
): CfnConsumableResource = CfnConsumableResource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConsumableResource(id: String, initializer: @AwsCdkDsl
    CfnConsumableResource.Builder.() -> Unit = {}): CfnConsumableResource =
    CfnConsumableResource.Builder.create(this, id).apply(initializer).build()
