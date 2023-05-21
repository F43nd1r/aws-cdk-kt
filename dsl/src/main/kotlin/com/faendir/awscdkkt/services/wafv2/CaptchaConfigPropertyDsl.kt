package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun captchaConfigProperty(initializer: CfnWebACL.CaptchaConfigProperty.Builder.() -> Unit =
    {}): CfnWebACL.CaptchaConfigProperty =
    CfnWebACL.CaptchaConfigProperty.builder().apply(initializer).build()
