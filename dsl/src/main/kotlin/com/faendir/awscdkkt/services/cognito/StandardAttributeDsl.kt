package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StandardAttribute

@Generated
public fun standardAttribute(initializer: StandardAttribute.Builder.() -> Unit = {}):
    StandardAttribute = StandardAttribute.builder().apply(initializer).build()
