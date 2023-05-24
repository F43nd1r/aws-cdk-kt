package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWarmPool(id: String, props: CfnWarmPoolProps): CfnWarmPool =
    CfnWarmPool(this, id, props)

@Generated
public fun Construct.cfnWarmPool(
  id: String,
  props: CfnWarmPoolProps,
  initializer: @AwsCdkDsl CfnWarmPool.() -> Unit,
): CfnWarmPool = CfnWarmPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWarmPool(id: String, initializer: @AwsCdkDsl
    CfnWarmPool.Builder.() -> Unit): CfnWarmPool = CfnWarmPool.Builder.create(this,
    id).apply(initializer).build()
