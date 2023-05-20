@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
import software.constructs.Construct

public fun Construct.cfnModuleDefaultVersion(
  id: String,
  props: CfnModuleDefaultVersionProps,
  initializer: CfnModuleDefaultVersion.() -> Unit = {},
): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id, props).apply(initializer)

public fun Construct.cfnModuleDefaultVersion(id: String,
    initializer: CfnModuleDefaultVersion.() -> Unit = {}): CfnModuleDefaultVersion =
    CfnModuleDefaultVersion(this, id).apply(initializer)
