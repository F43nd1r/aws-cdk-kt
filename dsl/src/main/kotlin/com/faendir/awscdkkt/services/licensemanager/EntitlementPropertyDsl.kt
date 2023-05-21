package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense

@Generated
public fun entitlementProperty(initializer: CfnLicense.EntitlementProperty.Builder.() -> Unit = {}):
    CfnLicense.EntitlementProperty =
    CfnLicense.EntitlementProperty.builder().apply(initializer).build()
