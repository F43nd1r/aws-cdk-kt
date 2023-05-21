package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.IpInstance
import software.amazon.awscdk.services.servicediscovery.IpInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.ipInstance(
  id: String,
  props: IpInstanceProps,
  initializer: IpInstance.() -> Unit = {},
): IpInstance = IpInstance(this, id, props).apply(initializer)
