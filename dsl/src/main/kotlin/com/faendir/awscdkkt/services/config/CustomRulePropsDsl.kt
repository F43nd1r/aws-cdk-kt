package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CustomRuleProps

@Generated
public fun customRuleProps(initializer: CustomRuleProps.Builder.() -> Unit = {}): CustomRuleProps =
    CustomRuleProps.builder().apply(initializer).build()
