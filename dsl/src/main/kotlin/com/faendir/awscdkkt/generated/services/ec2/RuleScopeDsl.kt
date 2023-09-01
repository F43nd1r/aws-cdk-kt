package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.RuleScope

@Generated
public fun buildRuleScope(initializer: @AwsCdkDsl RuleScope.Builder.() -> Unit = {}): RuleScope =
    RuleScope.Builder().apply(initializer).build()
