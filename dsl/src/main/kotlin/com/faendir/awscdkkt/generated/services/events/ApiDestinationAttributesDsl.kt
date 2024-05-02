package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.ApiDestinationAttributes

@Generated
public fun buildApiDestinationAttributes(initializer: @AwsCdkDsl
    ApiDestinationAttributes.Builder.() -> Unit = {}): ApiDestinationAttributes =
    ApiDestinationAttributes.Builder().apply(initializer).build()
