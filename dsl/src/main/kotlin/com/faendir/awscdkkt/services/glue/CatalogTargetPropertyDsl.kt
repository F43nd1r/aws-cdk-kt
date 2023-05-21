package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun catalogTargetProperty(initializer: CfnCrawler.CatalogTargetProperty.Builder.() -> Unit =
    {}): CfnCrawler.CatalogTargetProperty =
    CfnCrawler.CatalogTargetProperty.builder().apply(initializer).build()
