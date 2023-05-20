@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnPackage
import software.amazon.awscdk.services.panorama.CfnPackageProps
import software.constructs.Construct

public fun Construct.cfnPackage(
  id: String,
  props: CfnPackageProps,
  initializer: CfnPackage.() -> Unit = {},
): CfnPackage = CfnPackage(this, id, props).apply(initializer)
