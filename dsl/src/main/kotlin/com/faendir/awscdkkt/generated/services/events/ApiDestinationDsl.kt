package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.ApiDestination
import software.amazon.awscdk.services.events.ApiDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.apiDestination(id: String, props: ApiDestinationProps): ApiDestination =
    ApiDestination(this, id, props)

@Generated
public fun Construct.apiDestination(
  id: String,
  props: ApiDestinationProps,
  initializer: @AwsCdkDsl ApiDestination.() -> Unit,
): ApiDestination = ApiDestination(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApiDestination(id: String, initializer: @AwsCdkDsl
    ApiDestination.Builder.() -> Unit): ApiDestination = ApiDestination.Builder.create(this,
    id).apply(initializer).build()
