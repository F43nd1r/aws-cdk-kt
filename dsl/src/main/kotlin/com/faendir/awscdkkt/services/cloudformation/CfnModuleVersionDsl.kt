package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnModuleVersion
import software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModuleVersion(
  id: String,
  props: CfnModuleVersionProps,
  initializer: CfnModuleVersion.() -> Unit = {},
): CfnModuleVersion = CfnModuleVersion(this, id, props).apply(initializer)
