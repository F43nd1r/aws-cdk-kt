package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@Generated
public
    fun queryStringsConfigProperty(initializer: CfnOriginRequestPolicy.QueryStringsConfigProperty.Builder.() -> Unit
    = {}): CfnOriginRequestPolicy.QueryStringsConfigProperty =
    CfnOriginRequestPolicy.QueryStringsConfigProperty.builder().apply(initializer).build()
