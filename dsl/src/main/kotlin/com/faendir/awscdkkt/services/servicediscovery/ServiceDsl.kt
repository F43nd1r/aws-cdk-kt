package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.Service
import software.amazon.awscdk.services.servicediscovery.ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.service(
  id: String,
  props: ServiceProps,
  initializer: Service.() -> Unit = {},
): Service = Service(this, id, props).apply(initializer)
