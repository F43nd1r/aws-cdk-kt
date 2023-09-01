package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.DynamoDbDataSourceProps

@Generated
public fun buildDynamoDbDataSourceProps(initializer: @AwsCdkDsl
    DynamoDbDataSourceProps.Builder.() -> Unit = {}): DynamoDbDataSourceProps =
    DynamoDbDataSourceProps.Builder().apply(initializer).build()
