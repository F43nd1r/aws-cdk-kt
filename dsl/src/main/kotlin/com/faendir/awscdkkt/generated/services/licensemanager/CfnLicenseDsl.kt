package com.faendir.awscdkkt.generated.services.licensemanager

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnLicense.() -> Unit = {},
): CfnLicense = CfnLicense(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLicense(id: String, initializer: @AwsCdkDsl CfnLicense.Builder.() -> Unit = {}): CfnLicense = CfnLicense.Builder.create(this, id).apply(initializer).build()
