package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig

@Generated
public
    fun samlConfigOptionsProperty(initializer: CfnSecurityConfig.SamlConfigOptionsProperty.Builder.() -> Unit
    = {}): CfnSecurityConfig.SamlConfigOptionsProperty =
    CfnSecurityConfig.SamlConfigOptionsProperty.builder().apply(initializer).build()
