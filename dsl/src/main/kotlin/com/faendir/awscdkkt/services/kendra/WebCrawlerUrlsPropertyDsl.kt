package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnDataSource

@Generated
public
    fun webCrawlerUrlsProperty(initializer: CfnDataSource.WebCrawlerUrlsProperty.Builder.() -> Unit
    = {}): CfnDataSource.WebCrawlerUrlsProperty =
    CfnDataSource.WebCrawlerUrlsProperty.builder().apply(initializer).build()
