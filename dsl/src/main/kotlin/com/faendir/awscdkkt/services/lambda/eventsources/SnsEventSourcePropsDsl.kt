package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps

@Generated
public fun snsEventSourceProps(initializer: SnsEventSourceProps.Builder.() -> Unit = {}):
    SnsEventSourceProps = SnsEventSourceProps.builder().apply(initializer).build()
