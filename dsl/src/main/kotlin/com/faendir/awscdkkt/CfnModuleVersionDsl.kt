@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnModuleVersion
import software.amazon.awscdk.CfnModuleVersionProps
import software.constructs.Construct

public fun Construct.cfnModuleVersion(
  id: String,
  props: CfnModuleVersionProps,
  initializer: CfnModuleVersion.() -> Unit = {},
): CfnModuleVersion = CfnModuleVersion(this, id, props).apply(initializer)
