package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

@Generated
public
    fun certificateConfigurationProperty(initializer: CfnFleet.CertificateConfigurationProperty.Builder.() -> Unit
    = {}): CfnFleet.CertificateConfigurationProperty =
    CfnFleet.CertificateConfigurationProperty.builder().apply(initializer).build()
