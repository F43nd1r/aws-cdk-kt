package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense

@Generated
public fun issuerDataProperty(initializer: CfnLicense.IssuerDataProperty.Builder.() -> Unit = {}):
    CfnLicense.IssuerDataProperty =
    CfnLicense.IssuerDataProperty.builder().apply(initializer).build()
