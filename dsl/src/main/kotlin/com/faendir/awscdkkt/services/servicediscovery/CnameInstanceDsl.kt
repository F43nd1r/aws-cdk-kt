@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CnameInstance
import software.amazon.awscdk.services.servicediscovery.CnameInstanceProps
import software.constructs.Construct

public fun Construct.cnameInstance(
  id: String,
  props: CnameInstanceProps,
  initializer: CnameInstance.() -> Unit = {},
): CnameInstance = CnameInstance(this, id, props).apply(initializer)
