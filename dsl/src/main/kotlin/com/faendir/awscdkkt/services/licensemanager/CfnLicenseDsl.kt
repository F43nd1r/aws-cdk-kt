@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
