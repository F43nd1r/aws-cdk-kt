@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.amazon.awscdk.CfnModuleDefaultVersionProps
import software.constructs.Construct

public fun Construct.cfnModuleDefaultVersion(
  id: String,
  props: CfnModuleDefaultVersionProps,
  initializer: CfnModuleDefaultVersion.() -> Unit = {},
): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id, props).apply(initializer)

public fun Construct.cfnModuleDefaultVersion(id: String,
    initializer: CfnModuleDefaultVersion.() -> Unit = {}): CfnModuleDefaultVersion =
    CfnModuleDefaultVersion(this, id).apply(initializer)
