@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iottwinmaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspace
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps
import software.constructs.Construct

public fun Construct.cfnWorkspace(
  id: String,
  props: CfnWorkspaceProps,
  initializer: CfnWorkspace.() -> Unit = {},
): CfnWorkspace = CfnWorkspace(this, id, props).apply(initializer)
