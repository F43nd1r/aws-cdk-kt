package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.SecondaryIndexProps

@Generated
public fun buildSecondaryIndexProps(initializer: @AwsCdkDsl SecondaryIndexProps.Builder.() -> Unit =
    {}): SecondaryIndexProps = SecondaryIndexProps.Builder().apply(initializer).build()
