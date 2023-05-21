package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnDomainName

@Generated
public
    fun mutualTlsAuthenticationProperty(initializer: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit
    = {}): CfnDomainName.MutualTlsAuthenticationProperty =
    CfnDomainName.MutualTlsAuthenticationProperty.builder().apply(initializer).build()
