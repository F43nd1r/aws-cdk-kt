package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.EnvironmentPlaceholderValues

@Generated
public fun environmentPlaceholderValues(initializer: EnvironmentPlaceholderValues.Builder.() -> Unit
    = {}): EnvironmentPlaceholderValues =
    EnvironmentPlaceholderValues.builder().apply(initializer).build()
