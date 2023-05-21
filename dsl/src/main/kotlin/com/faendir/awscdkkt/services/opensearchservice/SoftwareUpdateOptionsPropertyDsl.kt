package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun softwareUpdateOptionsProperty(initializer: CfnDomain.SoftwareUpdateOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.SoftwareUpdateOptionsProperty =
    CfnDomain.SoftwareUpdateOptionsProperty.builder().apply(initializer).build()
