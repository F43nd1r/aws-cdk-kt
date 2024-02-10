package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.DistributedMap
import software.amazon.awscdk.services.stepfunctions.DistributedMapProps
import software.constructs.Construct

@Generated
public fun Construct.distributedMap(id: String, initializer: @AwsCdkDsl DistributedMap.() -> Unit =
    {}): DistributedMap = DistributedMap(this, id).apply(initializer)

@Generated
public fun Construct.distributedMap(
  id: String,
  props: DistributedMapProps,
  initializer: @AwsCdkDsl DistributedMap.() -> Unit = {},
): DistributedMap = DistributedMap(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDistributedMap(id: String, initializer: @AwsCdkDsl
    DistributedMap.Builder.() -> Unit = {}): DistributedMap = DistributedMap.Builder.create(this,
    id).apply(initializer).build()
