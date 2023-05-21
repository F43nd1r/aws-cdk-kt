package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun webCrawlerSeedUrlConfigurationProperty(initializer: CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.WebCrawlerSeedUrlConfigurationProperty =
    CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.builder().apply(initializer).build()
