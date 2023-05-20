@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opensearchserverless

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig

public
    fun samlConfigOptionsProperty(initializer: CfnSecurityConfig.SamlConfigOptionsProperty.Builder.() -> Unit):
    CfnSecurityConfig.SamlConfigOptionsProperty =
    CfnSecurityConfig.SamlConfigOptionsProperty.builder().apply(initializer).build()
