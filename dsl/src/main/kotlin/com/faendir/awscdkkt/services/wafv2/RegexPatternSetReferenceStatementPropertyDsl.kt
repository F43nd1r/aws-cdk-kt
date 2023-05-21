package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun regexPatternSetReferenceStatementProperty(initializer: CfnWebACL.RegexPatternSetReferenceStatementProperty.Builder.() -> Unit
    = {}): CfnWebACL.RegexPatternSetReferenceStatementProperty =
    CfnWebACL.RegexPatternSetReferenceStatementProperty.builder().apply(initializer).build()
