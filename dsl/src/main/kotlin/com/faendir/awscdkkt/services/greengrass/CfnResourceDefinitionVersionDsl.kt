package com.faendir.awscdkkt.services.greengrass

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResourceDefinitionVersion(
  id: String,
  props: CfnResourceDefinitionVersionProps,
  initializer: CfnResourceDefinitionVersion.() -> Unit = {},
): CfnResourceDefinitionVersion = CfnResourceDefinitionVersion(this, id, props).apply(initializer)
