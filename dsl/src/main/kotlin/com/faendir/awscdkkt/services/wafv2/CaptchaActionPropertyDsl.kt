package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun captchaActionProperty(initializer: CfnWebACL.CaptchaActionProperty.Builder.() -> Unit =
    {}): CfnWebACL.CaptchaActionProperty =
    CfnWebACL.CaptchaActionProperty.builder().apply(initializer).build()
