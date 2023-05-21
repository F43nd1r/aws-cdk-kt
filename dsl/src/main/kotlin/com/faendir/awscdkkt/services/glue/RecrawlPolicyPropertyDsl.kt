package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun recrawlPolicyProperty(initializer: CfnCrawler.RecrawlPolicyProperty.Builder.() -> Unit =
    {}): CfnCrawler.RecrawlPolicyProperty =
    CfnCrawler.RecrawlPolicyProperty.builder().apply(initializer).build()
