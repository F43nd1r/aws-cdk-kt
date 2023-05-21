package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun webCrawlerConfigurationProperty(initializer: CfnDataSource.WebCrawlerConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.WebCrawlerConfigurationProperty =
    CfnDataSource.WebCrawlerConfigurationProperty.builder().apply(initializer).build()
