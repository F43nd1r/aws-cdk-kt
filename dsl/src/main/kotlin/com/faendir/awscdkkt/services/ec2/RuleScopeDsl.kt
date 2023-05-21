package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.RuleScope

@Generated
public fun ruleScope(initializer: RuleScope.Builder.() -> Unit = {}): RuleScope =
    RuleScope.builder().apply(initializer).build()
