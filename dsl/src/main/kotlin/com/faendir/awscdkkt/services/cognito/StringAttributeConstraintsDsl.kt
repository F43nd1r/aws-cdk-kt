package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.StringAttributeConstraints

@Generated
public fun stringAttributeConstraints(initializer: StringAttributeConstraints.Builder.() -> Unit =
    {}): StringAttributeConstraints =
    StringAttributeConstraints.builder().apply(initializer).build()
