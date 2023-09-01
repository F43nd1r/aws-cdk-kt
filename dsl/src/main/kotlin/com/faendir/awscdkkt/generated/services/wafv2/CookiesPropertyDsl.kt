package com.faendir.awscdkkt.generated.services.wafv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun buildCookiesProperty(initializer: @AwsCdkDsl CfnWebACL.CookiesProperty.Builder.() -> Unit
    = {}): CfnWebACL.CookiesProperty =
    CfnWebACL.CookiesProperty.Builder().apply(initializer).build()
