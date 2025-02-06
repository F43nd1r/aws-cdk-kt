package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.EventApi
import software.amazon.awscdk.services.appsync.EventApiProps
import software.constructs.Construct

@Generated
public fun Construct.eventApi(
  id: String,
  props: EventApiProps,
  initializer: @AwsCdkDsl EventApi.() -> Unit = {},
): EventApi = EventApi(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventApi(id: String, initializer: @AwsCdkDsl EventApi.Builder.() -> Unit =
    {}): EventApi = EventApi.Builder.create(this, id).apply(initializer).build()
