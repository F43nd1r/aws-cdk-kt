package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun deltaTargetProperty(initializer: CfnCrawler.DeltaTargetProperty.Builder.() -> Unit = {}):
    CfnCrawler.DeltaTargetProperty =
    CfnCrawler.DeltaTargetProperty.builder().apply(initializer).build()
