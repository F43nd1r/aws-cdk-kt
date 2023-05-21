package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public
    fun licenseSpecificationProperty(initializer: CfnLaunchTemplate.LicenseSpecificationProperty.Builder.() -> Unit
    = {}): CfnLaunchTemplate.LicenseSpecificationProperty =
    CfnLaunchTemplate.LicenseSpecificationProperty.builder().apply(initializer).build()
