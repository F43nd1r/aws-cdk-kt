package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

@Generated
public
    fun serverCertificateSummaryProperty(initializer: CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder.() -> Unit
    = {}): CfnDomainConfiguration.ServerCertificateSummaryProperty =
    CfnDomainConfiguration.ServerCertificateSummaryProperty.builder().apply(initializer).build()
