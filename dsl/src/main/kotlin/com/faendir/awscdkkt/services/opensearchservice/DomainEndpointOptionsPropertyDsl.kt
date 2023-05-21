package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun domainEndpointOptionsProperty(initializer: CfnDomain.DomainEndpointOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.DomainEndpointOptionsProperty =
    CfnDomain.DomainEndpointOptionsProperty.builder().apply(initializer).build()
