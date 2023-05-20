@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.ConnectionAttributes

public fun connectionAttributes(initializer: ConnectionAttributes.Builder.() -> Unit):
    ConnectionAttributes = ConnectionAttributes.builder().apply(initializer).build()
