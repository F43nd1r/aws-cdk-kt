package com.faendir.awscdkkt.generated.services.logs.destinations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.destinations.FirehoseDestinationProps

@Generated
public fun buildFirehoseDestinationProps(initializer: @AwsCdkDsl
    FirehoseDestinationProps.Builder.() -> Unit = {}): FirehoseDestinationProps =
    FirehoseDestinationProps.Builder().apply(initializer).build()
