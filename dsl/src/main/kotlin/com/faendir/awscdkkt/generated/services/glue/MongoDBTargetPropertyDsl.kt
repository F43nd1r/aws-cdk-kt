package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun buildMongoDBTargetProperty(initializer: @AwsCdkDsl
    CfnCrawler.MongoDBTargetProperty.Builder.() -> Unit = {}): CfnCrawler.MongoDBTargetProperty =
    CfnCrawler.MongoDBTargetProperty.Builder().apply(initializer).build()
