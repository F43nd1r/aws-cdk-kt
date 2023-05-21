package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense

@Generated
public
    fun borrowConfigurationProperty(initializer: CfnLicense.BorrowConfigurationProperty.Builder.() -> Unit
    = {}): CfnLicense.BorrowConfigurationProperty =
    CfnLicense.BorrowConfigurationProperty.builder().apply(initializer).build()
