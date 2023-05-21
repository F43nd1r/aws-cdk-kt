package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.RuleTargetConfig

@Generated
public fun ruleTargetConfig(initializer: RuleTargetConfig.Builder.() -> Unit = {}): RuleTargetConfig
    = RuleTargetConfig.builder().apply(initializer).build()
