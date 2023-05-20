@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.licensemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.licensemanager.CfnLicense
import software.amazon.awscdk.services.licensemanager.CfnLicenseProps
import software.constructs.Construct

public fun Construct.cfnLicense(
  id: String,
  props: CfnLicenseProps,
  initializer: CfnLicense.() -> Unit = {},
): CfnLicense = CfnLicense(this, id, props).apply(initializer)
