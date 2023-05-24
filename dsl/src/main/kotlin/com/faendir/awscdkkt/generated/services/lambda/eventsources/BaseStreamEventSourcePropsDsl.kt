package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps

@Generated
public fun buildBaseStreamEventSourceProps(initializer: @AwsCdkDsl
    BaseStreamEventSourceProps.Builder.() -> Unit): BaseStreamEventSourceProps =
    BaseStreamEventSourceProps.Builder().apply(initializer).build()
