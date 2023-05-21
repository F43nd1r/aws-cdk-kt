package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun mongoDBTargetProperty(initializer: CfnCrawler.MongoDBTargetProperty.Builder.() -> Unit =
    {}): CfnCrawler.MongoDBTargetProperty =
    CfnCrawler.MongoDBTargetProperty.builder().apply(initializer).build()
