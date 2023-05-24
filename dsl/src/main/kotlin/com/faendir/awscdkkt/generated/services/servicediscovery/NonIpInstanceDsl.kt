package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.nonIpInstance(id: String, props: NonIpInstanceProps): NonIpInstance =
    NonIpInstance(this, id, props)

@Generated
public fun Construct.nonIpInstance(
  id: String,
  props: NonIpInstanceProps,
  initializer: @AwsCdkDsl NonIpInstance.() -> Unit,
): NonIpInstance = NonIpInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNonIpInstance(id: String, initializer: @AwsCdkDsl
    NonIpInstance.Builder.() -> Unit): NonIpInstance = NonIpInstance.Builder.create(this,
    id).apply(initializer).build()
