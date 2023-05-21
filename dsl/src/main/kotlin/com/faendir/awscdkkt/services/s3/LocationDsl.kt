package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Location

@Generated
public fun location(initializer: Location.Builder.() -> Unit = {}): Location =
    Location.builder().apply(initializer).build()
