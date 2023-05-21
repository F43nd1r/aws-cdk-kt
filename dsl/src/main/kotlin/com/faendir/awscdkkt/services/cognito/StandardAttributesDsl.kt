package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StandardAttributes

@Generated
public fun standardAttributes(initializer: StandardAttributes.Builder.() -> Unit = {}):
    StandardAttributes = StandardAttributes.builder().apply(initializer).build()
