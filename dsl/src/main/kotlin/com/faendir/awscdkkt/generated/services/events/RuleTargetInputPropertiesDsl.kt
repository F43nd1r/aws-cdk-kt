package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.RuleTargetInputProperties

@Generated
public fun buildRuleTargetInputProperties(initializer: @AwsCdkDsl
    RuleTargetInputProperties.Builder.() -> Unit = {}): RuleTargetInputProperties =
    RuleTargetInputProperties.Builder().apply(initializer).build()
