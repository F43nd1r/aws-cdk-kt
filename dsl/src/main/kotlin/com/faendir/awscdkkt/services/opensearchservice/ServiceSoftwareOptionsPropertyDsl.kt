package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun serviceSoftwareOptionsProperty(initializer: CfnDomain.ServiceSoftwareOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.ServiceSoftwareOptionsProperty =
    CfnDomain.ServiceSoftwareOptionsProperty.builder().apply(initializer).build()
