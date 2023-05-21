package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.NumberAttributeConstraints

@Generated
public fun numberAttributeConstraints(initializer: NumberAttributeConstraints.Builder.() -> Unit =
    {}): NumberAttributeConstraints =
    NumberAttributeConstraints.builder().apply(initializer).build()
