package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleDefaultVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModuleDefaultVersion(id: String,
    initializer: CfnModuleDefaultVersion.() -> Unit = {}): CfnModuleDefaultVersion =
    CfnModuleDefaultVersion(this, id).apply(initializer)

@Generated
public fun Construct.cfnModuleDefaultVersion(
  id: String,
  props: CfnModuleDefaultVersionProps,
  initializer: CfnModuleDefaultVersion.() -> Unit = {},
): CfnModuleDefaultVersion = CfnModuleDefaultVersion(this, id, props).apply(initializer)
