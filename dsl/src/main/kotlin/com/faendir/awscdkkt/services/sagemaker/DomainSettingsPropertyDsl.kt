package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDomain

@Generated
public fun domainSettingsProperty(initializer: CfnDomain.DomainSettingsProperty.Builder.() -> Unit =
    {}): CfnDomain.DomainSettingsProperty =
    CfnDomain.DomainSettingsProperty.builder().apply(initializer).build()
