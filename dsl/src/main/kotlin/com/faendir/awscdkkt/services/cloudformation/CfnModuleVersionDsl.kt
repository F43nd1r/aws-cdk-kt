@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnModuleVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps
import software.constructs.Construct

public fun Construct.cfnModuleVersion(
  id: String,
  props: CfnModuleVersionProps,
  initializer: CfnModuleVersion.() -> Unit = {},
): CfnModuleVersion = CfnModuleVersion(this, id, props).apply(initializer)
