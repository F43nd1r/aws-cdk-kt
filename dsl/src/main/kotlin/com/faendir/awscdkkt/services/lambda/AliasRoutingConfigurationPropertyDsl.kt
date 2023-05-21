package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnAlias

@Generated
public
    fun aliasRoutingConfigurationProperty(initializer: CfnAlias.AliasRoutingConfigurationProperty.Builder.() -> Unit
    = {}): CfnAlias.AliasRoutingConfigurationProperty =
    CfnAlias.AliasRoutingConfigurationProperty.builder().apply(initializer).build()
