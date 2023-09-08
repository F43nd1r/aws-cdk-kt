package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.ThroughputProps

@Generated
public fun buildThroughputProps(initializer: @AwsCdkDsl ThroughputProps.Builder.() -> Unit = {}):
    ThroughputProps = ThroughputProps.Builder().apply(initializer).build()
