package com.faendir.awscdkkt.generated.services.servicediscovery

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl Service.() -> Unit = {},
): Service = Service(this, id, props).apply(initializer)

@Generated
public fun Construct.buildService(id: String, initializer: @AwsCdkDsl Service.Builder.() -> Unit = {}): Service = Service.Builder.create(this, id).apply(initializer).build()
