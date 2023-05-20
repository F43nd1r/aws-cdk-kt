@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
