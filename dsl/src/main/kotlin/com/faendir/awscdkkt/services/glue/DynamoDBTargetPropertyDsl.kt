package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun dynamoDBTargetProperty(initializer: CfnCrawler.DynamoDBTargetProperty.Builder.() -> Unit
    = {}): CfnCrawler.DynamoDBTargetProperty =
    CfnCrawler.DynamoDBTargetProperty.builder().apply(initializer).build()
