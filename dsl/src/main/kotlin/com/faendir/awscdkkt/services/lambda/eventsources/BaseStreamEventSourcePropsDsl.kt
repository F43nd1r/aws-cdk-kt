package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps

@Generated
public fun baseStreamEventSourceProps(initializer: BaseStreamEventSourceProps.Builder.() -> Unit =
    {}): BaseStreamEventSourceProps =
    BaseStreamEventSourceProps.builder().apply(initializer).build()
