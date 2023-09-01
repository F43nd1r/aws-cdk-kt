package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps

@Generated
public fun buildSnsEventSourceProps(initializer: @AwsCdkDsl SnsEventSourceProps.Builder.() -> Unit =
    {}): SnsEventSourceProps = SnsEventSourceProps.Builder().apply(initializer).build()
