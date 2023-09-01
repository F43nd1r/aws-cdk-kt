package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalService
import software.amazon.awscdk.services.ecs.ExternalServiceProps
import software.constructs.Construct

@Generated
public fun Construct.externalService(
  id: String,
  props: ExternalServiceProps,
  initializer: @AwsCdkDsl ExternalService.() -> Unit = {},
): ExternalService = ExternalService(this, id, props).apply(initializer)

@Generated
public fun Construct.buildExternalService(id: String, initializer: @AwsCdkDsl
    ExternalService.Builder.() -> Unit = {}): ExternalService = ExternalService.Builder.create(this,
    id).apply(initializer).build()
