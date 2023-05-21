package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDomainName

@Generated
public
    fun mutualTlsAuthenticationProperty(initializer: CfnDomainName.MutualTlsAuthenticationProperty.Builder.() -> Unit
    = {}): CfnDomainName.MutualTlsAuthenticationProperty =
    CfnDomainName.MutualTlsAuthenticationProperty.builder().apply(initializer).build()
