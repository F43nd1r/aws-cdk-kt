package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.amazon.awscdk.services.licensemanager.CfnLicenseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLicense(
  id: String,
  props: CfnLicenseProps,
  initializer: CfnLicense.() -> Unit = {},
): CfnLicense = CfnLicense(this, id, props).apply(initializer)
