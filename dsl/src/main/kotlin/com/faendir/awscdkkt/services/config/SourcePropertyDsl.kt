package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigRule

@Generated
public fun sourceProperty(initializer: CfnConfigRule.SourceProperty.Builder.() -> Unit = {}):
    CfnConfigRule.SourceProperty = CfnConfigRule.SourceProperty.builder().apply(initializer).build()
