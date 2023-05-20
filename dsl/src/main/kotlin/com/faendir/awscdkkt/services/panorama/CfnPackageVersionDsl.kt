@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnPackageVersion
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps
import software.constructs.Construct

public fun Construct.cfnPackageVersion(
  id: String,
  props: CfnPackageVersionProps,
  initializer: CfnPackageVersion.() -> Unit = {},
): CfnPackageVersion = CfnPackageVersion(this, id, props).apply(initializer)
