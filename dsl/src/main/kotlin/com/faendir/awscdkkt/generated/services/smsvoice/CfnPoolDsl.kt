package com.faendir.awscdkkt.generated.services.smsvoice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.smsvoice.CfnPool
import software.amazon.awscdk.services.smsvoice.CfnPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPool(
  id: String,
  props: CfnPoolProps,
  initializer: @AwsCdkDsl CfnPool.() -> Unit = {},
): CfnPool = CfnPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPool(id: String, initializer: @AwsCdkDsl CfnPool.Builder.() -> Unit = {}): CfnPool = CfnPool.Builder.create(this, id).apply(initializer).build()
