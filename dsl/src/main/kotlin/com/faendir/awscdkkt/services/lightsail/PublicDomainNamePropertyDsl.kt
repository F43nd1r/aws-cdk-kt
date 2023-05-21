package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

@Generated
public
    fun publicDomainNameProperty(initializer: CfnContainer.PublicDomainNameProperty.Builder.() -> Unit
    = {}): CfnContainer.PublicDomainNameProperty =
    CfnContainer.PublicDomainNameProperty.builder().apply(initializer).build()
