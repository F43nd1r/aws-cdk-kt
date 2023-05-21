package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public fun sAMLOptionsProperty(initializer: CfnDomain.SAMLOptionsProperty.Builder.() -> Unit = {}):
    CfnDomain.SAMLOptionsProperty =
    CfnDomain.SAMLOptionsProperty.builder().apply(initializer).build()
