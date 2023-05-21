package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnModuleDefaultVersion
import software.amazon.awscdk.CfnModuleDefaultVersionProps
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
