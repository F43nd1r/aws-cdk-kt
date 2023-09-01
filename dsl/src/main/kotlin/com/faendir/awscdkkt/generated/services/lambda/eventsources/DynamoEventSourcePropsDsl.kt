package com.faendir.awscdkkt.generated.services.lambda.eventsources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps

@Generated
public fun buildDynamoEventSourceProps(initializer: @AwsCdkDsl
    DynamoEventSourceProps.Builder.() -> Unit = {}): DynamoEventSourceProps =
    DynamoEventSourceProps.Builder().apply(initializer).build()
