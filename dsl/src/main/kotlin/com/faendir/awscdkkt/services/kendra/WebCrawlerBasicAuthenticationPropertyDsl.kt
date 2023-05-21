package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun webCrawlerBasicAuthenticationProperty(initializer: CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder.() -> Unit
    = {}): CfnDataSource.WebCrawlerBasicAuthenticationProperty =
    CfnDataSource.WebCrawlerBasicAuthenticationProperty.builder().apply(initializer).build()
