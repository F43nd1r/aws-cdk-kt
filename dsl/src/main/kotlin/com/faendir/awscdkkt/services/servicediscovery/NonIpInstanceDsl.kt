package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.NonIpInstance
import software.amazon.awscdk.services.servicediscovery.NonIpInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.nonIpInstance(
  id: String,
  props: NonIpInstanceProps,
  initializer: NonIpInstance.() -> Unit = {},
): NonIpInstance = NonIpInstance(this, id, props).apply(initializer)
