package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.ConnectionAttributes

@Generated
public fun buildConnectionAttributes(initializer: @AwsCdkDsl
    ConnectionAttributes.Builder.() -> Unit): ConnectionAttributes =
    ConnectionAttributes.Builder().apply(initializer).build()
