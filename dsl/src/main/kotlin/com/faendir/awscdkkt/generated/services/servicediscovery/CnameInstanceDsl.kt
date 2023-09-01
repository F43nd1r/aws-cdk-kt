package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cnameInstance(
  id: String,
  props: CnameInstanceProps,
  initializer: @AwsCdkDsl CnameInstance.() -> Unit = {},
): CnameInstance = CnameInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCnameInstance(id: String, initializer: @AwsCdkDsl
    CnameInstance.Builder.() -> Unit = {}): CnameInstance = CnameInstance.Builder.create(this,
    id).apply(initializer).build()
