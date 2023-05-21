package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName

@Generated
public
    fun domainNameConfigurationProperty(initializer: CfnDomainName.DomainNameConfigurationProperty.Builder.() -> Unit
    = {}): CfnDomainName.DomainNameConfigurationProperty =
    CfnDomainName.DomainNameConfigurationProperty.builder().apply(initializer).build()
