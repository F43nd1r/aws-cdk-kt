package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense

@Generated
public
    fun provisionalConfigurationProperty(initializer: CfnLicense.ProvisionalConfigurationProperty.Builder.() -> Unit
    = {}): CfnLicense.ProvisionalConfigurationProperty =
    CfnLicense.ProvisionalConfigurationProperty.builder().apply(initializer).build()
