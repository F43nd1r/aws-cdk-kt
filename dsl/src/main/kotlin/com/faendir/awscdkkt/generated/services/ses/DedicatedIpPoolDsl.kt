package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.DedicatedIpPool
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps
import software.constructs.Construct

@Generated
public fun Construct.dedicatedIpPool(id: String, initializer: @AwsCdkDsl DedicatedIpPool.() -> Unit = {}): DedicatedIpPool = DedicatedIpPool(this, id).apply(initializer)

@Generated
public fun Construct.dedicatedIpPool(
  id: String,
  props: DedicatedIpPoolProps,
  initializer: @AwsCdkDsl DedicatedIpPool.() -> Unit = {},
): DedicatedIpPool = DedicatedIpPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDedicatedIpPool(id: String, initializer: @AwsCdkDsl DedicatedIpPool.Builder.() -> Unit = {}): DedicatedIpPool = DedicatedIpPool.Builder.create(this, id).apply(initializer).build()
