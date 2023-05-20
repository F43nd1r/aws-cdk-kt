@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

public
    fun regexMatchStatementProperty(initializer: CfnWebACL.RegexMatchStatementProperty.Builder.() -> Unit):
    CfnWebACL.RegexMatchStatementProperty =
    CfnWebACL.RegexMatchStatementProperty.builder().apply(initializer).build()
