package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public fun buildDynamoDBConfigProperty(initializer: @AwsCdkDsl
    CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit = {}):
    CfnDataSource.DynamoDBConfigProperty =
    CfnDataSource.DynamoDBConfigProperty.Builder().apply(initializer).build()
