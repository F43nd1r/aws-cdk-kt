@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps

public fun snsEventSourceProps(initializer: SnsEventSourceProps.Builder.() -> Unit):
    SnsEventSourceProps = SnsEventSourceProps.builder().apply(initializer).build()
