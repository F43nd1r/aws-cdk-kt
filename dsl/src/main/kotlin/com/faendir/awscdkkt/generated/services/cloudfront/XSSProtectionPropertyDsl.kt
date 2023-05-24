package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public fun buildXSSProtectionProperty(initializer: @AwsCdkDsl
    CfnResponseHeadersPolicy.XSSProtectionProperty.Builder.() -> Unit):
    CfnResponseHeadersPolicy.XSSProtectionProperty =
    CfnResponseHeadersPolicy.XSSProtectionProperty.Builder().apply(initializer).build()
