package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@Generated
public fun buildHeadersConfigProperty(initializer: @AwsCdkDsl
    CfnOriginRequestPolicy.HeadersConfigProperty.Builder.() -> Unit = {}):
    CfnOriginRequestPolicy.HeadersConfigProperty =
    CfnOriginRequestPolicy.HeadersConfigProperty.Builder().apply(initializer).build()
