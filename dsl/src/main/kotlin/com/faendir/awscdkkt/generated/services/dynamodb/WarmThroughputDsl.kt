package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.WarmThroughput

@Generated
public fun buildWarmThroughput(initializer: @AwsCdkDsl WarmThroughput.Builder.() -> Unit = {}):
    WarmThroughput = WarmThroughput.Builder().apply(initializer).build()
