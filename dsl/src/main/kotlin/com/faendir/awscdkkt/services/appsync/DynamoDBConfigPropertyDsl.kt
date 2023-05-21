package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource

@Generated
public
    fun dynamoDBConfigProperty(initializer: CfnDataSource.DynamoDBConfigProperty.Builder.() -> Unit
    = {}): CfnDataSource.DynamoDBConfigProperty =
    CfnDataSource.DynamoDBConfigProperty.builder().apply(initializer).build()
