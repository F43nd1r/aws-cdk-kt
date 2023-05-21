package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun webCrawlerAuthenticationConfigurationProperty(initializer: CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder.() -> Unit
    = {}): CfnDataSource.WebCrawlerAuthenticationConfigurationProperty =
    CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.builder().apply(initializer).build()
