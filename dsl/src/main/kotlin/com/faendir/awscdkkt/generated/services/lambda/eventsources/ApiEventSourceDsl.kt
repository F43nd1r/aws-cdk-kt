package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.ApiEventSource

@Generated
public fun buildApiEventSource(
  method: String,
  path: String,
  initializer: @AwsCdkDsl ApiEventSource.Builder.() -> Unit,
): ApiEventSource = ApiEventSource.Builder.create(method, path).apply(initializer).build()
